@All
Feature: Non Digital Receipt Approval

Background: 
 
When user navigate on operation dropdown menu
When user navigate on approval management option
Then user click on Non Digital Receipt approval option

@edit
Scenario: Verify user able to edit Non Digital Receipt successfully

When user select "01/01/2025" as from date
When user click on search button
When user click on actions option
When user click on edit option
When user select "Card Payment" as mode
When user enter "48658" as Cheque/ Reference Number
When user select "Akiba Commercial Bank Plc." as collecting bank
And user click on update button
And user able to view "1003-Information modified successfully" as message

@approve
Scenario: Verify user able to approve Non Digital Receipt successfully

When user select "01/01/2025" as from date
When user click on search button
When user click on actions option
When user click on approve option
And user click on approve button
And user able to view "1007-Information approved successfully" as message

@reject
Scenario: Verify user able to reject Non Digital Receipt successfully

When user select "01/01/2025" as from date
When user click on search button
When user click on actions option
When user click on reject option
And user click on reject button
And user able to view "1023-Information rejected successfully" as message

