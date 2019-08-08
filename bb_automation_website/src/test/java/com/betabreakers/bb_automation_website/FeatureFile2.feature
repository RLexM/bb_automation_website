Feature: To check that the main website pages have loaded in http://www.betabreakers.com

  Scenario: To check that the Betabreakers Main page has loaded
    Given I navigate to Betabreakers.com
    When I navigate to the Services page
    Then the page services should be visible
    When I navigate to the why test page
    Then the page why test should be visible
    When I navigate to the company page
    Then the page company should be visible
    When I navigate to the blog page
    Then the page blog should be visible
    When I navigate to the contact page
    Then the page contact should be visible

   Scenario: To check the drop-down menu links for "Services"
     Given I navigate to Betabreakers.com
     When I mouse over the Services menu
     Then I click the Functionality Testing link
