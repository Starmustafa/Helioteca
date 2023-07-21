package com.helioteca.step_definitions;

import org.openqa.selenium.*;
import com.helioteca.pages.NotesPage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotesStepDefs {

    NotesPage notesPage= new NotesPage();

    @Given("user navigates to the {string} module page")
    public void userNavigatesToTheModulePage(String modulePage) {
        notesPage.clickMenuByText(modulePage);
    }
    @When("user clicks on the New Note button")
    public void user_clicks_on_the_new_note_button() {
        notesPage.noteButton.click();

    }
    @And("user writes on the empty page {string}")
    public void userWritesOnTheEmptyPage(String anyNote) {
        WebElement element = notesPage.emptySpace;
        element.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(anyNote + Keys.ENTER).perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(notesPage.noteTitle, "title", anyNote));
    }

    @Then("user should see the title of note matches with the {string}")
    public void userShouldSeeTheTitleOfNoteMatchesWithThe(String anyNote) throws InterruptedException {

        String actualTitle= notesPage.noteTitle.getAttribute("title");
        Assert.assertTrue(actualTitle.contains(anyNote));
    }

    @Then("user clicks to the three dots next to the note and press {string}")
    public void userClicksToTheThreeDotsNextToTheNoteAndPress(String dotOption) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(notesPage.leftSideDotButton).click().perform();
        actions.moveToElement(notesPage.leftSideDotOptionList(dotOption)).click().perform();

    }

    @Given("user creates a new note {string}")
    public void userCreatesANewNote(String newNote) {
        user_clicks_on_the_new_note_button();
        userWritesOnTheEmptyPage(newNote);
    }


    @And("user navigates back to the {string} module page")
    public void userNavigatesBackToTheModulePage(String modulePage) {
        notesPage.clickMenuByText(modulePage);
    }

    @And("user clicks on the favorite section of the File page")
    public void userClicksOnTheFavoriteSectionOfTheFilePage() {
        notesPage.favoriteOption.click();
    }

    @Then("user can see the {string} on the favorite section.")
    public void userCanSeeTheOnTheFavoriteSection(String anyNote) {
        Assert.assertTrue(notesPage.favoriteText(anyNote).isDisplayed());

    }



    @When("user clicks on the dots at the right side of the page")
    public void userClicksOnTheDotsAtTheRightSideOfThePage() {
        notesPage.rightSideDotButton.click();
    }

    @And("user clicks on the Details from the dropdown list")
    public void userClicksOnTheDetailsFromTheDropdownList() {
        notesPage.detailsButton.click();
    }



    @Then("user can see the number of letters and words of the note")
    public void userCanSeeTheNumberOfLettersAndWordsOfTheNote() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement lettersAndWords = notesPage.numberOfLettersAndWords;
        wait.until(ExpectedConditions.visibilityOf(lettersAndWords));

        Assert.assertTrue(lettersAndWords.isDisplayed());

    }


    @Then("user should be able to see the note is no longer existed")
    public void userShouldBeAbleToSeeTheNoteIsNoLongerExisted() {
        try {
            boolean isNoteTitleDisplayed = notesPage.noteTitle.isDisplayed();

            if (isNoteTitleDisplayed) {
                Assert.fail("The note is still present.");
            } else {

                System.out.println("Note is no longer existed.");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Note is no longer existed.");
        }
    }
}


