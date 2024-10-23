Feature: Login Feature
  Scenario: Login successful with valid credentials
    Given user on lgin page
    When user enter valid credentials
    Then user must be landed on home page

