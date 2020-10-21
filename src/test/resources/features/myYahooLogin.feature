# Data driven parameterized test
# Scenario --> Scenario Outline
# Varibles in <> brackets
# Examples added with header, and data/values
# Changed Step Definiation file accordingly

Feature: Login yahoo account feature

  Scenario Outline: test login is successful with valid credentials
    Given yahoo home page is open on chrome browser
    When when user clicks on sign in botton
    Then user is navigated to yahoo login page
    When user enters valid <username>
    And user clicks on next button
    Then user is navigated to password entry page
    When user enter the valid <password>
    And user clicks on the next button
    Then user is navigated to home page

    Examples: 
      | username       | password |
      | sadat_tashkeel | azwama01 | # Test should pass with this data
      | ifath          | zoyama01 | # Test should fail with this data
