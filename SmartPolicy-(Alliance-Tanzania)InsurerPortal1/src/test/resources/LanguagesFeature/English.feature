Feature: Dashboard Language Switch
  @All
  Scenario: Validate dashboard elements in English language after language switch
   When user is on dashboard page able to view "View Dashboard"
   Then user validate all dashboard page elements
   |Element      |Text|
   |Hi           |Hi|
   |UserName     |Automated|
   |Risk Notes   |Risk Notes|
   |Tax Invoices |Tax Invoices|
   |Receipts     |Receipts|
   |Claims       |Claims|
   |Renewals     |Renewals|
   |Reports      |Reports|
     