@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Top Nav link(s) function

  Background:
    Given I navigate to Betabreakers.com
  @TopNav @MainServices @Services
  Scenario: Check the top menu link 'Services'
    When I access the top nav "services" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @MainWhyTest @WhyTest
  Scenario: Check the top menu link 'Why Test?'
    When I access the top nav "whyTest" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @MainCompany @Company
  Scenario: Check the top menu link 'Company'
    When I access the top nav "company" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @MainBlog @Blog
  Scenario: Check the top menu link 'Blog'
    When I access the top nav "blog" page link
    Then I validate the loaded page
    Then I close the browser

  @TopNav @MainContact @Contact
  Scenario: Check the top menu link 'Contact'
    When I access the top nav "contact" page link
    Then I validate the loaded page
    Then I close the browser