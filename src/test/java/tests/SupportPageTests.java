package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SupportPage;

/**
 * This test class includes the following test scenarios:
 * <p>
 * Invalid search
 * Valid search
 * Select language
 */

public class SupportPageTests extends BaseTest {
    @BeforeMethod(description = "Should navigate to the support page")
    public void goToSupportPage() {
        new HomePage(driver).goToSupportPage();
    }
    @Test(description = "Invalid search")
    public void invalidSearch()  {
       new SupportPage(driver)
                .search("nono");

        Assert.assertEquals(new SupportPage(driver).getHeaderText(), "No search results found");
    }

    @Test(description = "Valid search")
    public void validSearch() {
        new HomePage(driver)
                .goToSupportPage()
                .search("wunderlist");

        Assert.assertEquals(new SupportPage(driver).getHeaderText(), "692 results found for \"wunderlist\"");
    }

    @Test(description = "Select language")
    public void selectLanguage() {
            new SupportPage(driver)
                .selectLanguage("de");

        Assert.assertTrue(new SupportPage(driver).getLanguage().contains("German"));
    }
}
