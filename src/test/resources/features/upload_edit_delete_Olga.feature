@Upload
Feature: Upload Edit Delete Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee44" and password as "Employee123"

@Olga1
  Scenario: Verify user can upload a file
    Given  user navigates to "Files" module page
    Then user clicks on add button
    And uploads file
    Then file should appear on the list

  @Olga2
    Scenario:  Verify user can create new folder
      Given  user navigates to "Files" module page
      Then user clicks on add button
      And user creates new folder
      And user name the folder
      Then new folder should appear on the list

  @Olga3
  Scenario: Verify user can delete from three dots menu
    Given  user navigates to "Files" module page
    Then user clicks on three dots of selected item
    And  clicks on delete folder or file
    Then file should no longer be part of displayed list

@Olga4
  Scenario:
    Given user navigates on Files module page
    Then verifies the total number of files and folders under the files list table

