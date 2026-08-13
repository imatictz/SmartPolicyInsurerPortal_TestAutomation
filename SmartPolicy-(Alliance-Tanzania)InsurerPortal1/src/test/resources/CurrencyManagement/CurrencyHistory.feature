@All
Feature: Currency History

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on currency management option
Then user click on currency history option


@AllFields
Scenario: Verify user able to enter currency details
When user click on add button to enter details
When user select "Burundian Franc" as currency
When user enter "12.5" as Ccy Rate
When user select "01/01/2025" as date
And user click on save button
Then user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit currency details
#Search
When user select "Burundian Franc" as currency to search
When user select "01/01/2025" as from date
And user click on search button
And user clicks on edit icon

When user enter "12.5" as Ccy Rate
When user select "01/01/2025" as date
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit