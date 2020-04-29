package demo.steps;

import demo.pages.AddNewTodosPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TodoStepDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    AddNewTodosPage addNewTodosPage = new AddNewTodosPage();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = toDoHomePage.openTodoListPage();
        Assert.assertTrue(result);
    }

    @When("User click button add new task")
    public void userClickButtonAddNewTask() {
        toDoHomePage.clicAddNewTaskButton();
    }

    @Then("User see add new task page")
    public void userSeeAddNewTaskPage() {
        boolean result = addNewTodosPage.openNewTodosPage();
        Assert.assertTrue(result);
    }

    @And("User input {string} as title in title field on new task page")
    public void userInputAsTitleInTitleFieldOnNewTaskPage(String title) {
        addNewTodosPage.inputTitle(title);
    }

    @And("User input {string} as description in description field on new task page")
    public void userInputAsDescriptionInDescriptionFieldOnNewTaskPage(String description) {
        addNewTodosPage.inputDescription(description);
    }

    @And("User click button finish add new task")
    public void userClickButtonFinishAddNewTask() {
        addNewTodosPage.clicFinishAddNewTaskButton();
    }
}
