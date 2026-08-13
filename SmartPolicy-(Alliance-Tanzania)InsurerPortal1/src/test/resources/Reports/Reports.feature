@All
Feature: Reports

Background: 
Given user navigate on reports dropdown
Given user click on all reports

@245
Scenario: Verify user able to view Business Summary (Base Currency)(RPTINS245)report successfully
When user select "Business Performance" as report category
When user search "Business Summary (Base Currency)" as report name in search box
Then user click to select Business Summary (Base Currency) as report
When user select "All" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Business Summary (Base Currency)" report in pdf format

@205
Scenario: Verify user able to view Business Summary (Base Currency) by Branch(RPTINS205)report successfully
When user select "Business Performance" as report category
When user search "Business Summary (Base Currency) by Branch" as report name in search box
Then user click to select Business Summary (Base Currency) by Branch as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "All" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Business Summary (Base Currency) by Branch" report in pdf format

@206
Scenario: Verify user able to view Business Summary (Base Currency) by Channel(RPTINS206)report successfully
When user select "Business Performance" as report category
When user search "Business Summary (Base Currency) by Channel" as report name in search box
Then user click to select Business Summary (Base Currency) by Channel as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "All" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Business Summary (Base Currency) by Channel" report in pdf format

@204
Scenario: Verify user able to view Business Summary (Base Currency) by Product(RPTINS204)report successfully
When user select "Business Performance" as report category
When user search "Business Summary (Base Currency) by Product" as report name in search box
Then user click to select Business Summary (Base Currency) by Product as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "All" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Business Summary (Base Currency) by Product" report in pdf format

@202
Scenario: Verify user able to view Monthly Performance Report by Branch(RPTINS202)report successfully
When user select "Business Performance" as report category
When user search "Monthly Performance Report by Branch" as report name in search box
Then user click to select Monthly Performance Report by Branch as report
When user select "2025" as year
When user select "June" as monthly
When user select "Transaction Date" as date criteria
And user click on show report button
Then user able to view "Monthly Performance Report by Branch" report in pdf format

@201
Scenario: Verify user able to view Monthly Performance Report by Channel(RPTINS201)report successfully
When user select "Business Performance" as report category
When user search "Monthly Performance Report by Channel" as report name in search box
Then user click to select Monthly Performance Report by Channel as report
When user select "2025" as year
When user select "June" as monthly
When user select "Transaction Date" as date criteria
And user click on show report button
Then user able to view "Monthly Performance Report by Channel" report in pdf format

@203
Scenario: Verify user able to view Monthly Performance Report by Class(RPTINS203)report successfully
When user select "Business Performance" as report category
When user search "Monthly Performance Report by Class" as report name in search box
Then user click to select Monthly Performance Report by Class as report
When user select "2025" as year
When user select "June" as monthly
When user select "Transaction Date" as date criteria
And user click on show report button
Then user able to view "Monthly Performance Report by Class" in pdf format

@232
Scenario: Verify user able to view Claims Outstanding Detail (Currency wise) by Class(RPTINS232)report successfully
When user select "Claim Reports" as report category
When user search "Claims Outstanding Detail (Currency wise) by Class" as report name in search box
Then user click to select Claims Outstanding Detail (Currency wise) by Class as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Outstanding Detail (Currency wise) by Class" report in pdf format

@296
Scenario: Verify user able to view Claims Outstanding Report ( Claimant wise)(RPTINS296)report successfully
When user select "Claim Reports" as report category
When user search "Claims Outstanding Report ( Claimant wise)" as report name in search box
Then user click to select Claims Outstanding Report ( Claimant wise) as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Outstanding Report ( Claimant wise)" report in pdf format

@248
Scenario: Verify user able to view Claims Outstanding Summary (Base Currency) by Branch(RPTINS248)report successfully
When user select "Claim Reports" as report category
When user search "Claims Outstanding Summary (Base Currency) by Branch" as report name in search box
Then user click to select Claims Outstanding Summary (Base Currency) by Branch as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Outstanding Summary (Base Currency) by Branch" report in pdf format

@230
Scenario: Verify user able to view Claims Outstanding Summary (Base Currency) by Channel(RPTINS230)report successfully
When user select "Claim Reports" as report category
When user search "Claims Outstanding Summary (Base Currency) by Channel" as report name in search box
Then user click to select Claims Outstanding Summary (Base Currency) by Channel as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Outstanding Summary (Base Currency) by Channel" report in pdf format

@231
Scenario: Verify user able to view Claims Outstanding Summary (Base Currency) by Class(RPTINS231)report successfully
When user select "Claim Reports" as report category
When user search "Claims Outstanding Summary (Base Currency) by Class" as report name in search box
Then user click to select Claims Outstanding Summary (Base Currency) by Class as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Outstanding Summary (Base Currency) by Class" report in pdf format

@252
Scenario: Verify user able to view Claims Paid Report (Beyond 45 Days)(RPTINS252)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Report (Beyond 45 Days)" as report name in search box
Then user click to select Claims Paid Report (Beyond 45 Days) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Report (Beyond 45 Days)" report in pdf format

@242
Scenario: Verify user able to view Claims Paid Report (Currency wise) by Payee Type(RPTINS242)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Report (Currency wise) by Payee Type" as report name in search box
Then user click to select Claims Paid Report (Currency wise) by Payee Type as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Report (Currency wise) by Payee Type" report in pdf format

@241
Scenario: Verify user able to view Claims Paid Summary (Base Currency) by Branch(RPTINS241)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Summary (Base Currency) by Branch" as report name in search box
Then user click to select Claims Paid Summary (Base Currency) by Branch as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Summary (Base Currency) by Branch" report in pdf format

@249
Scenario: Verify user able to view Claims Paid Summary (Base Currency) by Channel(RPTINS249)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Summary (Base Currency) by Channel" as report name in search box
Then user click to select Claims Paid Summary (Base Currency) by Channel as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Summary (Base Currency) by Channel" report in pdf format

@240
Scenario: Verify user able to view Claims Paid Summary (Base Currency) by Class(RPTINS240)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Summary (Base Currency) by Class" as report name in search box
Then user click to select Claims Paid Summary (Base Currency) by Class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Summary (Base Currency) by Class" report in pdf format

@239
Scenario: Verify user able to view Claims Paid Summary (Base Currency) by Payee Type(RPTINS239)report successfully
When user select "Claim Reports" as report category
When user search "Claims Paid Summary (Base Currency) by Payee Type" as report name in search box
Then user click to select Claims Paid Summary (Base Currency) by Payee Type as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Paid Summary (Base Currency) by Payee Type" report in pdf format

#Claims Ratio (Base Currency) by branch
@257
Scenario: Verify user able to view Claims Ratio (Base Currency) by Channel(RPTINS257)report successfully
When user select "Claim Reports" as report category
When user search "Claims Ratio (Base Currency) by Channel" as report name in search box
Then user click to select Claims Ratio (Base Currency) by Channel as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Ratio (Base Currency) by Channel" report in pdf format

@256
Scenario: Verify user able to view Claims Ratio (Base Currency) by Class(RPTINS256)report successfully
When user select "Claim Reports" as report category
When user search "Claims Ratio (Base Currency) by Class" as report name in search box
Then user click to select Claims Ratio (Base Currency) by Class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Ratio (Base Currency) by Class" report in pdf format

@229
Scenario: Verify user able to view Claims Register Detail (Currency wise) by class(RPTINS229)report successfully
When user select "Claim Reports" as report category
When user search "Claims Register Detail (Currency wise) by class" as report name in search box
Then user click to select Claims Register Detail (Currency wise) by class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Register Detail (Currency wise) by class" report in pdf format

@228
Scenario: Verify user able to view Claims Register Summary (Base Currency) by Branch(RPTINS228)report successfully
When user select "Claim Reports" as report category
When user search "Claims Register Summary (Base Currency) by Branch" as report name in search box
Then user click to select Claims Register Summary (Base Currency) by Branch as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Register Summary (Base Currency) by Branch" report in pdf format

@226
Scenario: Verify user able to view Claims Register Summary (Base Currency) by Channel(RPTINS226)report successfully
When user select "Claim Reports" as report category
When user search "Claims Register Summary (Base Currency) by Channel" as report name in search box
Then user click to select Claims Register Summary (Base Currency) by Channel as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Register Summary (Base Currency) by Channel" report in pdf format

@227
Scenario: Verify user able to view Claims Register Summary (Base Currency) by Class(RPTINS227)report successfully
When user select "Claim Reports" as report category
When user search "Claims Register Summary (Base Currency) by Class" as report name in search box
Then user click to select Claims Register Summary (Base Currency) by Class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Register Summary (Base Currency) by Class" report in pdf format

@253
Scenario: Verify user able to view Claims Rejected Report(RPTINS253)report successfully
When user select "Claim Reports" as report category
When user search "Claims Rejected Report" as report name in search box
Then user click to select Claims Rejected Report as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Rejected Report" report in pdf format

@237
Scenario: Verify user able to view Claims Requisitions Pending Detail (by Payee Type)(RPTINS237)report successfully
When user select "Claim Reports" as report category
When user search "Claims Requisitions Pending Detail (by Payee Type)" as report name in search box
Then user click to select Claims Requisitions Pending Detail (by Payee Type) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user click on show report button
Then user able to view "Claims Requisitions Pending Detail (by Payee Type)" report in pdf format

@235
Scenario: Verify user able to view Claims Requisitions Pending Summary (by Payee Type)(RPTINS235)report successfully
When user select "Claim Reports" as report category
When user search "Claims Requisitions Pending Summary (by Payee Type)" as report name in search box
Then user click to select Claims Requisitions Pending Summary (by Payee Type) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user click on show report button
Then user able to view "Claims Requisitions Pending Summary (by Payee Type)" report in pdf format

@234
Scenario: Verify user able to view Claims Requisitions Register (By Payee Type)(RPTINS234)report successfully
When user select "Claim Reports" as report category
When user search "Claims Requisitions Register (By Payee Type)" as report name in search box
Then user click to select Claims Requisitions Register (By Payee Type) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Requisitions Register (By Payee Type)" report in pdf format

@251
Scenario: Verify user able to view Claims Requisitions Summary (by Payee Type)(RPTINS251)report successfully
When user select "Claim Reports" as report category
When user search "Claims Requisitions Summary (by Payee Type)" as report name in search box
Then user click to select Claims Requisitions Summary (by Payee Type) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Requisitions Summary (by Payee Type)" report in pdf format

@283
Scenario: Verify user able to view Claims Reserves Movement Summary (Base Currency) by Class(RPTINS283)report successfully
When user select "Claim Reports" as report category
When user search "Claims Reserves Movement Summary (Base Currency) by Class" as report name in search box
Then user click to select Claims Reserves Movement Summary (Base Currency) by Class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Reserves Movement Summary (Base Currency) by Class" report in pdf format

@284
Scenario: Verify user able to view Claims Reserves Movement Summary (Base Currency) by Type(RPTINS284)report successfully
When user select "Claim Reports" as report category
When user search "Claims Reserves Movement Summary (Base Currency) by Type" as report name in search box
Then user click to select Claims Reserves Movement Summary (Base Currency) by Type as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Reserves Movement Summary (Base Currency) by Type" report in pdf format

@285
Scenario: Verify user able to view Claims Reserves Movement (Base Currency) by Date(RPTINS285)report successfully
When user select "Claim Reports" as report category
When user search "Claims Reserves Movement (Base Currency) by Date" as report name in search box
Then user click to select Claims Reserves Movement (Base Currency) by Date as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Reserves Movement (Base Currency) by Date" report in pdf format

@289
Scenario: Verify user able to view Claims Settled Report (Currency wise) by Payee Type(RPTINS289)report successfully
When user select "Claim Reports" as report category
When user search "Claims Settled Report (Currency wise) by Payee Type" as report name in search box
Then user click to select Claims Settled Report (Currency wise) by Payee Type as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Settled Report (Currency wise) by Payee Type" report in pdf format

@291
Scenario: Verify user able to view Claims Settled Summary (Base Currency) by Branch(RPTINS291)report successfully
When user select "Claim Reports" as report category
When user search "Claims Settled Summary (Base Currency) by Branch" as report name in search box
Then user click to select Claims Settled Summary (Base Currency) by Branch as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Settled Summary (Base Currency) by Branch" report in pdf format

@292
Scenario: Verify user able to view Claims Settled Summary (Base Currency) by Channel(RPTINS292)report successfully
When user select "Claim Reports" as report category
When user search "Claims Settled Summary (Base Currency) by Channel" as report name in search box
Then user click to select Claims Settled Summary (Base Currency) by Channel as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Settled Summary (Base Currency) by Channel" report in pdf format

@293
Scenario: Verify user able to view Claims Settled Summary (Base Currency) by Class(RPTINS293)report successfully
When user select "Claim Reports" as report category
When user search "Claims Settled Summary (Base Currency) by Class" as report name in search box
Then user click to select Claims Settled Summary (Base Currency) by Class as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Settled Summary (Base Currency) by Class" report in pdf format

@294
Scenario: Verify user able to view Claims Settled Summary (Base Currency) by Payee Type(RPTINS294)report successfully
When user select "Claim Reports" as report category
When user search "Claims Settled Summary (Base Currency) by Payee Type" as report name in search box
Then user click to select Claims Settled Summary (Base Currency) by Payee Type as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Claims Settled Summary (Base Currency) by Payee Type" report in pdf format

@50
Scenario: Verify user able to view Commission Payable Report(RPTINS50)report successfully
When user select "Intemediary Commission Reports" as report category
When user search "Commission Payable Report" as report name in search box
Then user click to select Commission Payable Report as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "ALL" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Commission Payable Report" report in pdf format

@44
Scenario: Verify user able to view Commission Payable Report (User Wise)(RPTINS44)report successfully
When user select "Intemediary Commission Reports" as report category
When user search "Commission Payable Report (User Wise)" as report name in search box
Then user click to select Commission Payable Report (User Wise) as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "ALL" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Commission Payable Report (User Wise)" report in pdf format

@222
Scenario: Verify user able to view Commission Payable Report By Channel(RPTINS222)report successfully
When user select "Intemediary Commission Reports" as report category
When user search "Commission Payable Report By Channel" as report name in search box
Then user click to select Commission Payable Report By Channel as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "ALL" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Commission Payable Report By Channel" report in pdf format

@223
Scenario: Verify user able to view Commission Requisitions Pending(RPTINS223)report successfully
When user select "Intemediary Commission Reports" as report category
When user search "Commission Requisitions Pending" as report name in search box
Then user click to select Commission Requisitions Pending as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Commission Requisitions Pending" report in pdf format

@224
Scenario: Verify user able to view Commission Statement By Channel(RPTINS224)report successfully
When user select "Intemediary Commission Reports" as report category
When user search "Commission Statement By Channel" as report name in search box
Then user click to select Commission Statement By Channel as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "ALL" as business by
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Commission Statement By Channel" report in pdf format

@41
Scenario: Verify user able to view Reinsurer Premium Register(RPTINS41)report successfully
When user select "Old" as report category
When user search "Reinsurer Premium Register" as report name in search box
Then user click to select Reinsurer Premium Register as report
When user select "Head Office" as select insurer branch
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Reinsurer Premium Register" report in pdf format

@270    @OthersReports
Scenario: Verify user able to view Exception Report(RPTINS270)report successfully
When user select "Other Reports" as report category
When user search "Exception Report" as report name in search box
Then user click to select Exception Report as report
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Exception Report" report in pdf format

@297  @OthersReports
Scenario: Verify user able to view Indirect Premiums Receipt(RPTINS297)report successfully
When user select "Other Reports" as report category
When user search "Indirect Premiums Receipt" as report name in search box
Then user click to select Indirect Premiums Receipt as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Tanzanian Shillings" as currency
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Indirect Premiums Receipt" report in pdf format

@12    @OthersReports
Scenario: Verify user able to view Sticker Utilization Report(RPTINS12)report successfully
When user select "Other Reports" as report category
When user search "Sticker Utilization Report" as report name in search box
Then user click to select Sticker Utilization Report as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Sticker Utilization Report" report in pdf format

@76    @OthersReports
Scenario: Verify user able to view Travel Cession/Bordeaux Report(RPTINS76)report successfully
When user select "Other Reports" as report category
When user search "Travel Cession/Bordeaux Report" as report name in search box
Then user click to select Travel Cession/Bordeaux Report as report
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Travel Cession/Bordeaux Report" report in pdf format

@82    @OthersReports
Scenario: Verify user able to view Travel Cession/Bordeaux Report (MAPFRE)(RPTINS82)report successfully
When user select "Other Reports" as report category
When user search "Travel Cession/Bordeaux Report (MAPFRE)" as report name in search box
Then user click to select Travel Cession/Bordeaux Report (MAPFRE) as report
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Travel Cession/Bordeaux Report (MAPFRE)" report in pdf format

@91    @OthersReports
Scenario: Verify user able to view Unearned Premium Reserve(RPTINS91)report successfully
When user select "Other Reports" as report category
When user search "Unearned Premium Reserve" as report name in search box
Then user click to select Unearned Premium Reserve as report
And user click on show report button
Then user able to view "Unearned Premium Reserve" report in pdf format

@92    @OthersReports
Scenario: Verify user able to view Unearned Premium Reserve for ceded premium(RPTINS92)report successfully
When user select "Other Reports" as report category
When user search "Unearned Premium Reserve for ceded premium" as report name in search box
Then user click to select Unearned Premium Reserve for ceded premium as report
And user click on show report button
Then user able to view "Unearned Premium Reserve for ceded premium" report in pdf format

@121    @OthersReports
Scenario: Verify user able to view User Details(RPTINS121)report successfully
When user select "Other Reports" as report category
When user search "User Details" as report name in search box
Then user click to select User Details as report
And user click on show report button
Then user able to view "User Details" report in pdf format

@124    @OthersReports
Scenario: Verify user able to view Z_REPORT(RPTINS124)report successfully
When user select "Other Reports" as report category
When user search "Z_REPORT" as report name in search box
Then user click to select Z_REPORT as report
And user click on show report button
Then user able to view "Z_REPORT" report in pdf format


@110    @PremiumCollectionReports
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices (Outstanding wise)(RPTINS110)report successfully
When user select "Premium Collection Reports" as report category
When user search "Daily Debit Notes/ Tax Invoices (Outstanding wise)" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices (Outstanding wise) as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Daily Debit Notes/ Tax Invoices (Outstanding wise)" report in pdf format

@152    @PremiumCollectionReports
Scenario: Verify user able to view Debtors Age Analysis report(RPTINS152)report successfully
When user select "Premium Collection Reports" as report category
When user search "Debtors Age Analysis report" as report name in search box
Then user click to select Debtors Age Analysis report as report
When user select "All" as business by
When user select "Tanzanian Shillings" as currency
And user click on show report button
Then user able to view "Debtors Age Analysis report" report in pdf format

@18    @PremiumCollectionReports
Scenario: Verify user able to view Digital Premium Collection Report (Payment Mode Wise)(RPTINS18)report successfully
When user select "Premium Collection Reports" as report category
When user search "Digital Premium Collection Report (Payment Mode Wise)" as report name in search box
Then user click to select Digital Premium Collection Report (Payment Mode Wise) as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Digital Premium Collection Report (Payment Mode Wise)" report in pdf format

@300    @PremiumCollectionReports
Scenario: Verify user able to view Mobile Money Transaction(RPTINS300)report successfully
When user select "Premium Collection Reports" as report category
When user search "Mobile Money Transaction" as report name in search box
Then user click to select Mobile Money Transaction as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Mobile Money Transaction" report in pdf format

@43    @PremiumCollectionReports
Scenario: Verify user able to view Mobile Money Transactions (Branch Wise)(RPTINS43)report successfully
When user select "Premium Collection Reports" as report category
When user search "Mobile Money Transactions (Branch Wise)" as report name in search box
Then user click to select Mobile Money Transactions (Branch Wise) as report
When user select "TestProject" as select company
When user select "All" as select branch
When user select "Transaction Date" as date criteria
And user select "01/01/2025" as from date
And user click on show report button
Then user able to view "Mobile Money Transactions (Branch Wise)" report in pdf format






