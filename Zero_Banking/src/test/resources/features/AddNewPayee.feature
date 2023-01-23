Feature: Add new payee under pay bills

  @wip
  Scenario Outline: Add a new payee
    Given Add New Payee tab
    And creates new payee using following "<Field>" information "<Field Value>"
    Then message "The new payee The Law Offices of Hyde, Price & Scharks" was successfully created. should be displayed

    Examples:
      | Field         | Field Value                              |
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |