package CompanySetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class CompanyProfile {

	@When("user navigate on setup dropdown menu")
	public void user_navigate_on_setup_dropdown_menu() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span_Setup_lc']", 
	    		"user navigate on setup dropdown menu", "NAVIGATE", 2000);
	}
	@When("user navigate on company setup")
	public void user_navigate_on_company_setup() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span84']", 
	    		"user navigate on company setup", "NAVIGATE", 2000);
	}
	@Then("user click on company profile option")
	public void user_click_on_company_profile_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='span53']", 
	    		"user click on company profile option", "CLICK", 2000);
	}
	@When("user enter {string} as company name")
	public void user_enter_as_company_name(String company_name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtCompName']", 
				company_name, 
				   "user enter {string} as company name", "TEXTBOX", 0);
	}
	@When("user enter {string} as short name")
	public void user_enter_as_short_name(String short_name) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtShortName']", 
				short_name, 
				   "user enter {string} as short name", "TEXTBOX", 0);
	}
	@When("user enter {string} as address1")
	public void user_enter_as_address1(String address1) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtAddress1']", 
				address1, 
				   "user enter {string} as address1", "TEXTBOX", 0);
	}
	@When("user enter {string} as email")
	public void user_enter_as_email(String email) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtEmail']", 
				email, 
				   "user enter {string} as email", "TEXTBOX", 0);
	}
	@When("user enter {string} as reference no")
	public void user_enter_as_reference_no(String reference_no) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtrefNo']", 
				reference_no, 
				   "user enter {string} as reference no", "TEXTBOX", 0);
	}
	@When("user enter {string} as url")
	public void user_enter_as_url(String url) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtURL']", 
				url, 
				   "user enter {string} as url", "TEXTBOX", 0);
	}
	@When("user enter {string} as VRN")
	public void user_enter_as_vrn(String VRN) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtVat']", 
				VRN, 
				   "user enter {string} as VRN", "TEXTBOX", 0);
	}
	@When("user enter {string} as TIN")
	public void user_enter_as_tin(String TIN) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtTin']", 
				TIN, 
				   "user enter {string} as TIN", "TEXTBOX", 0);
	}
	@When("user enter {string} as Company Disclamer")
	public void user_enter_as_company_disclamer(String company_disclamer) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtDisclamer']", 
				company_disclamer, 
				   "user enter {string} as Company Disclamer", "TEXTBOX", 0);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnSave']", 
				"user click on save button", "CLICK", 2000);
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
