@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the Top Nav links available from base Beta Breakers website page and verify link(s) function

  @ScenarioSubNav
  Scenario Outline: Check Sub Nav Links
    Given I navigate to Betabreakers.com
    When I click the "<subNavMenuPage>" menu item
    Then I wait for the page to load
    Then I validate the loaded page
    Then I close the browser
    Examples:
      |subNavMenuPage |
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
      |branding       |
      |webdev         |
      |healthcare     |
      |educational    |
      |entertainment  |
      |business       |
      |retail         |
      |process        |
      |outsource      |
      |hire           |
      |faq            |
      |testimonials   |
      |team           |
      |careers        |