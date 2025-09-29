@All
Feature: Claims

Background: 
 
When user navigate on operation dropdown menu
When user navigate on approval management option
Then user click on claims approval option

@BondsClaims
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





















