Feature: Feature to test Self KRA fuctionality

Background: 
		Given user is on login page
    When user enters "sagar.gaddi@growexx.com" and "Sagar.growexx@631"
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage
 
 @Self_KRA   
 Scenario: check user can be navigated to Self KRA page
 		When user is on HomePage and clicks on Key icon
 		And Further clicks on Assignment and Self KRA
 		Then user should land on Self KRA Page