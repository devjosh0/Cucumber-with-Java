Feature: Login Feature
  Scenario Outline: Login Successful
    Given user on login page
    When user enter valid <username> and <password>
    Then user must be navigated to the home page

  Examples:
    |username|password|
    |"standard_user"|"secret_sauce"|
    |"problem_user"|"secret_sauce"|