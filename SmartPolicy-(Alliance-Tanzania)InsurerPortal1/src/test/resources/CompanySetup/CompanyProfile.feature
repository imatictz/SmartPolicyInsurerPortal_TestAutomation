@All
Feature: Company Profile

Background: 

When user navigate on setup dropdown menu
When user navigate on company setup
Then user click on company profile option

@edit
Scenario: Verify user able to edit company profile details successfully
When user enter "Automated Testing Company" as company name
When user enter "Automated" as short name
When user enter "Dar ,Tanzania" as address1
When user enter "pravintest@gmail.com" as email
When user enter "215615REF" as reference no
When user enter "smartpolicy.itl.co.tz" as url
When user enter "12542565" as VRN
When user enter "48126" as TIN
When user enter "Automated Testing Insurance Company" as Company Disclamer
And user click on save button
Then user able to view "1003-Information modified successfully" as message
