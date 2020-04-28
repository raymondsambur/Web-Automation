package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.webdriver.WebdriverInstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    private HomePage homePage = new HomePage();
    private ArticlePage articlePage = new ArticlePage();

    @Before
    public void before(){
        WebdriverInstance.initialize();
    }

    @After
    public void after(){
        WebdriverInstance.quit();
    }

    public void searchOnWikipedia(String params) {
        homePage.openHomePage();
        homePage.inputSearch(params);
        homePage.clickSearch();
        String title = articlePage.getTitle();
        Assert.assertEquals(params, title);
    }

    @Test
    public void searching1(){
        searchOnWikipedia("Apple");
    }

    @Test
    public void searching2(){
        searchOnWikipedia("Banana");
    }

    @Test
    public void searching3(){
        searchOnWikipedia("Mango");
    }

    @Test
    public void searching4(){
        searchOnWikipedia("Grape");
    }

//    @Test
//    public void searchPokemon() throws InterruptedException {
//        driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page");
//
//        WebElement inputSearch = driver.findElement(By.id("searchInput"));
//
//        inputSearch.sendKeys("Psyduck", Keys.ENTER);
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement pokemonName = wait
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='roundy']//table//tbody//tr//td//big//big//b[contains(text(),'Psyduck')]")));
//        String pokemon = pokemonName.getText();
//
//        WebElement pokemonNumber = wait
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'#054')]")));
//        String pokemonNo = pokemonNumber.getText();
//
//        Assert.assertEquals("Psyduck", pokemon);
//        Assert.assertEquals("#054", pokemonNo);
//    }
}
