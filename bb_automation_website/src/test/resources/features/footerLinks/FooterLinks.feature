@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site footer links function

#  Background:
#    Given I navigate to Betabreakers.com
  @FooterLinks @FunctionalityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "functionality" link
    Then I validate the loaded page
#    Then I close the browser

  @FooterLinks @AutomatedFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "automated" link
    Then I validate the loaded page

  @FooterLinks @CompatibilityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "compatibility" link
    Then I validate the loaded page

  @FooterLinks @WebsiteFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "website" link
    Then I validate the loaded page

  @FooterLinks @MobileFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "mobile" link
    Then I validate the loaded page

  @FooterLinks @TestPlanFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "testplan" link
    Then I validate the loaded page

  @FooterLinks @LocalizationFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "localization" link
    Then I validate the loaded page

  @FooterLinks @LoadFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "load" link
    Then I validate the loaded page

  @FooterLinks @AccessibilityFooter
  Scenario: To check the bottom menu main links
    Then I click the footer "accessibility" link
    Then I validate the loaded page