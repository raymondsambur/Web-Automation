@Web
Feature: Search Wikipedia

  Scenario: Search article about Apple on Wikipedia
    Given User open Wikipedia home page
    When User input search "Apple" on home page
    And User click button search on home page
    Then User see article with title "Apple" on article page
