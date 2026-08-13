package PendingApprovalsEndorsementApproval;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class EndorsementApproval {
	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MOD_INS_OPERATIONS']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}
	@When("user navigate on approval management option")
	public void user_navigate_on_approval_management_option() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MNU_APPROVAL']", "user navigate on approval management option", "NAVIGATE", 2000);

	}
	@Then("user click on endorsement approval option")
	public void user_click_on_compliance_quotation_approval_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='span_endorApprv_lc']", "user click on endorsement approval option", "CLICK", 2000);
	    
	}
	@When("user enter {string} as quote no")
	public void user_enter_as_quote_no(String quoteNo) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtSrchQuote']", quoteNo, "user enter {string} as quote no", "TEXTBOX", 0);
	}
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", "user click on search button", "CLICK", 4000);

	}
	@When("user click on display option")
	public void user_click_on_display_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@class='DisplayData fa fa-desktop']", "user click on display option", "CLICK", 4000);
	}
	@Then("user click on approve endorsement button")
	public void user_click_on_update_approve_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnApproveEndorse']", "user click on approve endorsement button", "CLICK", 2000);
	}
	@When("^user select \"([^\"]*)\" as from date$")
	public void user_select_as_date_from(String dateFrom) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtSrchFromDate']";
		 input[1]=dateFrom;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string}as from date",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	}
	@When("user enter {string} as Insurance Type")
	public void user_enter_as_insuranceType(String insuranceType) throws InterruptedException {
	   Itl.CustomSendEvent("//*[@id='MainContent_txtInsuranceType']", insuranceType, "user enter {string} as Insurance Type", "TEXTBOX", 0);
	}

	@When ("user click on search button to find {string} quote")
	public void user_click_on_search_button_quoteNo1(String quoteName) throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 SeleniumOperations.getRiskNote(quoteName);
		 Thread.sleep(4000);
	}

	@When ("user enter risk note number to search {string} quote")
	public void user_enter_as_quote_number(String quoteName) throws InterruptedException {
		String quoteNo = SeleniumOperations.getRiskNote(quoteName);
		Itl.CustomSendEvent("//*[@id='MainContent_txtRiskNote']", quoteNo, "user enter {string} as risk note number", "TEXTBOX", 0);
		Thread.sleep(4000);
	}


	@Then ("user navigate on Endorsement Approval screen")
	public void user_navigate_on_screen() throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='h4_lblEndorsement_lc']", "Endorsement", "user navigate on Endorsement Approval screen", "VALIDATION", 0);
	}

	@Then("user click on approve button")
	public void user_click_on_approve_button() throws Throwable {
		   Itl.CustomClickEvent("//*[@id='btnApprove']", "user click on approve button", "CLICK", 2000);
	 
	}
	@Then("user able to view {string} as message")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
}
