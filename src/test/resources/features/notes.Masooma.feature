@B29G41-262
Feature: Notes module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee166" and password as "Employee123"

  @B29G41-257
  Scenario: Verify user can create a new note
    Given user navigates to the "Notes" module page
    When user clicks on the New Note button
    And user writes on the empty page "Hello World!"
    Then user should see the title of note matches with the "Hello World!"
    Then user clicks to the three dots next to the note and press "Delete note"

  @B29G41-258
  Scenario: Verify user can add any notes to the favorite
    Given user navigates to the "Notes" module page
    Given user creates a new note "@CYDEO.Com"
    When user clicks to the three dots next to the note and press "Add to favorites"
    And user navigates back to the "Files" module page
    And user clicks on the favorite section of the File page
    Then user can see the "@CYDEO.Com" on the favorite section.
    Then user navigates back to the "Notes" module page
    Then user clicks to the three dots next to the note and press "Delete note"

  @B29G41-259
  Scenario: Verify user can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    Given user navigates to the "Notes" module page
    Given user creates a new note "Hello123@"
    When user clicks on the dots at the right side of the page
    And user clicks on the Details from the dropdown list
    Then user can see the number of letters and words of the note
    Then user clicks to the three dots next to the note and press "Delete note"

  @B29G41-260
  Scenario: Verify user can delete any notes
    Given user navigates to the "Notes" module page
    Given user creates a new note "@CYDEO.Com!123"
    And user clicks to the three dots next to the note and press "Delete note"
    Then user should be able to see the note is no longer existed




