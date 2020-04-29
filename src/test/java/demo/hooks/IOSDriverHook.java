package demo.hooks;

import demo.webdriver.iOSDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class IOSDriverHook {

    @Before(value = "@iOS")
    public void initializeIOSDriver(){
        iOSDriverInstance.initialize();
    }

    @After(value = "@iOS")
    public void quitIOS(){
        iOSDriverInstance.quit();
    }

}
