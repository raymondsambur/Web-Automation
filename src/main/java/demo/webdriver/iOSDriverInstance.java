package demo.webdriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSDriverInstance {

    public static IOSDriver<IOSElement> IOSDriver;
    public static void initialize(){
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone 11 Pro Max");
        caps.setCapability("udid", "8001B856-DB73-454F-9605-11F45FBE8001");
        caps.setCapability("app", "/Users/samburr/Downloads/TestingApp.app");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("platformVersion", "13.4.1");

        try {
            IOSDriver = new IOSDriver<>(new URL(appiumUrl), caps);
            IOSDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quit(){
        IOSDriver.quit();
    }

}
