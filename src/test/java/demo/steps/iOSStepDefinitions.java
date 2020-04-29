package demo.steps;

import demo.pages.DanaRegisterPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class iOSStepDefinitions {

    private DanaRegisterPage danaRegisterPage = new DanaRegisterPage();

    @Given("User os on DANA register page")
    public void userOsOnDANARegisterPage() {
        Boolean result = danaRegisterPage.isOnPage();
        Assert.assertTrue(result);
    }
}
