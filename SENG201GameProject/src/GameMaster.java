import javax.swing.JFrame;


public class GameMaster {
	// All the pages & game handler
	static GameHandler gameHandler = new GameHandler();
	static GameSetupPage setupPage = new GameSetupPage(gameHandler);
	static ClubPage clubPage = new ClubPage(gameHandler);
	static MainGamePage homePage = new MainGamePage(gameHandler);
	static StadiumPage stadiumPage = new StadiumPage(gameHandler);
	static MarketPage marketPage = new MarketPage(gameHandler);
	static CompetitionPage competitionPage = new CompetitionPage(gameHandler);
	
	public static void main(String[] args) {
		try {
			showSelectedPage(gameHandler.getPage());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void hideAllPage() {
		setupPage.hidePage();
		clubPage.hidePage();
		homePage.hidePage();
		stadiumPage.hidePage();
		competitionPage.hidePage();
	}
	
	public static void showSelectedPage(int page) {
		hideAllPage();
		if(page == 1) {
			setupPage.showPage();
		}else if(page == 2) {
			homePage.onAppear();
			gameHandler.generateTeam(new Team(gameHandler.getTeamName(),gameHandler.getSelectedAthletes()));
			homePage.showPage();
		}else if(page == 3) {
			clubPage.onAppear();
			clubPage.showPage();
		}else if(page == 4) {
			stadiumPage.showPage();
		}else if(page == 5) {
			marketPage.showPage();
		}else if(page == 6) {
			competitionPage.showPage();
		}
	}
}
