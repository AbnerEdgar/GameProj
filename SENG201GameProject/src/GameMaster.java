import javax.swing.JFrame;

public class GameMaster {
	// All the pages & game handler
	static GameSetupPage setupPage = new GameSetupPage();

	
	public static void main(String[] args) {
		try {
			setupPage.showPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
