@All
Feature: Regulatory Document Inventory

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on policy wordings setup option
Then user click on Regulatory Document Inventory option


@AllFields
Scenario: Verify user able to enter Regulatory Document Inventory details
When user click on add button to enter details
When user enter "Book-No:02" as book number
When user select "Automated Testing Company" as insurer
#When user select "Commercial Vehicles" as Insurance Type
#When user select "Fixed Benefit" as Insurance Class
When user enter "1003" as Sequence From
When user enter "1004" as to
And user click on save button
And user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit Regulatory Document Inventory details
#Search
When user enter "02" as book number(search)
And user click on search button
And user clicks on the actions dropdown(for Regulatory Document Inventory)
And user clicks on edit option(for Regulatory Document Inventory)

When user enter "Book-No:02" as book number
#When user select "Commercial Vehicles" as Insurance Type
#When user select "Fixed Benefit" as Insurance Class
When user enter "1003" as Sequence From
When user enter "1004" as to
And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit