package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.InputField;

public class SignInPage extends BasePage {
    private static final String EMAIL_FIELD = "input[type*='email']";
    @FindBy(how = How.CSS, using = EMAIL_FIELD)
    private InputField emailField;
    @FindBy(how = How.NAME, using = "password")
    private InputField passwordField;
    @FindBy(how = How.CSS, using = "input[type*='submit']")
    private WebElement submit;
    @FindBy(how = How.CSS, using = "div[role*='alert']")
    private WebElement message;

    public SignInPage(WebDriver driver) {
        super(driver, ExpectedConditions.visibilityOfElementLocated(By.cssSelector(EMAIL_FIELD)));
    }

    public SignInPage fillInEmail(String email) {
        emailField.fillIn(email);

        return this;
    }

    public boolean isEmailAddressValid() {
        return emailField.isValid(driver);
    }

    public boolean isEmailFieldDisplayed() {
        return emailField.isDisplayed();
    }

    public SignInPage fillInPassword(String password) {
        passwordField.fillIn(password);

        return this;
    }

    public boolean isPasswordValid() {
        return passwordField.isValid(driver);
    }


    public boolean isPasswordFieldDisplayed() {
        return passwordField.isDisplayed();
    }

    public SignInPage submit() {
        submit.click();

        return this;
    }

    public String getMessageText() {

       return message.getText();
    }
}
