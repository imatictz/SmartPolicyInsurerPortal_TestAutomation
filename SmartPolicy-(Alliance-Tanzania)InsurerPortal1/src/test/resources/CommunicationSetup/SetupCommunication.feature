@All 
Feature: Setup Communication

  Background:
    When user navigate on setup dropdown menu
    When user navigate on communication setup
    Then user click on setup communication option

  @AddSMS
  Scenario: Verify user able to enter setup communication (SMS) details
    When user click on add button
    When user select "SMS" as mode
    When user select "Bulk SMS" as service type
    When user click on enable checkbox
    When user enter "%120%" as body
    When user click on save button
    Then user able to view "1001-New information recorded successfully" as message
    
    @AddEMAIL
  Scenario: Verify user able to enter setup communication (EMAIL) details
    When user click on add button
    When user select "Email" as mode
    When user select "Bimasokoni renewal email" as service type
    When user click on enable checkbox
    When user enter "Communicating for assessment" as subject
    When user enter "Communication setup" as body
    When user click on save button
    Then user able to view "1001-New information recorded successfully" as message
    
    @Edit
  Scenario: Verify user able to edit currency details
    #Search
    When user enter "Assessor Communications" as search text
    When user select "01/01/2025" as Service Type
    And user click on search button
    And user clicks on edit icon
    And user click on edit button
    Then user able to view "1003-Information modified successfully" as message after edit
    