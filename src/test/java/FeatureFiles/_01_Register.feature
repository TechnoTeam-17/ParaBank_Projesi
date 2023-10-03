Feature: Creating User Registration (Register)

  @SmokeTest @Regression
  Scenario: US01_Reg
    Given Navigate To ParaBank
    When Enter click Register in button
    Then Enter Data in Text Box
    And User should login successfully



