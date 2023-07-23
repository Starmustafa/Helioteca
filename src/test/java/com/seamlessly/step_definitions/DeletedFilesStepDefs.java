package com.seamlessly.step_definitions;

import com.seamlessly.pages.DeletedFilePage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DeletedFilesStepDefs {


    DeletedFilePage deletedFilePage = new DeletedFilePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");

    }

    @Given("user clicks on Files tab")
    public void user_clicks_on_files_tab() {
        deletedFilePage.FilesTab.click();
    }

    @Then("user clicks on Deleted Files")
    public void user_clicks_on_deleted_files() {
        deletedFilePage.DeletedFilesTab.click();
    }


    @Then("user order the all deleted files")
    public void user_order_the_all_deleted_files() {
        deletedFilePage.OrderIcon2.click();
    }

    @Given("user is on the Deleted Files page")
    public void userIsOnTheDeletedFilesPage() {
        deletedFilePage.FilesTab.click();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        deletedFilePage.DeletedFilesTab.click();


    }

    @When("user clicks three dots icon in the file line")
    public void userClicksThreeDotsIconInTheFileLine() {
        deletedFilePage.DeletedFileThreeDot.click();
        BrowserUtils.sleep(2);
    }

    @Then("user clicks Delete permanently")
    public void userClicksDeletePermanently() {
        //deletedFilePage.FilesThreeDots.click();
        deletedFilePage.DeletePermanentlyButton.click();
        BrowserUtils.sleep(2);
    }

    @And("user clicks Restore")
    public void userClicksRestore() {
        deletedFilePage.RestoreButton.click();
    }

    @Then("user clicks All files tab")
    public void userClicksAllFilesTab() {
        deletedFilePage.AllFilesTab.click();
    }

    @Then("user able to see deleted file")
    public void userAbleToSeeDeletedFile() {
        Assert.assertTrue(deletedFilePage.RestoredFile.isDisplayed());

    }
}
