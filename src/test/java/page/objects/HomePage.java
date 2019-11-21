package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
    private static final String MENUBAR_ID = "menubar";
    @FindBy(how = How.ID, using = MENUBAR_ID)
    private WebElement menuBar;
    @FindBy(how = How.CSS, using = "img[class*='header-image']")
    private WebElement headerImage;
    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Support')])[1]")
    private WebElement supportButton;
    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Blog')])[1]")
    private WebElement blogButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver, ExpectedConditions.visibilityOfElementLocated(By.id(MENUBAR_ID)));
    }

    public boolean isMenuBarDisplayed() {
        return menuBar.isDisplayed();
    }

    public boolean isHeaderImageDisplayed() {
        return headerImage.isDisplayed();
    }

    public SupportPage goToSupportPage() {
        supportButton.click();

        return new SupportPage(driver);
    }

    public BlogPage goToBlogPage() {
        blogButton.click();

        return new BlogPage(driver);
    }
}
