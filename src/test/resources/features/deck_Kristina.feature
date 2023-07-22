@Deck
Feature: Deck Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee155" and password as "Employee123"
    Then user navigates to "Deck" module page

@task111
  Scenario: Verify user can create a new board
    When the user clicks on Open navigation button.
    When the user clicks on Add board button.
    And the user types in "School" in the Board name text field
    And the user clicks on Submit Arrow Button in Board Menu
    Then newly created board "School" should be displayed under All boards
@task222
  Scenario: User can create a new list of card/task under any board
    When the user clicks on Open navigation button
    When user clicks on "School" board button
    And user clicks on List name field button
    And user types "high school" in text field
    And user clicks on addListButtonArrow
    Then user can see newly created list "high school"

