@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Top Nav sub-links function - Outline

  @ScenarioSubNav
  Scenario Outline: Check Sub Nav Links
    When I click the "<subNavMenuPage>" menu item
    Then I validate the loaded page
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