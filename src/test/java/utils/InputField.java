package utils;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InputField extends WebComponent {

    public void fillIn(String text) {
        getWrappedWebElement().clear();
        getWrappedWebElement().sendKeys(text);
    }
}
