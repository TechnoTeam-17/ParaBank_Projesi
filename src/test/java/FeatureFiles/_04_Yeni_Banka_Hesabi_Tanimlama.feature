Feature: Creating A New Account

  Background:

    Given Navigate To ParaBank in Register
    Then Enter Data in Text Box
    And User should login successfully
  @SmokeTest @Regression
  Scenario: Open New Account
    Given Naviga to Open New Account Page
    Then Select Account Type and Account ID and Submit
    And Use account should succesfully opened