package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Combo;
import utils.InputField;

public class SupportPage extends BasePage{
    private static final String SEARCH_ID = "q";
    @FindBy(how = How.ID, using = SEARCH_ID)
    private InputField search;
    @FindBy(how = How.ID, using = "a-content-select")
    private Combo languageSelector;
    @FindBy(how = How.XPATH, using = "(//h2)[1]")
    private WebElement subHeader;
    @FindBy(how = How.XPATH, using = "(//h2)[1]")
    private WebElement header;
    @FindBy(how = How.XPATH, using = "(//button[(@type= 'submit')])[2]")
    private WebElement submit;


    public SupportPage(WebDriver webDriver) {
        super(webDriver, ExpectedConditions.visibilityOfElementLocated(By.id(SEARCH_ID)));
    }

    public String getLanguage() {
        return languageSelector.getVisibleText();
    }

    public String getSubHeaderText() {
        return subHeader.getText();
    }

    public SupportPage search(String text) {
        search.fillIn(text);

        return this;
    }

    public SupportPage submit () {
        submit.click();

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
