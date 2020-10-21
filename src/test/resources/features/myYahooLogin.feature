Feature: Login yahoo account feature

  Scenario: test login is successful with valid credentials
    Given yahoo home page is open on chrome browser
    When when user clicks on sign in botton
    Then user is navigated to yahoo login page
    When user enters valid user name
    And user clicks on next button
    Then user is navigated to password entry page
    When user enters valid password
    And user clicks on the next button
    Then user is navigated to home page
