Feature: To check the main page links for website pages in the betabreakers site

  Background:
    Given I navigate to Betabreakers.com

  Scenario: To check the top menu main links
    When I get the links from the page
#    When I access the main "services" page
    Then I get the links from the page
    Then I close the browser
