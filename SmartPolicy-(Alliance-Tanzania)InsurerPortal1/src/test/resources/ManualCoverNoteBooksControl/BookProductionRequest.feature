@All
Feature: Book Production Request

Background: 
 
When user navigate on operation dropdown menu
And user navigate on manual cover note books control menu
Then user select book production request option

@AllFields
Scenario: Verify user able to save book production request successfully
When user click on add button
When user enter "29/11/2023" as request date
When user enter "29/12/2023" as expected date
And user enter "Pravin Testing" as person requesting
Then user select "Engineering" as insurance type
When user select "25 pages" as pages
And user enter "10" as No. of books
Then user enter "Placing book production request for 10 books#" as notes
When user select "Vista Print" as printer
And user click on save button

