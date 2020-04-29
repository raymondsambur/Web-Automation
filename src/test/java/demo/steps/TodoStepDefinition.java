package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TodoStepDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = toDoHomePage.openTodoListPage();
        Assert.assertTrue(result);
    }

    @When("User click button add new task")
    public void userClickButtonAddNewTask() {
        toDoHomePage.clicAddNewTaskButton();
    }

//    @Then("User see add new task page")
//    public void userSeeAddNewTaskPage() {
//    }
}
