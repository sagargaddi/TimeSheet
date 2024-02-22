Feature: Feature to test Logout fuctionality

  Background: 
    Given user is on login page
    When user enters "sagar.gaddi@growexx.com" and "Sagar.growexx@631"
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage

  @Logout
  Scenario: check user is able to logout from timesheet
    When user is on HomePage and clicks on User icon
    And Further clicks on Logout option
    Then user should be logged out and navigated back to login page
