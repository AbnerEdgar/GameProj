import java.util.ArrayList;



public class GameHandler {
	
	
	//:START -- App Property
	private String appName;
	private int page;
	//:END -- App Property
	
	//:START -- Game Property
	private int difficulty; 	// 1: Easy, 2: Medium, 3: Hard
	private int seasonDur;  	// 5  -  10  -  15
	private ArrayList<Athlete> Athletes = new ArrayList<Athlete>();
	//:END -- Game Property
	
	//:START -- Player Data
	private float balance;
	private int points;
	private int currentSeason;
	private int remainingWeek;
	
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
		this.remainingWeek = 0;
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

	//:END -- GETTER-SETTER
	//:START -- Method	
	public void readFile() {
		
	}
	
	public void loadGame() {
		
	}
	
	public void saveGame() {
		
	}
	//:END -- Method	
	
}
