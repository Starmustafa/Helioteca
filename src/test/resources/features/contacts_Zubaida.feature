@B29G41-216

Feature: Tasks Module functionality

  Background: User logins and lands on the home page
    Given the user is on the login page
    And the user logged in with username as "Employee66" and password as "Employee123"
    And  user navigates to "Contacts" module page

    @AC1

    Scenario: Verify user can create a new contact
      When user clicks on "+ New contact" tab
      And user clicks on "New contact"
      And user fills the Name and Last Name of the new contact as "John Doe"
      Then user should see the new contact in the list

    @AC2
    Scenario: Verify user can see all the contacts as listed in "All Contacts" tab
      Then user should see all the contacts listed in the middle column
      And user should see the total number of contacts near the "All Contacts"

      @AC3
      Scenario: Verify user can change the profile picture of contacts using "Choose from Files" option
        When user selects a "contact" name "Anna Bill"
        And user clicks on the "Change photo" icon
        And user clicks on "Choose from Files" option
        And user selects a previously uploaded file
        And user clicks "Choose" option


        @AC4
        Scenario: Verify user can delete any selected contact
          When user selects a "contact" name "Anna Bill"
          And user clicks on "..." option on the right page
          And user selects "Delete" option
          Then user should not see the deleted contact in the list
