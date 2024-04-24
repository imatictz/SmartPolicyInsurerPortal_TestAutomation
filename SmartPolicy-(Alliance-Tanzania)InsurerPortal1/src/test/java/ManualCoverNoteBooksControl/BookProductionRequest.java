package ManualCoverNoteBooksControl;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BookProductionRequest {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[@class='dropdown-toggle'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user navigate on manual cover note books control menu$")
	public void user_navigate_on_manual_cover_note_books_control_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Manual Cover Note Books Control'])[1]";
		SeleniumOperations.actionClass(input7);
	}

	@Then("^user select book production request option$")
	public void user_select_book_production_request_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Book Production Request'])[1]";
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

	@When("^user enter \"([^\"]*)\" as request date$")
	public void user_enter_as_request_date(String requestDate) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtRequestDate']";
	  	input[1]=requestDate;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as request date",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as expected date$")
	public void user_enter_as_expected_date(String expectedDate) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtExpecteddate']";
	  	input[1]=expectedDate;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as expected date",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as person requesting$")
	public void user_enter_as_person_requesting(String personRequesting) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtPersonReq']";
	  	input[1]=personRequesting;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as person requesting",output.get("MESSAGE").toString());
	}

	@Then("^user select \"([^\"]*)\" as insurance type$")
	public void user_select_as_insurance_type(String insuranceType) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbInst']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=insuranceType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as insurance type",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as pages$")
	public void user_select_as_pages(String pages) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbPages']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=pages;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as pages",output.get("MESSAGE").toString());
    }

	@When("^user enter \"([^\"]*)\" as No\\. of books$")
	public void user_enter_as_No_of_books(String noOfBooks) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtNoBook']";
	  	input[1]=noOfBooks;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as No\\\\. of books",output.get("MESSAGE").toString());
	}

	@Then("^user enter \"([^\"]*)\" as notes$")
	public void user_enter_as_notes(String notes) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtNotes']";
	  	input[1]=notes;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as notes",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as printer$")
	public void user_select_as_printer(String printer) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbPrinter']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=printer;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as printer",output.get("MESSAGE").toString());
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
