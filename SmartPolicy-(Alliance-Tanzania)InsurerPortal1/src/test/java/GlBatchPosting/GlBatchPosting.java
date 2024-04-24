package GlBatchPosting;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class GlBatchPosting {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[@class='dropdown-toggle'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@Then("^user click on Gl batch posting option$")
	public void user_click_on_Gl_batch_posting_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='GL Batch Posting '])[1]";
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

	@When("^user select \"([^\"]*)\" as posting type$")
	public void user_select_as_posting_type(String postingType) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=postingType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as posting type",output.get("MESSAGE").toString());
	}

	@When("^user click on create posting date button$")
	public void user_click_on_create_posting_date_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on create posting date button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@Then ("^user able to view \"(.*)\" as status$")
	public void status(String status){
		Object[] input = new Object[2];
		input[0]="(//*[text()='Pending'])[1]";
		input[1]=status;
		Hashtable<String,Object>output=SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view \\\"(.*)\\\" as status",output.get("MESSAGE").toString());
	}
}
