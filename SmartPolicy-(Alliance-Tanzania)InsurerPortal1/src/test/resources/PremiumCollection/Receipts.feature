@All
Feature: Receipts

Background: Launch browser and open application

When user navigate on operation dropdown menu
When user navigate on premium collection option
And user navigate on In-Direct premium option
Then user click on receipts option

@AllFields
Scenario: (Receipts)Verify user able to enter all fields and save receipts details successfully
When user click on add button to enter receipts details
When user select "TestProject" as broker name 
When user enter "142000" as amount
When user select "Card Payment" as mode
When user select "Amana Bank Limited" as issuer bank 
When user enter "48658" as Cheque/ Reference Number
When user select "Akiba Commercial Bank Plc." as collecting bank
When user enter "Testing 124155 %$^ as RECEIPTS" as notes
When user enter "145ASW" as refrence id
When user select "ABC BANK" as bank to
When user select reconciled checkbox
When user select "ABC BANK" as ERP Bank Details
And user click on save button
Then user able to view "Pending" as status


@MandatoryFields
Scenario: Verify user able to enter mandatory fields and save receipts details successfully
When user click on add button to enter receipts details
When user select "TestProject" as broker name 
When user enter "142000" as amount
When user select "Card Payment" as mode
When user select "Amana Bank Limited" as issuer bank 
When user enter "48658" as Cheque/ Reference Number
When user select "Akiba Commercial Bank Plc." as collecting bank
When user enter "Testing 124155 %$^ as RECEIPTS" as notes
And user click on save button
Then user able to view "Pending" as status

@edit
Scenario: Verify user able to edit and update receipts details successfully
When user select "01/01/2026" as from date(receipts)
When user select "TestProject" broker name(receipts)
When user click on search button
When user click on actions option(receipts)
When user click on edit option(receipts)
When user select "TestProject" as broker name 
When user enter "142000" as amount
When user select "Card Payment" as mode
When user select "Amana Bank Limited" as issuer bank 
When user enter "48658" as Cheque/ Reference Number
When user select "Akiba Commercial Bank Plc." as collecting bank
When user enter "Testing 124155 %$^ as RECEIPTS" as notes
And user click on update button
Then user able to view "Pending" as status

@print
Scenario: Verify user able to edit and update receipts details successfully
When user select "01/01/2026" as from date
When user select "TestProject" broker name
When user click on search button
When user click on actions option
When user click on edit option
When user select "TestProject" as broker name 
When user enter "142000" as amount
When user select "Card Payment" as mode
When user select "Amana Bank Limited" as issuer bank 
When user enter "48658" as Cheque/ Reference Number
When user select "Akiba Commercial Bank Plc." as collecting bank
When user enter "Testing 124155 %$^ as RECEIPTS" as notes
And user click on save button
Then user able to view "Pending" as status