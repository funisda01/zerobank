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

  @Ismail
    Scenario: User click the Online Banking Button
      Given User click on online banking
      When User click on account summary
      Then User verifies the Cash Accounts is displayed
      And User verifies the Investment Accounts is displayed
      And User verifies the Credit Accounts is displayed
      And User verifies the Loan Accounts is displayed

    Scenario: Credit Accounts Table columns
      Given User click on online banking
      When User click on account summary
      Then User verifies Credit Accounts table has Account column
      And User verifies Credit Accounts table has Credit Card column
      And User verifies Credit Accounts table has Balance column