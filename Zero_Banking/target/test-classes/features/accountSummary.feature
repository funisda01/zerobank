Feature: Account Summary

  Background:
    Given User navigates to the url
    When User enters the valid Login
    And User enters valid Password
    And User clicks on Sign-in Button
    Then Any User should verify the homepage

  @wip
  Scenario: User should click on account summary
    Given User click on online banking
    When User click on account summary
    Then Any user should verify zero account page
