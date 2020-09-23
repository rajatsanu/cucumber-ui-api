Feature: Test Cucumber Project API

  #API Automation Scenario
  #Author : Rajat
  @Regression1
  Scenario Outline:  Compare Multiple JSON response
    Given  Read File "<file1>"
    And    Read File "<file2>"
    Then   Compare Response from both file API
    Examples:
      | file1     | file2     |
      | file1.txt | file2.txt |
