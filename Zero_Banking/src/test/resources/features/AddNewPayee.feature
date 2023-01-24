Feature: Add new payee under pay bills

  Background:
    Given User navigates to the url
    When User enters the valid Login
    And User enters valid Password
    And User clicks on Sign-in Button
    And User click on online banking
    And User clicks on Pay Bills option
    Then User should verify Add new payee tab


  Scenario: Add a new payee
    Given Add New Payee tab
    When creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee Details | XYZ account                              |

    Then message "The new payee The Law Offices of Hyde, Price & Scharks" was successfully created. should be displayed
