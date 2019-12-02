@FunctionalTest @SmokeTest @RegressionTest
Feature: To check the Top Nav links available from base Beta Breakers website page and verify link(s) function

  @ScenarioOutlineTopNav
  Scenario Outline: Check all Top Nav Links
    Given I navigate to Betabreakers.com
    When I access the top nav "<linkName>" page link
    Then I validate the loaded page
    Then I close the browser
    Examples:
      |linkName |
      |services |
      |whyTest  |
      |company  |
      |blog     |
      |contact  |
