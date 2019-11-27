@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the main page links for website pages in the betabreakers site

  Background:
    Given I navigate to Betabreakers.com
  @FooterLinks @MainPage
  Scenario: To check the bottom menu main links
    When I get the footer links from the page
    Then I click the links
    Then I validate the link
    Then I close the browser
