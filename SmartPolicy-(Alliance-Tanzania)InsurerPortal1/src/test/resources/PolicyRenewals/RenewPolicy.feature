@All
Feature: Renew Policy

Background: Launch browser and open application

When user navigate on operation dropdown menu
And user navigate on policy renewals option
Then user click on renew policy option

@renew
Scenario: (Renew Policy)Verify user able to renew policy details successfully
When user select "01/01/2025" as from date
When user click on search button
When user click on renew option
When user enter "Head Office" as insurance branch
When user select Retain Business With Intermediary checkbox
When user click on renew button
And user able to view "The renewal quote is created successfully." as message

@edit
Scenario: (Renew Policy)Verify user able to edit renew policy details successfully
When user select "01/01/2025" as from date
When user click on search button
When user click on edit option
When user enter "pending by client" as description
When user click on save button
And user able to view "1003-Information modified successfully" as message