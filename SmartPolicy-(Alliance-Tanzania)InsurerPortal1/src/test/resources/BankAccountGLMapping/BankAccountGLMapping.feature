@All
Feature: Bank Account GL Mapping (Digital Receipts Only)

Background: 
 
When user navigate on operation dropdown menu
Then user click on Bank Account GL Mapping (Digital Receipts Only) option

@AllFields
Scenario: Verify user able to save mapping successfully
When user click on add button
And user select "On-Premise System" as type
Then user select "Demo Insurance Company Limited - Branch" as intermediary type
When user enter "Cash" as payment mode
Then user select "NMB Bank" as mapped payment mode
When user select "Tanzanian Shillings" as Ccy
When user select "" as GL bank account
And user click on save button