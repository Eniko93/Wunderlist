package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Combo;
import utils.InputField;

public class SupportPage extends BasePage{
    private static final String SEARCH_FIELD = "input[type='search']";
    @FindBy(how = How.CSS, using = SEARCH_FIELD)
    private InputField search;
    @FindBy(how = How.CSS, using = ".language-filter")
    private Combo languageSelector;
    @FindBy(how = How.XPATH, using = "(//h2)[1]")
    private WebElement subHeader;
    @FindBy(how = How.CSS, using = "h3")
    private WebElement header;
    @FindBy(how = How.CSS, using = ".icon-search")
    private WebElement searchIcon;


    public SupportPage(WebDriver webDriver) {
        super(webDriver, ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SEARCH_FIELD)));
    }

    public String getLanguage() {
        return languageSelector.getVisibleText();
    }

    public String getSubHeaderText() {
        return subHeader.getText();
    }

    public SupportPage search(String text) {
        search.fillIn(text);
        search.sendKeys(Keys.ENTER);
        waitUntil(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".show-results")));

        return this;
    }

    public String getHeaderText() {
        return header.getText();
    }

    public SupportPage selectLanguage(String value) {
        languageSelector.selectComboBox(value);

        return this;
    }

}
