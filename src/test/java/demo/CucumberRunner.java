package demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/AddToDoTask.feature",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {""}
)
public class CucumberRunner {

}
