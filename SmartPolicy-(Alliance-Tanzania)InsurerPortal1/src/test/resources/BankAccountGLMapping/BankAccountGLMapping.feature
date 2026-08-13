@All
Feature: Bank Account GL Mapping (Digital Receipts Only)

Background: 
 
When user navigate on operation dropdown menu
And user navigate on GL management
Then user click on Bank Account GL Mapping (Digital Receipts Only) option

@AllFields1
Scenario: Verify user able to save mapping successfully (For On-Premise System Type)
When user click on add button
And user select "On-Premise System" as type
Then user select "Demo Insurance Company Limited - Branch" as intermediary type
When user enter "Cash" as payment mode
Then user select "NMB Bank" as mapped payment mode
When user select "Tanzanian Shillings" as Ccy
When user select "ABC Bank" as GL bank account
And user click on save button

@AllFields2
Scenario: Verify user able to save mapping successfully (For On-Cloud System Type)
When user click on add button
And user select "On-Cloud System" as type
When user enter "Cash" as payment mode
Then user select "NMB Bank" as mapped payment mode
When user select "Tanzanian Shillings" as Ccy
When user select "ABC Bank" as GL bank account
And user click on save button