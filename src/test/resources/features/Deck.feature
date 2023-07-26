@B29G41-288
Feature: Default

	Background:
		#@B29G41-289
		    Given the user is on the login page
		    And the user logged in with username as "Employee155" and password as "Employee123"
		    Then user navigates to "Deck" module page
		

	
	@B29G41-284
	Scenario: User can create a new baord
		When the user clicks on Open navigation button.
		    When the user clicks on Add board button.
		    And the user types in "School" in the Board name text field
		    And the user clicks on Submit Arrow Button in Board Menu
		    Then newly created board "School" should be displayed under All boards	

	
	@B29G41-285
	Scenario: User can create a new list of card/task under any board
		When the user clicks on Open navigation button
		    When user clicks on "School" board button
		    And user clicks on List name field button
		    And user types "high school" in text field
		    And user clicks on addListButtonArrow
		    Then user can see newly created list "high school"	

	
	@B29G41-286
	Scenario: User can add a new card/task on any list on the current board
		When the user clicks on Open navigation button.
		    When user clicks on board with a name "School"
		    And user clicks on Add card button
		    And user types "New Card" in Card Name text field
		    And user clicks submit arrow button on Card Menu
		    Then user can see newly created "New Card" card	

	
	@B29G41-287
	Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
		When the user clicks on Open navigation button.
		    When user clicks on board with a name "School"
		    Then clicks on "Assign to me" from three dot button on the card
		    Then user clicks on Assign to me
		    And user can see that related card has been assigned to him or her