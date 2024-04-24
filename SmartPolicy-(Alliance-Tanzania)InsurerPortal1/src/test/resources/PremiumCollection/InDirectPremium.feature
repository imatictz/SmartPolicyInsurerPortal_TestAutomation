@All
Feature: Receipts

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on premium collection option
And user navigate on In-Direct premium option
Then user click on receipts option
When user click on add button to enter receipts details

@AllFields
Scenario: (Receipts)Verify user able to enter all fields and save receipts details successfully
When user click on broker name dropdown 
And user enter "Demo Insurance Brokers (T) Limited." as broker name 
Then user select Demo Insurance Brokers (T) Limited. as broker name 
When user enter "142000" as amount
When user click on mode dropdown
And user enter "Card Payment" as mode
Then user select Card Payment as mode
When user click on issuer bank dropdown
And user enter "Amana Bank Limited" as issuer bank 
Then user select Amana Bank Limited as issuer bank
When user enter "48658" as Cheque/ Reference Number
When user click on collecting bank dropdown
And user enter "Akiba Commercial Bank Plc." as collecting bank
Then user select Akiba Commercial Bank Plc. as collecting bank
When user enter "Testing 124155 %$^ as RECEIPTS" as notes
When user enter "145ASW" as refrence id
And user click on save button
Then user able to view "Pending" as status


@MandatoryFields
Scenario: Verify user able to enter mandatory fields and save receipts details successfully
When user click on broker name dropdown 
And user enter "Demo Insurance Brokers (T) Limited." as broker name 
Then user select Demo Insurance Brokers (T) Limited. as broker name 
When user enter "415252" as amount
When user click on mode dropdown
And user enter "Card Payment" as mode
Then user select Card Payment as mode
When user enter "48658" as Cheque/ Reference Number
When user enter "Testing 1452ADqws %$^ as RECEIPTS" as notes
And user click on save button
Then user able to view "Pending" as status