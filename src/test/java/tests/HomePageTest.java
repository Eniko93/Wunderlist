package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.HomePage;


public class HomePageTest extends BaseTest {

    @Test(description = "Go to wunderlist home page")
    public void goToWunderlistPage() {

        Assert.assertTrue(new HomePage(getDriver()).isMenuBarDisplayed());
        Assert.assertTrue(new HomePage(getDriver()).isHeaderImageDisplayed());
    }
}