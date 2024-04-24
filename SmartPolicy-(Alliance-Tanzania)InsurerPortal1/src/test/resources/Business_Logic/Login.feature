Feature: Login Functionality

@SmokeTest @RegressionTest 
Scenario: (Login)To check Authentication and Authorization functionality by providing valid user id and valid password
When user enter username
When user enter password
And user click on login button
Then application shows home page to user

