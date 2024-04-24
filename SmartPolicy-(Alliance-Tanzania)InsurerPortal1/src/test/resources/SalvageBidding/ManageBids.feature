@All
Feature: Manage Bids

Background: Launch browser and open application

When user navigate on operation dropdown
And user navigate on salvage bidding option
Then user click on manage bids

@AllFields
Scenario: Verify user able to manage bids successfully for all fields
When user click on add button
When user enter "01/01/2024" as bid end date
And user enter "VEH4120-02/252" vehicle No
Then user click on new to enroll new vehicle make and type
When user enter "BMW X1" as make&Model
And user enter "SUV" as vehicle type
Then user click on save button (VehicleMake)
When user enter "BMW" as vehicle make
And user enter "SUV" as type
Then user enter "#5442AWSD52D155S125#" as chasis No
When user enter "2000000" as salvage value
#And user enter "800000" as min bid value
Then user select "Tanzanian Shillings" as currency from dropdown
#Location
When user enter "No 6822,street-tree lane,town-Village,4120558" as address
When user enter "Pravin Testing Insurer" as contact person
And user enter "6594544202" as mobile 
Then user enter "10 AM to 05 PM" as Preferred time to contact
When user enter "Pravin Testing Insurer" as contact person (Insurance Company)
And user enter "6594544202" as mobile (Insurance Company)
#When user select "Selective" as bid type from dropdown
#And user select "Affan alware" as bidders
Then user click on save button
Then user able to view "Required Approval" as status



@MandatoryFields
Scenario: Verify user able to manage bids successfully for mandatory fields
When user click on add button
When user enter "01/01/2024" as bid end date
And user enter "VEH4120-02/252" vehicle No
When user enter "BMW" as vehicle make
And user enter "SUV" as type
When user enter "2000000" as salvage value
#Location
When user enter "No 6822,street-tree lane,town-Village,4120558" as address
When user enter "Pravin Testing Insurer" as contact person
And user enter "6594544202" as mobile 
Then user enter "10 AM to 05 PM" as Preferred time to contact
When user enter "Pravin Testing Insurer" as contact person (Insurance Company)
And user enter "6594544202" as mobile (Insurance Company)
#When user select "Selective" as bid type from dropdown
#And user select "Affan alware" as bidders
Then user click on save button
Then user able to view "Required Approval" as status
