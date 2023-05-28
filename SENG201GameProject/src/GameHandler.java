import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

public class GameHandler {
    // App Property
    private String appName;
    private int page;

    // Game Property
    private ArrayList<Athlete> athletes;
    private ArrayList<Racket> marketRackets;
    private ArrayList<Shoe> marketShoes;
    private ArrayList<Athlete> marketAthletes;
    private ArrayList<ArrayList<Match>> weeklyMatches;
    private boolean sellButton;
    private int clubSelectedAthlete;

    // Player Data
    private String teamName;
    private int difficulty; // 1: Easy, 2: Medium, 3: Hard
    private int minBotLevel;
    private int maxBotLevel;
    private float balance;
    private int points;
    private int currentWeek;
    private int remainingWeek;
    private ArrayList<Athlete> selectedAthletes;
    private String nationality;
    private Team playerTeam;
    private ArrayList<Racket> inventoryRacket;
    private ArrayList<Shoe> inventoryShoe;
    private ArrayList<Match> matchHistory;
    private int gameWon;
    private int gameLoss;

    // Market Data
    private int selectedIRacket;
    private int selectedIShoe;
    private int selectedIAthlete;
    private int buyCategory; // 1 racket, 2 shoe, 3 athlete

    public GameHandler() {
        initialize();
    }

    /**
     * Initializes the game handler with default values.
     */
    private void initialize() {
        this.appName = "Badminton Tournament Game Setup";
        this.page = 0;
        this.sellButton = false;

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

        this.athletes = new ArrayList<>();
        this.marketRackets = new ArrayList<>();
        this.marketShoes = new ArrayList<>();
        this.marketAthletes = new ArrayList<>();
        this.weeklyMatches = new ArrayList<>();

        this.selectedAthletes = new ArrayList<Athlete>() {{
        	add(new Athlete());
        	add(new Athlete());
        	add(new Athlete());
        	add(new Athlete());
        }};
        this.inventoryRacket = new ArrayList<Racket>() {{
        	add(new Racket());
        	add(new Racket());
        	add(new Racket());
        	add(new Racket());
        }};
        this.inventoryShoe = new ArrayList<Shoe>() {{
            add(new Shoe());
            add(new Shoe());
            add(new Shoe());
            add(new Shoe());
        }};
        this.matchHistory = new ArrayList<>();
        readDefaultFile();
    }

    /**
     * Gets the current page.
     *
     * @return The current page.
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the current page.
     *
     * @param page The page to set.
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Gets the game difficulty.
     *
     * @return The game difficulty.
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the game difficulty.
     *
     * @param difficulty The difficulty to set.
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets the minimum bot level.
     *
     * @return The minimum bot level.
     */
    public int getMinBotLevel() {
        return minBotLevel;
    }

    /**
     * Sets the minimum bot level.
     *
     * @param minBotLevel The minimum bot level to set.
     */
    public void setMinBotLevel(int minBotLevel) {
        this.minBotLevel = minBotLevel;
    }

    /**
     * Gets the maximum bot level.
     *
     * @return The maximum bot level.
     */
    public int getMaxBotLevel() {
        return maxBotLevel;
    }

    /**
     * Sets the maximum bot level.
     *
     * @param maxBotLevel The maximum bot level to set.
     */
    public void setMaxBotLevel(int maxBotLevel) {
        this.maxBotLevel = maxBotLevel;
    }
	
    /**
     * Returns the application name.
     *
     * @return The application name.
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Returns the list of athletes.
     *
     * @return The list of athletes.
     */
    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    /**
     * Returns the current balance.
     *
     * @return The current balance.
     */
    public float getBalance() {
        return balance;
    }

    /**
     * Sets the balance.
     *
     * @param balance The balance to set.
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * Returns the nationality.
     *
     * @return The nationality.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality.
     *
     * @param nationality The nationality to set.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Returns the points.
     *
     * @return The points.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the points.
     *
     * @param points The points to set.
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Returns the current week.
     *
     * @return The current week.
     */
    public int getCurrentWeek() {
        return currentWeek;
    }

    /**
     * Sets the current week.
     *
     * @param currentWeek The current week to set.
     */
    public void setCurrentWeek(int currentWeek) {
        this.currentWeek = currentWeek;
    }

    /**
     * Returns the remaining weeks.
     *
     * @return The remaining weeks.
     */
    public int getRemainingWeek() {
        return remainingWeek;
    }

    /**
     * Sets the remaining weeks.
     *
     * @param remainingWeek The remaining weeks to set.
     */
    public void setRemainingWeek(int remainingWeek) {
        this.remainingWeek = remainingWeek;
    }

    /**
     * Returns the team name.
     *
     * @return The team name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the team name.
     *
     * @param teamName The team name to set.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Returns the player's team.
     *
     * @return The player's team.
     */
    public Team getPlayerTeam() {
        return playerTeam;
    }

    /**
     * Sets the player's team.
     *
     * @param playerTeam The player's team to set.
     */
    public void setPlayerTeam(Team playerTeam) {
        this.playerTeam = playerTeam;
    }

    /**
     * Returns the index of the selected racket.
     *
     * @return The index of the selected racket.
     */
    public int getSelectedIRacket() {
        return selectedIRacket;
    }

    /**
     * Sets the index of the selected racket.
     *
     * @param selectedIRacket The index of the selected racket to set.
     */
    public void setSelectedIRacket(int selectedIRacket) {
        this.selectedIRacket = selectedIRacket;
    }

    /**
     * Returns the index of the selected shoe.
     *
     * @return The index of the selected shoe.
     */
    public int getSelectedIShoe() {
        return selectedIShoe;
    }

    /**
     * Sets the index of the selected shoe.
     *
     * @param selectedIShoe The index of the selected shoe to set.
     */
    public void setSelectedIShoe(int selectedIShoe) {
        this.selectedIShoe = selectedIShoe;
    }

    /**
     * Returns the index of the selected athlete.
     *
     * @return The index of the selected athlete.
     */
    public int getSelectedIAthlete() {
        return selectedIAthlete;
    }

    /**
     * Sets the index of the selected athlete.
     *
     * @param selectedIAthlete The index of the selected athlete to set.
     */
    public void setSelectedIAthlete(int selectedIAthlete) {
        this.selectedIAthlete = selectedIAthlete;
    }

    /**
     * Returns the list of market rackets.
     *
     * @return The list of market rackets.
     */
    public ArrayList<Racket> getMarketRackets() {
        return marketRackets;
    }

    /**
     * Sets the list of market rackets.
     *
     * @param marketRackets The list of market rackets to set.
     */
    public void setMarketRackets(ArrayList<Racket> marketRackets) {
        this.marketRackets = marketRackets;
    }

    /**
     * Returns the list of market shoes.
     *
     * @return The list of market shoes.
     */
    public ArrayList<Shoe> getMarketShoes() {
        return marketShoes;
    }

    /**
     * Sets the list of market shoes.
     *
     * @param marketShoes The list of market shoes to set.
     */
    public void setMarketShoes(ArrayList<Shoe> marketShoes) {
        this.marketShoes = marketShoes;
    }

    /**
     * Returns the list of market athletes.
     *
     * @return The list of market athletes.
     */
    public ArrayList<Athlete> getMarketAthletes() {
        return marketAthletes;
    }

    /**
     * Sets the list of market athletes.
     *
     * @param marketAthletes The list of market athletes to set.
     */
    public void setMarketAthletes(ArrayList<Athlete> marketAthletes) {
        this.marketAthletes = marketAthletes;
    }

    /**
     * Returns the list of weekly matches.
     *
     * @return The list of weekly matches.
     */
    public ArrayList<ArrayList<Match>> getWeeklyMatches() {
        return weeklyMatches;
    }

    /**
     * Sets the list of weekly matches.
     *
     * @param weeklyMatches The list of weekly matches to set.
     */
    public void setWeeklyMatches(ArrayList<ArrayList<Match>> weeklyMatches) {
        this.weeklyMatches = weeklyMatches;
    }

    /**
     * Returns the buy category.
     *
     * @return The buy category.
     */
    public int getBuyCategory() {
        return buyCategory;
    }

    /**
     * Sets the buy category.
     *
     * @param buyCategory The buy category to set.
     */
    public void setBuyCategory(int buyCategory) {
        this.buyCategory = buyCategory;
    }

    /**
     * Returns the list of inventory rackets.
     *
     * @return The list of inventory rackets.
     */
    public ArrayList<Racket> getInventoryRacket() {
        return inventoryRacket;
    }

    /**
     * Sets the list of inventory rackets.
     *
     * @param inventoryRacket The list of inventory rackets to set.
     */
    public void setInventoryRacket(ArrayList<Racket> inventoryRacket) {
        this.inventoryRacket = inventoryRacket;
    }

    /**
     * Returns the list of inventory shoes.
     *
     * @return The list of inventory shoes.
     */
    public ArrayList<Shoe> getInventoryShoe() {
        return inventoryShoe;
    }

    /**
     * Sets the list of inventory shoes.
     *
     * @param inventoryShoe The list of inventory shoes to set.
     */
    public void setInventoryShoe(ArrayList<Shoe> inventoryShoe) {
        this.inventoryShoe = inventoryShoe;
    }

    /**
     * Returns the number of games won.
     *
     * @return The number of games won.
     */
    public int getGameWon() {
        return gameWon;
    }

    /**
     * Sets the number of games won.
     *
     * @param gameWon The number of games won to set.
     */
    public void setGameWon(int gameWon) {
        this.gameWon = gameWon;
    }

    /**
     * Gets the number of losses in the game.
     * @return The number of game losses.
     */
    public int getGameLoss() {
        return gameLoss;
    }

    /**
     * Sets the number of losses in the game.
     * @param gameLoss The number of game losses.
     */
    public void setGameLoss(int gameLoss) {
        this.gameLoss = gameLoss;
    }

    /**
     * Gets the match history of the game.
     * @return The list of matches in the game history.
     */
    public ArrayList<Match> getMatchHistory() {
        return matchHistory;
    }

    /**
     * Sets the match history of the game.
     * @param matchHistory The list of matches in the game history.
     */
    public void setMatchHistory(ArrayList<Match> matchHistory) {
        this.matchHistory = matchHistory;
    }
    
    
    public boolean isSellButton() {
		return sellButton;
	}

	public void setSellButton(boolean sellButton) {
		this.sellButton = sellButton;
	}

	public int getClubSelectedAthlete() {
		return clubSelectedAthlete;
	}

	public void setClubSelectedAthlete(int clubSelectedAthlete) {
		this.clubSelectedAthlete = clubSelectedAthlete;
	}

	/**
     * Reads the default JSON files containing athlete, racket, shoe, and match data.
     */
    public void readDefaultFile() {
        JSONParser jsonParser = new JSONParser();

        try {
            readAthletes(jsonParser);
            readRackets(jsonParser);
            readShoes(jsonParser);
            readMatches(jsonParser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads the athlete data from the JSON file and populates the athletes list.
     *
     * @param jsonParser the JSONParser object to parse the JSON file
     * @throws IOException    if an I/O error occurs while reading the file
     * @throws ParseException if there is an error parsing the JSON data
     */
    private void readAthletes(JSONParser jsonParser) throws IOException, ParseException {
        try (FileReader reader = new FileReader("Athletes.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject athleteList = (JSONObject) obj;

            for (Object key : athleteList.keySet()) {
                String athleteId = (String) key;
                JSONObject athlete = (JSONObject) athleteList.get(athleteId);

                // Access athlete's information
                String name = (String) athlete.get("name");
                Integer age = Integer.parseInt((String) athlete.get("age"));
                Float height = Float.parseFloat((String) athlete.get("height"));
                JSONObject stats = (JSONObject) athlete.get("stats");
                Float power = Float.parseFloat((String) stats.get("power"));
                Float agility = Float.parseFloat((String) stats.get("agility"));
                Float stamina = Float.parseFloat((String) stats.get("stamina"));

                athletes.add(new Athlete(name, age, height, power, agility, stamina, stamina));
            }
        }
    }

    /**
     * Reads the racket data from the JSON file and populates the marketRackets list.
     *
     * @param jsonParser the JSONParser object to parse the JSON file
     * @throws IOException    if an I/O error occurs while reading the file
     * @throws ParseException if there is an error parsing the JSON data
     */
    private void readRackets(JSONParser jsonParser) throws IOException, ParseException {
        try (FileReader reader = new FileReader("Rackets.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject racketList = (JSONObject) obj;

            for (Object key : racketList.keySet()) {
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

                marketRackets.add(new Racket(name, offense, defense, weight, price, tension));
            }
        }
    }

    /**
     * Reads the shoe data from the JSON file and populates the marketShoes list.
     *
     * @param jsonParser the JSONParser object to parse the JSON file
     * @throws IOException    if an I/O error occurs while reading the file
     * @throws ParseException if there is an error parsing the JSON data
     */
    private void readShoes(JSONParser jsonParser) throws IOException, ParseException {
        try (FileReader reader = new FileReader("Shoes.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject shoeList = (JSONObject) obj;

            for (Object key : shoeList.keySet()) {
                String shoeId = (String) key;
                JSONObject shoe = (JSONObject) shoeList.get(shoeId);

                // Access shoe's information
                String name = (String) shoe.get("name");
                Integer weight = Integer.parseInt((String) shoe.get("weight"));
                String grip = (String) shoe.get("grip");
                Float price = Float.parseFloat((String) shoe.get("price"));
                JSONObject stats = (JSONObject) shoe.get("stats");
                Float offense = Float.parseFloat((String) stats.get("offense"));
                Float defense = Float.parseFloat((String) stats.get("defense"));

                marketShoes.add(new Shoe(name, offense, defense, weight, price, grip));
            }
        }
    }

    /**
     * Reads the match data from the JSON file and populates the weeklyMatches list.
     *
     * @param jsonParser the JSONParser object to parse the JSON file
     * @throws IOException    if an I/O error occurs while reading the file
     * @throws ParseException if there is an error parsing the JSON data
     */
    private void readMatches(JSONParser jsonParser) throws IOException, ParseException {
        try (FileReader reader = new FileReader("Matches.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject weekList = (JSONObject) obj;
            Random random = new Random();

            for (Object key : weekList.keySet()) {
                String weekId = (String) key;
                JSONObject compList = (JSONObject) weekList.get(weekId);
                ArrayList<Match> weekMatches = new ArrayList<>();

                for (Object key2 : compList.keySet()) {
                    String compId = (String) key2;
                    JSONObject comp = (JSONObject) compList.get(compId);

                    String name = (String) comp.get("name");
                    Integer price = Integer.parseInt((String) comp.get("price"));
                    Integer point = Integer.parseInt((String) comp.get("points"));
                    float randInt = random.nextInt(getMaxBotLevel() - getMinBotLevel() + 1) + getMinBotLevel();

                    weekMatches.add(new Match(name, price, point, randInt));
                }

                weeklyMatches.add(weekMatches);
            }
        }
    }

	/**
	 * Loads the game from a saved state.
	 */
	public void loadGame() {
	    // TODO: Implement the logic to load the game state
	}

	/**
	 * Saves the current game state.
	 */
	public void saveGame() {
	    // TODO: Implement the logic to save the game state
	}

	/**
	 * Removes the athlete at the specified index from the selected athletes list.
	 * @param index The index of the athlete to remove.
	 */
	public void removeSelectedAthlete(int index) {
	    selectedAthletes.set(index, new Athlete());
	}

	/**
	 * Adds the specified athlete to the selected athletes list at the given index, if not already present.
	 * @param athlete The athlete to add.
	 * @param index The index at which to add the athlete.
	 */
	public void addSelectedAthlete(Athlete athlete, int index) {
	    boolean isContaining = false;
	    int i = 0;
	    while (i < 4) {
	        if (getSelectedAthlete(i).getName().equals(athlete.getName())) {
	            isContaining = true;
	            break;
	        }
	        i++;
	    }
	    if (!isContaining) {
	        selectedAthletes.set(index, athlete);
	    }
	}

	/**
	 * Gets the athlete at the specified index from the selected athletes list.
	 * @param index The index of the athlete to retrieve.
	 * @return The athlete at the specified index.
	 */
	public Athlete getSelectedAthlete(int index) {
	    return selectedAthletes.get(index);
	}

	/**
	 * Gets the list of selected athletes.
	 * @return The list of selected athletes.
	 */
	public ArrayList<Athlete> getSelectedAthletes() {
	    return selectedAthletes;
	}

	/**
	 * Generates a team using the specified team object.
	 * @param team The team object to generate.
	 */
	public void generateTeam(Team team) {
	    playerTeam = team;
	}

	/**
	 * Gets the number of active members in the club (team).
	 * @return The number of active members.
	 */
	public int getActiveMembers() {
	    // TODO: Implement the logic to get the currently active members in the club (team)
	    return 0;
	}

	/**
	 * Checks if there is an available racket in the inventory.
	 * @return True if a racket is available, false otherwise.
	 */
	public boolean racketInventoryAvailable() {
	    int count = 0;
	    boolean available = false;
	    while (count < getInventoryRacket().size() - 1) {
	        if (getInventoryRacket().get(count).getName().equals("")) {
	            available = true;
	            break;
	        }
	        count++;
	    }
	    return available;
	}

	/**
	 * Checks if there is an available shoe in the inventory.
	 * @return True if a shoe is available, false otherwise.
	 */
	public boolean shoeInventoryAvailable() {
	    int count = 0;
	    boolean available = false;
	    while (count < getInventoryShoe().size() - 1) {
	        if (getInventoryShoe().get(count).getName().equals("")) {
	            available = true;
	            break;
	        }
	        count++;
	    }
	    return available;
	}
}
