@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Footer Links - Outline

  @ScenarioFooterLinks
  Scenario Outline: Check all Bottom Nav Links
    Given I navigate to Betabreakers.com
    Then I click the footer "<bottomPageLinks>" link
    Then I validate the loaded page
    Examples:
      |bottomPageLinks |
      |functionality  |
      |automated      |
      |compatibility  |
      |website        |
      |mobile         |
      |usability      |
      |testplan       |
      |localization   |
      |load           |
      |accessibility  |