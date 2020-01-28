@FunctionalTest @SmokeTest @RegressionTest
Feature: To check that the main website pages have loaded in betabreakers site

  @SubMenu @SubServices @Functionality
  Scenario: To check the top menu 'Services' sub-link 'Functionality'
    When I click the "functionality" menu item
    Then I validate the loaded page

   @SubMenu @SubServices @Automated
  Scenario: To check the top menu 'Services' sub-link 'Automated'
    When I click the "automated" menu item
    Then I validate the loaded page

   @SubMenu @SubServices @Compatibility
  Scenario: To check the top menu 'Services' sub-link 'Compatibility'
     When I click the "compatibility" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Website
  Scenario: To check the top menu 'Services' sub-link 'Website'
     When I click the "website" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Mobile
  Scenario: To check the top menu 'Services' sub-link 'Mobile'
     When I click the "mobile" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Usability
  Scenario: To check the top menu 'Services' sub-link 'Usability'
     When I click the "usability" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Testplan
  Scenario: To check the top menu 'Services' sub-link 'Test Plan'
     When I click the "testplan" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Localization
  Scenario: To check the top menu 'Services' sub-link 'Localization'
     When I click the "localization" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Load
  Scenario: To check the top menu 'Services' sub-link 'Load'
     When I click the "load" menu item
     Then I validate the loaded page

   @SubMenu @SubServices @Accessibility
  Scenario: To check the top menu 'Services' sub-link 'Accessibility'
     When I click the "accessibility" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Branding
  Scenario: To check the top menu 'Industries' sub-link 'Branding'
     When I click the "branding" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Webdev
  Scenario: To check the top menu 'Industries' sub-link 'Web Development'
     When I click the "webdev" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Healthcare
  Scenario: To check the top menu 'Industries' sub-link 'Healthcare'
     When I click the "healthcare" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Educational
  Scenario: To check the top menu 'Industries' sub-link 'Educational'
     When I click the "educational" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Entertainment
  Scenario: To check the top menu 'Industries' sub-link 'Entertainment'
     When I click the "entertainment" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Business
  Scenario: To check the top menu 'Industries' sub-link 'Business'
     When I click the "business" menu item
     Then I validate the loaded page

   @SubMenu @SubIndustries @Retail
  Scenario: To check the top menu 'Industries' sub-link 'Retail'
     When I click the "retail" menu item
     Then I validate the loaded page

   @SubMenu @SubWhyTest @Process
  Scenario: To check the top menu 'Why Test?' sub-link 'Process'
     When I click the "process" menu item
     Then I validate the loaded page

   @SubMenu @SubWhyTest @Outsource
  Scenario: To check the top menu 'Why Test?' sub-link 'Outsource'
     When I click the "outsource" menu item
     Then I validate the loaded page

   @SubMenu @SubWhyTest @Hire
  Scenario: To check the top menu 'Why Test?' sub-link 'Hires'
     When I click the "hire" menu item
     Then I validate the loaded page

   @SubMenu @SubWhyTest @FAQ
  Scenario: To check the top menu 'Why Test?' sub-link 'FAQ'
     When I click the "faq" menu item
     Then I validate the loaded page

   @SubMenu @SubCompany @Testimonals
  Scenario: To check the top menu 'Company' sub-link 'Testimonials'
     When I click the "testimonials" menu item
     Then I validate the loaded page

   @SubMenu @SubCompany @Team
  Scenario: To check the top menu 'Company' sub-link 'Team'
     When I click the "team" menu item
     Then I validate the loaded page

   @SubMenu @SubCompany @Careers
  Scenario: To check the top menu 'Company' sub-link 'Careers'
     When I click the "careers" menu item
     Then I validate the loaded page