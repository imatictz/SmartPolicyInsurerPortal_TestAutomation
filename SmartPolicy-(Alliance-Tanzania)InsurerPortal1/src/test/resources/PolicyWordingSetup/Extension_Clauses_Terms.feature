@All
Feature: Extension/Clauses/Terms

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on policy wordings setup option
Then user click on Extension/Clauses/Terms option


@AllFields
Scenario: Verify user able to enter Extension/Clauses/Terms details
When user click on add button to enter details
When user select "Accident Cover" as Insurance Type
When user select "Fixed Benefit" as Insurance Class
When user enter "No plan" as Excess
When user enter "Addons" as Exclusions
When user enter "Benefits" as Scope of Cover
#When user enter "clauses for policy" as Extensions, Terms & Clauses
And user click on save button
And user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit Extension/Clauses/Terms details
#Search
When user select "Accident Cover" as Insurance Type(search)
When user select "Fixed Benefit" as Insurance Class(search)
And user click on search button
And user clicks on edit icon

When user enter "No plan" as Excess
When user enter "Addons" as Exclusions
When user enter "Benefits" as Scope of Cover
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit