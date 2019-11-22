package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordPage extends BasePage {
    private static final String SUBMIT = ".button";
    @FindBy(how = How.CSS, using = SUBMIT)
    private WebElement submitButton;
    @FindBy(how = How.CSS, using = "h2")
    private WebElement header;

    public ForgotPasswordPage(WebDriver webDriver) {
        super(webDriver, ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SUBMIT)));
    }

    public String getHeaderText() {
        return header.getText();
    }

}
