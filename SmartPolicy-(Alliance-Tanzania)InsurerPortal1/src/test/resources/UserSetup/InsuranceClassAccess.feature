@All
Feature: Insurance Class Access

Background: Launch browser and open application

    When user navigate on setup dropdown menu
    When user navigate on user setup
    Then user click on insurance class access option

@Edit
Scenario: Verify user able to edit Insurance Class Access details
#Search
When user enter "AUTO" as user code
And user click on search button
When user select edit icon (Insurance Class Access)
When user select insurance type checkbox
And user click on save detail icon
When user click on yes button
Then user able to view "1003-Information modified successfully" as message after edit