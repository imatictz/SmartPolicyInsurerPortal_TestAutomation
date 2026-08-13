@All
Feature: Sticker Assignment

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on policy wordings setup option
Then user click on Sticker Assignment option


@AllFields
Scenario: Verify user able to enter Sticker Assignment details
When user click on add button to enter details
When user select "05" as book number
When user select "Head Office" as branch name
And user click on save button
And user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit Sticker Assignment details
#Search
When user select "Automated Testing Company" as insurer(search)
And user click on search button
And user clicks on the actions dropdown(for Sticker Assignment)
And user clicks on edit option(for Sticker Assignment)

When user select "Head Office" as branch name
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit