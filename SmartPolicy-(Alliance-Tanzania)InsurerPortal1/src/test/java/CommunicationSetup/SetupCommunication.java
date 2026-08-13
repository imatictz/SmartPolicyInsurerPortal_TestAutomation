package CommunicationSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class SetupCommunication {

	@When("user navigate on setup dropdown menu")
	public void user_navigate_on_setup_dropdown_menu() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span_Setup_lc']", 
	    		"user navigate on setup dropdown menu", "NAVIGATE", 2000);
	}
	@When("user navigate on communication setup")
	public void user_navigate_on_communication_setup() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span97']", 
	    		"user navigate on communication setup", "NAVIGATE", 2000);
	}
	@Then("user click on setup communication option")
	public void user_click_on_etup_communication_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='Span56']", 
	    		"user click on setup communication option", "CLICK", 2000);
	}
	@When("user click on add button")
	public void user_click_on_add_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='button_btnAdd_lc']", 
	    		"user click on add button",
	    		"CLICK", 2000);

	}
	@When("user select {string} as mode")
	public void user_select_as_mode(String mode) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCommunication')]",
	    		"//*[@class='select2-search__field']",
	    		mode, 
	    		"//*[contains(@data-select2-id,'select2-MainContent_cmbCommunication')]",
	    		"user select {string} as mode",
	    		"DROPDOWN", 0);
	}
	@When("user select {string} as service type")
	public void user_select_as_service_type(String service_type) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbService')]",
	    		"//*[@class='select2-search__field']",
	    		service_type, 
	    		"//*[contains(@data-select2-id,'select2-MainContent_cmbService')]",
	    		"user select {string} as service type",
	    		"DROPDOWN", 0);
	}
	@When("user click on enable checkbox")
	public void user_click_on_enable_checkbox() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='chkEnable']", 
	    		"user click on enable checkbox",
	    		"CLICK", 2000);
	}
	@When("user enter {string} as body")
	public void user_enter_as_body(String body) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='MainContent_txtBody']",
	    		body,
	    		"user enter {string} as body", "TEXTBOX", 0);

	}
	@When("user enter {string} as subject")
	public void user_enter_as_subject(String subject) throws InterruptedException {
	    Itl.CustomClearSendEvent("//*[@id='txtSubject']",
	    		subject,
	    		"user enter {string} as subject", "TEXTBOX", 0);

	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on save button",
	    		"CLICK", 2000);
	}
	@Then("user able to view {string} as message")
	public void user_able_to_view_as_message(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
}
