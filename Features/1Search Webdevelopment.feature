Feature: Identify Courses

  Scenario: Search for Web Development Course
    Given User navigate to the coursera Home page
    When user gives input in the search box
    And click the check boxes
    Then get the course details

  @smoke
  Scenario: Search for Web Development Course
    Given User navigate to the coursera Home page
    When user gives input in the search box
