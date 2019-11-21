package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Combo;

public class SupportPage extends BasePage{
    private static final String SEARCH_ID = "q";
    @FindBy(how = How.ID, using = SEARCH_ID)
    private WebElement search;
    @FindBy(how = How.ID, using = "a-content-select")
    private Combo languageSelector;
    @FindBy(how = How.XPATH, using = "(//h2)[1]")
    private WebElement subHeader;


    public SupportPage(WebDriver webDriver) {
        super(webDriver, ExpectedConditions.visibilityOfElementLocated(By.id(SEARCH_ID)));
    }

    public String getLanguage() {
        return languageSelector.getVisibleText();
    }

    public String getSubHeaderText() {
        return subHeader.getText();
    }

}
