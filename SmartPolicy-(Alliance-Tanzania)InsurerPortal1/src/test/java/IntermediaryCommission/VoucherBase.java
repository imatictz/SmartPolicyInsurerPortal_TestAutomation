package IntermediaryCommission;

import java.util.Hashtable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class VoucherBase {

	
 	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="(//*[@class='dropdown-toggle'])[1]";
	    SeleniumOperations.clickOnElement(input7);
	}
 	
	@When("^user navigate on intermediary commission option$")
	public void user_navigate_on_intermediary_commission_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="//*[@id='MNU_COMMISSION']";
		SeleniumOperations.actionClass(input7);
	}

	@When("^user click on voucher base$")
	public void user_click_on_voucher_base() throws Throwable {
	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MNU_WFCTXN']";
	    SeleniumOperations.clickOnElement(input4);
	}

	@When("^user click on add button to enter Commission Voucher details$")
	public void user_click_on_add_button_to_enter_Commission_Voucher_details() throws Throwable {
	    Object[] input4=new Object[1];
	    input4[0]="//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input4);
	}

	@When("^user click on broker name dropdown$")
	public void user_click_on_broker_name_dropdown() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[3]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on broker name dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as broker name$")
	public void user_enter_as_broker_name(String brokerName) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=brokerName;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as broker name",output.get("MESSAGE").toString());
	}

	@Then("^user select Demo Insurance Brokers \\(T\\) Limited\\. as broker name$")
	public void user_select_Demo_Insurance_Brokers_T_Limited_as_broker_name() throws Throwable {
	    Object[]input=new Object[1];
		input[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Demo Insurance Brokers \\\\(T\\\\) Limited\\\\. as broker name",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as amount$")
	public void user_enter_as_amount(String amount) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtAmount']";
	    input[1]=amount;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as amount",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user click on mode dropdown$")
	public void user_click_on_mode_dropdown() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[5]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on mode dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as mode$")
	public void user_enter_as_mode(String mode) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@class='select2-input select2-focused']";
	    input[1]=mode;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as mode",output.get("MESSAGE").toString());
	}

	@Then("^user select Card Payment as mode$")
	public void user_select_Card_Payment_as_mode() throws Throwable {
	    Object[]input=new Object[1];
		input[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Card Payment as mode",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as Cheque/ Reference Number$")
	public void user_enter_as_Cheque_Reference_Number(String referenceNumber) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtRefNB']";
	    input[1]=referenceNumber;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as Cheque/ Reference Number",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as notes$")
	public void user_enter_as_notes(String notes) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtNotes']";
	    input[1]=notes;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as notes",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as refrence id$")
	public void user_enter_as_refrence_id(String refrenceId) throws Throwable {
	    Object[] input=new Object[2];
	    input[0]="//*[@id='MainContent_txtAcctRefId']";
	    input[1]=refrenceId;
	    Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as refrence id",output.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    Object[] input=new Object[1];
		input[0]="//*[@id='btnSave']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());
	    Thread.sleep(4000);
	}

	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String status) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="//*[@style='width: 5%; text-align: left'][1]";
		input[1]=status;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
	}
}
