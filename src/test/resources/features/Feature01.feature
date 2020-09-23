Feature: Test Cucumber Project

  @Regression
  Scenario Outline:  Purchase pillow - "<case>" case
    Given  Navigate to "MidTrans" website
    When   Validate header of home page
    And    Click on Buy Now button
    And    Click on Checkout and proceed with continue
    And    Select Credit card and enter details
      | Card Number   | Expiry Date   | CVV Number   | Bank’s OTP   |
      | <Card Number> | <Expiry Date> | <CVV Number> | <Bank’s OTP> |
    Then   Validate "<case>" message in Home Page
    Examples:
      | case    | Card Number         | Expiry Date | CVV Number | Bank’s OTP |
      | success | 4811 1111 1111 1114 | 12/24       | 123        | 112233     |
      | failure | 4911 1111 1111 1113 | 02/24       | 123        | 112233     |