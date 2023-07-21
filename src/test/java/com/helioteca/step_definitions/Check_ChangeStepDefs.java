package com.helioteca.step_definitions;

import com.helioteca.pages.ProfilePage;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Check_ChangeStepDefs {
    ProfilePage profilePage=new ProfilePage();

    @Given("user navigates to profile module page")
    public void user_navigates_to_profile_module_page() {
       profilePage.profile.click();
    }
    @When("user clicks on the setting button")
    public void user_clicks_on_the_setting_button() {
        profilePage.settingButton.click();
    }

    @Then("user see Full name same with {string}")
    public void user_see_full_name_same_with(String userName) {
      profilePage.profile.click();
      //Assert.assertEquals(profilePage.fullNameInput.getAttribute("value"),userName);
      Assert.assertEquals(profilePage.fullNameInput.getAttribute("value"),profilePage.userName.getText());
    }

    @When("User click on email input box")
    public void user_click_on_email_input_box() {
       profilePage.emailInput.click();
    }
    @Then("User should able to enter {string}")
    public void user_should_able_to_enter(String email) {
        profilePage.emailInput.clear();
        profilePage.emailInput.sendKeys(email);
    }

    @Then("User see check mark in the email input")
    public void user_see_check_mark_in_the_email_input() {
    Assert.assertTrue(profilePage.checkMark.isDisplayed());
    }


    @When("user  select the Language to {string}")
    public void user_select_the_language_to(String language) {
        Select select=new Select(profilePage.languageDropdown);
        select.selectByVisibleText(language);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),language);
        BrowserUtils.sleep(2);
        select.selectByVisibleText("English (US)");
    }















    }






















