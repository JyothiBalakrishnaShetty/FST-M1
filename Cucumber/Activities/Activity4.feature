@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User is on Login Page
    When User enters "admin" and "password"
    Then Read the page Title and confirmation message
    And close the browser