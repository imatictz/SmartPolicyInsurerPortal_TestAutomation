package UserSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class InsuranceClassAccess {

	@Then("user click on insurance class access option")
	public void user_click_on_insurance_class_access_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='Span62']", 
	    		"user click on insurance class access option", "CLICK", 2000);
	}
	@When("user enter {string} as user code")
	public void user_enter_as_user_code(String user_code) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchUserCode']", 
				user_code, 
				   "user enter {string} as user code", "TEXTBOX", 0);
	}
	@When("user select edit icon \\(Insurance Class Access)")
	public void user_select_edit_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[3]/*[2]", 
	    		"user select edit icon", "CLICK", 2000);
	}
	@When("user select insurance type checkbox")
	public void user_select_insurance_type_checkbox() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_InsType']/tbody/tr[1]/td[2]", 
	    		"user select insurance type checkbox", "CLICK", 2000);
	}
	@When("user click on save detail icon")
	public void user_click_on_save_detail_icon() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table_InsType']/tbody/tr[1]/td[3]", 
	    		"user click on save detail icon", "CLICK", 2000);
	}
	@When("user click on yes button")
	public void user_click_on_yesButton() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSaveconfig']", 
	    		"user click on yes button", "CLICK", 2000);
	}
}
