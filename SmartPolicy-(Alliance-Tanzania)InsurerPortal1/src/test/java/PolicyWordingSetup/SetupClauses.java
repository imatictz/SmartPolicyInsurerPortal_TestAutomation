package PolicyWordingSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class SetupClauses {

	@Then("user click on setup clauses option")
	public void user_click_on_extension_clauses_terms_option() throws InterruptedException {
		Object[] input = new Object[1];
		input[0]="//*[@id='Span75']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(3000);
	}
	@When("user select {string} as type")
	public void user_select_as_type(String type) throws InterruptedException {
		Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbType')]", 
				"//*[@class='select2-search__field']", 
				type , 
				"(//*[contains(@data-select2-id,'MainContent_cmbType')])[2]", 
				"user select {string} as type", 
				"DROPDOWN", 
				2000);
	}
	@When("user enter {string} as name")
	public void user_enter_as_name(String name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='txtName']",
				name, 
				"user enter {string} as name",
				"TEXTBOX", 
				0);
	}
	@When("user enter {string} as description")
	public void user_enter_as_description(String description) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtParmDesc']",
				description, 
				"user enter {string} as description",
				"TEXTBOX", 
				0);
	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[3]", 
				status,
				"user able to view {string} as status", 
				"VALIDATION", 
				0);
	}
	@When("user clicks on edit option")
	public void user_click_on_edit_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[4]/*[2]/*[2]/*[1]", 
				"user clicks on edit option", "CLICK", 2000);
	}
	@When("user clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[4]/*[2]", 
				"user clicks on the actions dropdown", "CLICK", 2000);
	}
}
