package PolicyWordingSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class SetupProductLimitsClauses {

	
	@Then("user click on Setup Product Limits & Clauses option")
	public void user_click_on_extension_clauses_terms_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span76']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(3000);
	}
	@When("user enter {string} as Scope of Covers")
	public void user_enter_as_scope_of_cover(String ScopeofCover) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtScopeofCover']",
				ScopeofCover, 
				"user enter {string} as Scope of Cover",
				"TEXTBOX", 
				2000);
	}
	@When("user enter {string} as description\\(Excess)")
	public void user_enter_as_description_excess(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescription']",
				description, 
				"user enter {string} as description\\\\(Excess)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Percent %\\(Excess)")
	public void user_enter_as_percent_excess(String Percent) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPercent']",
				Percent, 
				"user enter {string} as Percent %\\\\(Excess)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Min. Amount\\(Excess)")
	public void user_enter_as_min_amount_excess(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMinAmount']",
				Amount, 
				"user enter {string} as Min. Amount\\\\(Excess)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Max Amount\\(Excess)")
	public void user_enter_as_max_amount_excess(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMaxAmount']",
				Amount, 
				"user enter {string} as Max Amount\\\\(Excess)",
				"TEXTBOX", 
				2000);
	}
	@When("user select {string} as Currency\\(Excess)")
	public void user_select_as_currency_excess(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbCurrency')])[1]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrency-result')])[1]", 
				"user select {string} as Currency\\\\(Excess)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on add button\\(Excess)")
	public void user_click_on_add_button_excess() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnAddLedger']", 
	    		"user click on add button\\\\(Excess)", 
	    		"CLICK",
	    		2000);
	}
	@When("user enter {string} as description\\(Inclusions)")
	public void user_enter_as_description_inclusions(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescriptionInclusions']",
				description, 
				"user enter {string} as description\\\\(Inclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Percent %\\(Inclusions)")
	public void user_enter_as_percent_inclusions(String Percent) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPercentInclusions']",
				Percent, 
				"user enter {string} as Percent %\\\\(Inclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Min. Amount\\(Inclusions)")
	public void user_enter_as_min_amount_inclusions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMinAmountInclusions']",
				Amount, 
				"user enter {string} as Min. Amount\\\\(Inclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Max Amount\\(Inclusions)")
	public void user_enter_as_max_amount_inclusions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMaxAmountInclusions']",
				Amount, 
				"user enter {string} as Max Amount\\\\(Inclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Currency\\(Inclusions)")
	public void user_select_as_currency_inclusions(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrencyInclusions')]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrencyInclusions')])[2]", 
				"user select {string} as Currency\\\\(Inclusions)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on add button\\(Inclusions)")
	public void user_click_on_add_button_inclusions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnAddLedgerInclusions']", 
	    		"user click on add button\\\\(Inclusions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user enter {string} as description\\(Exclusions)")
	public void user_enter_as_description_exclusions(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescriptionExclusions']",
				description, 
				"user enter {string} as description\\\\(Exclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Percent %\\(Exclusions)")
	public void user_enter_as_percent_exclusions(String Percent) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPercentExclusions']",
				Percent, 
				"user enter {string} as Percent %\\\\(Exclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Min. Amount\\(Exclusions)")
	public void user_enter_as_min_amount_exclusions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMinAmountExclusions']",
				Amount, 
				"user enter {string} as Min. Amount\\\\(Exclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Max Amount\\(Exclusions)")
	public void user_enter_as_max_amount_exclusions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMaxAmountExclusions']",
				Amount, 
				"user enter {string} as Max Amount\\\\(Exclusions)",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Currency\\(Exclusions)")
	public void user_select_as_currency_exclusions(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrencyExclusions')]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrencyExclusions')])[2]", 
				"user select {string} as Currency\\\\(Exclusions)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on add button\\(Exclusions)")
	public void user_click_on_add_button_exclusions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnAddLedgerExclusions']", 
	    		"user click on add button\\\\(Exclusions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user enter {string} as description\\(Extensions)")
	public void user_enter_as_description_extensions(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescriptionExtensions']",
				description, 
				"user enter {string} as description\\\\(Extensions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Percent %\\(Extensions)")
	public void user_enter_as_percent_extensions(String Percent) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPercentExtensions']",
				Percent, 
				"user enter {string} as Percent %\\\\(Extensions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Min. Amount\\(Extensions)")
	public void user_enter_as_min_amount_extensions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMinAmountExtensions']",
				Amount, 
				"user enter {string} as Min. Amount\\\\(Extensions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Max Amount\\(Extensions)")
	public void user_enter_as_max_amount_extensions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMaxAmountExtensions']",
				Amount, 
				"user enter {string} as Max Amount\\\\(Extensions)",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Currency\\(Extensions)")
	public void user_select_as_currency_extensions(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrencyExtensions')]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrencyExtensions')])[2]", 
				"user select {string} as Currency\\\\(Extensions)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on add button\\(Extensions)")
	public void user_click_on_add_button_extensions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnAddLedgerExtensions']", 
	    		"user click on add button\\\\(Extensions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user enter {string} as description\\(Terms & Conditions)")
	public void user_enter_as_description_terms_conditions(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescriptionTerms']",
				description, 
				"user enter {string} as description\\\\(Terms & Conditions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Percent %\\(Terms & Conditions)")
	public void user_enter_as_percent_terms_conditions(String Percent) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtPercentTerms']",
				Percent, 
				"user enter {string} as Percent %\\\\(Terms & Conditions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Min. Amount\\(Terms & Conditions)")
	public void user_enter_as_min_amount_terms_conditions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMinAmountTerms']",
				Amount, 
				"user enter {string} as Min. Amount\\\\(Terms & Conditions)",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as Max Amount\\(Terms & Conditions)")
	public void user_enter_as_max_amount_terms_conditions(String Amount) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtMaxAmountTerms']",
				Amount, 
				"user enter {string} as Max Amount\\\\(Terms & Conditions)",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Currency\\(Terms & Conditions)")
	public void user_select_as_currency_terms_conditions(String Currency) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCurrencyTerms')]", 
				"//*[@class='select2-search__field']", 
				Currency , 
				"(//*[contains(@data-select2-id,'MainContent_cmbCurrencyTerms')])[2]", 
				"user select {string} as Currency\\\\(Terms & Conditions)", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on add button\\(Terms & Conditions)")
	public void user_click_on_add_button_terms_conditions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnAddLedgerTerms']", 
	    		"user click on add button\\\\(Terms & Conditions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user clicks on edit icons")
	public void user_clicks_on_edit_option1() throws InterruptedException {
	    Itl.CustomClickEvent("(//*[@class='EditData fa fa-edit'])[3]",
	    		"user clicks on edit option", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit option\\(Excess)")
	public void user_click_on_edit_option_excess() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_LedgerDetails']/tbody/tr[1]/td[7]/*[1]",
	    		"user click on edit option\\\\(Excess)", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit option\\(Inclusions)")
	public void user_click_on_edit_option_inclusions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_Inclusions']/tbody/tr[1]/td[7]/*[1]",
	    		"user click on edit option\\\\(Inclusions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit option\\(Exclusions)")
	public void user_click_on_edit_option_exclusions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_Exclusions']/tbody/tr[1]/td[7]/*[1]",
	    		"user click on edit option\\\\(Exclusions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit option\\(Extensions)")
	public void user_click_on_edit_option_extensions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_Extensions']/tbody/tr[1]/td[7]/*[1]",
	    		"user click on edit option\\\\(Extensions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit option\\(Terms & Conditions)")
	public void user_click_on_edit_option_terms_conditions() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_Terms']/tbody/tr[1]/td[7]/*[1]",
	    		"user click on edit option\\\\(Terms & Conditions)", 
	    		"CLICK",
	    		2000);
	}
	@When("user navigate on Setup dropdown")
	public void user_navigate_on_setup_dropdown() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span_Setup_lc']", 
	    		"user navigate on Setup dropdown", "NAVIGATE", 2000);
	}
	@When("user navigate on policy wordings setup option")
	public void user_navigate_on_policy_wordings_setup_option() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span99']", 
	    		"user navigate on policy wordings setup option", "NAVIGATE", 2000);
	}
	@When("user click on add button to enter details")
	public void user_click_on_add_button_to_enter_details() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='button_btnAdd_lc']",
	    		"user click on add button to enter details", 
	    		"CLICK",
	    		2000);
	}
	@When("user select {string} as Insurance Type")
	public void user_select_as_insurance_type(String insurance_type) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceType')]", 
				"//*[@class='select2-search__field']", 
				insurance_type , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuranceType')])[2]", 
				"user select {string} as Insurance Type", 
				"DROPDOWN", 
				2000);
	}
	@When("user select {string} as Insurance Class")
	public void user_select_as_insurance_class(String insurance_class) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInsuranceClass')]", 
				"//*[@class='select2-search__field']", 
				insurance_class , 
				"(//*[contains(@data-select2-id,'MainContent_cmbInsuranceClass')])[2]", 
				"user select {string} as Insurance Class", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']",
	    		"user click on save button", 
	    		"CLICK",
	    		2000);
	}
	@When("user click on edit button")
	public void user_click_on_edit_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']",
	    		"user click on edit button", 
	    		"CLICK",
	    		2000);
	}
	@When("user able to view {string} as message")
	public void user_able_to_view_as_message(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
	@When("user enter {string} as Search Text")
	public void user_enter_as_search_text(String search_text) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSearchCriteria']",
				search_text, 
				"user enter {string} as Search Text",
				"TEXTBOX", 
				0);
	}
	@When("user select {string} as Search Criteria")
	public void user_select_as_search_criteria(String search_criteria) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSearchCriteria')]", 
				"//*[@class='select2-search__field']", 
				search_criteria , 
				"(//*[contains(@data-select2-id,'MainContent_cmbSearchCriteria')])[2]", 
				"user select {string} as Search Criteria", 
				"DROPDOWN", 
				2000);
	}
	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='button_btnSearch_lc']",
	    		"user click on search button", 
	    		"CLICK",
	    		2000);
	}
	@Then("user able to view {string} as message after edit")
	public void user_able_to_view_as_message_after_edit(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
}
