package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage;
import com.helioteca.pages.ContactsPage;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @When("user clicks on {string} tab")
    public void user_clicks_on_tab(String string) {
        contactsPage.addNewContact.click();
    }

    @And("user clicks on {string}")
    public void user_clicks_on(String string) {
        contactsPage.newContact.click();
    }

    @And("user fills the Name and Last Name of the new contact as {string}")
    public void user_fills_the_name_and_last_name_of_the_new_contact_as(String string) {
        contactsPage.newContact.sendKeys("John Doe" + Keys.ENTER);
    }

    @Then("user should see the new contact in the list")
    public void user_should_see_the_new_contact_in_the_list() {
        boolean isVisible = contactsPage.newContact.isDisplayed();
        Assert.assertTrue("New contact is not visible in the list", isVisible);
    }

    /* @Then("user should see all the contacts listed in the middle column")
     public void user_should_see_all_the_contacts_listed_in_the_middle_column() {
         List<String> expectedContacts = List.of("John Doe", "Ashley Smith", "Anna Bill", "John Doe", "John Doe1");
         int actualContactCount = contactsPage.allContactsInMiddle.size();

         System.out.println(contactsPage.allContactsInMiddle.size());
         Assert.assertEquals("Expected contacts list is incorrect", expectedContacts.size(), actualContactCount);

         for (String contactName : expectedContacts){
             boolean isContactPresent = false;
             for (WebElement contactElement : contactsPage.allContactsInMiddle){
                 if (contactElement.getText().contains(contactName)){
                     isContactPresent = true;
                     break;
                 }
             }
             Assert.assertTrue("Contacts " + contactName + " is not listed.", isContactPresent);
         }
     }

     */
    @Then("user should see the total number of contacts near the {string}")
    public void user_should_see_the_total_number_of_contacts_near_the(String string) {
        //String totalContacts = contactsPage.numberOfContacts.getText();
        //int totalCount = Integer.parseInt(totalContacts);
        //int expectedTotal = 2;
        //Assert.assertEquals("Total number of contacts is incorrect", expectedTotal, totalContacts);
        Assert.assertTrue(contactsPage.numberOfContacts.isDisplayed());
    }

    @Then("user should see all the contacts listed in the middle column")
    public void user_should_see_all_the_contacts_listed_in_the_middle_column() {
        List<String> expectedContacts = List.of("Anna Bill", "Ashley Smith", "John Doe", "John Doe", "John Doe1");
        List<String> actualContacts = new ArrayList<>();

        for (WebElement contactElement : contactsPage.allContactsInMiddle) {
            actualContacts.add(contactElement.getText());
        }
        Assert.assertEquals("Expected contacts list is incorrect", expectedContacts, actualContacts);
    }

   /* @When("user selects a {string}")
    public void user_selects_a(String name) {
        BrowserUtils.sleep(2);
        contactsPage.contactName(name);
        BrowserUtils.sleep(3);
    }

    */

    @When("user selects a {string} name {string}")
    public void user_selects_a_name(String name, String annaBill) {
        contactsPage.contactName.click();
    }

    @When("user clicks on the {string} icon")
    public void user_clicks_on_the_icon(String string) {
        contactsPage.photoButton.click();
    }

    @When("user clicks on {string} option")
    public void user_clicks_on_option(String string) {
        contactsPage.fileButton.click();
    }

    @And("user selects a previously uploaded file")
    public void user_selects_a_previously_uploaded_file() {
      // String fullFilePath = contactsPage.getFullFilePathToUpload();
       contactsPage.fullFileElement.click();
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String string) {
        contactsPage.chooseButton.click();
    }

   /* @Then("user should see the updated profile picture for the contact")
    public void user_should_see_the_updated_profile_picture_for_the_contact() {
        WebElement profilePictures = contactsPage.uploadedPicture;
        WebElement profilePic = profilePictures.findElement(By.xpath("//img[@src='blob:https://qa.seamlessly.net/38b4dee5-0b32-453a-a33d-f4fa4e70fd7d']"));

        boolean isProfPicVisible = profilePic.isDisplayed();
        Assert.assertTrue("Profile picture is not visible", isProfPicVisible);

      //  boolean isProfilePicVisible = contactsPage.uploadedPicture.isDisplayed();
       // Assert.assertTrue("Profile picture is not visible", isProfilePicVisible);
    }

    */

    @When("user clicks on {string} option on the right page")
    public void user_clicks_on_option_on_the_right_page(String string) {
        contactsPage.threeDots.click();
    }

    @When("user selects {string} option")
    public void user_selects_option(String string) {
       contactsPage.deleteButton.click();
    }

    @Then("user should not see the deleted contact in the list")
    public void user_should_not_see_the_deleted_contact_in_the_list() {
       String deletedContactName = "Anna Bill";
    Assert.assertTrue("Deleted Contact " + deletedContactName + "is still visible", contactsPage.deletedContact.isDisplayed());
    }


}
