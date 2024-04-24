package PendingApprovalsNonCompliance;

import java.util.Hashtable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class NonComplianceApproval {
	
	@When("^user click on branch portal menu$")
	public void user_click_on_branch_portal_menu() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='MNU_BROKER_2']";
		SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}

	@When("^user click on quotations menu$")
	public void user_click_on_quotations_menu() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='MNU_WFFIQNM_2']";
	    SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
	 
	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException  {
		Object[] input10=new Object[1];
		input10[0]="//*[@class='bold'][text()='Add']";
		SeleniumOperations.clickOnElement(input10);
		Thread.sleep(3000);
	}

	@When("^user click on select insurance type dropdown$")
	public void user_click_on_select_insurance_type_dropdown() throws InterruptedException  {    
	    Object[] input11=new Object[1];
		input11[0]="(//*[text()='Select Insurance Type'])[1]";
		SeleniumOperations.clickOnElement(input11);  
		Thread.sleep(3000);
	}

	@When("^user enter \"([^\"]*)\" to search insurance type in search box$")
	public void enterInsuranceType(String insuranceType) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=insuranceType;
		SeleniumOperations.sendKeys(input);
		Thread.sleep(2000);
	}
	
	@When("^user select Bonds as insurance type from dropdown$")
	public void selectInsuranceTypeResult() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		SeleniumOperations.clickOnElement(input11);
		Thread.sleep(10000);
	}

	@When("^user enter \"([^\"]*)\" as client name$")
	public void enterClientName(String clientName) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtClientName']";
		input[1]=clientName;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Pravin Testing\" as client name",output.get("MESSAGE").toString());
	    Thread.sleep(5000);
	}

	@When("^user select Pravin Testing as client name$")
	public void selectClientName() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MainContent_txtClientName']";
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Pravin Testing as client name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When ("^user enter \"(.*)\" as cover note$")
	public void enterCoverNote(String coverNote) throws Throwable {
	    Object[] input1=new Object[2];
		input1[0]="//*[@id='MainContent_txtGridICN']";
		SeleniumOperations.clickOnElement(input1);
		Thread.sleep(4000);
			
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtGridICN']";
	    input[1]=coverNote;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"123459876501234\" as cover note",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
		
    @When("^user click on insurance class dropdown$")
	public void clickOnInsuranceClassDropdown() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='s2id_MainContent_cmbInsuranceClass']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insurance class dropdown",output.get("MESSAGE").toString());
		Object[] input12=new Object[1];
		input12[0]="//*[@id='s2id_MainContent_cmbInsuranceClass']";
		SeleniumOperations.clickOnElement(input12);
	}

	@When("^user enter \"([^\"]*)\" as insurance class$")
	public void enterInsuranceClass(String insuranceClass) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=insuranceClass;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Advance Payment Bond 1\" as insurance class",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user select Advance Payment Bond one as insurance class$")
	public void selectInsuranceClassResult() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Advance Payment Bond one as insurance class",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as contract value$")
	public void enterContractValue(String contractValue) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='txtContractVal']";
		input[1]=contractValue;
		Hashtable<String,Object> output=  SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"2000000\" as contract value",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("^user enter \"(.*)\" as description$")
	public void enterDescription(String description) throws InterruptedException {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtDescription']";
		input[1]=description;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Bonds Quotation\" as description",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
		
	@When("^user click on compute button$")
	public void clickOnComputeButton() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnCompute']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on compute button",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on insert button$")
	public void clickOnInsertButton() throws InterruptedException {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnInsert']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert button",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("^user click on broker partner name dropdown$")
	public void clickOnDropDown() throws InterruptedException {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MainContent_cmbBussViaBroker']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on broker partner name dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
	
	@When ("^user select hivohivo as broker partner name$")
	public void clickOnselectValue() throws InterruptedException {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select hivohivo as broker partner name",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
		
	@When ("^user click on save button$")
	public void clickOnSaveButton() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='btnSave']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());
		   
		Object[] input1=new Object[1];
		input1[0]="//*[@id='btnSave']";
		SeleniumOperations.clickOnElement(input1);
		Thread.sleep(2000);
	}
		
	@When("^user click on capture receipt icon$")
	public void user_click_on_capture_receipt_icon() throws Throwable {
	    Object[] input=new Object[1];
	    input[0]="//*[@id='MainContent_repIQNM_btnAppTeller_0']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on capture receipt icon",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	 
	@When("^user click on mode dropdown$")
	public void user_click_on_mode_dropdown() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="(//*[@class='select2-chosen'])[43]";
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
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Electronic Funds Transfer (EFT)\" as mode",output.get("MESSAGE").toString());  
	}

	@When("^user select Electronic Funds Transfer \\(EFT\\) as mode$")
	public void user_select_Electronic_Funds_Transfer_EFT_as_mode() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@CLASS='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Electronic Funds Transfer (EFT) as mode",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user click on issuer bank dropdown$")
	public void user_click_on_issuer_bank_dropdown() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="(//*[@class='select2-chosen'])[44]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issuer bank dropdown",output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as issuer bank$")
	public void user_enter_as_issuer_bank(String issuerBank ) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=issuerBank;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Absa Group Limited\" as issuer bank",output.get("MESSAGE").toString());  
	}

	@When("^user select Absa Group Limited as issuer bank$")
	public void user_select_Absa_Group_Limited_as_issuer_bank() throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@CLASS='select2-match']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Absa Group Limited as issuer bank",output.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

	@When("^user click on collecting bank dropdown$")
	public void user_click_on_collecting_bank_dropdown() throws Throwable {
		Object[] input=new Object[1];
		input[0]="(//*[@class='select2-chosen'])[45]";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on collecting bank dropdown",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as collecting bank$")
	public void user_enter_as_collecting_bank(String collectingBank) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@class='select2-input select2-focused']";
		input[1]=collectingBank;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"Uchumi Commercial Bank\" as collecting bank",output.get("MESSAGE").toString());  
	}

	@When("^user select Uchumi Commercial Bank as collecting bank$")
	public void user_select_Uchumi_Commercial_Bank_as_collecting_bank() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@CLASS='select2-match']";
	    Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select Uchumi Commercial Bank as collecting bank",output.get("MESSAGE").toString()); 
		Thread.sleep(2000);
	}

    @When("^user enter \"([^\"]*)\" as reference No$")
	public void user_enter_as_reference_No(String referenceNo) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtTRReciptNb']";
		input[1]=referenceNo;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \"1250\" as reference No",output.get("MESSAGE").toString());  
	}

	@When("^user click on proceed button$")
	public void user_click_on_proceed_button() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='btnProceed']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on proceed button",output.get("MESSAGE").toString()); 
	}

	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String awaitingReceipt) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[text()='Pending ']";
		input[1]=awaitingReceipt;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \"Awaiting Receipt\" as status",output.get("MESSAGE").toString());  
	}
		
	@When("^user click on issue risk note option$")
	public void user_click_on_issue_risk_note_option() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='btnRisknote']";
		SeleniumOperations.clickOnElement(input);
	}

	@When ("^user click on issue risk note option for pending status$")
    public void user_click_on_issue_risk_note_option_for_Pending () throws Throwable {
		Object[] input=new Object[1];
		input[0]="//*[@id='MainContent_repIQNM_btnRisknote_0']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user click on yes button for confirmation$")
	public void user_click_on_yes_button_for_confirmation() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='btnProcedeRiskNote']";
	    SeleniumOperations.clickOnElement(input);
		Thread.sleep(2000);
	}
		
    @When("^user click on insurer portal menu$")
	public void user_click_on_insurer_portal_menu() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='MNU_INSURER_2']";
	    SeleniumOperations.clickOnElement(input);
	}

	@When("^user navigate on operation dropdown menu$")
	public void user_navigate_on_operation_dropdown_menu() {
	    Object[] input7=new Object[1];
		input7[0]="(//*[@class='dropdown-toggle'])[1]";
		SeleniumOperations.actionClass(input7);
	}

	@When("^user navigate on pending approvals option$")
	public void user_navigate_on_pending_approvals_option() throws Throwable {
		Object[] input7=new Object[1];
		input7[0]="//*[@id='MNU_APPROVAL']";
		SeleniumOperations.actionClass(input7);
	}

	@Then("^user click on non-compliance quotation approval option$")
	public void user_click_on_non_compliance_quotation_approval_option() throws Throwable {
		Object[] input=new Object[1];
	    input[0]="//*[@id='MNU_WFFIQNM']";
		SeleniumOperations.clickOnElement(input);
	}

	@When("^user enter \"([^\"]*)\" as quote no$")
	public void user_enter_as_quote_no(String quoteNo) throws Throwable {
		Object[] input=new Object[2];
		input[0]="//*[@id='MainContent_txtSrchQuote']";
		input[1]=quoteNo;
		Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as quote no",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button1() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MainContent_btnSearch']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^user click on display option$")
	public void user_click_on_display_option() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@class='DisplayData fa fa-desktop']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on display option",output.get("MESSAGE").toString());
		Thread.sleep(3000);
	}

	@Then("^user click on update&approve button$")
	public void user_click_on_update_approve_button() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='btnUpdate']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update&approve button",output.get("MESSAGE").toString());
		Object[] input12=new Object[1];
		input12[0]="//*[@id='btnUpdate']";
		SeleniumOperations.clickOnElement(input12);
		Thread.sleep(3000);
     }

	@When("^user click on branch portal$")
	public void user_click_on_branch_portal() throws Throwable {
		Object[] input11=new Object[1];
		input11[0]="//*[@id='MNU_BROKER_2']";
		Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on branch portal",output.get("MESSAGE").toString());
		Thread.sleep(2000);
	}
}
