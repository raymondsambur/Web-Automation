package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getTitle(){
        WebElement titleArticle = WebdriverInstance.driver.findElement(By.id("firstHeading"));
//        WebDriverWait wait = new WebDriverWait(WebdriverInstance.driver, 10);
//        WebElement titleArticle = wait
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
        String title = titleArticle.getText();
        return title;
    }

}
