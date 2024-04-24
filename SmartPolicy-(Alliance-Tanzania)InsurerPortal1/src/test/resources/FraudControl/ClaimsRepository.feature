@All
Feature: Claims Repository

Background: 
 
When user navigate on tools dropdown menu
And user navigate on fraud control menu
Then user click on Claims Repository option

@AllFields
Scenario: Verify user able to save Claims Repository details successfully
When user click on add button
When user enter "Pravin Testing" as insured name
When user enter "654156SE21561SED" as vehicle reg no
When user enter "TVS" as vehicle make
When user enter "SCOOTY" as vehicle type
When user enter "#5656566565GDTE441334#" as chassis No
When user enter "25152ENG55" as engine No
When user enter "POLICY5414" as policy No
When user enter "481267485102458" as cover note
When user enter "12518" as risk note
When user enter "154200" as claim amount
And user click on save button