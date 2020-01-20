@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Top Nav sub-links function - Outline

  @ScenarioSubNav
  Scenario Outline: Check Sub Nav Links
#    Given I navigate to Betabreakers.com
    When I click the "<subNavMenuPage>" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#    Then I close the browser
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