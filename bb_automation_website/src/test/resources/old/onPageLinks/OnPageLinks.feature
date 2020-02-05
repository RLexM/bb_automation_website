@FunctionalTest @SmokeTest @RegressionTest
Feature: Find and check all on-page links

#  Background:
#    Given I navigate to Betabreakers.com
  @OnPageLinks @MainPage
  Scenario: To check the links on the page
    When I get the on-page links from the page
    Then I click the first link
    Then I validate the navigation to the link
    Then I click the second link

#    Then I close the browser
