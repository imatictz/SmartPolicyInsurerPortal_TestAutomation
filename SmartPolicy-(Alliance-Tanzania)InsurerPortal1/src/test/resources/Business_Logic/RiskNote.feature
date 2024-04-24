Feature: Policy Cancel
@repeatPolicyCancel					
Scenario: (Policy Cancellation) Verify user able to cancel policy successfully after insurer approval
#Insurer Portal
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "AL-5" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "33402" as risk note number
When user click on branch dropdown
And user enter "All" as branch
Then user select All as branch
Then user click on search button for the respective Risk Note for cancellation
When user click on display icon insurer
Then user click on accept button