package demo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikipediaStepsDefinition {
    @Given("User open Wikipedia home page")
    public void userOpenWikipediaHomePage() {
        
    }

    @When("User input search {string} on home page")
    public void userInputSearchOnHomePage(String arg0) {
    }

    @And("User click button search on home page")
    public void userClickButtonSearchOnHomePage() {
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String arg0) {
    }
}
