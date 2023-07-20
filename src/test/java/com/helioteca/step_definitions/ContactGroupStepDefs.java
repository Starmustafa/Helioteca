package com.helioteca.step_definitions;

import com.helioteca.pages.ContactGroupPage;

import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactGroupStepDefs {

    ContactGroupPage contactGroupPage = new ContactGroupPage();


    @Then("user can create a new group under Contacts Module with its {string} and {string} and {string}")
    public void userCanCreateANewGroupUnderContactsModuleWithItsAndAnd(String group1, String group2, String group3) {
        contactGroupPage.createGroupMethod(group1,group2,group3);
    }

    @And("user navigates to the contact’s own info menu")
    public void userNavigatesToTheContactSOwnInfoMenu() {
        contactGroupPage.NewContactLink.click();

    }
    @And("user clicks on {string} on the contact’s info page")
    public void userClicksOnOnTheContactSInfoPage(String arg0) {
        contactGroupPage.groupsBox.click();
    }

    @Then("User can see all the available groups name through the group’s dropdown menu")
    public void userCanSeeAllTheAvailableGroupsNameThroughTheGroupSDropdownMenu() {
        List <String> actualListName = BrowserUtils.getElementsText(contactGroupPage.groupNamesListedOnLeft);
        System.out.println(actualListName.toString()+"actual");


        List <String> expectedListName = contactGroupPage.getElementsTextByAttribute(contactGroupPage.groupNamesListedOnRight);


        Assert.assertEquals(expectedListName,actualListName);



    }





    @And("user clicks on Add new property")
    public void userClicksOnAddNewProperty() {
        contactGroupPage.addNewProperty.click();
    }

    @And("choose {string}")
    public void choose(String propertyName) {
        BrowserUtils.sleep(2);
        contactGroupPage.chooseByText(propertyName);
        BrowserUtils.sleep(3);
    }


    @Then("user should see {string} on contact’s info page")
    public void userShouldSeeOnContactSInfoPage(String newlyAddedPropertyName) {
        WebElement webElement = contactGroupPage.locateNewlyAddedPropertyByName(newlyAddedPropertyName);
    Assert.assertTrue(webElement.isDisplayed());
    }


    }

