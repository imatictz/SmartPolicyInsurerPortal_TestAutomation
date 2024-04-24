@All
Feature: Download Risk Notes & Tax Invoices

Background: 

When user navigate on operation dropdown menu
Then user click on Download Risk Notes & Tax Invoices option

@Risk
Scenario: Verify user able to Download Risk Notes successfully
When user select "Demo Insurance Brokers (T) Limited." as select intermediary
When user select "01/11/2023" as from date 
And user click on generate file button

@TaxInvoices
Scenario: Verify user able to Download customer Tax Invoices successfully
When user select customer tax invoice radio button
When user select "Demo Insurance Brokers (T) Limited." as select intermediary
When user select "01/11/2023" as from date 
And user click on generate file button

@AllBrokerRiskNote
Scenario: Verify user able to Download Risk Notes for all broker successfully
When user select all broker only one day checkbox
When user select "01/11/2023" as from date
And user click on generate file button

@AllBrokerTaxInvoices
Scenario: Verify user able to Download customer Tax Invoices for all broker successfully
When user select customer tax invoice radio button
And user select all broker only one day checkbox
When user select "01/11/2023" as from date
And user click on generate file button
