Feature: Purchase Foreign Currency

  Background:
    Given User navigates to the url
    When User enters the valid Login
    And User enters valid Password
    And User clicks on Sign-in Button
    And User click on online banking
    And User clicks on Pay Bills option

  @wip
  Scenario: Available currencies
    Given the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  Scenario: Error message for not selecting currency
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed

  Scenario: Error message for not entering value
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without entering a value
    Then error message should be displayed
