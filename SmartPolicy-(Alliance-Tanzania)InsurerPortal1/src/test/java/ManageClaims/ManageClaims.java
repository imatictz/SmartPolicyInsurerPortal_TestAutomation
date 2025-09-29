package ManageClaims;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageClaims {

	 
	 
	 @When("user navigate on operation dropdown menu")
		public void user_navigate_on_operation_dropdown_menu() throws Throwable {
		    Itl.CustomNavigateAction("//*[@id='span_Security_lc']", "user navigate on operation dropdown menu", "NAVIGATE", 2000);
		}
	 
	 @When("user navigate on approval management option")
		public void user_navigate_on_approval_management_option() throws Throwable {
		    Itl.CustomNavigateAction("//*[@id='MNU_APPROVAL']", "user navigate on approval management option", "NAVIGATE", 2000);
		}

	 @Then("user click on claim approval option")
	 public void user_click_on_claims_option() throws Throwable {
		    Itl.CustomClickEvent("//*[@id='span_claimApprv_lc']", "user click on claim approval option", "CLICK", 2000);
	   }
	 @When("user navigate on claims management option")
		public void user_navigate_on_claims_management_option() throws Throwable {
		    Itl.CustomNavigateAction("//*[@id='span24']", "user navigate on claims management option", "NAVIGATE", 2000);
		}

	 @Then("user click on manage claims option")
	 public void user_click_on_manage_claims_option() throws Throwable {
		    Itl.CustomClickEvent("//*[@id='span26']", "user click on manage claims option", "CLICK", 2000);
	   }
	 
	 @When("user enter {string} as cover information")
		public void user_enter_as_insuranceType(String coverInformation) throws InterruptedException {
		   Itl.CustomSendEvent("//*[@id='MainContent_txtSrchCoverType']", coverInformation, "user enter {string} as cover information", "TEXTBOX", 0);
		}
	 @When ("user select {string} as branch")
	 public void selectBranch(String branch) {
		 Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBranch')]", "//*[@class='select2-search__field']", branch, "(//*[contains(@id,'MainContent_cmbBranch-results')])[1]", "user select {string} as branch", "DROPDOWN", 1000);
	 }

		@When ("user click on search button to find {string} claim")
		public void user_click_on_search_button_quoteNo1(String quoteName) throws Throwable {
			 Object[] input=new Object[1];
			 input[0]="//*[@id='MainContent_btnSearch']";
			 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
			 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
			 Thread.sleep(2000);
			 SeleniumOperations.getClaimId(quoteName);
			 Thread.sleep(4000);
		}

		@When ("user enter claim id to search {string} claim")
		public void user_enter_as_quote_number(String quoteName) throws InterruptedException {
			String claimId = SeleniumOperations.getClaimId(quoteName);
			Itl.CustomSendEvent("//*[@id='MainContent_txtSrchRiskNote']", claimId, "user enter {string} as claim id", "TEXTBOX", 0);
			Thread.sleep(4000);
		}


     @When("^user select \"([^\"]*)\" as from date$")
 	public void user_select_as_date_from(String dateFrom) throws Throwable {
 		 Object[] input=new Object[2];
 		 input[0]="//*[@id='MainContent_txtSrchFromDate1']";
 		 input[1]=dateFrom;
 		 Hashtable<String,Object> output= SeleniumOperations.clearAndEnter(input);
 		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user select {string}as from date",output.get("MESSAGE").toString());
 		 Thread.sleep(2000);
 	}
	 

	 @When("^user click on search button$")
	 public void user_click_on_search_button() throws Throwable {
		 Object[] input11=new Object[1];
		 input11[0]="//*[@id='MainContent_btnSearch']";
		 SeleniumOperations.clickOnElement(input11);
		 Thread.sleep(2000);
	 }

	 @When("user click on display option")
		public void user_click_on_display_option() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]/*[1]", "user click on display option", "CLICK", 4000);
		}
	 @Then("user click on accept button")
		public void user_click_on_update_approve_button() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='MainContent_btnAccept']", "user click on accept button", "CLICK", 2000);
		}
	 @When("user enter {string} as initial claims reserve")
	 public void user_enter_as_initial_claims_reserve(String claimReserve) throws InterruptedException {
			Itl.CustomSendEvent("//*[@id='MainContent_txtInitCR']", claimReserve, "user enter {string} as initial claims reserve", "TEXTBOX", 0);

	 }
	 @When("user select assign assessor checkbox")
	 public void user_select_assign_assessor_checkbox() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='chkAssessor']", "user select assign assessor checkbox", "CLICK", 1000);

	 }
	 @When("user select assign investigator checkbox")
	 public void user_select_assign_investigator_checkbox() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='chkInvestigator']", "user select assign investigator checkbox", "CLICK", 1000);

	 }
	 @When("user select assign loss adjustor\\/Suryevor checkbox")
	 public void user_select_assign_loss_adjustor_suryevor_checkbox() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='chkLossAdjustor']", "user select assign loss adjustor\\\\/Suryevor checkbox", "CLICK", 2000);

	 }
	 @When("user click on register new claim botton")
	 public void user_click_on_register_new_claim_botton() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnClaimProceed']", "user click on register new claim botton", "CLICK", 2000);

	 }
	 @Then ("user able to view {string} as success message")
	 public void successMessage(String message) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", message, "user able to view {string} as success message", "VALIDATION", 0);

	 }
	 @When ("user enter claim id")
	 public void enterClaimId() throws InterruptedException {
		// String claimId = SeleniumOperations.getStoredClaimId();
			Itl.CustomSendEvent("//*[@id='MainContent_txtSrchRiskNote']", "401", "user enter risk note number", "TEXTBOX", 2000);
	 }
	 @Then ("user able to view {string} as status")
	 public void status(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[9]", status, "user able to view {string} as status", "VALIDATION", 0);
	 }
	 @When("user clicks on the actions dropdown")
	 public void user_clicks_on_the_actions_dropdown() throws InterruptedException {
	        Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[11]/*[2]", "user clicks on the actions dropdown", "CLICK", 4000);
	 }

	 @When ("user click on edit claim icon")
	 public void editClaimIcon() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@class='DisplayData grid_btnSpace']", "user click on edit claim icon", "CLICK", 5000);
	 }
	 
	 @When ("^user select \"(.*)\" as claimant category$")
	 public void user_click_on_claimant_category_dropdown(String claimantCategory) throws Throwable {
	       Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbClaimantType']", "//*[@class='select2-input select2-focused']", claimantCategory, "//*[@class='select2-match']", "user select \\\\\\\"(.*)\\\\\\\" as claimant category", "DROPDOWN", 2000);
	 }
	 @When("user enter claimant details :")
	 public void user_enter_claimant_details(DataTable dataTable) throws InterruptedException {
		 List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	 	   
	        //claimant category
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClaimantType')]", "//*[@class='select2-search__field']", userList.get(0).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbClaimantType-result')])", "user select {string} as claimant category", "DROPDOWN", 0);
			Thread.sleep(4000);
			//claimant status
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCLMDType')]", "//*[@class='select2-search__field']", userList.get(1).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbCLMDType-result')])", "user select {string} as claimant status", "DROPDOWN", 3000);
			//gender
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbGender')]", "//*[@class='select2-search__field']", userList.get(2).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbGender-result')])", "user select {string} as gender", "DROPDOWN", 2000);
			//claimant birth date
			Itl.CustomSendEvent("//*[@id='MainContent_txtCBOD']",userList.get(3).get("Value"), "user enter {string} as claimant birth date", "TEXTBOX", 0);
			//KYC ID Type
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbClaimantIdType')]", "//*[@class='select2-search__field']", userList.get(4).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbClaimantIdType-result')])", "user select {string} as KYC ID Type", "DROPDOWN", 0);
			//KYC ID number
			Itl.CustomSendEvent("//*[@id='MainContent_txtCLMDIdNb']",userList.get(5).get("Value"), "user enter {string} as KYC ID number", "TEXTBOX", 0);
			//reported type
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbIntimationType')]", "//*[@class='select2-search__field']", userList.get(6).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbIntimationType-result')])", "user select {string} as reported type", "DROPDOWN", 0);
			//claimant loss type
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbLossType')]", "//*[@class='select2-search__field']", userList.get(7).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbLossType-result')])", "user select {string} as claimant loss type", "DROPDOWN", 0);
			//Country of Claimant
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCountryCode')]", "//*[@class='select2-search__field']", userList.get(8).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbCountryCode-result')])", "user select {string} as Country of Claimant", "DROPDOWN", 0);
			//Region/City of Claimant
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbRegionC')]", "//*[@class='select2-search__field']", userList.get(9).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbRegionC-result')])", "user select {string} as Region/City of Claimant", "DROPDOWN", 0);
			//District of Claimant
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDistrictC')]", "//*[@class='select2-search__field']", userList.get(10).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDistrictC-result')])", "user select {string} as District of Claimant", "DROPDOWN", 0);
			//claimant name
			Itl.CustomSendEvent("//*[@id='MainContent_txtClaimantName']",userList.get(11).get("Value"), "user enter {string} as claimant name", "TEXTBOX", 0);
			//Claimant Circumstances
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbInjured')]", "//*[@class='select2-search__field']", userList.get(12).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbInjured-result')])", "user select {string} as Claimant Circumstances", "DROPDOWN", 0);
			//expected claim amount
			Itl.CustomSendEvent("//*[@id='txtClaimedAmount']",userList.get(13).get("Value"), "user enter {string} as expected claim amount", "TEXTBOX", 0);
			//initial reserve amount
			Itl.CustomSendEvent("//*[@id='txtClaimantAmount']",userList.get(14).get("Value"), "user enter {string} as initial reserve amount", "TEXTBOX", 0);
			//Circumstances of the Loss Event
			Itl.CustomSendEvent("//*[@id='MainContent_txtCircums']",userList.get(15).get("Value"), "user enter {string} as Circumstances of the Loss Event", "TEXTBOX", 0);
			//Reported by
			Itl.CustomSendEvent("//*[@id='MainContent_txtClaimReported']",userList.get(16).get("Value"), "user enter {string} as Reported by", "TEXTBOX", 0);
			//First Loss Payee
			Itl.CustomSendEvent("//*[@id='txtPayeeBenefeciary']",userList.get(17).get("Value"), "user enter {string} as First Loss Payee", "TEXTBOX", 0);
			//Reported Date
			Itl.CustomSendEvent("//*[@id='MainContent_txtReportedDate']",userList.get(18).get("Value"), "user enter {string} as Reported Date", "TEXTBOX", 0);
	 
	 }
	 @When ("user select reported time")
	 public void reportTime() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='MainContent_txtReportedTime']", "user select reported time", "CLICK", 2000);
            Itl.ClickEvent("//*[@id='MainContent_txtReportedTime']", "CLICK", 2000);
	 }
	 @When ("user click on exit button")
	 public void exitButton() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnCancel']", "user click on exit button", "CLICK", 2000);
	 }
	 @When ("user click on upload documents icon")
	 public void UploadDocuments() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@class='AtchData grid_btnSpace']", "user click on edit claim icon", "CLICK", 5000);
	 }
	 @When("user select {string} as attachment type")
	 public void user_select_as_attachment_type(String attachType) {
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbAtchFileType')]", "//*[@class='select2-search__field']", attachType, "(//*[contains(@data-select2-id,'MainContent_cmbAtchFileType-result')])", "user select {string} as attachment type", "DROPDOWN", 0);

	 }
	 @When("user select file to upload")
	 public void user_select_file_to_upload() throws InterruptedException {
			Itl.CustomSendEvent("//*[@id='fileAtchDoc']","C:\\Users\\Administrator\\Documents\\NA.pdf", "user select file to upload", "TEXTBOX", 2000);

	 }
	 @When("user click on upload button")
	 public void user_click_on_upload_button() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnUploadAcchment']", "user click on upload button", "CLICK", 2000);

	 }
	 @Then ("user able to view {string} status after document upload")
	 public void documentstatus(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='uploadStatus']", status, "user able to view {string} status after document upload", "VALIDATION", 0);
	 }
	 @When("user select Completed claim form checkbox as document received")
	 public void userselectcheckbox1() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='Atch2']/tbody/tr[1]/td[1]", "user select Completed claim form checkbox as document received", "CLICK", 2000);

	 }
	 @When("user select Employment details including employment contract, salary slip, ID, resignation letter \\(if any) checkbox as document received")
	 public void userselectcheckbox2() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='Atch2']/tbody/tr[2]/td[1]", "user select Employment details including employment contract, salary slip, ID, resignation letter (if any) checkbox as document received", "CLICK", 2000);

	 }
	 @Then ("user able to view {string} as received by status for first document received")
	 public void receivedstatus1(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='Atch2']/tbody/tr[1]/td[4]", status, "user able to view {string} as received by status for first document received", "VALIDATION", 0);
	 }
	 @Then ("user able to view {string} as received by status for second document received")
	 public void receivedstatus2(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='Atch2']/tbody/tr[2]/td[4]", status, "user able to view {string} as received by status for second document received", "VALIDATION", 0);
            Itl.ClickEvent("//*[@id='btnExit']", "CLICK", 2000);

	 }
	 @When ("user click on feedback icon")
	 public void feedback() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@class='DispData grid_btnSpace']", "user click on feedback icon", "CLICK", 4000);
	 }
	 @When("user enter assigned to assessor details:")
	 public void user_enter_assigned_to_assessor_details(DataTable dataTable) throws InterruptedException {
		 List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	 	   
	        //status
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDisStatus')]", "//*[@class='select2-search__field']", userList.get(0).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDisStatus-result')])", "user select {string} as status", "DROPDOWN", 0);
			Thread.sleep(4000);
			//assessor
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDisAssessor')]", "//*[@class='select2-search__field']", userList.get(1).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDisAssessor-result')])", "user select {string} as assessor", "DROPDOWN", 2000);
			//assessment option
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbLAO')]", "//*[@class='select2-search__field']", userList.get(2).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbLAO-result')])", "user select {string} as assessment option", "DROPDOWN", 2000);
			//vehicle at garage
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbVehicleAtGarage')]", "//*[@class='select2-search__field']", userList.get(3).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbVehicleAtGarage-result')])", "user select {string} as vehicle at garage", "DROPDOWN", 2000);
			//currency
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCcy')]", "//*[@class='select2-search__field']", userList.get(4).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbCcy-result')])", "user select {string} as currency", "DROPDOWN", 2000);
			//Assessment Fee
			Itl.CustomSendEvent("//*[@id='txtAssessmentAmount']",userList.get(5).get("Value"), "user enter {string} as Assessment Fee", "TEXTBOX", 0);
	 }
	 @When ("user click on save button to save feedback")
	 public void savefeedback() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='btnDisSave']", "user click on save button to save feedback", "CLICK", 2000);
	 }
	 @Then ("user able to view {string} status after feedback saved successfully")
	 public void feedbackstatus(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='MainContent_lblDisError']", status, "user able to view {string} status after feedback saved successfully", "VALIDATION", 4000);
	 }
	 @When("user enter Received Final Report details:")
	 public void user_enter_received_final_report_details(DataTable dataTable) throws InterruptedException {
		 List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	 	   
	        //status
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDisStatus')]", "//*[@class='select2-search__field']", userList.get(0).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDisStatus-result')])", "user select {string} as status", "DROPDOWN", 0);
			Thread.sleep(4000);
			//Service Provider
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDisAssessor')]", "//*[@class='select2-search__field']", userList.get(1).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDisAssessor-result')])", "user select {string} as Service Provider", "DROPDOWN", 2000);
			//Reference Number
			Itl.CustomSendEvent("//*[@id='MainContent_txtDisReferenceNb']",userList.get(2).get("Value"), "user enter {string} as Reference Number", "TEXTBOX", 0);
			//Invoice Number
			Itl.CustomSendEvent("//*[@id='MainContent_txtincNo']",userList.get(3).get("Value"), "user enter {string} as Invoice Number", "TEXTBOX", 0);
			//Service Fee Amount
			Itl.CustomSendEvent("//*[@id='txtService']",userList.get(4).get("Value"), "user enter {string} as Service Fee Amount", "TEXTBOX", 0);
			//Parts SubTotal
			Itl.CustomSendEvent("//*[@id='txtPartSubToT']",userList.get(5).get("Value"), "user enter {string} as Parts SubTotal", "TEXTBOX", 0);
			//Labor SubTotal
			Itl.CustomSendEvent("//*[@id='txtLaborSubToT']",userList.get(6).get("Value"), "user enter {string} as Labor SubTotal", "TEXTBOX", 0);
			//Salvage Location
			Itl.CustomSendEvent("//*[@id='txtSLVGL']",userList.get(7).get("Value"), "user enter {string} as Salvage Location", "TEXTBOX", 0);
			//Assessed Salvage Amount
			Itl.CustomSendEvent("//*[@id='txtSLVGAmount']",userList.get(8).get("Value"), "user enter {string} as Assessed Salvage Amount", "TEXTBOX", 0);
			//Current Market Value
			Itl.CustomSendEvent("//*[@id='txtCMV']",userList.get(9).get("Value"), "user enter {string} as Current Market Value", "TEXTBOX", 0);
			//Country
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCNTR')]", "//*[@class='select2-search__field']", userList.get(10).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbCNTR-result')])", "user select {string} as Country", "DROPDOWN", 2000);
			//Region/City
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbRegionCity')]", "//*[@class='select2-search__field']", userList.get(11).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbRegionCity-result')])", "user select {string} as Region/City", "DROPDOWN", 2000);
			//District
			Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbDistrictS')]", "//*[@class='select2-search__field']", userList.get(12).get("Value"), "(//*[contains(@data-select2-id,'MainContent_cmbDistrictS-result')])", "user select {string} as District", "DROPDOWN", 2000);
			//Assessment Date
			Itl.CustomSendEvent("//*[@id='MainContent_txtAssessmentDT']",userList.get(13).get("Value"), "user enter {string} as Assessment Date", "TEXTBOX", 0);
			//Reference Date
			Itl.CustomSendEvent("//*[@id='MainContent_txtDisReferenceDate']",userList.get(14).get("Value"), "user enter {string} as Reference Date", "TEXTBOX", 0);
	 
	 }
	 @When("user select repair checkbox as assessor decision")
	 public void user_select_repair_checkbox_as_assessor_decision() throws InterruptedException {
		    Itl.CustomClickEvent("//*[@id='chkRepair']", "user select repair checkbox as assessor decision", "CLICK", 2000);

	 }


}
