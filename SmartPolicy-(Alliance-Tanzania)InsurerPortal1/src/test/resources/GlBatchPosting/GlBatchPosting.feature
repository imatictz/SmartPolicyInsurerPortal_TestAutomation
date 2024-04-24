@All
Feature: GL Batch Posting

Background: 

When user navigate on operation dropdown menu
Then user click on Gl batch posting option

@AllFields
Scenario: Verify user able to create posting date successfully
When user click on add button
When user select "Daily" as posting type
And user click on create posting date button
Then user able to view "Pending" as status