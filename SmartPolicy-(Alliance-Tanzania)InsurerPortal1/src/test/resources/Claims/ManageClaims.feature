@All
Feature: Manage claims

Background: 

When user navigate on operation dropdown menu
When user navigate on approval management option
Then user click on claim approval option

@ManageClaims
Scenario: Verify user able to manage claims successfully

#Claim Approval
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as cover information
When user select "All" as branch
When user click on search button to find "Individual Personal Accident" claim
When user enter claim id to search "Individual Personal Accident" claim
When user click on search button
When user click on display option
#And user click on accept button

#Claim Registration Details(Claim Reserve)
#When user enter "10000" as initial claims reserve
#When user select assign assessor checkbox
#When user select assign investigator checkbox
#When user select assign loss adjustor/Suryevor checkbox
#And user click on register new claim botton
#Then user able to view "Claim intimation accepted successfully" as success message

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon

When user enter claimant details :
      | Field                    | Value                                      |
      | claimant category        | Insured                                    |
      | claimant status          | Individual                                 |
      | gender                   | Male                                       |
      | claimant birth date      | 01/01/2000                                 |
      | KYC ID Type              | Birth Certificate                          |
      | KYC ID number            | 23165231652315                             |
      | reported type            | Mobile App                                 |
      | claimant loss type       | Accidental Damage                          |
      | Country of Claimant      | Tanzania                                   |
      | Region/City of Claimant  | Dodoma                                     |
      | District of Claimant     | Bahi                                       |
      | claimant name            | Pravin Testing                             |
      | Claimant Circumstances   | Motor Cycle Rider                          |
      | expected claim amount    | 700000                                     |
      | initial reserve amount   | 100000                                     |
      | Circumstances of the Loss Event| Driver side                          |
      | Reported by              | Pravin                                     |
      | First Loss Payee         | Payee                                      |
      | Reported Date            | 23/09/2025                                 |
When user select reported time
#Then user click on insert claimant button
#And user click on update button
#Then user able to view "Issue Claim Note" as status

#Upload Documents
When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist
When user select Completed claim form checkbox as document received
Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload
When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist
When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
Then user able to view "AUTO-1" as received by status for second document received

#Feedback-Assigned to Assessor
And user clicks on the actions dropdown
When user click on feedback icon
When user enter assigned to assessor details:
      | Field                    | Value                                      |
      | status                   | Assigned to Assessor                       |
      | assessor                 | Africa Loss Assessors Limited              |
      | assessment option        | In-house                                   |
      | vehicle at garage        | A B Motors Ltd                             |
      | currency                 | Tanzanian Shillings                        |
      | Assessment Fee           | 5000                                       |
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully

#Feedback-Received Final Report
When user enter Received Final Report details:
      | Field                    | Value                                      |
      | status                   | Received Final Report                      |
      | Service Provider         | Africa Loss Assessors Limited              |
      | Reference Number         | 125402Ref                                  |
      | Invoice Number           | 12568740                                   |
      | Service Fee Amount       | 500                                        |
      | Parts SubTotal           | 500                                        |
      | Labor SubTotal           | 500                                        |
      | Salvage Location         | Bahi                                       |
      | Assessed Salvage Amount  | 500                                        |
      | Current Market Value     | 500                                        |
      | Country                  | Tanzania                                   |
      | Region/City              | Dodoma                                     |
      | District                 | Bahi                                       |
      | Assessment Date          | 26-Sep-2025                                |
      | Reference Date           | 26-Sep-2025                                 |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully








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


