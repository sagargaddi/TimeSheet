Feature: Feature to test Self KRA fuctionality

Background: 
		Given user is on login page
    When user enters "sagar.gaddi@growexx.com" and "Sagar.growexx@631"
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage
 		When user is on HomePage and clicks on Key icon
 		And Further clicks on Assignment and Self KRA
 		Then user should land on Self KRA Page

 @Change_Quarter		
 Scenario Outline: check user can change Quarter on Self KRA page
 		When user is on Self KRA Page and clicks on Listbox to change Quarter
 		And sends input <Quarter>
 		Then user should be able to see Self KRA details for that Quarter
 		
 Examples:
 | Quarter |
 | "Q1" |
 | "Q2" |
 | "Q3" |
 | "Q4" |
 
 @Change_Year
 Scenario Outline: check user can change Quarter on Self KRA page
 	  When user is on Self KRA Page and clicks on Listbox to change Year
 	  And sends input <Year>
 	  Then user should be able to see Self KRA details for that Year