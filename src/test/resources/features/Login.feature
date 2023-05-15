Feature: Verify Login Feature

  Scenario:  user can login with valid credentials
    Given user open the website
    And verify user is on login page
    When user enters valid credentials
    Then verify user is on home page
