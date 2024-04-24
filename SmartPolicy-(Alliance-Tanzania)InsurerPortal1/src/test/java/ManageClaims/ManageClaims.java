package ManageClaims;

import java.util.Hashtable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageClaims {

	 @When("^user click on branch portal menu$")
     public void user_click_on_branch_portal_menu() throws Throwable {
		 Object[] input=new Object[1];
	     input[0]="//*[@id='MNU_BROKER_2']";
	     SeleniumOperations.clickOnElement(input);
	     Thread.sleep(2000);
     }
	 
	 @When("^user navigate on operation dropdown menu$")
     public void user_navigate_on_operation_dropdown_menu() throws InterruptedException {
	     Object[] input7=new Object[1];
		 input7[0]="//*[@id='MOD_INS_OPERATIONS']";
		 SeleniumOperations.actionClass(input7);
         Thread.sleep(2000); 
	 }
	 
	 @When("^user navigate on claims management menu$")
	 public void user_navigate_on_claims_management_menu() throws Throwable {
	     Object[] input7=new Object[1];
		 input7[0]="//*[@id='MNU_wfCLAMM']";
		 SeleniumOperations.actionClass(input7);
         Thread.sleep(2000);
	 }

	 @Then("^user click on manage claims option$")
	 public void user_click_on_manage_claims_option() throws Throwable {
	     Object[] input7=new Object[1];
	     input7[0]="//*[@id='MNU_wfCLMM']";
		 SeleniumOperations.clickOnElement(input7);
         Thread.sleep(2000);
	 }

     @Then ("^user select \"(.*)\" as company name$")
	 public void user_select_Maverick_insurance_branch_limited_company_as_company_name(String companyName) throws Throwable {
	     Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbSrchBroker']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=companyName;
		 input1[3]="//*[@class='select2-match']";
		 SeleniumOperations.dropdown(input1);
	 }

	 @And ("^user enter \"(.*)\" as from date$")
	 public void enterFromDate(String fromDate) {
		 Object[] input2=new Object[2];
		 input2[0]="//*[@id='MainContent_txtSrchFromDate1']";
		 input2[1]=fromDate;
		 SeleniumOperations.clearAndEnter(input2);
	 }
	 
	 @Then("^user enter \"([^\"]*)\" as risk note$")
	 public void user_enter_as_risk_note(String riskNote) throws Throwable {
	     Object[] input2=new Object[2];
		 input2[0]="//*[@id='MainContent_txtSrchRiskNote']";
		 input2[1]=riskNote;
		 SeleniumOperations.sendKeys(input2);
	 }

	 @When("^user click on search button$")
	 public void user_click_on_search_button() throws Throwable {
		 Object[] input11=new Object[1];
		 input11[0]="//*[@id='MainContent_btnSearch']";
		 SeleniumOperations.clickOnElement(input11);
		 Thread.sleep(2000);
	 }

	 @When("^user click on display icon$")
	 public void user_click_on_display_icon() throws Throwable {
	     Object[] input3=new Object[1];
		 input3[0]="//*[@class='DisplayData fa fa-desktop']";
		 SeleniumOperations.clickOnElement(input3);
		 Thread.sleep(2000);
	 }

	 @When ("^user click on edit claim icon$")
	 public void editClaimIcon() throws InterruptedException {
		 Object[] input=new Object[1];
		 input[0]="(//*[@class='btn btn-default quickAccesss'])[2]";
		 Hashtable<String,Object> output = SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on edit claim icon", output.get("MESSAGE").toString());
		 Thread.sleep(4000);
	 }
	 
	 @When ("^user select \"(.*)\" as claimant category$")
	 public void user_click_on_claimant_category_dropdown(String claimantCategory) throws Throwable {
	     Object[] input=new Object[1];
		 input[0]="(//*[@class='select2-arrow'])[22]";
		 SeleniumOperations.clickOnElement(input);
		 Object[] input1=new Object[4];
		 input1[0]="(//*[@class='select2-arrow'])[22]";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantCategory;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output = SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"(.*)\\\" as claimant category", output.get("MESSAGE").toString());
	 }

	 @When("^user select \"([^\"]*)\" as claimant status$")
	 public void user_select_as_claimant_status(String claimantStatus) throws Throwable {
	     Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbCLMDType']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantStatus;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as claimant status", output.get("MESSAGE").toString());
     }

	 @When("^user select \"([^\"]*)\" as gender$")
	 public void user_select_as_gender(String gender) throws Throwable {
	     Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbGender']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=gender;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as gender", output.get("MESSAGE").toString());
     }

	 @When("^user enter \"([^\"]*)\" as claimant birth date$")
	 public void user_enter_as_claimant_birth_date(String claimantBirthDate) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtCBOD']";
		 input[1]=claimantBirthDate;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as claimant birth date",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as claimant ID$")
	 public void user_select_as_claimant_ID(String claimantID) throws Throwable {
	     Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbClaimantIdType']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantID;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as claimant ID", output.get("MESSAGE").toString());
     }

	 @Then("^user enter \"([^\"]*)\" as id number$")
	 public void user_enter_as_id_number(String idNumber) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtCLMDIdNb']";
		 input[1]=idNumber;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as id number",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }



	 @Then ("^user select \"(.*)\" as claimant loss type$")
	 public void user_select_Accidental_Damage_as_claimant_loss_type(String claimantLoss) throws Throwable {
		 Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbLossType']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbLossType']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantLoss;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"(.*)\\\" as claimant loss type", output.get("MESSAGE").toString());
	 }

	 @When ("^user enter \"(.*)\" as claimant name$")
	 public void claimantName(String claimantName) throws InterruptedException {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtClaimantName']";
		 input[1]=claimantName;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"(.*)\\\" as claimant name",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }
	 
	 @Then("^user enter \"([^\"]*)\" as expected claim amount$")
	 public void user_enter_as_expected_claim_amount(String expectedAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtClaimedAmount']";
		 input[1]=expectedAmount;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as expected claim amount",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as initial reserve amount$")
	 public void user_enter_as_initial_reserve_amount(String reserveAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtClaimantAmount']";
		 input[1]=reserveAmount;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as initial reserve amount",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }
	 
	 
	 @Then("^user click on insert claimant button$")
	 public void user_click_on_insert_claimant_button() throws Throwable {
	     Object[] input8=new Object[1];
	     input8[0]="//*[@id='btnClaimantInsert']";
		 SeleniumOperations.clickOnElement(input8);
		 
		 Object[] input7=new Object[1];
		 input7[0]="//*[@id='btnClaimantInsert']";
		 Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on insert claimant button",output.get("MESSAGE").toString());  
         Thread.sleep(2000);
	 }

	 @And ("^user click on update button$")
	 public void clickOnUpdateButton() throws InterruptedException{
		 Object[]input1=new Object[1];
		 input1[0]="//*[@id='MainContent_btnSave']";
		 SeleniumOperations.clickOnElement(input1);
		 
		 Object[]input=new Object[1];
		 input[0]="//*[@id='MainContent_btnSave']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on update button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	 
	 @Then("^user able to view \"([^\"]*)\" as status$")
	 public void user_able_to_view_as_status(String status) throws Throwable {
	     Object[] input=new Object[2];
	     input[0]="(//*[text()='Issue Claim Note'])[1]";
	     input[1]=status;
	     Hashtable<String,Object> output= SeleniumOperations.validation(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
	 }

	 @When ("^user click on display icon to check claim reserve$")
	 public void user_click_on_display_icon_claim_reserve() throws Throwable {
		 Object[] input3=new Object[1];
		 input3[0]="(//*[@class='DisplayData fa fa-desktop'])[1]";
	     SeleniumOperations.clickOnElement(input3);
		 Thread.sleep(2000);
	 }
	 
	 @When("^user click on claim reserve icon$")
	 public void user_click_on_claim_reserve_icon() throws Throwable {
	     Object[]input1=new Object[1];
		 input1[0]="(//*[@class='btn btn-default quickAccesss'])[6]";
		 SeleniumOperations.clickOnElement(input1);
		 
		 Object[]input=new Object[1];
		 input[0]="(//*[@class='btn btn-default quickAccesss'])[6]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on claim reserve icon",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }
	 
	 @Then ("^user able to view \"(.*)\" as status in reserve transactions$")
	 public void user_able_to_view_as_status_ClaimTransactions(String status) throws Throwable {
	     Object[] input=new Object[2];
	     input[0]="(//*[text()='Approved '])[1]";
	     input[1]=status;
		 Hashtable<String,Object> output= SeleniumOperations.validation(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"(.*)\\\" as status in reserve transactions",output.get("MESSAGE").toString());
	 }

	 @When("^user click on feedback icon$")
	 public void user_click_on_feedback_icon() throws Throwable {
	     Object[]input=new Object[1];
		 input[0]="(//*[@class='btn btn-default quickAccesss'])[34]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on feedback icon",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as status from dropdown$")
	 public void user_select_as_status_from_dropdown(String status) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=status;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as status from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as claimant from dropdown$")
	 public void user_select_as_claimant_from_dropdown(String claimant) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisClaimant']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisClaimant']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimant;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as claimant from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as assessor from dropdown$")
	 public void user_select_as_assessor_from_dropdown(String assessor) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=assessor;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as assessor from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as Loss Assessment Option from dropdown$")
	 public void user_select_as_Loss_Assessment_Option_from_dropdown(String lossAssessment) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbLAO']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbLAO']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=lossAssessment;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as Loss Assessment Option from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as assessor id from dropdown$")
	 public void user_select_as_assessor_id_from_dropdown(String assessorId) throws Throwable {
	     Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbAssessorId']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=assessorId;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as assessor id from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as assessor id number$")
	 public void user_enter_as_assessor_id_number(String assessorIdNumber) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtAssessorIdNb']";
		 input[1]=assessorIdNumber;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as assessor id number",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user click on save button$")
	 public void user_click_on_save_button() throws Throwable {
	     Object[]input1=new Object[1];
		 input1[0]="//*[@id='btnDisSave']";
		 SeleniumOperations.clickOnElement(input1);
		 
		 Object[]input=new Object[1];
		 input[0]="//*[@id='btnDisSave']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on save button",output.get("MESSAGE").toString());
		 Thread.sleep(4000);
	 }

	 @When("^user select \"([^\"]*)\" as status from dropdown for Preliminary Report$")
	 public void user_select_as_status_from_dropdown_for_Preliminary_Report(String status) throws Throwable {
	     Object[] input2=new Object[4];
	     input2[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
	     SeleniumOperations.clickOnElement(input2);
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=status;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as status from dropdown for Preliminary Report", output.get("MESSAGE").toString());
	     Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as assessor from dropdown for Preliminary Report$")
	 public void user_select_as_assessor_from_dropdown_for_Preliminary_Report(String assessor) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=assessor;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as assessor from dropdown for Preliminary Report", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as assesed amount for Preliminary Report$")
	 public void user_enter_as_assesed_amount_for_Preliminary_Report(String assesedAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtAssessedAmount']";
		 input[1]=assesedAmount;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as assesed amount for Preliminary Report",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as reference number for Preliminary Report$")
	 public void user_enter_as_reference_number_for_Preliminary_Report(String referenceNumber) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtDisReferenceNb']";
		 input[1]=referenceNumber;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as reference number for Preliminary Report",output.get("MESSAGE").toString());  
		 Thread.sleep(4000);
	 }

	 @When("^user select \"([^\"]*)\" as status from dropdown for Final Report$")
	 public void user_select_as_status_from_dropdown_for_Final_Report(String status) throws Throwable {
	     Object[] input2=new Object[1];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisStatus']";
		 Thread.sleep(2000);
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=status;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as status from dropdown for Final Report", output.get("MESSAGE").toString());
         Thread.sleep(4000);
	 }

	 @When("^user select \"([^\"]*)\" as assessor from dropdown for Final Report$")
	 public void user_select_as_assessor_from_dropdown_for_Final_Report(String assessor) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 SeleniumOperations.clickOnElement(input2);
		
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbDisAssessor']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=assessor;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as assessor from dropdown for Final Report", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as assesed amount for Final Report$")
	 public void user_enter_as_assesed_amount_for_Final_Report(String assesedAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtAssessedAmount']";
		 input[1]=assesedAmount;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as assesed amount for Final Report",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as reference number for Final Report$")
	 public void user_enter_as_reference_number_for_Final_Report(String referenceNumber) throws Throwable {
		 Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtDisReferenceNb']";
		 input[1]=referenceNumber;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as reference number for Final Report",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }


	 @When("^user click on issue claim note icon$")
	 public void user_click_on_issue_claim_note_icon() throws Throwable {
	     Object[]input=new Object[1];
		 input[0]="(//*[@class='btn btn-default quickAccesss'])[18]";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on issue claim note icon",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 
		 Object[]input1=new Object[1];
		 input1[0]="(//*[@class='btn btn-default quickAccesss'])[18]";
		 SeleniumOperations.clickOnElement(input1);
	 }

	 @When("^user select \"([^\"]*)\" as claimant name from dropdown$")
	 public void user_select_as_claimant_name_from_dropdown(String claimantName) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbClaimNoteClaimant']";
		 SeleniumOperations.clickOnElement(input2);
		
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbClaimNoteClaimant']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantName;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as claimant name from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as claim amount$")
	 public void user_enter_as_claim_amount(String claimAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtDVAmount']";
		 input[1]=claimAmount;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as claim amount",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as assessor from dropdown for claim note$")
	 public void user_select_as_assessor_from_dropdown_for_claim_note(String assessor) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbClaimNoteAssessor']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbClaimNoteAssessor']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=assessor;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as assessor from dropdown for claim note", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }
	 
	 @Then("^user select \"([^\"]*)\" as claimant payee from dropdown$")
	 public void user_select_as_claimant_payee_from_dropdown(String claimantPayee) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbPayeeTypeFD']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbPayeeTypeFD']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=claimantPayee;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as claimant payee from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @Then("^user click on excess applicable checkbox$")
	 public void user_click_on_excess_applicable_checkbox() throws Throwable {
	     Object[]input=new Object[1];
		 input[0]="//*[@id='chkExcessFD']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on excess applicable checkbox",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as first excess from dropdown$")
	 public void user_select_as_first_excess_from_dropdown(String firstExcess) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbExcessDisp']";
		 SeleniumOperations.clickOnElement(input2);
		
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbExcessDisp']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=firstExcess;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as first excess from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as excess percent for first excess$")
	 public void user_enter_as_excess_percent_for_first_excess(String excessPercent) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtExcessPercentDisp']";
		 input[1]=excessPercent;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess percent for first excess",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as excess amount for first excess$")
	 public void user_enter_as_excess_amount_for_first_excess(String excessAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtFirstExcessAmountDisp']";
		 input[1]=excessAmount;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess amount for first excess",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user select \"([^\"]*)\" as second excess from dropdown$")
	 public void user_select_as_second_excess_from_dropdown(String secondExcess) throws Throwable {
	     Object[] input2=new Object[4];
		 input2[0]="//*[@id='s2id_MainContent_cmbSecondExcessDisp']";
		 SeleniumOperations.clickOnElement(input2);
		 
		 Object[] input1=new Object[4];
		 input1[0]="//*[@id='s2id_MainContent_cmbSecondExcessDisp']";
		 input1[1]="//*[@class='select2-input select2-focused']";
		 input1[2]=secondExcess;
		 input1[3]="//*[@class='select2-match']";
		 Hashtable<String, Object> output =  SeleniumOperations.dropdown(input1);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select \\\"([^\\\"]*)\\\" as second excess from dropdown", output.get("MESSAGE").toString());
         Thread.sleep(2000);
	 }

	 @When("^user enter \"([^\"]*)\" as excess percent for second excess$")
	 public void user_enter_as_excess_percent_for_second_excess(String excessPercent) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSecondExcessPercentDisp']";
		 input[1]=excessPercent;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess percent for second excess",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as excess amount for second excess$")
	 public void user_enter_as_excess_amount_for_second_excess(String excessAmount) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSecondExcessAmountDisp']";
		 input[1]=excessAmount;
		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as excess amount for second excess",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as total claim excess$")
	 public void user_enter_as_total_claim_excess(String claimExcess) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSettleExcessAmountFD']";
		 input[1]=claimExcess;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as total claim excess",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" as less betterment/Depreciation$")
	 public void user_enter_as_less_betterment_Depreciation(String lessBetterment) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSettleLessBettermentFD']";
		 input[1]=lessBetterment;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as less betterment/Depreciation",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" as young/Inexperience Driver$")
	 public void user_enter_as_young_Inexperience_Driver(String youngInexperienceDriver) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSettleYoungInexpFD']";
		 input[1]=youngInexperienceDriver;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as young/Inexperience Driver",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @When("^user enter \"([^\"]*)\" as salvage$")
	 public void user_enter_as_salvage(String salvage) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtSettleSalvageFD']";
		 input[1]=salvage;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as salvage",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @Then("^user enter \"([^\"]*)\" as under insurance contribution$")
	 public void user_enter_as_under_insurance_contribution(String underInsurance) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='txtUndInsurancecontributionFD']";
		 input[1]=underInsurance;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as under insurance contribution",output.get("MESSAGE").toString());  
		 Thread.sleep(1000);
	 }

	 @Then("^user click on amount includes withhold tax checkbox$")
	 public void user_click_on_amount_includes_withhold_tax_checkbox() throws Throwable {
	     Object[]input=new Object[1];
		 input[0]="//*[@id='chkIsWithholdTaxFD']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on amount includes withhold tax checkbox",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @Then("^user enter \"([^\"]*)\" as recomendation$")
	 public void user_enter_as_recomendation(String recomendation) throws Throwable {
	     Object[] input=new Object[2];
		 input[0]="//*[@id='MainContent_txtRecomendation']";
		 input[1]=recomendation;
		 Hashtable<String,Object> output= SeleniumOperations.sendKeys(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user enter \\\"([^\\\"]*)\\\" as recomendation",output.get("MESSAGE").toString());  
		 Thread.sleep(2000);
	 }

	 @When("^user click on dispay icon$")
	 public void user_click_on_dispay_icon() throws Throwable {
	     Object[]input=new Object[1];
		 input[0]="//*[@id='chkIsWithholdTaxFD']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on amount includes withhold tax checkbox",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }

	 @When("^user click on approve icon$")
	 public void user_click_on_approve_icon() throws Throwable {
	     
	 }

	 @Then("^user click on approve button$")
	 public void user_click_on_approve_button() throws Throwable {
	     
	 }

	 @When("^user click on accept icon$")
	 public void user_click_on_accept_icon() throws Throwable {
	     
	 }

	 @When("^user enter \"([^\"]*)\" as reference date$")
	 public void user_enter_as_reference_date(String arg1) throws Throwable {
	    
	 }

	 @When("^user enter \"([^\"]*)\" as reference number$")
	 public void user_enter_as_reference_number1(String arg1) throws Throwable {
	     
	 }

	 @Then("^user enter \"([^\"]*)\" receive date$")
	 public void user_enter_receive_date(String arg1) throws Throwable {
	    
	 }

	 @When("^user click on Payment Requistion icon$")
	 public void user_click_on_Payment_Requistion_icon() throws Throwable {
	     
	 }


}
