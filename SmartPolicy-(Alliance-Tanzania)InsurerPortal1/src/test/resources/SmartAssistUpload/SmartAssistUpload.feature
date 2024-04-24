@All
Feature: Smart Assist Upload

Background: 
 
When user navigate on tools dropdown menu
Then user click on Smart Assist Upload option

@AllFields
Scenario: Verify user able to save Smart Assist Upload details successfully
When user click on add button
When user enter "Pravin Testing" as insured name
When user select "Demo Insurance Broker (India)" as broker
When user enter "462REG45" as vehicle registration
When user enter "POLICY4150EW" as policy No
When user enter "TVS" as vehicle make
When user enter "SCOOTY" as vehicle model
When user enter "testsmart@gmail.com" as email ID
When user enter "659544202" as mobile No
And user click on save button
Then user able to view "Created" as status