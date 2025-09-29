package BankAccountGLMapping;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class BankAccountGLMapping {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}
	
	@When("user navigate on GL management")
	public void glManagement() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span93']", "user navigate on GL managemen", "NAVIGATE", 2000);
	}

	@Then("user click on Bank Account GL Mapping \\(Digital Receipts Only) option")
	public void Bank_Account_GL_Mapping() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='span32']", "user click on Bank Account GL Mapping (Digital Receipts Only) option", "CLICK", 2000);
	    
	}
	
	@When("user click on add button")
	public void user_click_on_add_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='button_btnAdd_lc']", "user click on add button", "CLICK", 2000);

	}
	@When("user select {string} as type")
	public void user_select_as_type(String type) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbType')]", "//*[@class='select2-search__field']", type, "//*[contains(@data-select2-id,'select2-MainContent_cmbType')]", "user select {string} as type", "DROPDOWN", 0);
	}
	@Then("user select {string} as intermediary type")
	public void user_select_as_intermediary_type(String intermediaryType) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbBroker')]", "//*[@class='select2-search__field']", intermediaryType, "//*[contains(@data-select2-id,'select2-MainContent_cmbBroker')]", "user select {string} as intermediary type", "DROPDOWN", 0);

	}
	@When("user enter {string} as payment mode")
	public void user_enter_as_payment_mode(String paymentMode) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='txtPayMode']", paymentMode, "user enter {string} as payment mode", "TEXTBOX", 0);
	}
	@Then("user select {string} as mapped payment mode")
	public void user_select_as_mapped_payment_mode(String mappedMode) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbMPayMode')]", "//*[@class='select2-search__field']", mappedMode, "//*[contains(@data-select2-id,'select2-MainContent_cmbMPayMode')]", "user select {string} as mapped payment mode", "DROPDOWN", 0);

	}
	@When("user select {string} as Ccy")
	public void user_select_as_ccy(String ccy) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'CmbCcy')]", "//*[@class='select2-search__field']", ccy, "//*[contains(@data-select2-id,'select2-MainContent_CmbCcy')]", "user select {string} as Ccy", "DROPDOWN", 0);

	}
	@When("user select {string} as GL bank account")
	public void user_select_as_gl_bank_account(String glBankAcc) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbGlBAcc')]", "//*[@class='select2-search__field']", glBankAcc, "//*[contains(@data-select2-id,'select2-MainContent_cmbGlBAcc')]", "user select {string} as GL bank account", "DROPDOWN", 0);

	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 0);
	}

	
}
