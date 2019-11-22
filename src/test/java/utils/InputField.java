package utils;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InputField extends WebComponent {

    public void fillIn(String text) {
        getWrappedWebElement().clear();
        getWrappedWebElement().sendKeys(text);
    }

    public boolean isValid(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        return (boolean) js.executeScript("return arguments[0].checkValidity();", this.getWrappedWebElement());
    }
}
