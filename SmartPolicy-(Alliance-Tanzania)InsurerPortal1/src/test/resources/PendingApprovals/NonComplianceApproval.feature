@All
Feature: Compliance Quotations Approval

Background: Launch browser and open application

When user navigate on operation dropdown menu
When user navigate on approval management option
Then user click on compliance quotation approval option

@ApproveAccidentQuote @ApproveQuote
Scenario: (Compliance Approval-AccidentalDamage Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Individual Personal Accident" as Insurance Type
When user click on search button to find "Individual Personal Accident" quote
When user enter quote number to search "Individual Personal Accident" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveBondsQuote  @ApproveQuote
Scenario: (Compliance Approval-Bonds Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Bonds" as Insurance Type
When user click on search button to find "Bonds" quote
When user enter quote number to search "Bonds" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveBurglaryQuote  @ApproveQuote
Scenario: (Compliance Approval-Burglary/Theft Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Burglary/Theft" as Insurance Type
When user click on search button to find "Burglary/Theft" quote
When user enter quote number to search "Burglary/Theft" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveCreditLifeQuote    @ApproveQuote
Scenario: (Compliance Approval-Credit Life Insurance Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Credit Life Insurance" as Insurance Type
When user click on search button to find "Credit Life Insurance" quote
When user enter quote number to search "Credit Life Insurance" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveFidelityQuote    @ApproveQuote
Scenario: (Compliance Approval-Fidelity Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Fidelity" as Insurance Type
When user click on search button to find "Fidelity" quote
When user enter quote number to search "Fidelity" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveFireBurglaryQuote    @ApproveQuote
Scenario: (Compliance Approval-Fire and Burglary Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Fire and Burglary" as Insurance Type
When user click on search button to find "Fire and Burglary" quote
When user enter quote number to search "Fire and Burglary" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveFireClassQuote    @ApproveQuote
Scenario: (Compliance Approval-Fire Class Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Fire Class" as Insurance Type
When user click on search button to find "Fire Class" quote
When user enter quote number to search "Fire Class" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveGroupLifeQuote    @ApproveQuote
Scenario: (Compliance Approval-Group Life Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Group Life" as Insurance Type
When user click on search button to find "Group Life" quote
When user enter quote number to search "Group Life" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveMedicalQuote     @ApproveQuote
Scenario: (Compliance Approval-Medical Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Medical" as Insurance Type
When user click on search button to find "Medical" quote
When user enter quote number to search "Medical" quote
When user click on search button
When user click on display option
And user click on approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApprovePensionQuote     @ApproveQuote
Scenario: (Compliance Approval-Pension Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Pension" as Insurance Type
When user click on search button to find "Pension" quote
When user enter quote number to search "Pension" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen

@ApproveMotorQuote     @ApproveQuote
Scenario: (Compliance Approval-Motor Quotation)Verify user able to approve non compliance approval successfully
When user select "01/01/2025" as from date
When user enter "Motor" as Insurance Type
When user click on search button to find "Motor" quote
When user enter quote number to search "Motor" quote
When user click on search button
When user click on display option
And user click on update&approve button
Then user able to view "1003-Information modified successfully" as message
Then user navigate on Compliance Quotation Approval screen





