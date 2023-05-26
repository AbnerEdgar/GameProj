import javax.swing.JFrame;


public class GameMaster {
	// All the pages & game handler
	static GameHandler gameHandler = new GameHandler();
	static GameSetupPage setupPage = new GameSetupPage(gameHandler);
	static ClubPage clubPage = new ClubPage(gameHandler);
	static MainGamePage homePage = new MainGamePage(gameHandler);
	static StadiumPage stadiumPage = new StadiumPage(gameHandler);
	static MarketPage1 marketPage1 = new MarketPage1(gameHandler);
	static MarketPage2 marketPage2 = new MarketPage2(gameHandler);
	static MarketPage3 marketPage3 = new MarketPage3(gameHandler);
	static CompetitionPage competitionPage = new CompetitionPage(gameHandler);
	static AfterBuyItemPage afterBuyPage = new AfterBuyItemPage(gameHandler);
	static TeamInventoryPage inventoryPage = new TeamInventoryPage(gameHandler);
	
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
		marketPage1.hidePage();
		marketPage2.hidePage();
		marketPage3.hidePage();
	}
	//note untuk tombol sell diganti terminate 
	// tombol terminatenya kayaknya harus di bikin page baru karena
	// biar player bisa confirm yes or no untuk terminate contractnya
	public static void showSelectedPage(int page) {
		hideAllPage();
		if(page == 1) {
			setupPage.showPage();
		}else if(page == 2) {
			homePage.showPage();
		}else if(page == 3) {
			clubPage.showPage();
		}else if(page == 4) {
			stadiumPage.showPage();
		}else if(page == 5) {
			marketPage1.showPage();
		}else if(page == 6) {
			marketPage2.showPage();
		}else if (page == 7) {
			marketPage3.showPage();
		}else if (page == 8) {
			competitionPage.showPage();
		}else if (page == 9) {
			
		}else if (page == 10) {
			afterBuyPage.showPage();
		}
	}
}
