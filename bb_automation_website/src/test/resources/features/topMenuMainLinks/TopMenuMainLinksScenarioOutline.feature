@FunctionalTest @SmokeTest @RegressionTest
Feature: Check BB Site Top Nav links function - Outline

  @ScenarioTopNav
  Scenario Outline: Check all Top Nav Links
    Given I navigate to Betabreakers.com
    When I access the top nav "<linkName>" page link
    Then I validate the loaded page
    Examples:
      |linkName |
      |services |
      |whyTest  |
      |company  |
      |blog     |
      |contact  |
