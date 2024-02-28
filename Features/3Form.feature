Feature: Form

  Scenario: Fill the Form
    Given navigate to Coursera home page
    When the user clicks on For Enterprises
    And the user clicks on what we offer
    And the user clicks on Coursera for campus
    Then enter the details in the form
    And verify the error message

  @regression
  Scenario: Fill the Form
    Given navigate to Coursera home page
    When the user clicks on For Enterprises
    And the user clicks on what we offer
    And the user clicks on Coursera for campus
    Then enter the details in the form
    And verify the error message

  @smoke
  Scenario: Fill the Form
    Given navigate to Coursera home page
    When the user clicks on For Enterprises
