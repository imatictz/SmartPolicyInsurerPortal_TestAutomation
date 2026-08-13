package GlBatchPosting;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class GlBatchPosting {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}

	@When("user navigate on GL management")
	public void glManagement() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span93']", "user navigate on GL managemen", "NAVIGATE", 2000);
	}
	
	@Then("^user click on Gl batch posting option$")
	public void user_click_on_Gl_batch_posting_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="//*[@id='span_EventLog_lc']";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MainContent_btnAdd']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on add button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("user select {string} as posting type")
	public void user_select_as_posting_type(String postingType) throws Throwable {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'select2-MainContent_cmbType-container')]",
	    		   "//*[@class='select2-search__field']", 
	    		   postingType, 
	    		   "//*[contains(@data-select2-id,'select2-data-select2-MainContent_cmbType-result-')][2]", 
	    		   "user select \"Daily\" as posting type",
	    		   "DROPDOWN",
	    		   2000);
	}

	@When("^user click on create posting date button$")
	public void user_click_on_create_posting_date_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on create posting date button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	
	@When("user select {string} as from date")
	public void user_select_as_from_date(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']", 
				   fromDate, 
				   "user select {string} as from date", "TEXTBOX", 0);
	}
	@When("user enter {string} as status")
	public void user_enter_status(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchStatus']", 
				   fromDate, 
				   "user enter {string} as status", "TEXTBOX", 0);
	}
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", 
	    		"user click on search button", "CLICK", 2000);
	}
	@Then ("user able to view {string} as message")
	 public void status(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
					status,
					"user able to view {string} as message", 
					"VALIDATION", 
					0);
	 }
	@When("user click on actions option")
	public void user_click_on_actions_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]", 
				"user click on actions option", "CLICK", 2000);
	}
	@When("user click on edit option")
	public void user_click_on_reconcile_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[1]", 
				"user click on edit option", "CLICK", 2000);
	}
	@When("user click on post option")
	public void user_click_on_post_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[2]", 
				"user click on post option", "CLICK", 2000);
	}
	@When("user click on print option")
	public void user_click_on_print_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[1]", 
				"user click on print option", "CLICK", 2000);
	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", 
				status,
				"user able to view {string} as status", 
				"VALIDATION", 
				0);
	}
	@When("user click on provisional post button")
	public void user_click_on_propost_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSaveConfirm']", 
				"user click on provisional post button", "CLICK", 2000);
	}
}
