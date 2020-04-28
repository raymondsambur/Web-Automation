package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void openHomePage(){
        WebdriverInstance.driver.get("https://www.wikipedia.org/");
    }

    public void inputSearch(String keyword){
        WebElement inputSearch = WebdriverInstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword);
    }

    public void clickSearch(){
        WebElement buttonSearch = WebdriverInstance.driver.findElement(By.xpath("//button[@type = 'submit']"));
        buttonSearch.click();
    }

}
