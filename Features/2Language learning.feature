Feature: Language learning

  Scenario: Display the languages and levels
    Given Navigate to the coursera Home page
    When user clicks on the search box
    And the user clicks on show more
    Then get the languages and their count
    And get the levels and their count

  @smoke
  Scenario: Display the languages and levels
    Given Navigate to the coursera Home page
    When user clicks on the search box
