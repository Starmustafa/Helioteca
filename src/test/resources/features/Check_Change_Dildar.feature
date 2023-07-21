@dildar
Feature: Check Change Profile Setting Functionality
  As a user, I should be able to check or change profile info settings under the Profile module

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee133" and password as "Employee123"
@AC1
  Scenario: Verify user Full name and username should be the same.
    Given  user navigates to profile module page
    When user clicks on the setting button
    Then user see Full name same with "Employee133"
@AC2
  Scenario: Verify that  User can enter a proper e-mail to Email input box
    Given  user navigates to profile module page
    When   user clicks on the setting button
    And   User click on email input box
    And   User should able to enter "afsaf@gmail.com"
    Then  User see check mark in the email input
@AC3
  Scenario: User can change Language.
    Given  user navigates to profile module page
    When   user clicks on the setting button
    Then  user  select the Language to "Japanese (日本語)"


