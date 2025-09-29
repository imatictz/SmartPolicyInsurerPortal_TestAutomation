@All
Feature: Treaty Master

Background: 
 
When user navigate on reinsurance dropdown menu
When user click on treaty master option
Then user click on add button

@AllFields
Scenario: Verify user able to save treaty master with all fields successfully
When user enter "1006" as treaty code
When user enter "Treaty For Direct Business" as treaty description
When user select "Direct" as business type
When user select "User Rate" as rate basis
When user select "Buy Rate" as rate type
When user enter "100" as round off
When user enter "3725" as exchange rate
When user enter "25" as Fac Inwards Treaty Limit %
When user enter "1000000" as cash call limit
#Treaty Limits
When user select "Demo One Insurance Company Limited" as company name
When user select "Fronting Business" as treaty type
When user select "Sum Insured (SI)" as limit type
When user select "Lines with Limits" as ceding type
When user select "On Balance" as allocation mode
When user enter "75" as percentage
When user enter "10" lines
When user enter "120000000" as limit amount
When user enter "12.5" as commission %
When user select "Africa Reinsurance Consultant" as reinsurance broker
When user enter "10" as rate
When user enter "1250000" as minimum deposit premium
#When user enter "50000000" as yearly limit
#When user enter "5" as No of reinstatement
When user enter "15" as withhold tax %
When user enter "13.5" as premium levy %
When user enter "15" as city levy %
When user enter "18" as additional levy %
And user click on add button to save treaty limit
And user click on save button
Then user able to view "Created" as status


@MandatoryFields
Scenario: Verify user able to save treaty master with mandatory fields successfully
When user enter "1006" as treaty code
When user enter "Treaty For Direct Business" as treaty description
When user select "Direct" as business type
When user select "User Rate" as rate basis
When user select "Buy Rate" as rate type
When user enter "100" as round off
When user enter "3725" as exchange rate
When user enter "25" as Fac Inwards Treaty Limit %
When user enter "1000000" as cash call limit
#Treaty Limits
When user select "Demo One Insurance Company Limited" as company name
When user select "Fronting Business" as treaty type
When user select "Sum Insured (SI)" as limit type
When user select "Lines with Limits" as ceding type
When user select "On Balance" as allocation mode
When user enter "75" as percentage
When user enter "10" lines
When user enter "120000000" as limit amount
When user enter "12.5" as commission %
When user select "Africa Reinsurance Consultant" as reinsurance broker
When user enter "10" as rate
When user enter "1250000" as minimum deposit premium
#When user enter "50000000" as yearly limit
#When user enter "5" as No of reinstatement
When user enter "15" as withhold tax %
When user enter "13.5" as premium levy %
When user enter "15" as city levy %
When user enter "18" as additional levy %
And user click on add button to save treaty limit
And user click on save button
Then user able to view "Created" as status
