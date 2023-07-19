@Tasks

Feature: Tasks Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee177" and password as "Employee123"
    And  user navigates to "Tasks" module page



  Scenario: Verify user can create a new list of tasks
    Then user clicks on Add List
    Then user types "Grocery" in new list input
    Then clicks on save button
    And user verify "Grocery" is add to list of tasks


    Scenario: Verify user can create a new task
     Then user clicks on "Grocery" list
      Then user adds "Broccoli" to the list
      Then user verifies "Broccoli" is Added to the list

      Scenario: Verify user can add any task to the list of completed tasks
        When user clicks the check box of task
        Then user navigates to completed section
        And user verifies "Broccoli" is added to completed tasks



