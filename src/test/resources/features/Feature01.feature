Feature: Test Cucumber Project

  @Regression
  Scenario Outline:  Purchase pillow - "<case>" case
    Given  Navigate to "MidTrans" website
    When   Validate header of home page
    Examples:
      | case    |
      | success |