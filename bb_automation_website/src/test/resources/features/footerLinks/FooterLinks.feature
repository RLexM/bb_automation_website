@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the footer page links for the betabreakers site

  Background:
    Given I navigate to Betabreakers.com
  @FooterLinks @FunctionalityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "functionality" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @AutomatedFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "automated" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @CompatibilityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "compatibility" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @WebsiteFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "website" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @MobileFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "mobile" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @TestPlanFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "testplan" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @LocalizationFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "localization" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @LoadFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "load" link
    Then I validate the loaded page
    Then I close the browser
  @FooterLinks @AccessibilityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "accessibility" link
    Then I validate the loaded page
    Then I close the browser
