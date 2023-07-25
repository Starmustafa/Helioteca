package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage;
import com.helioteca.pages.DeckPage;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();


    @When("the user clicks on Open navigation button")
    public void the_user_clicks_on_open_navigation_button() {
      deckPage.openNavigationButton.click();
      BrowserUtils.sleep(2);
    }
    @When("the user clicks on Add board button")
    public void the_user_clicks_on_add_board_button() {
        deckPage.addBoardButton.click();
        BrowserUtils.sleep(1);

    }
    @When("the user types in {string} in the Board name text field")
    public void the_user_types_in_in_the_board_name_text_field(String boardName) {
        deckPage.boardNameField.sendKeys(boardName);
        BrowserUtils.sleep(1);

    }
    @When("the user clicks on Submit Arrow Button in Board Menu")
    public void the_user_clicks_on_submit_arrow_button_in_board_menu() {
        deckPage.submitArrow.click();
    }
    @Then("newly created board {string} should be displayed under All boards")
    public void newly_created_board_should_be_displayed_under_all_boards(String expectedName) {
        boolean highSchool = expectedName.equals("high school");
        BrowserUtils.sleep(1);
    }


    @When("user clicks on {string} board button")
    public void user_clicks_on_board_with(String string) {
        deckPage.schoolBoard.click();
    }

    @When("user clicks on List name field button")
    public void user_clicks_on_list_name_field_button() {
        deckPage.listNameField.click();
    }

    @When("user types {string} in text field")
    public void user_types_in_text_field(String string) {
        deckPage.listNameField.sendKeys("high school");
    }
    @When("user clicks on addListButtonArrow")
    public void user_clicks_on_add_list_button_arrow() {
        deckPage.addListButtonArrow.click();
    }
    @Then("user can see newly created list {string}")
    public void user_can_see_newly_created_list(String string) {
        deckPage.highSchoolList.isDisplayed();
    }


    @When("the user clicks on Add board button.")
    public void theUserClicksOnAddBoardButton() {
        deckPage.addBoardButton.click();
        BrowserUtils.sleep(1);
    }

    @When("the user clicks on Open navigation button.")
    public void theUserClicksOnOpenNavigationButton() {
        deckPage.openNavigationButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks on board with a name {string}")
    public void user_clicks_on_board_with_a_name(String schoolBoard) {
        deckPage.schoolBoard.click();
    }
    @When("user clicks on Add card button")
    public void user_clicks_on_add_card_button() {
        deckPage.addCardButton.click();
    }
    @When("user types {string} in Card Name text field")
    public void user_types_in_card_name_text_field(String string) {
        deckPage.cardNameField.sendKeys("New Card");
    }
    @When("user clicks submit arrow button on Card Menu")
    public void user_clicks_submit_arrow_button_on_card_menu() {
        deckPage.cardNameSubmitArrow.click();
    }
    @Then("user can see newly created {string} card")
    public void user_can_see_newly_created_card(String string) {
        deckPage.newCard.isDisplayed();
    }
    @Then("clicks on {string} from three dot button on the card")
    public void clicks_on_from_three_dot_button_on_the_card(String string) {
        deckPage.threeDotOnCard.click();
    }
    @Then("user clicks on Assign to me")
    public void user_clicks_on_assign_to_me() {
        deckPage.assignToMeButton.click();
    }
    @Then("user can see that related card has been assigned to him or her")
    public void user_can_see_that_related_card_has_been_assigned_to_him_her() {
        deckPage.assignToMeConfirmation.isDisplayed();
    }
}
