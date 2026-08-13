@All
Feature: Currency Setup

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on currency management option
Then user click on currency setup option


@AllFields
Scenario: Verify user able to enter currency details
When user click on add button to enter details
When user select "Burundian Franc" as currency name
When user enter "12.5" as Ccy Rate
And user click on save button
Then user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit currency details
#Search
When user enter "BIF" as code
When user enter "Burundian Franc" as name
And user click on search button
And user clicks on the actions dropdown
And user clicks on edit option

When user enter "10.5" as Ccy Rate
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit