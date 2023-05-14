import javax.swing.JFrame;

public class GameMaster {
	// All the pages & game handler
	static GameHandler gameHandler = new GameHandler();
	static GameSetupPage setupPage = new GameSetupPage(gameHandler);
	static ClubPage clubPage = new ClubPage(gameHandler);
	static MainGamePage homePage = new MainGamePage(gameHandler);
	static StadiumPage stadiumPage = new StadiumPage(gameHandler);
	
	
	public static void main(String[] args) {

		try {
			hideAllPage();
			
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
	}
	
	public static void showSelectedPage(int page) {
		if(page == 1) {
			setupPage.showPage();
		}else if(page == 2) {
			homePage.showPage();
		}else if(page == 3) {
			clubPage.showPage();
		}else if(page == 4) {
			stadiumPage.showPage();
		}
	}
}
