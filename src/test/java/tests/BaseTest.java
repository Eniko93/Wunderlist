package tests;

import utils.Browsers;
import utils.URLs;
import utils.WebBrowsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebBrowsers.getDriver(Browsers.CHROME);
        driver.get(URLs.BASE_URL);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
