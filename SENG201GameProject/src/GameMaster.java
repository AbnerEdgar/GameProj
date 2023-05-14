import javax.swing.JFrame;

public class GameMaster {
	// All the pages & game handler
	static GameSetupPage setupPage = new GameSetupPage();
	static ClubPage clubPage = new ClubPage();
	static MainGamePage homePage = new MainGamePage();
	static StadiumPage stadiumPage = new StadiumPage();
	static GameHandler gameHandler = new GameHandler();
	
	public static void main(String[] args) {
		try {
			setupPage.showPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}







