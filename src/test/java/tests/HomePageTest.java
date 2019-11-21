package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.BlogPage;
import page.objects.HomePage;
import page.objects.SupportPage;
import page.objects.SwitchPage;

public class HomePageTest extends BaseTest {

    @Test(description = "Go to wunderlist home page")
    public void goToWunderlistPage() {

        Assert.assertTrue(new HomePage(driver).isMenuBarDisplayed());
        Assert.assertTrue(new HomePage(driver).isHeaderImageDisplayed());
    }

    @Test(description = "Go to support page")
    public void goToSupportPage() {
        new HomePage(driver)
                .goToSupportPage();

        Assert.assertEquals(new SupportPage(driver).getLanguage(), "English");
        Assert.assertEquals(new SupportPage(driver).getSubHeaderText(), "Browse by Topic");
    }

    @Test(description = "Go to blog page")
    public void goToBlogPage() {
        new HomePage(driver)
                .goToBlogPage();

        Assert.assertTrue(new BlogPage(driver).isArticleDisplayed());
    }
}