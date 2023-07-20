@B29G41-244

Feature: Tasks Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee177" and password as "Employee123"
    And  user navigates to "Tasks" module page


  @B29G41-238

  Scenario: Create a new list of tasks
    Then user clicks on Add List
    Then user types "Grocery" in new list input
    Then clicks on save button
    And user verify "Grocery" is add to list of tasks

  @B29G41-239

  Scenario: Create a new task
    Then user clicks on "Grocery" list
    Then user adds "Broccoli" to the list
    Then user verifies "Broccoli" is Added to the list

  @B29G41-240

  Scenario: Add task to the list of completed tasks
    When user clicks the check box of task
    Then user navigates to completed section
    And user verifies "Broccoli" is added to completed tasks

  @B29G41-241

  Scenario: Add task to the list of important tasks
    When user clicks on "Grocery" list
    Then user clicks on the star icon next to the added task
    Then user heads to Important section
    And user verifies "Broccoli" is added to important tasks

  @B29G41-242

  Scenario: Verify user can see the number of all uncompleted tasks
    Given is on Current page
    Then user verifies the number of uncompleted tasks next to the Current tab




