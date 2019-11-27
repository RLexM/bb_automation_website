@FunctionalTest @SmokeTest @RegressionTest
Feature: To check that the main website pages have loaded in betabreakers site

  Background:
    Given I navigate to Betabreakers.com

  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Functionality'
    When I click the "functionality" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Automated'
    When I click the "automated" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Compatibility'
    When I click the "compatibility" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Website'
    When I click the "website" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Mobile'
    When I click the "mobile" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Usability'
    When I click the "usability" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Test Plan'
    When I click the "testplan" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Localization'
    When I click the "localization" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Load'
    When I click the "load" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Services
  Scenario: To check the top menu 'Services' sub-link 'Accessibility'
    When I click the "accessibility" menu item
    Then I wait for the page to load
    Then I validate the loaded page

  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Branding'
    When I click the "branding" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Web Development'
    When I click the "webdev" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Healthcare'
    When I click the "healthcare" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Educational'
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Entertainment'
    When I click the "entertainment" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Business'
    When I click the "business" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Industries
  Scenario: To check the top menu 'Industries' sub-link 'Retail'
    When I click the "retail" menu item
    Then I wait for the page to load
    Then I validate the loaded page

  @TopNav @SubMenu @WhyTest
  Scenario: To check the top menu 'Why Test?' sub-link 'Process'
    When I click the "process" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @WhyTest
  Scenario: To check the top menu 'Why Test?' sub-link 'Outsource'
    When I click the "outsource" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @WhyTest
  Scenario: To check the top menu 'Why Test?' sub-link 'Hires'
    When I click the "hire" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @WhyTest
  Scenario: To check the top menu 'Why Test?' sub-link 'FAQ'
    When I click the "faq" menu item
    Then I wait for the page to load
    Then I validate the loaded page

  @TopNav @SubMenu @Company
  Scenario: To check the top menu 'Company' sub-link 'Testimonials'
    When I click the "testimonials" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Company
  Scenario: To check the top menu 'Company' sub-link 'Team'
    When I click the "team" menu item
    Then I wait for the page to load
    Then I validate the loaded page
  @TopNav @SubMenu @Company
  Scenario: To check the top menu 'Company' sub-link 'Careers'
    When I click the "careers" menu item
    Then I wait for the page to load
    Then I validate the loaded page

    Then I close the browser