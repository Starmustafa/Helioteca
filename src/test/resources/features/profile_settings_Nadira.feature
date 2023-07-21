@Nadi

Feature: Edit/Enter Profile Settings Functionality

  user story:As a user, I should be able to change profile info settings under the Profile module.

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee122" and password as "Employee123"

    Scenario:verify user can see personal info  under profile info page
      Given user navigates to profile
      And user navigates to "settings" module page
       When user click personal info button
       Then user can see full name email and phone


@Nadi
  Scenario:verify user name and full name
    Given user navigates to profile
    And user navigates to "settings" module page
    When user click personal info button
    Then user can see user name and full name is same "Employee122"



 # Scenario:verify phone number is only digits
  #  Given user navigates to profile
   # And user navigates to "settings" module page
    #When user click personal info button
    #Then user only be able to enter numbers in phone number input boxes









