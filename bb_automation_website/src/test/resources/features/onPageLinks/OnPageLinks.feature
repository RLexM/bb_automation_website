@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the main page links for website pages in the betabreakers site

  Background:
    Given I navigate to Betabreakers.com
  @OnPageLinks @MainPage
  Scenario: To check the links on the page
    When I access the top nav "services" page link
    Then I get the on-page links from the page
    Then I click the link
    Then I validate the navigation to the link
    Then I close the browser
