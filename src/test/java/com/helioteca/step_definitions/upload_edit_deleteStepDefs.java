package com.helioteca.step_definitions;

import com.helioteca.pages.upload_edit_deletePage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class upload_edit_deleteStepDefs {

    upload_edit_deletePage upload_edit_deletePage = new upload_edit_deletePage();

    @Then("user clicks on add button")
    public void user_clicks_on_add_button() {
        upload_edit_deletePage.addButton.click();
    }

    @Then("uploads file")
    public void uploads_file() {
        String filePath = "D:\\CYDEO Lessons\\Helioteca2\\File_to_upload.txt";
         upload_edit_deletePage.uploadFile.click();

        //String fullFilePath = projectPath + "/" + filePath;

        //return fullFilePath;

    }

    @Then("file should appear on the list")
    public void file_should_appear_on_the_list() {

       //upload_edit_deletePage.File.isDisplayed();
        Assert.assertTrue(upload_edit_deletePage.uploadedFile.isDisplayed());

    }
    @And("user creates new folder")
    public void userCreatesNewFolder() {
        upload_edit_deletePage.newFolder.click();
    }


    @And("user name the folder")
    public void userNameTheFolder() {

        String folderName = "New Folder";
        upload_edit_deletePage.folderNameInput.sendKeys("New Folder");
        BrowserUtils.sleep(5);

    }

    @Then("new folder should appear on the list")
    public void newFolderShouldAppearOnTheList() {

        Assert.assertTrue(upload_edit_deletePage.newFolder.isDisplayed());
    }



    @When("user navigates on {string} module page")
    public void userNavigatesOnModulePage(String arg0) {
    }

    @Then("user clicks on three dots of selected item")
    public void userClicksOnThreeDotsOfSelectedItem() {
        upload_edit_deletePage.threeDots.click();
        BrowserUtils.sleep(2);
    }

    @And("clicks on delete folder or file")
    public void clicksOnDeleteFolderOrFile() {

        upload_edit_deletePage.deleteFile.click();
    }

    @Then("file should no longer be part of displayed list")
    public void fileShouldNoLongerBePartOfDisplayedList() {
        try {
            boolean isFileToDeleteDisplayed = upload_edit_deletePage.ahtem.isDisplayed();
            if (isFileToDeleteDisplayed) {
                Assert.fail("This test is failed!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("File is no longer part of the displayed list, the test is passed!");
            System.out.println("e = " + e);
        }
    }


      //  System.out.println("File is no longer the part of displayed list");
  //  }

    @Then("user verify number of items match displayed number of folders and files")
     public void userVerifyNumberOfItemsMatchDisplayedNumberOfFoldersAndFiles() {



        upload_edit_deletePage.fileSummary.isDisplayed();
        Assert.assertTrue(upload_edit_deletePage.fileSummary.isDisplayed());
        BrowserUtils.sleep(5);

}


}


