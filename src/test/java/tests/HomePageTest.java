package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.*;

/**
 * This test class includes the following test scenarios:
 * <p>
 * Go to wunderlist home page
 * Go to support page
 * Go to blog page
 * Go to switch page
 * Go to sign in page
 */

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

    @Test(description = "Go to switch page")
    public void goToSwitchPage() {
        new HomePage(driver)
                .goToSwitchPage();

        Assert.assertTrue(new SwitchPage(driver).isFirstStepDisplayed());
        Assert.assertTrue(new SwitchPage(driver).isSecondStepDisplayed());
        Assert.assertTrue(new SwitchPage(driver).isThirdStepDisplayed());
    }

    @Test(description = "Go to sign in page")
    public void goToSignInPage() {
        new HomePage(driver)
                .goToSignInPage();

        Assert.assertTrue(new SignInPage(driver).isEmailFieldDisplayed());
        Assert.assertTrue(new SignInPage(driver).isPasswordFieldDisplayed());
    }
}