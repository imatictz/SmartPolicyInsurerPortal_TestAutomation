package NotificationSetup;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class NotificationSetup {

	@When("^user navigate on tools dropdown menu$")
	public void user_navigate_on_tools_dropdown_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="//*[@id='MOD_INS_FRAUD']";
		SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on Notification setup menu$")
	public void user_navigate_on_Notification_setup_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Notification Setup'])[1]";
		SeleniumOperations.actionClass(input7);
	}

	@Then("^user click on Notification Master option$")
	public void user_click_on_Notification_Master_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Notification Master'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MainContent_btnAdd']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on add button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as screen$")
	public void user_select_as_screen(String screen) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbNtfmScreen']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=screen;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as screen",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as status$")
	public void user_select_as_status(String status) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbNtfmStatus']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=status;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as status to close$")
	public void user_select_as_status_to_close(String statusToClose) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbNtfmStatusClose']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=statusToClose;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as status to close",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as notification type$")
	public void user_select_as_notification_type(String notificationType) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbNtfmType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=notificationType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as notification type",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as email subject$")
	public void user_enter_as_email_subject(String emailSubject) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtEmailSubject']";
	  	input[1]=emailSubject;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as email subject",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as email body$")
	public void user_enter_as_email_body(String emailBody) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtEmailBody']";
	  	input[1]=emailBody;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as email body",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as SMS text$")
	public void user_enter_as_SMS_text(String smsText) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtSmsText']";
	  	input[1]=smsText;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as SMS text",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as reminder frequency$")
	public void user_select_as_reminder_frequency(String reminderFrequency) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbReminderFreq']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=reminderFrequency;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as reminder frequency",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as due value$")
	public void user_enter_as_due_value(String dueValue) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtDueValue']";
	  	input[1]=dueValue;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as due value",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as levelone$")
	public void user_select_as_levelone(String levelone) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbLevel1']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=levelone;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as levelone",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as leveltwo$")
	public void user_select_as_leveltwo(String levelTwo) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbLevel2']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=levelTwo;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as leveltwo",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as levelthree$")
	public void user_select_as_levelthree(String levelThree) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbLevel3']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=levelThree;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as levelthree",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as levelfour$")
	public void user_select_as_levelfour(String levelFour) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbLevel4']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=levelFour;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as levelfour",output.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}
}
