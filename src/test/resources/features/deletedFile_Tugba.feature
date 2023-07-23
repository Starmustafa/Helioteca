@B29G41-248
Feature: Deleted Files Tab functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee30" and password as "Employee123"

  @B29G41-245
  Scenario: Verify user can order the all deleted files by newest to oldest or vice versa
    Given user is on the home page
    And user clicks on Files tab
    Then user clicks on Deleted Files
    Then user order the all deleted files

  @B29G41-246
  Scenario: Verify user can delete any deleted file permanently
    Given user is on the Deleted Files page
    When user clicks three dots icon in the file line
    Then user clicks Delete permanently

  @B29G41-247
  Scenario: Verify user can restore deleted files
    Given user is on the Deleted Files page
    When user clicks three dots icon in the file line
    And user clicks Restore
    Then user clicks All files tab
    Then user able to see deleted file