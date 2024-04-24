package FraudControl;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BlackListedCustomers {

	@When("^user navigate on tools dropdown menu$")
	public void user_navigate_on_tools_dropdown_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="//*[@id='MOD_INS_FRAUD']";
		SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on fraud control menu$")
	public void user_navigate_on_fraud_control_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Fraud Control'])[1]";
		SeleniumOperations.actionClass(input7);
	}

	@Then("^user click on Black Listed Customers option$")
	public void user_click_on_Black_Listed_Customers_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Black Listed Customers'])[1]";
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

	@When("^user enter \"([^\"]*)\" as client name$")
	public void user_enter_as_client_details(String clientName) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtCltName']";
	  	input[1]=clientName;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as client name",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as ID type$")
	public void user_select_as_ID_type(String idType) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbIDType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=idType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as ID type",output.get("MESSAGE").toString());
	}

	@Then("^user enter \"([^\"]*)\" as ID number$")
	public void user_enter_as_ID_number(String idNumber) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtIDNumber']";
	  	input[1]=idNumber;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as ID number",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as date of birth$")
	public void user_enter_as_date_of_birth(String dateOfBirth) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtDOB']";
	  	input[1]=dateOfBirth;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as date of birth",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as TIN No$")
	public void user_enter_as_TIN_No(String tinNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtIndTINNb']";
	  	input[1]=tinNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as TIN No",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as reason$")
	public void user_enter_as_reason(String reason) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtAddress']";
	  	input[1]=reason;
	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as reason",output.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String name) throws Throwable {
        Object[] input = new Object[2];
	  	input[0]="//*[@id='txtSrchName']";
	  	input[1]=name;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as name",output.get("MESSAGE").toString());
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MainContent_btnSearch']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on search button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user click on upload pictures icon$")
	public void user_click_on_upload_pictures_icon() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="(//*[@class='AttachData fa fa-paperclip'])[4]";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on upload pictures icon",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When ("^user choose \"(.*)\" file to upload$")
	public void user_choose_file_to_upload(String data) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='fileAtchDoc4']";
	  	input[1]=data;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as name",output.get("MESSAGE").toString());
	  	Thread.sleep(2000);
	}

	@When("^user click on upload button$")
	public void user_click_on_upload_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnUploadAcchment']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on upload button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@Then("^user able to view \"([^\"]*)\" as message$")
	public void user_able_to_view_as_message(String message) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[text()='2001-Document uploaded successfully']";
	  	input[1]=message;
	  	Hashtable<String,Object>output=SeleniumOperations.validation(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view \\\"([^\\\"]*)\\\" as message",output.get("MESSAGE").toString());
	  	Thread.sleep(2000);
	}
}
