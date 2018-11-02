@Featuretag
Feature: Login Feature
  Verify if user is able to Login in to the site

  @ScenarioTag
  Scenario: Login as a authenticated user
    Given user is on homepage
    When user enter "cars" in search field
    And user presses search button
    Then results page is displayed

  @ScenarioTag2
  Scenario Outline: Login as a authenticated user
    Given user is on homepage
    When user enter "<value>" in search field
    And user presses search button
    Then results page is displayed
    
    Examples:
    |value|
    |cats|
    |dogs|