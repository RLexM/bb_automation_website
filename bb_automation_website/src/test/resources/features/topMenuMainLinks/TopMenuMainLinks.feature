@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Top Nav links function

#  Background:
    Given I navigate to Betabreakers.com
  @TopNav @MainServices @Services
  Scenario: Check the top menu link 'Services'
    Given I navigate to Betabreakers.com
    When I access the top nav "services" page link
    Then I validate the loaded page

  @TopNav @MainAutomated @AutomatedTesting
    Scenario: Check the top menu link 'Automated Testing'
    Given I navigate to Betabreakers.com
    When I access the top nav "automatedTesting" page link
    Then I validate the loaded page

  @TopNav @MainWhyTest @WhyTest
  Scenario: Check the top menu link 'Why Test?'
    Given I navigate to Betabreakers.com
    When I access the top nav "whyTest" page link
    Then I validate the loaded page

  @TopNav @MainCompany @Company
  Scenario: Check the top menu link 'Company'
    Given I navigate to Betabreakers.com
    When I access the top nav "company" page link
    Then I validate the loaded page

  @TopNav @MainBlog @Blog
  Scenario: Check the top menu link 'Blog'
    Given I navigate to Betabreakers.com
    When I access the top nav "blog" page link
    Then I validate the loaded page

  @TopNav @MainContact @Contact
  Scenario: Check the top menu link 'Contact'
    Given I navigate to Betabreakers.com
    When I access the top nav "contact" page link
    Then I validate the loaded page