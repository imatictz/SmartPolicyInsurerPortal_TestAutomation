package cucumberMapReports;

import java.util.Hashtable;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Reports {
	@Given("user navigate on reports dropdown")
	public void user_navigate_on_reports_dropdown() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Reports_lc']", "user navigate on reports dropdown", "NAVIGATE", 2000);
	}
	@Given("user click on all reports")
	public void user_click_on_all_reports() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@id='span_Reports1_lc']", "user click on all reports", "CLICK", 4000);
	}
	@When("user select {string} as report category")
	public void user_select_as_report_category(String reportCategory) throws InterruptedException {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbFilter')]", "//*[@class='select2-search__field']", reportCategory, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbFilter-result')]", "user select {string} as report category", "DROPDOWN", 2000);
	}
	@When("user search {string} as report name in search box")
	public void user_search_as_report_name_in_search_box(String reportName) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtSearch']", reportName, "user search {string} as report name in search box", "TEXTBOX", 2000);

	}
	@When("user select {string} as business by")
	public void user_select_as_business_by(String businessBy) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBusinessBy')]", "//*[@class='select2-search__field']", businessBy, "//*[@role='option']", "user select {string} as business by", "DROPDOWN", 2000);

	}
	@When("user select {string} as date criteria")
	public void user_select_as_date_criteria(String dateCriteria) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDateCriteria')]", "//*[@class='select2-search__field']", dateCriteria, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbDateCriteria-result')]", "user select {string} as date criteria", "DROPDOWN", 2000);

	}
	@When("user select {string} as year")
	public void user_select_as_year(String year) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbYear')]", "//*[@class='select2-search__field']", year, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbYear-result')]", "user select {string} as year", "DROPDOWN", 2000);

	}
	@When("user select {string} as monthly")
	public void user_select_as_monthly(String monthly) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbMonthly')]", "//*[@class='select2-search__field']", monthly, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbMonthly-result')]", "user select {string} as monthly", "DROPDOWN", 2000);

	}
	@When("user select {string} as insurance type")
	public void user_select_as_insurance_type(String insuranceType) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceType')]", "//*[@class='select2-search__field']", insuranceType, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbInsuranceType-result')]", "user select {string} as insurance type", "DROPDOWN", 2000);

	}
	@When("user select {string} as from date")
	public void user_select_as_from_date(String date) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtFromDate1']", date, "user select {string} as from date", "TEXTBOX", 2000);

	}
	@When("user click on show report button")
	public void user_click_on_show_report_button() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@id='button_btnShowReports_lc']", "user click on show report button", "CLICK", 4000);

	}
	@Then("user click to select Business Summary \\(Base Currency) as report")
	public void user_click_to_select_business_summary_base_currency_as_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS245']", "user click to select Business Summary \\\\(Base Currency) as report", "CLICK", 4000);

	}
	@Then("user able to view {string} report in pdf format")
	public void user_able_to_view_business_summary_base_currency_report_in_pdf_format(String nameOfReport) throws Throwable {
	    Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        nameOfReport,
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Business Summary \\(Base Currency) by Branch as report")
	public void user_click_to_select_business_summary_base_currency_by_branch_as_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS205']", "user click to select Business Summary \\\\(Base Currency) by Branch as report", "CLICK", 4000);

	}
	@When("user select {string} as select insurer branch")
	public void user_select_as_select_insurer_branch(String insurerBranch) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsurerBranch')]", "//*[@class='select2-search__field']", insurerBranch, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbInsurerBranch-result')]", "user select {string} as select insurer branch", "DROPDOWN", 2000);

	}
	@When("user select {string} as select company")
	public void user_select_as_select_company(String company) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchBroker')]", "//*[@class='select2-search__field']", company, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbSrchBroker-result')]", "user select {string} as select company", "DROPDOWN", 2000);

	}
	@When("user select {string} as select branch")
	public void user_select_as_select_branch(String branch) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSrchBranch')]", "//*[@class='select2-search__field']", branch, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbSrchBranch-result')]", "user select {string} as select branch", "DROPDOWN", 2000);

	}
	@When("user select {string} as currency")
	public void user_select_as_select_currency(String currency) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrency')]", "//*[@class='select2-search__field']", currency, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbCurrency-result')]", "user select {string} as currency", "DROPDOWN", 2000);

	}
	@When("When user select {string} as business by")
	public void user_select_as_select_businessBy(String businessBy) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBusinessBy')]", "//*[@class='select2-search__field']", businessBy, "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbBusinessBy-result')]", "user select {string} as business by", "DROPDOWN", 2000);

	}
	@Then("user able to view Business Summary \\(Base Currency) by Branch report in pdf format")
	public void user_able_to_view_business_summary_base_currency_by_branch_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Business Summary \\\\(Base Currency) by Branch report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Business Summary \\(Base Currency) by Channel as report")
	public void user_click_to_select_business_summary_base_currency_by_Channel_as_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS206']", "user click to select Business Summary (Base Currency) by Channel as report", "CLICK", 4000);

	}
	@Then("user able to view Business Summary \\(Base Currency) by Channel report in pdf format")
	public void user_able_to_view_business_summary_base_currency_by_channel_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Business Summary (Base Currency) by Channel report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Business Summary \\(Base Currency) by Product as report")
	public void user_click_to_select_business_summary_base_currency_by_Product_as_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS204']", "user click to select Business Summary (Base Currency) by Product as report", "CLICK", 4000);

	}
	@Then("user able to view Business Summary \\(Base Currency) by Product report in pdf format")
	public void user_able_to_view_business_summary_base_currency_by_Product_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Business Summary (Base Currency) by Product report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Monthly Performance Report by Branch as report")
	public void user_click_to_select_monthly_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS202']", "user click to select Monthly Performance Report by Branch as report", "CLICK", 4000);

	}
	@Then("user able to view Monthly Performance Report by Branch report in pdf format")
	public void user_able_to_view_business_monthly_performance_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Monthly Performance Report by Branch report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Business Summary \\(Currency Wise) as report")
	public void user_click_to_select_business_summary_base_currency_wise_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS246']", "user click to select Business Summary (Currency Wise) as report", "CLICK", 4000);

	}
	@Then("user able to view Business Summary \\(Currency Wise) report in pdf format")
	public void user_able_to_view_business_summary_base_currency_wise_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Business Summary (Currency Wise) report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Monthly Performance Report by Class as report")
	public void user_click_to_select_monthly2_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS203']", "user click to select Monthly Performance Report by Class as report", "CLICK", 4000);

	}
	@Then("user able to view Monthly Performance Report by Class in pdf format")
	public void user_able_to_view_monthly_performance2_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Monthly Performance Report by Class in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Outstanding Detail \\(Currency wise) by Class as report")
	public void user_click_to_select_claims_outstanding_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS232']", "user click to select Claims Outstanding Detail (Currency wise) by Class as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Outstanding Detail \\(Currency wise) by Class report in pdf format")
	public void user_able_to_view_claims_outstanding_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Outstanding Detail (Currency wise) by Class report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Monthly Performance Report by Channel as report")
	public void user_click_to_select_monthly1_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS201']", "user click to select Monthly Performance Report by Channel as report", "CLICK", 4000);

	}
	@Then("user able to view Monthly Performance Report by Channel report in pdf format")
	public void user_able_to_view_monthly_performance1_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Monthly Performance Report by Channel report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Outstanding Summary \\(Base Currency) by Branch as report")
	public void user_click_to_select_claims1_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS248']", "user click to select Claims Outstanding Summary (Base Currency) by Branch as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Outstanding Summary \\(Base Currency) by Branch report in pdf format")
	public void user_able_to_view_claims1_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Outstanding Summary (Base Currency) by Branch report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Outstanding Report \\( Claimant wise) as report")
	public void user_click_to_select_claims_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS296']", "user click to select Claims Outstanding Report ( Claimant wise) as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Outstanding Report \\( Claimant wise) report in pdf format")
	public void user_able_to_view_claims_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Outstanding Report ( Claimant wise) report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Outstanding Summary \\(Base Currency) by Channel as report")
	public void user_click_to_select_claims2_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS230']", "user click to select Claims Outstanding Summary (Base Currency) by Channel as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Outstanding Summary \\(Base Currency) by Channel report in pdf format")
	public void user_able_to_view_claims2_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Outstanding Summary (Base Currency) by Channel report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Outstanding Summary \\(Base Currency) by Class as report")
	public void user_click_to_select_claims3_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS231']", "user click to select Claims Outstanding Summary (Base Currency) by Class as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Outstanding Summary \\(Base Currency) by Class report in pdf format")
	public void user_able_to_view_claims3_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Outstanding Summary (Base Currency) by Class report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Paid Report \\(Beyond 45 Days) as report")
	public void user_click_to_select_claims4_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS252']", "user click to select Claims Paid Report (Beyond 45 Days) as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Paid Report \\(Beyond 45 Days) report in pdf format")
	public void user_able_to_view_claims4_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Paid Report (Beyond 45 Days) report in pdf format\\",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Paid Report \\(Currency wise) by Payee Type as report")
	public void user_click_to_select_claims5_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS242']", "user click to select Claims Paid Report (Currency wise) by Payee Type as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Paid Report \\(Currency wise) by Payee Type report in pdf format")
	public void user_able_to_view_claims5_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Paid Report (Currency wise) by Payee Type report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Paid Summary \\(Base Currency) by Branch as report")
	public void user_click_to_select_claims6_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS241']", "user click to select Claims Paid Summary (Base Currency) by Branch as report", "CLICK", 4000);

	}
	@Then("user able to view Claims Paid Summary \\(Base Currency) by Branch report in pdf format")
	public void user_able_to_view_claims6_report_in_pdf_format() {
		Hashtable<String, Object> output = SeleniumOperations.printReport1(); // ✅ match method name

	    // Existing basic step log
	    HTMLReportGenerator.StepDetails(
	        output.get("STATUS").toString(),
	        "user able to view Claims Paid Summary (Base Currency) by Branch report in pdf format",
	        output.get("MESSAGE").toString()
	    );

	    // ✅ Extract key details
	    String status = output.get("STATUS").toString();
	    String message = output.get("MESSAGE").toString();
	    String pdfUrl = String.valueOf(output.getOrDefault("PDF_URL", "N/A"));
	    String pageCount = String.valueOf(output.getOrDefault("PDF_PAGE_COUNT", "N/A"));
	    String textSample = String.valueOf(output.getOrDefault("PDF_TEXT_SAMPLE", "No text extracted"));

	    // Escape < and > to avoid HTML breaking
	    textSample = textSample.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

	    // ✅ Print detailed info in console
	    System.out.println("========== PDF REPORT DETAILS ==========");
	    System.out.println("📄 PDF URL           : " + pdfUrl);
	    System.out.println("📑 Total Pages       : " + pageCount);
	    System.out.println("📝 Text (Preview)    : " + textSample);
	    System.out.println("📋 Message           : " + message);
	    System.out.println("========================================");

	    // ✅ Append extended PDF details into HTML report
	    String detailedHtmlLog =
	        "<b>PDF URL:</b> " + pdfUrl + "<br>" +
	        "<b>Total Pages:</b> " + pageCount + "<br>" +
	        "<b>Extracted Text (Preview):</b><br><pre>" + textSample + "</pre><br>" +
	        "<b>Message:</b> " + message + "<br>";

	    HTMLReportGenerator.StepDetails(
	        status,
	        "Detailed PDF Report Information",
	        detailedHtmlLog
	    );

	    // ✅ Summary log
	    if ("Pass".equalsIgnoreCase(status)) {
	        System.out.println("✅ [PASS] Report verified successfully in PDF format.");
	    } else {
	        System.err.println("❌ [FAIL] Report verification failed: " + message);
	    }
	}
	@Then("user click to select Claims Paid Summary \\(Base Currency) by Channel as report")
	public void user_click_to_select_claims7_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS249']", "user click to select Claims Paid Summary (Base Currency) by Channel as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Paid Summary \\(Base Currency) by Class as report")
	public void user_click_to_select_claims8_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS240']", "user click to select Claims Paid Summary (Base Currency) by Class as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Paid Summary \\(Base Currency) by Payee Type as report")
	public void user_click_to_select_claims9_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS239']", "user click to select Claims Paid Summary (Base Currency) by Payee Type as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Ratio \\(Base Currency) by Channel as report")
	public void user_click_to_select_claims10_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS257']", "user click to select Claims Ratio (Base Currency) by Channel as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Ratio \\(Base Currency) by Class as report")
	public void user_click_to_select_claims11_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS256']", "user click to select Claims Ratio (Base Currency) by Class as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Register Detail \\(Currency wise) by class as report")
	public void user_click_to_select_claims12_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS229']", "user click to select Claims Register Detail (Currency wise) by class as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Register Summary \\(Base Currency) by Branch as report")
	public void user_click_to_select_claims13_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS228']", "user click to select Claims Register Summary (Base Currency) by Branch as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Register Summary \\(Base Currency) by Channel as report")
	public void user_click_to_select_claims14_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS226']", "user click to select Claims Register Summary (Base Currency) by Channel as report", "CLICK", 4000);

	}
	@Then("user click to select Claims Register Summary \\(Base Currency) by Class as report")
	public void user_click_to_select_claims15_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS227']", "user click to select Claims Register Summary (Base Currency) by Class as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Rejected Report as report")
	public void user_click_to_select_claims16_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS253']", "user click to select Claims Rejected Report as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Requisitions Pending Detail \\(by Payee Type) as report")
	public void user_click_to_select_claims17_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS237']", "user click to select Claims Requisitions Pending Detail (by Payee Type) as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Requisitions Pending Summary \\(by Payee Type) as report")
	public void user_click_to_select_claims18_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS235']", "user click to select Claims Requisitions Pending Summary (by Payee Type) as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Requisitions Register \\(By Payee Type) as report")
	public void user_click_to_select_claims19_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS234']", "user click to select Claims Requisitions Register (By Payee Type) as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Requisitions Summary \\(by Payee Type) as report")
	public void user_click_to_select_claims20_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS251']", "user click to select Claims Requisitions Summary (by Payee Type) as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Reserves Movement Summary \\(Base Currency) by Class as report")
	public void user_click_to_select_claims21_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS283']", "user click to select Claims Reserves Movement Summary (Base Currency) by Class as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Reserves Movement Summary \\(Base Currency) by Type as report")
	public void user_click_to_select_claims22_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS284']", "user click to select Claims Reserves Movement Summary (Base Currency) by Type as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Reserves Movement \\(Base Currency) by Date as report")
	public void user_click_to_select_claims23_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS285']", "user click to select Claims Reserves Movement (Base Currency) by Date as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Settled Report \\(Currency wise) by Payee Type as report")
	public void user_click_to_select_claims24_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS289']", "user click to select Claims Settled Report (Currency wise) by Payee Type as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Settled Summary \\(Base Currency) by Branch as report")
	public void user_click_to_select_claims25_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS291']", "user click to select Claims Settled Summary (Base Currency) by Branch as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Settled Summary \\(Base Currency) by Channel as report")
	public void user_click_to_select_claims26_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS292']", "user click to select Claims Settled Summary (Base Currency) by Channel as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Settled Summary \\(Base Currency) by Class as report")
	public void user_click_to_select_claims27_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS293']", "user click to select Claims Settled Summary (Base Currency) by Class as report", "CLICK", 4000);
	}
	@Then("user click to select Claims Settled Summary \\(Base Currency) by Payee Type as report")
	public void user_click_to_select_claims28_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS294']", "user click to select Claims Settled Summary (Base Currency) by Payee Type as report", "CLICK", 4000);
	}
	@Then("user click to select Commission Payable Report as report")
	public void user_click_to_select_commission_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS50']", "user click to select Commission Payable Report as report", "CLICK", 4000);
	}
	@Then("user click to select Commission Payable Report \\(User Wise) as report")
	public void user_click_to_select_commission1_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS44']", "user click to select Commission Payable Report (User Wise) as report", "CLICK", 4000);
	}
	@Then("user click to select Commission Payable Report By Channel as report")
	public void user_click_to_select_commission2_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS222']", "user click to select Commission Payable Report By Channel as report", "CLICK", 5000);
	}
	@Then("user click to select Commission Requisitions Pending as report")
	public void user_click_to_select_commission3_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS223']", "user click to select Commission Requisitions Pending as report", "CLICK", 5000);
	}
	@Then("user click to select Commission Statement By Channel as report")
	public void user_click_to_select_commission4_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS224']", "user click to select Commission Statement By Channel as report", "CLICK", 5000);
	}
	@Then("user click to select Reinsurer Premium Register as report")
	public void user_click_to_select_reinsurer_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS41']", "user click to select Reinsurer Premium Register as report", "CLICK", 5000);
	}
	@Then("user click to select Exception Report as report")
	public void user_click_to_select_ExceptionReport_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS270']", "user click to select Exception Report as report", "CLICK", 5000);
	}
	@Then("user click to select Indirect Premiums Receipt as report")
	public void user_click_to_select_others_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS297']", "user click to select Indirect Premiums Receipt as report", "CLICK", 5000);
	}
	@Then("user click to select Sticker Utilization Report as report")
	public void user_click_to_select_others1_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS12']", "user click to select Sticker Utilization Report as report", "CLICK", 5000);
	}
	@Then("user click to select Travel Cession\\/Bordeaux Report as report")
	public void user_click_to_select_others2_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS76']", "user click to select Travel Cession/Bordeaux Report as report", "CLICK", 5000);
	}
	@Then("user click to select Travel Cession\\/Bordeaux Report \\(MAPFRE) as report")
	public void user_click_to_select_others3_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS82']", "user click to select Travel Cession\\\\/Bordeaux Report \\\\(MAPFRE) as report", "CLICK", 5000);
	}
	@Then("user click to select Unearned Premium Reserve as report")
	public void user_click_to_select_others4_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS91']", "user click to select Unearned Premium Reserve as report", "CLICK", 5000);
	}
	@Then("user click to select Unearned Premium Reserve for ceded premium as report")
	public void user_click_to_select_others5_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS92']", "user click to select Unearned Premium Reserve for ceded premium as report", "CLICK", 5000);
	}
	@Then("user click to select User Details as report")
	public void user_click_to_select_others6_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS121']", "user click to select User Details as report", "CLICK", 5000);
	}
	@Then("user click to select Z_REPORT as report")
	public void user_click_to_select_others7_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS124']", "user click to select Z_REPORT as report", "CLICK", 5000);
	}
	@Then("user click to select Daily Debit Notes\\/ Tax Invoices \\(Outstanding wise) as report")
	public void user_click_to_select_PremiumCollectionReports1_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS110']", "user click to select Daily Debit Notes/ Tax Invoices (Outstanding wise) as report", "CLICK", 5000);
	}
	@Then("user click to select Debtors Age Analysis report as report")
	public void user_click_to_select_PremiumCollectionReports2_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS152']", "user click to select Debtors Age Analysis report as report", "CLICK", 5000);
	}
	@Then("user click to select Digital Premium Collection Report \\(Payment Mode Wise) as report")
	public void user_click_to_select_PremiumCollectionReports3_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS18']", "user click to select Digital Premium Collection Report (Payment Mode Wise) as report", "CLICK", 5000);
	}
	@Then("user click to select Mobile Money Transaction as report")
	public void user_click_to_select_PremiumCollectionReports4_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS300']", "user click to select Mobile Money Transaction as report", "CLICK", 5000);
	}
	@Then("user click to select Mobile Money Transactions \\(Branch Wise) as report")
	public void user_click_to_select_PremiumCollectionReports5_report() throws InterruptedException {
		 Itl.CustomClickEvent("//*[@value='RPTINS43']", "user click to select Mobile Money Transactions (Branch Wise) as report", "CLICK", 5000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
