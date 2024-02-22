Feature: Feature to test login page functionality

  @Login
  Scenario Outline: Check user is able to login with valid credentials
    Given user is on login page
    When user enters <Username> and <Password>
    And clicks on Sign In button
    Then user is navigated to TimeSheet HomePage

    Examples: 
      | Username                     | Password             |
      | "sagar.gaddi@growexx.com" | "Sagar.growexx@631" |
