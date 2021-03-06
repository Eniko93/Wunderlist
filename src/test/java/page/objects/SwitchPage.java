package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SwitchPage extends BasePage {
    private static final String STEP_ID = "step-1";
    @FindBy(how = How.ID, using = STEP_ID)
    private WebElement firstStep;
    @FindBy(how = How.ID, using = "step-2")
    private WebElement secondStep;
    @FindBy(how = How.ID, using = "step-3")
    private WebElement thirdStep;

    public SwitchPage(WebDriver driver) {
        super(driver, ExpectedConditions.visibilityOfElementLocated(By.id(STEP_ID)));
    }

    public boolean isFirstStepDisplayed() {
        return firstStep.isDisplayed();
    }

    public boolean isSecondStepDisplayed() {
        return firstStep.isDisplayed();
    }

    public boolean isThirdStepDisplayed() {
        return firstStep.isDisplayed();
    }
}
