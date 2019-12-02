@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the Top Nav links available from base Beta Breakers website page and verify link(s) function

  Background:
    Given I navigate to Betabreakers.com
  @TopNav @Services @TestServices
  Scenario: Check the top menu link 'Services'
    When I access the top nav "services" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @WhyTest
  Scenario: Check the top menu link 'Why Test?'
    When I access the top nav "whyTest" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @Company
  Scenario: Check the top menu link 'Company'
    When I access the top nav "company" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @Blog
  Scenario: Check the top menu link 'Blog'
    When I access the top nav "blog" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @Contact
  Scenario: Check the top menu link 'Contact'
    When I access the top nav "contact" page link
    Then I validate the loaded page
    Then I close the browser