package DownloadRiskNotesTaxInvoices;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class DownloadRiskNotesTaxInvoices {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[@class='dropdown-toggle'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@Then("^user click on Download Risk Notes & Tax Invoices option$")
	public void user_click_on_Download_Risk_Notes_Tax_Invoices_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="(//*[text()='Download Risk Notes/Tax Invoices'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user select \"([^\"]*)\" as select intermediary$")
	public void user_select_as_select_intermediary(String intermediary) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbBroker']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=intermediary;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as select intermediary",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as from date$")
	public void user_select_as_from_date(String date) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='MainContent_txtFromDate1']";
	  	input[1]=date;
	  	Hashtable<String,Object>output=SeleniumOperations.clearAndEnter(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as from date",output.get("MESSAGE").toString());
	}

	@When("^user click on generate file button$")
	public void user_click_on_generate_file_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnPrint']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on generate file button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user select customer tax invoice radio button$")
	public void user_select_customer_tax_invoice_radio_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='uniform-MainContent_rdlList_1']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select customer tax invoice radio button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
	}

	@When("^user select all broker only one day checkbox$")
	public void user_select_all_broker_only_one_day_checkbox() throws Throwable {
		Object[] input7=new Object[1];
 		input7[0]="//*[@id='MainContent_chkAllBroker']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select all broker only one day checkbox",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);  
	}
}
