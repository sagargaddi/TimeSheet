Feature: Feature to test Change Password fuctionality

  Background: 
    Given user is on login page
    When user enters "sagar.gaddi@growexx.com" and "Sagar.growexx@631"
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage

  @Change_Password
  Scenario Outline: Check user is able to change password for the timesheet
    When user is on HomePage and clicks on User icon
    And Further clicks on Change Password option
    Then user should get options to enter <Current Password>, <New Password> and <Confirm Password>
    When user clicks on Submit button
    Then user should be able to update password

    Examples: 
      | Current Password | New Password  | Confirm Password |
      | "Sagar.growexx@631"    | "Sagar.growexx@631" | "Sagar.growexx@631"    |
