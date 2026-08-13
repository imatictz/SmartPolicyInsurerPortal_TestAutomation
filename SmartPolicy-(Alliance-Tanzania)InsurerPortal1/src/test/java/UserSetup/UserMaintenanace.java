package UserSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class UserMaintenanace {

	@When("user navigate on setup dropdown menu")
	public void user_navigate_on_setup_dropdown_menu() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span_Setup_lc']", 
	    		"user navigate on setup dropdown menu", "NAVIGATE", 2000);
	}
	
	@When("user navigate on user setup")
	public void user_navigate_on_user_setup() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span94']", 
	    		"user navigate on user setup", "NAVIGATE", 2000);
	}
	@Then("user click on user maintenace option")
	public void user_click_on_user_maintenace_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='Span58']", 
	    		"user click on user maintenace option", "CLICK", 2000);

	}
	@When("user enter {string} as Search Text")
	public void user_enter_as_search_text(String search_text) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSearchCriteria']", 
				search_text, 
				   "user enter {string} as Search Text", "TEXTBOX", 0);
	}
	@When("user select {string} as Search Criteria")
	public void user_select_as_search_criteria(String search_criteria) {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbSearchCriteria')]",
				 "//*[@class='select2-search__field']", 
				 search_criteria, 
				 "(//*[contains(@id,'MainContent_cmbSearchCriteria-results')])[1]", 
				 "user select {string} as Search Criteria", "DROPDOWN", 1000);
	}
	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='button_btnSearch_lc']", 
	    		"user click on search button", "CLICK", 2000);
	}
	@When("user select edit icon")
	public void user_select_edit_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[7]/*[2]", 
	    		"user select edit icon", "CLICK", 2000);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
	    		"user click on save button", "CLICK", 2000);
	}
	@Then("user able to view {string} as message after edit")
	public void user_able_to_view_as_message_after_edit(String status) throws InterruptedException {
		Itl.CustomValidationEvent("(//*[@class='messenger-message-inner'])[1]", 
				status,
				"user able to view {string} as message after edit", 
				"VALIDATION", 
				0);
	}
}
