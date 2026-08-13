@All
Feature: Setup Product Limits & Clauses

Background: Launch browser and open application

When user navigate on Setup dropdown
When user navigate on policy wordings setup option
Then user click on Setup Product Limits & Clauses option


@AllFields
Scenario: Verify user able to enter Setup Product Limits & Clauses details
When user click on add button to enter details
When user select "Aviation Hull" as Insurance Type
When user select "Annual Declaration cover" as Insurance Class
When user enter "Benefits" as Scope of Covers

#Excess
When user enter "Policy excess details" as description(Excess)
When user enter "5" as Percent %(Excess)
When user enter "3000" as Min. Amount(Excess)
When user enter "5000" as Max Amount(Excess)
When user select "US Dollars" as Currency(Excess)
And user click on add button(Excess)

#Inclusions
When user enter "Policy Inclusions details" as description(Inclusions)
When user enter "5" as Percent %(Inclusions)
When user enter "2000" as Min. Amount(Inclusions)
When user enter "5000" as Max Amount(Inclusions)
When user select "US Dollars" as Currency(Inclusions)
And user click on add button(Inclusions)

#Exclusions
When user enter "Policy Exclusions details" as description(Exclusions)
When user enter "5" as Percent %(Exclusions)
When user enter "2000" as Min. Amount(Exclusions)
When user enter "5000" as Max Amount(Exclusions)
When user select "US Dollars" as Currency(Exclusions)
And user click on add button(Exclusions)

#Extensions
When user enter "Policy Extensions details" as description(Extensions)
When user enter "5" as Percent %(Extensions)
When user enter "2000" as Min. Amount(Extensions)
When user enter "5000" as Max Amount(Extensions)
When user select "US Dollars" as Currency(Extensions)
And user click on add button(Extensions)

#Terms & Conditions
When user enter "Policy Terms & Conditions details" as description(Terms & Conditions)
When user enter "5" as Percent %(Terms & Conditions)
When user enter "2000" as Min. Amount(Terms & Conditions)
When user enter "5000" as Max Amount(Terms & Conditions)
When user select "US Dollars" as Currency(Terms & Conditions)
And user click on add button(Terms & Conditions)

And user click on save button
And user able to view "1001-New information recorded successfully" as message

@Edit
Scenario: Verify user able to edit Setup Product Limits & Clauses details
#Search
When user enter "Aviation Hull" as Search Text
When user select "Insurance Type" as Search Criteria
And user click on search button
And user clicks on edit icons

When user enter "Benefits" as Scope of Covers

#Excess
When user click on edit option(Excess)
When user enter "Policy excess details" as description(Excess)
When user enter "5" as Percent %(Excess)
When user enter "3000" as Min. Amount(Excess)
When user enter "5000" as Max Amount(Excess)
When user select "US Dollars" as Currency(Excess)
And user click on add button(Excess)

#Inclusions
When user click on edit option(Inclusions)
When user enter "Policy Inclusions details" as description(Inclusions)
When user enter "5" as Percent %(Inclusions)
When user enter "2000" as Min. Amount(Inclusions)
When user enter "5000" as Max Amount(Inclusions)
When user select "US Dollars" as Currency(Inclusions)
And user click on add button(Inclusions)

#Exclusions
When user click on edit option(Exclusions)
When user enter "Policy Exclusions details" as description(Exclusions)
When user enter "5" as Percent %(Exclusions)
When user enter "2000" as Min. Amount(Exclusions)
When user enter "5000" as Max Amount(Exclusions)
When user select "US Dollars" as Currency(Exclusions)
And user click on add button(Exclusions)

#Extensions
When user click on edit option(Extensions)
When user enter "Policy Extensions details" as description(Extensions)
When user enter "5" as Percent %(Extensions)
When user enter "2000" as Min. Amount(Extensions)
When user enter "5000" as Max Amount(Extensions)
When user select "US Dollars" as Currency(Extensions)
And user click on add button(Extensions)

#Terms & Conditions
When user click on edit option(Terms & Conditions)
When user enter "Policy Terms & Conditions details" as description(Terms & Conditions)
When user enter "5" as Percent %(Terms & Conditions)
When user enter "2000" as Min. Amount(Terms & Conditions)
When user enter "5000" as Max Amount(Terms & Conditions)
When user select "US Dollars" as Currency(Terms & Conditions)
And user click on add button(Terms & Conditions)


And user click on edit button
Then user able to view "1003-Information modified successfully" as message after edit