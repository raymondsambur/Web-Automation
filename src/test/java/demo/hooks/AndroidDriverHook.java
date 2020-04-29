package demo.hooks;

import demo.webdriver.AndroidDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {

    @Before
    public void initializeAndroidDriver(){
        AndroidDriverInstance.initialize();
    }

    @After
    public void quitAndroidDriver(){
        AndroidDriverInstance.quit();
    }
}
