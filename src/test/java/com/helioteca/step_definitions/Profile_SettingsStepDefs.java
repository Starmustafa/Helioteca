package com.helioteca.step_definitions;

import com.helioteca.pages.Profile_SettingsPage;
import com.helioteca.pages.TasksPage;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Profile_SettingsStepDefs {

    TasksPage tasksPage = new TasksPage();
    Profile_SettingsPage profile_settingsPage= new Profile_SettingsPage();



    @Given("user navigates to profile")
    public void userNavigatesToProfile() {
        profile_settingsPage.profile.click();
    }
    @Then("user click personal info button")
    public void user_click_personal_info_button() {
    profile_settingsPage.personalInfo.click();


    }


    @Then("user can see full name email and phone")
    public void userCanSeeFullNameEmailAndPhone() {
        Assert.assertTrue(profile_settingsPage.FullNameLabel.isDisplayed());
        Assert.assertTrue(profile_settingsPage.EmailLabel.isDisplayed());
        Assert.assertTrue(profile_settingsPage.PhoneLabel.isDisplayed());

    }

    @Given("user is on personal info page")
    public void userIsOnPersonalInfoPage() {

    }

    @Then("user can see user name and full name is same {string}")
    public void userCanSeeUserNameAndFullNameIsSame(String UserName) {
        BrowserUtils.waitForVisibility(profile_settingsPage.FullNameBox,20);

        String actualFullName= profile_settingsPage.FullNameBox.getAttribute("value");


        //String expectedName = profile_settingsPage.ProfileName.getText().toString();

        Assert .assertEquals(UserName,actualFullName);
    }

  @Then("user only be able to enter numbers in phone number input box")
    public void userOnlyBeAbleToEnterNumbersInPhoneNumberInputBox() {

        String phoneNumber = profile_settingsPage.PhoneNumBox.getText();

        boolean flag=true;
        if (!phoneNumber.trim().isEmpty())
        {

            for (char c : phoneNumber.toCharArray()) {
                if (!Character.isDigit(c)) {
                   flag=false;
                   break;
                }
            }

            Assert.assertTrue(flag);
        }

    }


}


