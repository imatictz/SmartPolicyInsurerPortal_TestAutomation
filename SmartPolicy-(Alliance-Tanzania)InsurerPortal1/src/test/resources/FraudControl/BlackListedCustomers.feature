@All
Feature: Black Listed Customers

Background: 

When user navigate on tools dropdown menu
And user navigate on fraud control menu
Then user click on Black Listed Customers option

@AllFields
Scenario: Verify user able to save black listed customers details(Individual) successfully
When user click on add button
When user enter "Pravin Testing Client102" as client name
And user select "Birth certificate" as ID type 
Then user enter "124620626266" as ID number
When user enter "01/01/2023" as date of birth
And user enter "195489TIN" as TIN No
When user enter "Black listed due to reason" as reason
And user click on save button
#Search client
When user enter "Pravin Testing Client102" as name
Then user click on search button
When user click on actions option
When user click on upload pictures icon
When user choose "C:\Users\Public\Documents\2MB.pdf" file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" as message


@AllFieldsCorporate
Scenario: Verify user able to save black listed customers details(corporate) successfully
When user click on add button
When user enter "Pravin Testing Client201" as client name
When user select "Corporate" as client type
When user select "Automobile Manufacturing" as business type
When user enter "2150NO1020" as VRN No
And user enter "195489TIN" as TIN No(corporate)
When user enter "Black listed due to reason" as reason
And user click on save button
#Search client
When user enter "Pravin Testing Client201" as name
Then user click on search button
When user click on actions option
When user click on upload pictures icon
When user choose "C:\Users\Public\Documents\2MB.pdf" file to upload
And user click on upload button
Then user able to view "2001-Document uploaded successfully" as message
