package PendingApprovalsNonDigitalReceipt;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class NonDigitalReceipt {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}
 
 @When("user navigate on approval management option")
	public void user_navigate_on_approval_management_option() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MNU_APPROVAL']", "user navigate on approval management option", "NAVIGATE", 2000);
	}

 @Then("user click on Non Digital Receipt approval option")
 public void user_click_on_claims_option() throws Throwable {
	    Itl.CustomClickEvent("//*[@id='span123']",
	    		"user click on Non Digital Receipt approval option", "CLICK", 2000);
   }
 @When("user select {string} as from date")
	public void user_select_as_date_from(String dateFrom) throws Throwable {
		 
		 Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate1']", 
				 dateFrom, "user select {string} as from date", "TEXTBOX", 0);
	}
 @Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", 
	    		"user click on search button", "CLICK", 2000);
	}
	@When("user click on actions option")
	public void user_click_on_actions_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]", 
				"user click on actions option", "CLICK", 2000);
	}
	@When("user click on edit option")
	public void user_click_on_edit_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[1]", 
				"user click on edit option", "CLICK", 2000);
	}
	@When("user click on reject option")
	public void user_click_on_reject_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[2]", 
				"user click on reject option", "CLICK", 2000);
	}
	@When("user select {string} as mode")
	public void user_select_as_mode(String mode) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbMode')]",
				 "//*[@class='select2-search__field']", 
				 mode, 
				 "(//*[contains(@id,'MainContent_cmbMode-results')])[1]", 
				 "user select {string} as mode", "DROPDOWN", 1000);
	}
	
	@When("user enter {string} as Cheque\\/ Reference Number")
	public void user_enter_as_cheque_reference_number(String Cheque) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtRefNB']", 
				   Cheque, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);
	}
	@When("user select {string} as collecting bank")
	public void user_select_as_collecting_bank(String collectingBank) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCollectingBnk')]",
				 "//*[@class='select2-search__field']", 
				 collectingBank, 
				 "(//*[contains(@id,'MainContent_cmbCollectingBnk-results')])[1]", 
				 "user select {string} as collecting bank", "DROPDOWN", 1000);
	}
	@When("user click on update button")
	public void user_click_on_update_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
				"user click on update button", "CLICK", 2000);
	}
	@Then("user able to view {string} as message")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
	@When("user click on approve option")
	public void user_click_on_approve_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[3]", 
				"user click on approve option", "CLICK", 2000);
	}
	@Then("user click on approve button")
	public void user_click_on_approve_button() throws Throwable {
		   Itl.CustomClickEvent("//*[@id='btnApprove']", "user click on approve button", "CLICK", 2000);
	}
	@Then("user click on reject button")
	public void user_click_on_reject_button() throws Throwable {
		   Itl.CustomClickEvent("//*[@id='btnReject']", "user click on reject button", "CLICK", 2000);
	}
}
