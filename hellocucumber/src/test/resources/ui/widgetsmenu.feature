Feature: As a tester
when menu is clicked
then verify all submenu accordian and clicks

  Scenario: As a tester I want to test Menu accordian
    When Open browser
    And I click accordian in widgets Menu
    And I switch to iframe
    Then I click on section2 Menu
    And I switch back to main
    Then I click on Customizeicon
    Then I click button in widgets Menu
    And I click radio button in widgets Menu
    And I switch to iframe
    Then I click radio button in iframe
    When I switch back to main
    And I click accordian in widgets Menu
    And I switch to iframe
 		Then I close browser
 	