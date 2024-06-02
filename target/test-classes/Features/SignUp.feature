@smoke
Feature: Feature to test User signs up to starbucks website
  @smoke1
  Scenario Outline: User signs up to starbucks website with valid details
    Given User logins in to the starbucks website
    When User provides <firstName> <lastName> <email> and <password>
#    When User provides <firstname> <lastname> <email> and <password> with other details
    And Clicks on signup button
    Then User should be signed up successfully

    Examples:
      |firstName|lastName| email | password |
      |firstName001|lastName001| dsm15free@gmail.com | Startbuckspass@123 |