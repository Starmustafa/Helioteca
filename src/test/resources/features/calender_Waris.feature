@B29G41-277
Feature: Tasks Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee180" and password as "Employee123"




  @B29G41-268
    Scenario: Verify User can display daily calendar view
      Given user navigates to "calendar" module page
      And user clicks on square Black button
      And user clicks on Day
      Then  user should see daily Calendar View


  @B29G41-269
   Scenario: Verify User can display weekly calendar view
    Given user navigates to "calendar" module page
    And user clicks on square Black button
     And user clicks on Week
     Then  user should see weekly Calendar View


  @B29G41-270
  Scenario: Verify User can display monthly calendar view
    Given user navigates to "calendar" module page
    And user clicks on square Black button
    And user clicks on month
    Then  user should see monthly Calendar View


  @B29G41-272
  Scenario: Verify User can create a new event under the Calendar module
  and see it on the related day through the Monthly Calendar view

    Given user navigates to "calendar" module page
    And user clicks on New event button
    And user clicks on Event title enter event name
    And user click on Date from enter the "date1"
    And user click on Date to enter the "date2"
    And user click on Save
    Then user should see new event on monthly calendar view




