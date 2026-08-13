@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user navigate on approval management option
Then user click on claim approval option

@ManageAccidentalDamageClaims
Scenario: (Manage Accidental Damage Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as cover information
When user select "All" as branch
When user click on search button to find "Individual Personal Accident" claim
When user enter claim id to search "Individual Personal Accident" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


@ManageBondsClaims
Scenario: (Manage Bonds Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Bonds" as cover information
When user select "All" as branch
When user click on search button to find "Bonds" claim
When user enter claim id to search "Bonds" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


@ManageBurglaryClaims
Scenario: (Manage Burglary Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as cover information
When user select "All" as branch
When user click on search button to find "Burglary/Theft" claim
When user enter claim id to search "Burglary/Theft" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


@ManageCreditLifeClaims
Scenario: (Manage Credit Life Insurance Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as cover information
When user select "All" as branch
When user click on search button to find "Credit Life Insurance" claim
When user enter claim id to search "Credit Life Insurance" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


@ManageFidelityClaims
Scenario: (Manage Fidelity Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Fidelity" as cover information
When user select "All" as branch
When user click on search button to find "Fidelity" claim
When user enter claim id to search "Fidelity" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@ManageFireBurglaryClaims
Scenario: (Manage Fire and Burglary Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as cover information
When user select "All" as branch
When user click on search button to find "Fire and Burglary" claim
When user enter claim id to search "Fire and Burglary" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@ManageFireClassClaims
Scenario: (Manage Fire Class Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Fire Class" as cover information
When user select "All" as branch
When user click on search button to find "Fire Class" claim
When user enter claim id to search "Fire Class" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@ManageGroupLifeClaims
Scenario: (Manage Group Life Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Group Life" as cover information
When user select "All" as branch
When user click on search button to find "Group Life" claim
When user enter claim id to search "Group Life" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@ManageMedicalClaims
Scenario: (Manage Medical Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Medical" as cover information
When user select "All" as branch
When user click on search button to find "Medical" claim
When user enter claim id to search "Medical" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


@ManagePensionClaims
Scenario: (Manage Pension Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Pension" as cover information
When user select "All" as branch
When user click on search button to find "Pension" claim
When user enter claim id to search "Pension" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@ManageMotorClaims
Scenario: (Manage Motor Claim)Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Vehicle" as cover information
When user select "All" as branch
When user click on search button to find "Vehicle" claim
When user enter claim id to search "Vehicle" claim
When user click on search button
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message





















