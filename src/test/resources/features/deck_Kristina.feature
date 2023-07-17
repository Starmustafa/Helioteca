@Deck
Feature: Desk Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee150" and password as "Employee123"

  Scenario: Verify user can create a new board
    Given  user navigates to "Deck" module page
