package BankAccountGLMapping;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BankAccountGLMapping {

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() throws Throwable {
		Object[] input7=new Object[1];
		input7[0]="(//*[@class='dropdown-toggle'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@Then("^user click on Bank Account GL Mapping \\(Digital Receipts Only\\) option$")
	public void user_click_on_Bank_Account_GL_Mapping_Digital_Receipts_Only_option() throws Throwable {
	    Object[] input7=new Object[1];
		input7[0]="//*[text()='Bank Account GL Mapping (Digital Receipts Only)']";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnAdd']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on add button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
 	}

	@When("^user select \"([^\"]*)\" as type$")
	public void user_select_as_type(String type) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbType']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=type;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as type",output.get("MESSAGE").toString());
	}

	@Then("^user select \"([^\"]*)\" as intermediary type$")
	public void user_select_as_intermediary_type(String intermediaryType) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbBroker']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=intermediaryType;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as intermediary type",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as payment mode$")
	public void user_enter_as_payment_mode(String paymentMode) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtPayMode']";
	  	input[1]=paymentMode;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as payment mode",output.get("MESSAGE").toString());
	}

	@Then("^user select \"([^\"]*)\" as mapped payment mode$")
	public void user_select_as_mapped_payment_mode(String mappedPaymentMode) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbMPayMode']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=mappedPaymentMode;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as mapped payment mode",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as Ccy$")
	public void user_select_as_Ccy(String ccy) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_CmbCcy']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=ccy;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as Ccy",output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as GL bank account$")
	public void user_select_as_GL_bank_account(String glBankAccount) throws Throwable {
	    Object[] input= new Object[4];
		input[0]="//*[@id='s2id_MainContent_cmbGlBAcc']";
		input[1]="//*[@class='select2-input select2-focused']";
		input[2]=glBankAccount;
		input[3]="//*[@class='select2-match']";
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as GL bank account",output.get("MESSAGE").toString());
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
