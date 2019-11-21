package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SupportPage;

public class SupportPageTests extends BaseTest {
    @Test(description = "Invalid search")
    public void invalidSearch() {
        new HomePage(driver)
                .goToSupportPage()
                .search("nono")
                .submit();

        Assert.assertEquals(new SupportPage(driver).getHeaderText(), "0 results found for \"nono\"");
    }

    @Test(description = "Valid search")
    public void validSearch() {
        new HomePage(driver)
                .goToSupportPage()
                .search("wunderlist")
                .submit();

        Assert.assertEquals(new SupportPage(driver).getHeaderText(), "691 results found for \"wunderlist\"");
    }

    @Test(description = "Select language")
    public void selectLanguage() {
        new HomePage(driver)
                .goToSupportPage()
                .selectLanguage("de");

        Assert.assertEquals(new SupportPage(driver).getLanguage(), "Deutsch");
    }
}
