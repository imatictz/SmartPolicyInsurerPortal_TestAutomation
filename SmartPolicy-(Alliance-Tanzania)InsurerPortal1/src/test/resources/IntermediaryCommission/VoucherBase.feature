@All
Feature: Commission Voucher

Background: Launch browser and open application

When user navigate on operation dropdown
When user navigate on intermediary commission option
And user click on voucher base
When user click on add button to enter Commission Voucher details

@AllFields
Scenario: (Commission Voucher) Verify user able to enter all fields and save Commission Voucher details successfully
When user click on broker name dropdown 
And user enter "hivohivo" as broker name 
Then user select Demo Insurance Brokers (T) Limited. as broker name 
When user enter "47850" as amount
When user click on mode dropdown
And user enter "Card Payment" as mode
Then user select Card Payment as mode
When user enter "48658" as Cheque/ Reference Number
When user enter "Testing 1549849 %$^ as Commission Voucher" as notes
When user enter "JBVFUH65456" as refrence id
And user click on save button
Then user able to view "Pending" as status


@MandatoryFields
Scenario: (Commission Voucher) Verify user able to enter mandatory fields and save Commission Voucher details successfully
When user click on broker name dropdown 
And user enter "hivohivo" as broker name 
Then user select Demo Insurance Brokers (T) Limited. as broker name 
When user enter "32510" as amount
When user click on mode dropdown
And user enter "Card Payment" as mode
Then user select Card Payment as mode
When user enter "35465HSDCV" as Cheque/ Reference Number
When user enter "Testing 31651 %$^ as Commission Voucher" as notes
And user click on save button
Then user able to view "Pending" as status