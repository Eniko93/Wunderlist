package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlogPage extends BasePage {
    private static final String ARTICLE_XPATH = "//div/article";
    @FindBy(how = How.XPATH, using = ARTICLE_XPATH)
    private WebElement article;

    public BlogPage(WebDriver driver) {
        super(driver, ExpectedConditions.visibilityOfElementLocated(By.xpath(ARTICLE_XPATH)));
    }

    public boolean isArticleDisplayed() {
        return article.isDisplayed();
    }
}
