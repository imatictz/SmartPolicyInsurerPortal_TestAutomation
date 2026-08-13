@All
Feature: All Receipts

Background: Launch browser and open application

When user navigate on operation dropdown menu
When user navigate on premium collection option
And user navigate on Direct premium option
Then user click on all receipts option

@reconcile
Scenario: (All Receipts)Verify user able to reconcile details successfully
When user select "01/01/2026" as from date
When user click on search button for "Allocated" status
When user enter receipt no for "Allocated" status
When user click on search button
When user click on actions option
When user click on reconcile option
When user click on save button
And user able to view "1001-New information recorded successfully" as message

@print
Scenario: (All Receipts)Verify user able to print receipts details successfully
When user select "01/01/2026" as from date
When user click on search button for "Allocated" status
When user enter receipt no for "Allocated" status
When user click on search button
When user click on actions option
When user click on print option
And the receipts should include all relevant details like
      | Field              | 
      | Receipts           |
      | Client Name        |
      | Total Amount       |
      
@cancel
Scenario: (All Receipts)Verify user able to cancel details successfully
When user select "01/01/2026" as from date
When user click on search button for "Allocated" status
When user enter receipt no for "Allocated" status
When user click on search button
When user click on actions option
When user click on cancel option
And user click on cancel button
And user able to view "2009-Transaction Cancelled Successfully" as message
Then user able to view "Cancelled" as status(All Receipts)

@revoke
Scenario: (All Receipts)Verify user able to revoke details successfully
When user select "01/01/2026" as from date
When user click on search button for "Cancelled" status
When user enter receipt no for "Cancelled" status
When user click on search button
When user click on actions option
When user click on revoke option
And user click on revoke button
And user able to view "2010-Transaction Revoked Successfully." as message
Then user able to view "Pending" as status(All Receipts)
      