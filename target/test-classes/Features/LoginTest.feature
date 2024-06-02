@smoke
Feature: Login feature

  #Scenario: User should be logged in if correct credentials are passed
    #Given User is in the login page
    #When User provides username and password
    #And Clicks on login button
    #Then Take proper action on thge user
  @smoke1
  Scenario Outline: User should be logged in if correct credentials are passed
    Given User is in the login page
    When User provides <username> and <password>
    And Clicks on login button
    Then Take proper action on the user

    Examples: 
      | username            | password      |
      | dsm15free@gmail.com | Starbuckspass@123 |
      | dsm15free@gmail.com | Starbuckspass@123 |
