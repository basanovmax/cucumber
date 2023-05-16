Feature: Verify Login Feature

  Background:
    Given user opens the website
    And verify user is on login page

  @smoke @chirag
  Scenario Outline: Verify user can login with valid credentials
    When user enters username "<username>" and password "<password>"
    Then verify user is on home page
    Examples:
      | username | password |
      | demo     | demo@123 |
      |          |          |
      | ADMIN    | ADMIN@123|
      | admin    | demo@123 |
      | demo     | admin@123|

  @regression
  Scenario: Verify user can login with invalid credentials
    When user enters username "demo" and password "demo@123"
    Then verify user could not access home page



