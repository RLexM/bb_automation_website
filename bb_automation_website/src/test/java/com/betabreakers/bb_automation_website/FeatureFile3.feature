Feature: To check that the main website pages have loaded in http://www.betabreakers.com

  #Scenario: To check that the Betabreakers Main page has loaded
    #Given I navigate to Betabreakers.com
    #When I navigate to the Services page
    #Then the page services should be visible
    #When I navigate to the why test page
    #Then the page why test should be visible
    #When I navigate to the company page
    #Then the page company should be visible
    #When I navigate to the blog page
    #Then the page blog should be visible
    #When I navigate to the contact page
    #Then the page contact should be visible

  Scenario: To check the drop-down menu links for "Services"
    Given I navigate to Betabreakers.com
    When I access the "services" page
    Then I validate the "services" page


    #When I mouse over Services and click Functionality
    #Then I wait for the Functionality page to load
    #Then I validate the Functionality page loaded correctly

    #When I mouse over Services and click Automation
    #Then I wait for the Automation page to load
    #Then I validate the Automation page loaded correctly

    #When I mouse over Services and click Compatibility
    #Then I wait for the Compatibility page to load
    #Then I validate the Compatibility page loaded correctly

  Scenario: I get a variable from the log



     #Then I click the Functionality Testing link
