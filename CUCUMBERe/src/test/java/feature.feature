

Feature: login action
I want to use my valid credentials
  @smoke
  Scenario Outline: Successful login with valid credential
    Given user navigate to home page
    When user enters "<username>" and "<password>"
    Then message user logged in successfully

    Examples: 
      | username | password    |
      | Lalitha  | password123 |
      | Rick     | Rick123     |
      | Andrew   | Andrew123   |