import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameMasterTest {

    public GameMaster gameMaster;

    @Before
    public void setUp() {
        gameMaster = new GameMaster();
    }

    @Test
    public void testHideAllPage() {
        gameMaster.hideAllPage();
        Assert.assertFalse(GameMaster.setupPage.isPageVisible());
        Assert.assertFalse(GameMaster.clubPage.isPageVisible());
        Assert.assertFalse(GameMaster.homePage.isPageVisible());
        Assert.assertFalse(GameMaster.stadiumPage.isPageVisible());
        Assert.assertFalse(GameMaster.competitionPage.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage1.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage2.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage3.isPageVisible());
    }

    @Test
    public void testShowSelectedPage() {
        GameMaster.hideAllPage();
        GameMaster.showSelectedPage(3);
        Assert.assertFalse(GameMaster.setupPage.isPageVisible());
        Assert.assertFalse(GameMaster.homePage.isPageVisible());
        Assert.assertTrue(GameMaster.clubPage.isPageVisible());
        Assert.assertFalse(GameMaster.stadiumPage.isPageVisible());
        Assert.assertFalse(GameMaster.competitionPage.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage1.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage2.isPageVisible());
        Assert.assertFalse(GameMaster.marketPage3.isPageVisible());

    }
}
