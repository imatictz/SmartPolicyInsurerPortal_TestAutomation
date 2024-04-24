@All
Feature: Claims

Background: 
 
When user click on branch portal menu
When user navigate on operation dropdown menu
When user Click on risk note menu
When user select "01/01/2023" as from date
When user enter "63" as risk note number
When user click on search button
When user click on options button
When user click on report claim umbrella like button 
When user click on intimation type dropdown
When user enter "Phone" as intimation type
When user select Phone as intimation type
When user click on country of loss dropdown
When user enter "Tanzania" as country of loss			
When user select Tanzania as country of loss
When user click on cause of loss/accident dropdown
When user enter "Burglary" as cause of loss/accident
When user select Burglary as cause of loss/accident
When user click on region/city dropdown
When user enter "Dodoma" as region/city
When user select Dodoma as region/city 
When user click on district dropdown
When user enter "Bahi" as district
When user select Bahi as district
When user enter "15/09/2023" as date of loss/Accident
When user enter "Travelling line" as place of loss/accident
When user enter "Testing Circumstances of the accident" as Circumstances of the accident
When user enter "Testing Third Party Insurance Information (Insurer/Cover)" as Third Party Insurance Information (Insurer/Cover)
When user enter "Testing Nature of Loss" as Nature of Loss 
When user click on claimant loss type dropdown
When user enter "Own Damage" as claimant loss type
When user select Own Damage as claimant loss type
When user enter "Pravin Testing" as Payee/Beneficiary
When user enter "Burglary" as Description of Injury
When user enter "Checked" as Remarks
When user click on insert claimant button
When user click on save button
#Then user able to view "Claim Reported" as status

Scenario: (Claim Approval) Verify user able to approve claim approval successfully
When user click on options icon
And user click on report to insurer option
And user click on Yes,Report button for confirmation
#Then user able to view "Claim Intimated to Insurer" as status
When user click on insurer portal menu
When user navigate on operation dropdown menu from insurer
And user navigate on pending approvals option
Then user click on claim approval
When user click on edit icon
And user click on accept button
When user click on branch portal menu
And user click on claims menu
Then user able to view "Intimation Accepted" as status2





















