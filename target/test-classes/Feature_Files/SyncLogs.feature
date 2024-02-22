Feature: Feature to test Sync Logs fuctionality

Background: 
		Given user is on login page
    When user enters "sagar.gaddi@growexx.com" and "Sagar.growexx@631"
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage
 
 @SyncLogs   
 Scenario: check user is able to sync logs
 		When user clicks on Sync Logs
 		And Enters From and To dates
 		And clicks on Sync button
 		Then logs should be synced and verify download button is clickable