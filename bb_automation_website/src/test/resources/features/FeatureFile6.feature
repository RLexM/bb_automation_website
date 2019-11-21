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


#  Scenario: To check the top menu Services sub-links
#    When I click the "functionality" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#    When I click the "functionality" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#  #automated
#  compatibility
#  website
#  mobile
#  usability
#  testplan
#  localization
#  load
#  accessibility

#  Scenario: To check the top menu Industries sub-links
#    When I click the "branding" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#  branding
#  webdev
#  healthcare
#  educational
#  entertainment
#  business
#  retail

#  Scenario: To check the top menu Why Test? sub-links
#    When I click the "process" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#  process
#  outsource
#  hire
#  faq

#  Scenario: To check the top menu Company sub-links
#    When I click the "testimonals" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#    When I click the "team" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page
#    When I click the "career" menu item
#    Then I wait for the page to load
#    Then I validate the loaded page

      #Then I quit the browser


#  Scenario: To check the top menu sub-links
#    When I mouse over the "services" menu
#    Then I click the top nav menu items
#    Then I wait for the page to load
#    Then I validate the loaded page
#    |functionality|







  #Scenario: To check the top menu main links
    #When I access the "services" page
    #Then I validate the loaded page
    #Then I validate the "services" page
    #When I access the "why test" page
    #Then I validate the loaded page
    #Then I validate the "why test" page
    #When I access the "company" page
    #Then I validate the loaded page
    #Then I validate the "company" page
    #When I access the "blog" page
    #Then I validate the loaded page
    #Then I validate the "blog" page
    #When I access the "contact" page
    #Then I validate the loaded page
    #Then I validate the "contact" page


  #Scenario: To check the top menu main links
    #When I access the "top_nav" page
    #Then I validate the loaded page
    #|top_nav    |
    #|services   |
    #|why test   |
    #|company    |
    #|blog       |
   # |contact    |









    # Hard-Coded Scenarios/steps -------

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



    #When I mouse over Services and click Functionality
    #Then I wait for the Functionality page to load
    #Then I validate the Functionality page loaded correctly

    #When I mouse over Services and click Automation
    #Then I wait for the Automation page to load
    #Then I validate the Automation page loaded correctly

    #When I mouse over Services and click Compatibility
    #Then I wait for the Compatibility page to load
    #Then I validate the Compatibility page loaded correctly

  #Scenario: I get a variable from the log



     #Then I click the Functionality Testing link
