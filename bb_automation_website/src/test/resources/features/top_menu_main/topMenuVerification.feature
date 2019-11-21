Feature: To check that the main website pages have loaded in betabreakers site

  Background:
    Given I navigate to Betabreakers.com

  Scenario: To check the top menu main links
    When I access the top nav "services" page link
    Then I validate the loaded page
    When I access the top nav "whyTest" page link
    Then I validate the loaded page
    When I access the top nav "company" page link
    Then I validate the loaded page
    When I access the top nav "blog" page link
    Then I validate the loaded page
    When I access the top nav "contact" page link
    Then I validate the loaded page
    Then I close the browser