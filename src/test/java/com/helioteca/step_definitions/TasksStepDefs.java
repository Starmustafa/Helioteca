package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage;
import com.helioteca.pages.LoginPage;
import com.helioteca.pages.TasksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TasksStepDefs {
TasksPage tasksPage = new TasksPage();
    @Given("user navigates to {string} module page")
    public void user_navigates_to_module_page(String moudleName) {

        tasksPage.clickMenuByText(moudleName);
    }



}
