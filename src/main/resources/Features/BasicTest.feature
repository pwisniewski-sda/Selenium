Feature: Cv Creation

  @Regression
  Scenario: Fill the personal data
    Given I open application
    When I set the name "Piotr"
    And I set the surname "Wisniewski"
    Then The name "Piotr" is visible in preview
    And The surname "Wisniewski" is visible in preview