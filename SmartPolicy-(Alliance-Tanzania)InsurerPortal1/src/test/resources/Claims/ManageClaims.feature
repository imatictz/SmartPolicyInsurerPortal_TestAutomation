@All
Feature: Manage claims

Background: 

When user navigate on operation dropdown menu
And user navigate on claims management menu
Then user click on manage claims option
Then user select "Maverick insurance branch limited company" as company name 
And user enter "01/01/2023" as from date 
And user enter "3" as risk note
When user click on search button
Then user click on display icon 

@ManageClaims
Scenario: Verify user able to manage claims successfully
#Edit Claim
When user click on edit claim icon
When user select "Insured" as claimant category
When user select "Individual" as claimant status
And user select "Male" as gender
And user enter "01/01/2000" as claimant birth date
When user select "Birth Certificate" as claimant ID
Then user enter "23165231652315" as id number
Then user select "Accidental Damage" as claimant loss type
When user enter "Pravin Testing" as claimant name
Then user enter "700000" as expected claim amount
And user enter "1000000" as initial reserve amount
Then user click on insert claimant button
And user click on update button
Then user able to view "Issue Claim Note" as status

#Claim Reserve (Checking reserve amount)
When user click on display icon to check claim reserve 
When user click on claim reserve icon 
Then user able to view "Approved" as status in reserve transactions

#Assigned to assessor/loss adjustor
When user click on feedback icon
When user select "assigned to assessor/loss adjustor" as status from dropdown
And user select "Pravin Testing" as claimant from dropdown
When user select "Internal Assessor" as assessor from dropdown
And user select "External-Registered Insurance Adjuster" as Loss Assessment Option from dropdown
When user select "National ID" as assessor id from dropdown
And user enter "NA125103400" as assessor id number
Then user click on save button

#Receiving report (Received Preliminary Report)
When user select "Received Preliminary Report" as status from dropdown for Preliminary Report
When user select "Internal Assessor" as assessor from dropdown for Preliminary Report
And user enter "75000" as assesed amount for Preliminary Report
Then user enter "1254Ref" as reference number for Preliminary Report
Then user click on save button

#Receiving report (Received Final Report)
#When user select "Received Final Report" as status from dropdown for Final Report
#When user select "Internal Assessor" as assessor from dropdown for Final Report
#And user enter "72000" as assesed amount for Final Report
#Then user enter "1254Ref" as reference number for Final Report
#Then user click on save button

#Issue Claim Note
When user click on issue claim note icon
And user select "Pravin Testing" as claimant name from dropdown
Then user enter "80000" as claim amount
When user select "Internal Assessor" as assessor from dropdown for claim note
Then user select "Insured" as claimant payee from dropdown
And user click on excess applicable checkbox
When user select "Excess on Claim Amount" as first excess from dropdown
And user enter "1" as excess percent for first excess
Then user enter "1000" as excess amount for first excess
When user select "Excess on Claim Amount" as second excess from dropdown
And user enter "1.5" as excess percent for second excess
Then user enter "1000" as excess amount for second excess
Then user enter "5000" as total claim excess
When user enter "1000" as less betterment/Depreciation
When user enter "1000" as young/Inexperience Driver 
And user enter "1000" as salvage
Then user enter "1000" as under insurance contribution
Then user click on amount includes withhold tax checkbox
And user enter "Claim Note" as recomendation
Then user click on save button

#Approving Claim Note
When user click on dispay icon 
And user click on approve icon 
Then user click on approve button
When user click on accept icon 
And user enter "07/11/2023" as reference date
And user enter "1254412" as reference number
Then user enter "08/11/2023" receive date

#Payment Requistion
When user click on Payment Requistion icon 


