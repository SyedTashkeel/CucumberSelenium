
@TestGoogleSearchFeature
Feature: Test google search functionlity
 
  @TestGoogleSearchScenario
  Scenario: Validate Google Search is Working
  
    Given browser is open
    And user is on google search page
    When user enters text in search box
    And hits enter
    Then user is navigated to results page
   
