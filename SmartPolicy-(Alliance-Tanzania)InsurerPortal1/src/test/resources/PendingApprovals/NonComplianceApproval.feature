@All
Feature: Non-Compliance Quotations Approval

Background: Launch browser and open application

When user click on branch portal menu
When user click on quotations menu
When user click on add button
When user click on select insurance type dropdown
When user enter "Bonds" to search insurance type in search box
When user select Bonds as insurance type from dropdown
When user enter "Pravin Testing" as client name
When user select Pravin Testing as client name
When user enter "123459876501234" as cover note
When user click on insurance class dropdown
When user enter "Advance Payment Bond 1" as insurance class
When user select Advance Payment Bond one as insurance class
When user enter "200000" as contract value
When user enter "Bonds Quotation" as description
When user click on compute button
When user click on insert button
When user click on broker partner name dropdown
When user select hivohivo as broker partner name
When user click on save button
When user click on capture receipt icon
When user click on mode dropdown
When user enter "Electronic Funds Transfer (EFT)" as mode
When user select Electronic Funds Transfer (EFT) as mode
When user click on issuer bank dropdown
When user enter "Absa Group Limited" as issuer bank
When user select Absa Group Limited as issuer bank
When user click on collecting bank dropdown
When user enter "Uchumi Commercial Bank" as collecting bank
When user select Uchumi Commercial Bank as collecting bank
When user enter "1250" as reference No
When user click on proceed button 
Then user able to view "Pending" as status
When user click on issue risk note option
When user click on yes button for confirmation
#Then user able to view "Required Approval(Credit Limit exhausted)" as status
When user click on insurer portal menu

When user navigate on operation dropdown menu
When user navigate on pending approvals option
Then user click on non-compliance quotation approval option

Scenario: (Non-Compliance Approval)Verify user able to approve non compliance approval successfully

When user enter "115" as quote no 
Then user click on search button
When user click on display option
Then user click on update&approve button
When user click on branch portal
When user click on quotations menu
When user enter "115" as quote no
And user click on search button
#Then user able to view "Pending" as status
When user click on issue risk note option for pending status
And user click on yes button for confirmation
Then user able to view "Risk Note Issued" as status