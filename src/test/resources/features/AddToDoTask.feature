@Android
Feature: Add to do task

#  Scenario: Open new task page
#    Given User is on to do list page
#    When User click button add new task
#    Then User see add new task page

  Scenario: Add new task
    Given User is on to do list page
    When User click button add new task
    And User see add new task page
    And User input "Study" as title in title field on new task page
    And User input "Testing Study" as description in description field on new task page
    And User click button finish add new task
    Then User is on to do list page