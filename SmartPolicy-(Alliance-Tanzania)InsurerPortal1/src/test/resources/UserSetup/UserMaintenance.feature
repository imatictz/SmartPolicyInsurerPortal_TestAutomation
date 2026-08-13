@All
Feature: User Maintenance

Background: Launch browser and open application

    When user navigate on setup dropdown menu
    When user navigate on user setup
    Then user click on user maintenace option

@Edit
Scenario: Verify user able to edit User Maintenance details
#Search
When user enter "Pravin Wagh" as Search Text
When user select "User Name" as Search Criteria
And user click on search button
When user select edit icon
And user click on save button
Then user able to view "1001-New information recorded successfully" as message after edit