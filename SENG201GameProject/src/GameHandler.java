import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.Iterator;

public class GameHandler {
	//:START -- App Property
	private String appName;
	private int page;
	//:END -- App Property
	
	//:START -- Game Property
	private ArrayList<Athlete> Athletes = new ArrayList<Athlete>();
	private ArrayList<Racket> marketRackets = new ArrayList<Racket>();
	private ArrayList<Shoe> marketShoes = new ArrayList<Shoe>();
	private ArrayList<Athlete> marketAthletes = new ArrayList<Athlete>();
	private ArrayList<ArrayList<Match>> WeeklyMatches = new ArrayList<ArrayList<Match>>();
//	private ArrayList<Match>
	//:END -- Game Property
	
	//:START -- Player Data
	private String teamName;
	private int difficulty; 	// 1: Easy, 2: Medium, 3: Hard
	private int minBotLevel;
	private int maxBotLevel;
	private float balance;
	private int points;
	private int currentWeek;
	private int remainingWeek;
	private ArrayList<Athlete> selectedAthletes = new ArrayList<Athlete>() {{
        add(new Athlete());
        add(new Athlete());
        add(new Athlete());
        add(new Athlete());
    }};
    private String nationality;
	private Team playerTeam;
	private ArrayList<Racket> InventoryRacket = new ArrayList<Racket>() {{
        add(new Racket());
        add(new Racket());
        add(new Racket());
        add(new Racket());
    }};
    private ArrayList<Shoe> InventoryShoe = new ArrayList<Shoe>() {{
        add(new Shoe());
        add(new Shoe());
        add(new Shoe());
        add(new Shoe());
    }};
	//:END -- Player Data
	
	//START -- Market Data
	// The 3 var below is used for selected item in market, the index selected will be used
	// to display the item's details
	private int selectedIRacket;
	private int selectedIShoe;
	private int selectedIAthlete;
	//to know if the item is racket, shoe or athlete
	private int buyCategory; // 1 racket, 2 shoe, 3 athlete
	//:END -- Market Data 
	
	GameHandler(){
		initialize();
	}
	
	private void initialize() {
		this.appName = "Badminton Tournament Game Setup";
		this.page = 1;
		
		this.difficulty = 1;
		this.nationality = "IDN";
		
		this.balance = 1000;
		this.points = 0;
		this.currentWeek = 1;
		this.remainingWeek = 4;
		
		this.selectedIRacket = 0;
		this.selectedIShoe = 0;
		this.selectedIAthlete = 0;
		this.buyCategory = 0;
		
		this.minBotLevel = 0;
		this.maxBotLevel = 0;
		
		readDefaultFile();
	}
	
	//:START -- GETTER-SETTER
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public int getMinBotLevel() {
		return minBotLevel;
	}

	public void setMinBotLevel(int minBotLevel) {
		this.minBotLevel = minBotLevel;
	}

	public int getMaxBotLevel() {
		return maxBotLevel;
	}

	public void setMaxBotLevel(int maxBotLevel) {
		this.maxBotLevel = maxBotLevel;
	}
	
	public String getAppName() {
		return appName;
	}

	public ArrayList<Athlete> getAthletes() {
		return Athletes;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getCurrentWeek() {
		return currentWeek;
	}

	public void setCurrentWeek(int currentWeek) {
		this.currentWeek = currentWeek;
	}

	public int getRemainingWeek() {
		return remainingWeek;
	}

	public void setRemainingWeek(int remainingWeek) {
		this.remainingWeek = remainingWeek;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Team getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(Team playerTeam) {
		this.playerTeam = playerTeam;
	}

	public int getSelectedIRacket() {
		return selectedIRacket;
	}

	public void setSelectedIRacket(int selectedIRacket) {
		this.selectedIRacket = selectedIRacket;
	}

	public int getSelectedIShoe() {
		return selectedIShoe;
	}

	public void setSelectedIShoe(int selectedIShoe) {
		this.selectedIShoe = selectedIShoe;
	}

	public int getSelectedIAthlete() {
		return selectedIAthlete;
	}

	public void setSelectedIAthlete(int selectedIAthlete) {
		this.selectedIAthlete = selectedIAthlete;
	}

	public ArrayList<Racket> getMarketRackets() {
		return marketRackets;
	}

	public void setMarketRackets(ArrayList<Racket> marketRackets) {
		this.marketRackets = marketRackets;
	}

	public ArrayList<Shoe> getMarketShoes() {
		return marketShoes;
	}

	public void setMarketShoes(ArrayList<Shoe> marketShoes) {
		this.marketShoes = marketShoes;
	}

	public ArrayList<Athlete> getMarketAthletes() {
		return marketAthletes;
	}

	public void setMarketAthletes(ArrayList<Athlete> marketAthletes) {
		this.marketAthletes = marketAthletes;
	}
	
	public ArrayList<ArrayList<Match>> getWeeklyMatches() {
		return WeeklyMatches;
	}

	public void setWeeklyMatches(ArrayList<ArrayList<Match>> weeklyMatches) {
		WeeklyMatches = weeklyMatches;
	}
	
	
	public int getBuyCategory() {
		return buyCategory;
	}

	public void setBuyCategory(int buyCategory) {
		this.buyCategory = buyCategory;
	}
	
	public ArrayList<Racket> getInventoryRacket() {
		return InventoryRacket;
	}

	public void setInventoryRacket(ArrayList<Racket> inventoryRacket) {
		InventoryRacket = inventoryRacket;
	}
	
	public ArrayList<Shoe> getInventoryShoe() {
		return InventoryShoe;
	}

	public void setInventoryShoe(ArrayList<Shoe> inventoryShoe) {
		InventoryShoe = inventoryShoe;
	}

	//:END -- GETTER-SETTER
	//:START -- Method	
	public void readDefaultFile() {
		
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("Athletes.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            //READ JSON Default Athlete List
            JSONObject athleteList = (JSONObject) obj;
            //For every athlete in list
            for(Object key : athleteList.keySet()) {
            	String athleteId = (String) key;
                JSONObject athlete = (JSONObject) athleteList.get(athleteId);

                // Access athlete's information
                String name = (String) athlete.get("name");
                Integer age = Integer.parseInt((String) athlete.get("age"));
                Float height = Float.parseFloat((String) athlete.get("height"));
                JSONObject stats = (JSONObject) athlete.get("stats");
                Float power = Float.parseFloat((String) stats.get("power")) ;
                Float agility = Float.parseFloat((String) stats.get("agility"));
                Float stamina = Float.parseFloat((String) stats.get("stamina"));
                //ADD Default Athlete List
                Athletes.add(new Athlete(name, age, height, power, agility, stamina, stamina));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try (FileReader reader = new FileReader("Rackets.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            //READ JSON Default Racket List
            JSONObject racketList = (JSONObject) obj;
            //For every athlete in list
            for(Object key : racketList.keySet()) {
            	String racketId = (String) key;
                JSONObject racket = (JSONObject) racketList.get(racketId);

                // Access racket's information
                String name = (String) racket.get("name");
                Integer weight = Integer.parseInt((String) racket.get("weight"));
                Integer tension = Integer.parseInt((String) racket.get("tension"));
                Float price = Float.parseFloat((String) racket.get("price"));
                JSONObject stats = (JSONObject) racket.get("stats");
                Float offense = Float.parseFloat((String) stats.get("offense"));
                Float defense = Float.parseFloat((String) stats.get("defense"));
                //ADD Default Racket List
                //TODO:
                marketRackets.add(new Racket(name, offense, defense, weight, price, tension));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try (FileReader reader = new FileReader("Shoes.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            //READ JSON Default Shoe List
            JSONObject shoeList = (JSONObject) obj;
            //For every shoe in list
            for(Object key : shoeList.keySet()) {
            	String shoeId = (String) key;
                JSONObject shoe = (JSONObject) shoeList.get(shoeId);

                // Access Shoe's information
                String name = (String) shoe.get("name");
                Integer weight = Integer.parseInt((String) shoe.get("weight"));
                String grip = (String) shoe.get("grip");
                Float price = Float.parseFloat((String) shoe.get("price"));
                JSONObject stats = (JSONObject) shoe.get("stats");
                Float offense = Float.parseFloat((String) stats.get("offense"));
                Float defense = Float.parseFloat((String) stats.get("defense"));
                //ADD Default Shoe List
                //TODO:
                marketShoes.add(new Shoe(name, offense, defense, weight, price, grip));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		try (FileReader reader = new FileReader("Matches.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            //READ JSON Default Match List
            JSONObject weekList = (JSONObject) obj;
            
            
            //For every athlete in list
            for(Object key : weekList.keySet()) {
            	String weekId = (String) key;
                JSONObject compList = (JSONObject) weekList.get(weekId);
                ArrayList<Match> WeekMatch = new ArrayList<Match>();
                for(Object key2 : compList.keySet()) {
                	String compId = (String) key2;
                	JSONObject comp = (JSONObject) compList.get(compId);
                	String name = (String) comp.get("name");
                	Integer price = Integer.parseInt((String) comp.get("price")); 
                	Integer point =  Integer.parseInt((String) comp.get("points"));
                	WeekMatch.add(new Match(name,price,point));
                }
                WeeklyMatches.add(WeekMatch);
                
                // Access racket's information
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private Match Match(String name, Integer price, Integer point) {
		// TODO Auto-generated method stub
		return null;
	}

	public void loadGame() {
		
	}
	
	public void saveGame() {
		
	}
	
	public void removeSelectedAthlete(int index) {
		selectedAthletes.set(index, new Athlete());
	}
	
	public void addSelectedAthlete(Athlete athlete, int index) {
		boolean isContaining = false;
		int i = 0;
		while(i < 4) {
			if(getSelectedAthlete(i).getName().equals(athlete.getName())) {
				isContaining = true;
				break;
			}
			i++;
		}
		if(!isContaining) {
			selectedAthletes.set(index, athlete);
		}
	}
	
	public Athlete getSelectedAthlete(int index) {
		return selectedAthletes.get(index);
	}
	
	public ArrayList<Athlete> getSelectedAthletes() {
		return selectedAthletes;
	}
	
	public void generateTeam(Team team) {
		playerTeam = team;
	}
	
	public int getActiveMembers() {
		//TODO: Get the currently active member in club(team)
		return 0;
	}
	
	public boolean racketInventoryAvailable() {
		int count = 0;
		boolean available = false;
		while(count < getInventoryRacket().size()-1) {
			if(getInventoryRacket().get(count).getName().equals("")) {
				available = true;
				break;
			}
			count++;
		}
		return available;	
	}
	
	public boolean shoeInventoryAvailable() {
		int count = 0;
		boolean available = false;
		while(count < getInventoryShoe().size()-1) {
			if(getInventoryShoe().get(count).getName().equals("")) {
				available = true;
				break;
			}
			count++;
		}
		return available;	
	}
	
//	public float getCompPrice() {
//		return 
//	}
	//:END -- Method	
	
}
