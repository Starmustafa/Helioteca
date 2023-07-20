@ahtem
Feature: Tasks Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee144" and password as "Employee123"
@task1
  Scenario: Verify User can create a new group under Contacts Module
    Given user navigates to "contacts" module page
    Then user can create a new group under Contacts Module with its "ABC123" and "abc321*" and "AHTEM NURI"

@task2
  Scenario:  Verify User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
    Given user navigates to "contacts" module page
    And user can create a new group under Contacts Module with its "ABC123" and "abc321*" and "AHTEM NURI"
    And user navigates to the contact’s own info menu
    And user clicks on "Groups" on the contact’s info page
    Then User can see all the available groups name through the group’s dropdown menu


@task3
Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
  Given user navigates to "contacts" module page
  And user clicks on Add new property
  And choose "Birthday"
  Then user should see "Birthday" on contact’s info page





