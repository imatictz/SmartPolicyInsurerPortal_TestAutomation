@All
Feature: GL Batch Posting

Background: 

When user navigate on operation dropdown menu
And user navigate on GL management
Then user click on Gl batch posting option

@AllFields
Scenario: Verify user able to create posting date successfully
When user click on add button
When user select "Daily" as posting type
And user click on create posting date button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Pending" as status

@Edit
Scenario: Verify user able to edit posting date successfully
When user select "01/01/2026" as from date
When user enter "Pending" as status
When user click on search button
When user click on actions option
When user click on edit option
When user select "Daily" as posting type
And user click on create posting date button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Pending" as status

@post
Scenario: Verify user able to post posting date successfully
When user select "01/01/2026" as from date
When user enter "Pending" as status
When user click on search button
When user click on actions option
When user click on post option
And user click on provisional post button
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Posted" as status

@print
Scenario: Verify user able to print posting date successfully
When user select "01/01/2026" as from date
When user enter "Posted" as status
When user click on search button
When user click on actions option
When user click on print option
And user able to view "1001-New information recorded successfully" as message
Then user able to view "Posted" as status