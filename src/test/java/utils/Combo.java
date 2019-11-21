package utils;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Combo extends WebComponent {
    private Select select;

    public void selectComboBox(String value) {
        getSelect().selectByValue(value);
    }

    public void selectComboBoxByText(String text) {
        getSelect().selectByVisibleText(text);
    }

    private Select getSelect() {
        if (select != null) {
            return select;
        }

        return select = new Select(this);
    }

    public String getVisibleText() {
        return getSelect().getFirstSelectedOption().getText();
    }
}

