@regression
Feature: Mouse Hover functionality

  Scenario: Mouse Hover functionality
    Given user on JCPenny homepage
    When user input email
    And user enter passwords
    And user mousehover on Toys & Games
#    And user clicks on All Toys
    Then user able to land on All Toys page