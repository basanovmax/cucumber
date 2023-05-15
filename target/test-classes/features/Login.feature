Feature: Verify Login Feature

  Scenario: Verify user can login with valid credentials
    Given user opens the website
    And verify user is on login page
    When user enters valid credentials
    Then verify user is on home page