@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user navigate on policy management option
When user Click on risk note menu

@reportBondsClaims
Scenario: (Report Bond Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportBurglaryClaims
Scenario: (Report Burglary/Theft Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Accidental Damage" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportCreditLifeClaims
Scenario: (Report Credit Life Insurance Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Critical Illness(CI)" as nature of loss/claim type
When user enter date of death/illnes/others
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportFidelityClaims
Scenario: (Report Fidelity Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportFireBurglaryClaims
Scenario: (Report Fire and Burglary Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportFireClassClaims
Scenario: (Report Fire Class Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Fire Class" as Insurance Type
When user click on search button to find "Fire Class" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message

@reportGroupLifeClaims
Scenario: (Report Group Life Claim) Verify user able to report claim successfully
When user select "01/01/2026" as from date (RiskNote)
When user enter "Group Life" as Insurance Type
When user click on search button to find "Group Life" risk note
#Loss Event Details

When user select "Tanzania" as country
When user select "Dodoma" as region/City of loss
When user select "Bahi" as district of loss
When user select time of loss
When user enter date of loss/Accident
And user select "Accident" as cause of loss/Accident
Then user enter "Near new street" as place of loss/Accident

#Claimant Details
When user select "Phone" as reported type
When user enter "Pravin" as reported by
When user enter reported date
When user select reported time
When user select "Others" as nature of loss/claim type
When user select "Driver" as claimant circumstances
When user enter "100000" as claimant amount
When user enter "Cargo Loss" as circumstances of accidents
And user click on save button
Then user able to view "Created" as status (RiskNote)
When user click on display option
And user click on accept button

#Claim Registration Details(Claim Reserve)
When user enter "10000" as initial claims reserve
When user select assign assessor checkbox
When user select assign investigator checkbox
When user select assign loss adjustor/Suryevor checkbox
And user click on register new claim botton
Then user able to view "Claim intimation accepted successfully" as success message


