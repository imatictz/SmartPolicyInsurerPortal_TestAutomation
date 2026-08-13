@All
Feature: Manage claims

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
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

#Bonds
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


@ManageBondsClaims
Scenario: (Manage Bonds Claim)Verify user able to manage claims successfully


#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user click on claims handler
When user select "01/01/2025" as from date
When user enter "Bonds" as cover information
#When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on process claim option
When user click on edit claim icon
When user click on select icon

When user enter claimant details :
| Field                              | Value               |
| Claimant Category                  | Insured             |
| Claimant Status                    | Individual          |
| Gender                             | Male                |
| Claimant Birth Date                | 01-Jan-2000         |
| KYC ID Type                        | Birth Certificate   |
| KYC ID Number                      | 23165231652315      |
| Reported Type                      | Mobile App          |
| Claimant Loss Type                 | Accidental Damage   |
| Country of Claimant                | Tanzania            |
| Region/City of Claimant            | Dodoma              |
| District of Claimant               | Bahi                |
| Claimant Name                      | Pravin Testing      |
| Claimant Circumstances             | Motor Cycle Rider   |
| Expected Claim Amount              | 700000              |
| Initial Reserve Amount             | 100000              |
| Circumstances of the Loss Event    | Driver side         |
| Reported By                        | Pravin              |
| First Loss Payee                   | Payee               |
When user select reported time
#When user select time of loss
When user enter "pravin@gmail.com" as email
Then user click on insert claimant button
And user able to view "Data inserted successfully" as success message
#Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on attachment option
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
#When user select file to upload
#And user click on upload button
#Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
#Then user able to view "AUTO-1" as received by status for second document received

#Feedback-Assigned to Assessor
When user click on activities option
When user enter assigned to assessor details:
      | Field                    | Value                                      |
      | status                   | Assigned to Assessor                       |
      | assessor                 | Africa Loss Assessors Limited              |
      | assessment option        | External                                   |
      | vehicle at garage        | A B Motors Ltd                             |
      | currency                 | US Dollars                                 |
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully





@ManageBurglaryClaims
Scenario: (Manage Burglary Claim)Verify user able to manage claims successfully
#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully


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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Fidelity" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Fire Class" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Group Life" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Medical" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Pension" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully

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

#Claim Management
When user navigate on operation dropdown menu
When user navigate on claims management option
Then user click on manage claims option
When user select "01/01/2025" as from date
When user enter "Vehicle" as cover information
When user enter claim id
And user click on search button

#Edit Claim
#Claimant Details
Then user able to view "Intimation Accepted" as status
And user clicks on the actions dropdown
When user click on edit claim icon
When user click on select icon

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
And user click on update button
Then user able to view "Issue Claim Note" as status

#Upload Documents

When user click on exit button
And user clicks on the actions dropdown
When user click on upload documents icon
#When user select "Completed claim form" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload
#Claims Documents Checklist

#When user select Completed claim form checkbox as document received
#Then user able to view "AUTO-1" as received by status for first document received
#2nd document upload

#When user select "Employment details including employment contract, salary slip, ID, resignation letter (if any)" as attachment type
When user select file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" status after document upload

#Claims Documents Checklist
#When user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received
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
      | Assessment Date          | Today                                      |
      | Reference Date           | Today                                      |  
When user select repair checkbox as assessor decision
When user click on save button to save feedback
Then user able to view "1001-New information recorded successfully" status after feedback saved successfully


#Issue Claim Note
Given user click on claim note icon
When user enter claim note details:
      | Field                           | Value                                      |
      | Payee Type                      | Garage                                     |
      | Payee Name                      | A B Motors Ltd                             |
      | Claim Note Amount               | 50000                                      |
      | First Excess                    | Fixed Amount                               |
      | Second Excess                   | Fixed Amount                               |
      | Under insurance contribution    | 500                                        |
      | Less Betterment/Depreciation    | 500                                        |
      | First Excess Percent            | 5                                          |
      | Second Excess Percent           | 5                                          |
      | Young / Inexperience Driver     | 5                                          |
      | Other Deduction                 | 500                                        |
      | Recomendation                   | claim note                                 |
When user select Amount Includes WH Amount checkbox
When user select Add VAT checkbox
When user select Amount Includes VAT checkbox
And user click on save button to save claim note details
Then user able to view "1001-New information recorded successfully" status after claim note details saved successfully




