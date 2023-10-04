Feature: Paying Bills
  @SmokeTest @Regression
    Background:
    Given Navigate to parabank
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to parabank

    Scenario Account Overview
      When Click Bill Payment Service
      Then Enter payee information
      And Send Payment

