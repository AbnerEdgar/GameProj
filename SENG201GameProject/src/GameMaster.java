import javax.swing.JFrame;

/**
 * The main class that controls the game flow and navigation between pages.
 */
public class GameMaster {
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

    /**
     * The main entry point of the game.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try {
            showSelectedPage(gameHandler.getPage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Hides all the pages.
     */
    public static void hideAllPage() {
        setupPage.hidePage();
        clubPage.hidePage();
        homePage.hidePage();
        stadiumPage.hidePage();
        competitionPage.hidePage();
        marketPage1.hidePage();
        marketPage2.hidePage();
        marketPage3.hidePage();
        inventoryPage.hidePage();
        afterBuyPage.hidePage();
    }

    /**
     * Shows the selected page based on the given page number.
     *
     * @param page the page number to show
     */
    public static void showSelectedPage(int page) {
        hideAllPage();
        if (page == 1) {
            setupPage.showPage();
        } else if (page == 2) {
            homePage.showPage();
        } else if (page == 3) {
            clubPage.showPage();
        } else if (page == 4) {
            stadiumPage.showPage();
        } else if (page == 5) {
            marketPage1.showPage();
        } else if (page == 6) {
            marketPage2.showPage();
        } else if (page == 7) {
            marketPage3.showPage();
        } else if (page == 8) {
            competitionPage.showPage();
        } else if (page == 9) {
            inventoryPage.showPage();
        } else if (page == 10) {
            afterBuyPage.showPage();
        }
    }
}