package CompanySetup;

import java.util.concurrent.atomic.AtomicInteger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.ConfigReader;
import utility.SeleniumOperations;

public class PasswordChange {

	private static AtomicInteger counter = new AtomicInteger(0);

    private static String[] usernames = {
        ConfigReader.get("user1.username"),
        ConfigReader.get("user2.username")
    };

    private static String[] passwords = {
        ConfigReader.get("user1.password"),
        ConfigReader.get("user2.password")
    };
	@Then("user click on password change option")
	public void user_click_on_company_profile_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='nm']", 
	    		"user click on password change option", "CLICK", 2000);
	}
	@When("user enter current password")
	public void user_enter_current_password() {
		int index = counter.getAndIncrement() % usernames.length;

		SeleniumOperations.sendPasswordDynamic(
	            new Object[]{"//*[@id='MainContent_txtCurrentPwd']", passwords[index]}
	        );
	}
	@When("user enter current password {string}")
	public void user_enter_current_password1(String password) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtCurrentPwd']", 
				password, 
				   "user enter current password {string}", "TEXTBOX", 0);
	}
	@Given("username is {string}")
	public void username_is(String username) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtCurrentPwd']", 
				username, 
				   "username is {string}", "TEXTBOX", 0);
	}
	@When("user enter {string} as new password")
	public void user_enter_as_new_password(String new_password) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtNewPwd']", 
				new_password, 
				   "user enter {string} as new password", "TEXTBOX", 0);
	}
	@When("user enter {string} as retype new password")
	public void user_enter_as_retype_new_password(String retype_new_password) throws InterruptedException {
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtRetypeNewPwd']", 
				retype_new_password, 
				   "user enter {string} as retype new password", "TEXTBOX", 0);
	}
	@Then("user click on change button")
	public void user_click_on_changeButton() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='MainContent_btnChangePwdSave']", 
	    		"user click on change button", "CLICK", 2000);
	}
	@Then("system should display error {string}")
	public void system_should_display_error(String status) throws InterruptedException {
		Itl.CustomValidationContainsEvent("//*[@id='MainContent_lblPwdErrorMsg']", 
				status,
				"system should display error {string}", 
				"VALIDATION", 
				0);
	}
}
