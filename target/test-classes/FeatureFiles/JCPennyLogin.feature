@regression
  Feature: Login functionality

    Scenario: Login functionality
      Given user on JCPenny homepage
      When user input email
      And user enter passwords
      Then user should able to signed in