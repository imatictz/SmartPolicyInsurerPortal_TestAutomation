@All
Feature: Notification Master

Background: 

When user navigate on tools dropdown menu
And user navigate on Notification setup menu
Then user click on Notification Master option

@AllFields
Scenario: Verify user able to save Notification Master details successfully
When user click on add button
When user select "Claims" as screen
When user select "Advice sent to client" as status
When user select "Assign Investigator" as status to close
When user select "Both" as notification type
When user enter "Enrolling master details" as email subject
When user enter "Notification details-5252222221-AMOUNT-4525252/-" as email body
When user enter "Notification details-5252222221-AMOUNT-4525252/-" as SMS text
When user select "Daily" as reminder frequency
When user enter "124020" as due value
When user select "Level 1 ipf approval" as levelone
When user select "Level 1 ipf approval" as leveltwo
When user select "Level 1 ipf approval" as levelthree
When user select "Level 1 ipf approval" as levelfour
And user click on save button