package SmartAssistUpload;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class SmartAssistUpload {

	@When("user navigate on tools dropdown menu")
	public void user_navigate_on_tools_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MOD_INS_FRAUD']", "user navigate on tools dropdown menu", "NAVIGATE", 2000);
	}

	@Then("^user click on Smart Assist Upload option$")
	public void user_click_on_Smart_Assist_Upload_option() throws Throwable {
	    Itl.CustomClickEvent("//*[@id='span45']", "user click on Smart Assist Upload option", "CLICK", 2000);

	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MainContent_btnAdd']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on add button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as insured name$")
	public void user_enter_as_insured_name(String insuredName) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtInsuredName']";
	  	input[1]=insuredName;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as insured name",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as broker$")
	public void user_select_as_broker(String broker) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[contains(@aria-controls,'cmbBroker')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=broker;
		input[3]="//*[contains(@data-select2-id,'select2-MainContent_cmbBroker')]";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as broker",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle registration$")
	public void user_enter_as_vehicle_registration(String vehicleRegistration) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtRegNB']";
	  	input[1]=vehicleRegistration;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle registration",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as policy No$")
	public void user_enter_as_policy_No(String policyNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtRnNB']";
	  	input[1]=policyNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as policy No",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle make$")
	public void user_enter_as_vehicle_make(String vehicleMake) throws Throwable {
	    Object[] input = new Object[2];
	    input[0]="//*[@id='MainContent_txtVehicleMake']";
	  	input[1]=vehicleMake;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle make",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle model$")
	public void user_enter_as_vehicle_model(String vehicleModel) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtVehicleModel']";
	  	input[1]=vehicleModel;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle model",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as email ID$")
	public void user_enter_as_email_ID(String emailId) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtEmail1']";
	    input[1]=emailId;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as email ID",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as mobile No$")
	public void user_enter_as_mobile_No(String mobileNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtmobileno1']";
	  	input[1]=mobileNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as mobile No",output.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@Then ("^user able to view \"(.*)\" as status$")
	public void status(String status) {
		Object[] input = new Object[2];
	  	input[0]="(//*[text()='Created'])[1]";
	  	input[1]=status;
	  	Hashtable<String,Object>output=SeleniumOperations.validation(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view \\\"(.*)\\\" as status",output.get("MESSAGE").toString());
	}
}
