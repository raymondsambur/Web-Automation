package demo.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebdriverInstance {

    public static WebDriver driver;

    public static void initialize(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        //not working for macOS
        options.addArguments("--incognito","--disable-extentions");

        //set platform to macOS
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);

        //set browser to chrome
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //for maximize the window
        driver.manage().window().maximize();
    }

    public static void quit(){
        driver.quit();
    }

}
