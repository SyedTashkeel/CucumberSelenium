#Comment - Author: Syed
#Commnet - Cucumber Feature file creation

@SmokeFeatureTest
Feature: To test login functionality

	@SmokeTest
  Scenario: Check if login is successful with valid Credentials
    Given user is on the login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to user account page

 # Scenario Outline: Check if login is successful with valid Credentials
   #  Given user is on the login page
   #  When user enters <username> and <password>
   #  And clicks on login button
   #  Then user is navigated to user account page

   #  Examples: 
   #   | username | Password |
   #   | user01   | user123  |
   #   | user02   | user456  | 
