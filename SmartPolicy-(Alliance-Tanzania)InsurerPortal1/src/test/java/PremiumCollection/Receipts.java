package PremiumCollection;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Receipts {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}

 	
 	@When("^user navigate on premium collection option$")
	public void user_navigate_on_premium_collection_option() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MNU_PREMIUM']";
 		SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on In-Direct premium option$")
	public void user_navigate_on_In_Direct_premium_option() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='liInDirect']";
 		SeleniumOperations.actionClass(input7);
	}

	@Then("^user click on receipts option$")
	public void user_click_on_receipts_option() throws Throwable {
	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MNU_wfINCTXN']";
	    SeleniumOperations.clickOnElement(input4);
	}

	@When("^user click on add button to enter receipts details$")
	public void user_click_on_add_button_to_enter_receipts_details() throws Throwable {
	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input4);
	    Thread.sleep(2000);
	}
	@When("user select {string} as broker name")
	public void user_select_as_broker_name(String brokerName) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBroker')]",
				 "//*[@class='select2-search__field']", 
				 brokerName, 
				 "(//*[contains(@id,'MainContent_cmbBroker-results')])[1]", 
				 "user select {string} as broker name", "DROPDOWN", 1000);
	}
	@When("user enter {string} as amount")
	public void user_enter_as_amount(String amount) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtAmount']", 
				   amount, "user enter {string} as amount", "TEXTBOX", 0);

	}
	@When("user select {string} as mode")
	public void user_select_as_mode(String mode) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbMode')]",
				 "//*[@class='select2-search__field']", 
				 mode, 
				 "(//*[contains(@id,'MainContent_cmbMode-results')])[1]", 
				 "user select {string} as mode", "DROPDOWN", 1000);
	}
	@When("user select {string} as issuer bank")
	public void user_select_as_issuer_bank(String issuerBank) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClientBank')]",
				 "//*[@class='select2-search__field']", 
				 issuerBank, 
				 "(//*[contains(@id,'MainContent_cmbClientBank-results')])[1]", 
				 "user select {string} as issuer bank", "DROPDOWN", 1000);
	}
	@When("user enter {string} as Cheque\\/ Reference Number")
	public void user_enter_as_cheque_reference_number(String Cheque) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtRefNB']", 
				   Cheque, "user enter {string} as Cheque\\\\/ Reference Number", "TEXTBOX", 0);

	}
	@When("user select {string} as collecting bank")
	public void user_select_as_collecting_bank(String collectingBank) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsurerBank')]",
				 "//*[@class='select2-search__field']", 
				 collectingBank, 
				 "(//*[contains(@id,'MainContent_cmbInsurerBank-results')])[1]", 
				 "user select {string} as collecting bank", "DROPDOWN", 1000);
	}
	@When("user enter {string} as notes")
	public void user_enter_as_notes(String notes) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtNotes']", 
				   notes, "user enter {string} as notes", "TEXTBOX", 0);

	}
	@When("user enter {string} as refrence id")
	public void user_enter_as_refrence_id(String refrence_id) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcctRefId']",
				   refrence_id, "user enter {string} as refrence id", "TEXTBOX", 0);

	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on save button", "CLICK", 2000);

	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[7]", 
				status,
				"user able to view {string} as status", 
				"VALIDATION", 
				0);
	}
	@When("user select {string} as bank to")
	public void user_select_as_bank_to(String bank_to) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBankTo')]",
				 "//*[@class='select2-search__field']", 
				 bank_to, 
				 "(//*[contains(@id,'MainContent_cmbBankTo-results')])[1]", 
				 "user select {string} as bank to", "DROPDOWN", 1000);
	}
	@When("user select reconciled checkbox")
	public void user_select_reconciled_checkbox() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='chkRecon']", 
	    		"user select reconciled checkbox", "CLICK", 2000);
	}
	@When("user select {string} as ERP Bank Details")
	public void user_select_as_erp_bank_details(String erp_bank_details) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbErpBank')]",
				 "//*[@class='select2-search__field']", 
				 erp_bank_details, 
				 "(//*[contains(@id,'MainContent_cmbErpBank-results')])[1]", 
				 "user select {string} as ERP Bank Details", "DROPDOWN", 1000);
	}
	
	
	@When("user select {string} broker name")
	public void user_select_as_brokerName(String brokerName) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_srchBroker')]",
				 "//*[@class='select2-search__field']", 
				 brokerName, 
				 "(//*[contains(@id,'MainContent_srchBroker-results')])[1]", 
				 "user select {string} broker name", "DROPDOWN", 1000);
	}
	@When("user click on actions option\\(receipts)")
	public void user_click_on_actions_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]/*[2]", "user click on actions option", "CLICK", 2000);
	}
	@When("user select {string} broker name\\(receipts)")
	public void user_click_on_broker_name(String brokerName) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_srchBroker')]",
				 "//*[@class='select2-search__field']", 
				 brokerName, 
				 "(//*[contains(@id,'MainContent_srchBroker-results')])[1]", 
				 "user select {string} broker name\\\\(receipts)", "DROPDOWN", 1000);	}
	
	@When("user select {string} as from date\\(receipts)")
	public void user_select_as_from_date(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']", 
				   fromDate, 
				   "user select {string} as from date\\\\(receipts)", "TEXTBOX", 0);
	}
	@When("user click on edit option\\(receipts)")
	public void user_click_on_edit_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]/*[2]/*[2]/*[2]", "user click on edit option\\\\(receipts)", "CLICK", 2000);
	}
	@When("user click on update button")
	public void user_click_on_update_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
				"user click on update button", "CLICK", 2000);

	}
	
	
	
    
}
