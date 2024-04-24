@All
Feature: Delayed Tax Invoices Approval

Background: 
 
When user click on branch portal menu
When user navigate on operation dropdown menu
When user Click on debit note/Tax invoices menu
When user select "01/01/2023" as from date
And user enter "37" as risk note number
And user click on search button
Then user click on request tax invoice option
When user click on insurer portal menu
When user navigate on operation dropdown menu from insurer
And user navigate on pending approvals option
Then user click on delayed tax invoices approvals option


Scenario: (Delayed Tax Invoices Approval) Verify user able to approve delayed tax invoices approval successfully
