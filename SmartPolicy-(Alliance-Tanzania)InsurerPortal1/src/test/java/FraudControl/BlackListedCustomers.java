package FraudControl;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BlackListedCustomers {

	@When("user navigate on tools dropdown menu")
	public void user_navigate_on_tools_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='MOD_INS_FRAUD']", "user navigate on tools dropdown menu", "NAVIGATE", 2000);
	}

	@When("user navigate on fraud control menu")
	public void user_navigate_on_fraud_dropdown_menu() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span_IntegrationMonit_lc']", "user navigate on fraud control menu", "NAVIGATE", 2000);
	}

	@Then("^user click on Black Listed Customers option$")
	public void user_click_on_Black_Listed_Customers_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Black Listed Customers'])[1]";
		SeleniumOperations.clickOnElement(input7);	
		Thread.sleep(2000);
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
		input[0]="//*[contains(@aria-controls,'cmbIDType')]";
		input[1]="//*[@class='select2-search__field']";
		input[2]=idType;
		input[3]="//*[contains(@data-select2-id,'select2-MainContent_cmbIDType')]";
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
  
	@When("user click on actions option")
	public void user_click_on_actions_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[6]/*[2]", "user click on actions option", "CLICK", 2000);

	}
	@When("^user click on upload pictures icon$")
	public void user_click_on_upload_pictures_icon() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="(//*[@class='AttachData dropdown-item'])";
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
	
	@When("user select {string} as client type")
	public void user_select_as_client_type(String Clienttype) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbBLCSType')]", "//*[@class='select2-search__field']", Clienttype, "//*[contains(@data-select2-id,'select2-MainContent_cmbBLCSType')]", "user select {string} as client type", "DROPDOWN", 0);

	}
	@When("user select {string} as business type")
	public void user_select_as_business_type(String businessType) {
	    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'cmbBLCSBusType')]", "//*[@class='select2-search__field']", businessType, "//*[contains(@data-select2-id,'select2-MainContent_cmbBLCSBusType')]", "user select {string} as business type", "DROPDOWN", 0);

	}
	@When("user enter {string} as VRN No")
	public void user_enter_as_vrn_no(String vrnNo) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='txtVRNNb']", vrnNo, "user enter {string} as VRN No", "TEXTBOX", 0);

	}
	@And("user enter {string} as TIN No\\(corporate)")
	public void enter_Tin_no(String tinNo) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='txtTINNb']", tinNo, "user enter {string} as TIN No\\\\(corporate)", "TEXTBOX", 0);

	}
}
