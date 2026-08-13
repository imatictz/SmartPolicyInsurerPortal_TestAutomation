package PolicyRenewals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class RenewPolicy {

	@When("user navigate on operation dropdown menu")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", 
	    		"user navigate on operation dropdown menu", "NAVIGATE", 2000);
	}
	@When("user navigate on policy renewals option")
	public void user_navigate_on_policy_renewals_option() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span23']", 
	    		"user navigate on policy renewals option", "NAVIGATE", 2000);
	}
	@Then("user click on renew policy option")
	public void user_click_on_renew_policy_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='span25']", 
	    		"user click on renew policy option", "CLICK", 2000);
	}
	@When("user select {string} as from date")
	public void user_select_as_from_date(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']", 
				   fromDate, 
				   "user select {string} as from date", "TEXTBOX", 0);
	}
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", 
	    		"user click on search button", "CLICK", 2000);
	}
	@When("user click on renew option")
	public void user_click_on_renew_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[2]", 
	    		"user click on renew option", "CLICK", 2000);
	}
	@When("user enter {string} as insurance branch")
	public void user_enter_as_insurance_branch(String branch) {
		 Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBrokerBranch')]",
				 "//*[@class='select2-search__field']", 
				 branch, 
				 "(//*[contains(@data-select2-id,'MainContent_cmbBrokerBranch-result')])[1]", 
				 "user enter {string} as insurance branch",
				 "DROPDOWN", 1000);

	}
	@When("user select Retain Business With Intermediary checkbox")
	public void user_select_retain_business_with_intermediary_checkbox() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='chkRetainBroker']", 
	    		"user select Retain Business With Intermediary checkbox", "CLICK", 2000);
	}
	@When("user click on renew button")
	public void user_click_on_renew_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnRenewIntermediatePolicy']", 
	    		"user click on renew button", "CLICK", 2000);
	}
	@When("user able to view {string} as message")
	public void user_able_to_view_as_message(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
				status,
				"user able to view {string} as message", 
				"VALIDATION", 
				0);
	}
	@When("user click on edit option")
	public void user_click_on_reconcile_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]", 
				"user click on edit option", "CLICK", 2000);
	}
	@When("user enter {string} as description")
	public void user_enter_as_description(String description) throws InterruptedException {
	   Itl.CustomClearSendEvent("//*[@id='MainContent_txtDescription']", 
			   description, 
			   "user enter {string} as description", "TEXTBOX", 0);
	}
	@When ("user click on save button")
	 public void savefeedback() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnSaveRenew']",
		    		"user click on save button", "CLICK", 4000);
	 }
}
