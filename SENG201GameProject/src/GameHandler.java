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
	private ArrayList<Item> Items;
	//:END -- Game Property
	
	//:START -- Player Data
	private String teamName;
	private int difficulty; 	// 1: Easy, 2: Medium, 3: Hard
	private int seasonDur;  	// 5  -  10  -  15
	private float balance;
	private int points;
	private int currentSeason;
	private int remainingWeek;
	private ArrayList<Athlete> selectedAthletes = new ArrayList<Athlete>() {{
        add(new Athlete());
        add(new Athlete());
        add(new Athlete());
        add(new Athlete());
    }};
	private Team playerTeam;
	//:END -- Player Property
	
	GameHandler(){
		initialize();
	}
	
	private void initialize() {
		this.appName = "Badminton Tournament Game Setup";
		this.page = 1;
		
		this.difficulty = 1;
		this.seasonDur = 5;
		
		this.balance = 0;
		this.points = 0;
		this.currentSeason = 0;
		this.remainingWeek = 5;
		readFile();
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

	public int getSeasonDur() {
		return seasonDur;
	}

	public void setSeasonDur(int seasonDur) {
		this.seasonDur = seasonDur;
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

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
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

	//:END -- GETTER-SETTER
	//:START -- Method	
	public void readFile() {
		
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("athletes.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONObject athleteList = (JSONObject) obj;
            
            for(Object key : athleteList.keySet()) {
            	String athleteId = (String) key;
                JSONObject athlete = (JSONObject) athleteList.get(athleteId);

                // Access athlete's information
                String name = (String) athlete.get("name");
                String position = (String) athlete.get("position");
                String nationality = (String) athlete.get("nationality");
                JSONObject stats = (JSONObject) athlete.get("stats");
                Float power = Float.parseFloat((String) stats.get("power")) ;
                Float agility = Float.parseFloat((String) stats.get("agility"));
                Float stamina = Float.parseFloat((String) stats.get("stamina"));
                
                Athletes.add(new Athlete(name, position, nationality, power, agility, stamina, stamina));
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
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
	//:END -- Method	
	
}
