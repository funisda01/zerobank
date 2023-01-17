Feature: Login functionality


  Scenario: login with valid credentials

    Given User navigates to the url
    When User enters the valid Login
    And User enters valid Password
    And User clicks on Sign-in Button
    Then Any User should verify the homepage


  Scenario: Login with invalid Username

    Given User navigates to the url
    When User enters the invalid Login
    And User enters valid Password
    And User clicks on Sign-in Button - negative
    Then Any User should verify the error-message


  Scenario: Login with invalid password

    Given User navigates to the url
    When User enters the valid Login
    And User enters invalid Password
    And User clicks on Sign-in Button - negative
    Then Any User should verify the error-message


  Scenario: Login with invalid Username and invalid password

    Given User navigates to the url
    When User enters the invalid Login
    And User enters invalid Password
    And User clicks on Sign-in Button - negative
    Then Any User should verify the error-message


  Scenario: Login without credentials

    Given User navigates to the url
    When User keeps Login blank
    And User keeps Password blank
    And User clicks on Sign-in Button - negative
    Then Any User should verify the error-message