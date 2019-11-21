Feature: To check that the main website pages have loaded in betabreakers site

  Background:
    Given I navigate to Betabreakers.com


# Services

  Scenario: To check the top menu 'Services' sub-links
# functionality
    When I click the "functionality" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# automated
    When I click the "automated" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# compatibility
    When I click the "compatibility" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# website
    When I click the "website" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# mobile
    When I click the "mobile" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# usability
    When I click the "usability" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# testplan
    When I click the "testplan" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# localization
    When I click the "localization" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# load
    When I click the "load" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# accessibility
    When I click the "accessibility" menu item
    Then I wait for the page to load
    Then I validate the loaded page

# Industries

  Scenario: To check the top menu 'Industries' sub-links
#  branding
    When I click the "branding" menu item
    Then I wait for the page to load
    Then I validate the loaded page
# webdev
    When I click the "webdev" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  healthcare
    When I click the "healthcare" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  educational
    When I click the "educational" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  entertainment
    When I click the "entertainment" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  business
    When I click the "business" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  retail
    When I click the "retail" menu item
    Then I wait for the page to load
    Then I validate the loaded page

# Why Test?

  Scenario: To check the top menu 'Why Test?' sub-links
#  process
    When I click the "process" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  outsource
    When I click the "outsource" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  hire
    When I click the "hire" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  faq
    When I click the "faq" menu item
    Then I wait for the page to load
    Then I validate the loaded page

# Company

  Scenario: To check the top menu Company sub-links
#  testimonials
    When I click the "testimonials" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  team
    When I click the "team" menu item
    Then I wait for the page to load
    Then I validate the loaded page
#  careers
    When I click the "careers" menu item
    Then I wait for the page to load
    Then I validate the loaded page

    Then I close the browser