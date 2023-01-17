Feature: Find Transactions in Account Activity

  Background:
    Given User navigates to the url
    When User enters the valid Login
    And User enters valid Password
    And User clicks on Sign-in Button
    And the user clicks on Savings link on the Account Summary page

@wip
  Scenario: Search date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-02"

  Scenario: Search description
    Given the user accesses the Find Transactions tab
    When the user enters description “ONLINE”
    And clicks search
    Then results table should only show descriptions containing “ONLINE”
    When the user enters description “OFFICE”
    And clicks search
    Then results table should only show descriptions containing “OFFICE”
    But results table should not show descriptions containing “OFFICE”

  Scenario: Search description case insensitive
    Given the user accesses the Find Transactions tab
    When the user enters description “ONLINE”
    And clicks search
    Then results table should only show descriptions containing “ONLINE”
    When the user enters description “online” the Find Transactions tab
    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type “Deposit”
    Then results table should show at least one result under Deposit
    But results table should show no result under Withdrawal
    When user selects type “Withdrawal”
    Then results table should show at least one result under Withdrawal
    But results table should show no result under Deposit
