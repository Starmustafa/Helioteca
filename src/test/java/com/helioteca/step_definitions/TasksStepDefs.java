package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage;
import com.helioteca.pages.LoginPage;
import com.helioteca.pages.TasksPage;
import com.helioteca.pages.Tasks_New_Tasks_Page;
import com.helioteca.utilities.BrowserUtils;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.swing.text.Utilities;

public class TasksStepDefs {
       TasksPage tasksPage = new TasksPage();

   Tasks_New_Tasks_Page tasksNewTasksPage = new Tasks_New_Tasks_Page();
    @Given("user navigates to {string} module page")
    public void user_navigates_to_module_page(String moudleName) {

        tasksPage.clickMenuByText(moudleName);

        BrowserUtils.sleep(1);
    }

    @Then("user clicks on Add List")
    public void user_clicks_on_add_list() {

        tasksPage.addList.click();

    }
    @Then("user types {string} in new list input")
    public void user_types_in_new_list_input(String newList) {
        tasksPage.newListInput.sendKeys(newList);

    }
    @Then("clicks on save button")
    public void clicks_on_save_button() {

        tasksPage.saveButton.click();
        System.out.println("tasksPage.addedList.getText() = " + tasksPage.addedList.getText());


    }
    @Then("user verify {string} is add to list of tasks")
    public void user_verify_is_add_to_list_of_tasks(String expectedList) {
        String actualList = tasksPage.addedList.getText();

        Assert.assertTrue(expectedList.equals(actualList));


    }

    @Then("user clicks on {string} list")
    public void userClicksOnList(String arg0) {

        tasksPage.addedList.click();
    }



    @Then("user adds {string} to the list")
    public void userAddsToTheList(String newTask) {

        tasksNewTasksPage.addTaskInput.sendKeys(newTask + Keys.ENTER);

    }

    @Then("user verifies {string} is Added to the list")
    public void userVerifiesIsAddedToTheList(String expectedTask) {

       String actualTask = tasksNewTasksPage.addedTask.getText();

       Assert.assertTrue(expectedTask.equals(actualTask));

    }

    @When("user clicks the check box of task")
    public void userClicksTheCheckBoxOfTask() {

        tasksNewTasksPage.taskCheckBox.click();
    }



    @Then("user navigates to completed section")
    public void userNavigatesToCompletedSection() {
        tasksNewTasksPage.completedTaskSection.click();
    }

    @And("user verifies {string} is added to completed tasks")
    public void userVerifiesIsAddedToCompletedTasks(String expectedResult) {

       String completedTask= tasksNewTasksPage.addedTask.getText();

        Assert.assertTrue(completedTask.contains(expectedResult));
    }
}
