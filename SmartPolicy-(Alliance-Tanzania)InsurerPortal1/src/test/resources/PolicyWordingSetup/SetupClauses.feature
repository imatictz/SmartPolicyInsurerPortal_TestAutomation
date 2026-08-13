@All
Feature: Setup Clauses

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on policy wordings setup option
Then user click on setup clauses option


@AllFields
Scenario: Verify user able to enter Setup Clauses details
When user click on add button to enter details
When user select "Excess" as type
When user enter "Pravin Testing Broker" as name
#When user enter "Setup clauses for policy" as description
And user click on save button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Pending" as status

@Edit
Scenario: Verify user able to edit Setup Clauses details
#Search
When user enter "Excess" as Search Text
When user select "Type" as Search Criteria
And user click on search button
And user clicks on the actions dropdown
And user clicks on edit option

When user select "Excess" as type
When user enter "Pravin Testing Broker" as name
#When user enter "Setup clauses for policy" as description
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit