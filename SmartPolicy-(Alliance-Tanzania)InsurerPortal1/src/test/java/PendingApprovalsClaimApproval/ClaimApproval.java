package PendingApprovalsClaimApproval;

import java.util.Hashtable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ClaimApproval {
	
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
	   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchCoverType']", coverInformation, "user enter {string} as cover information", "TEXTBOX", 0);
	}
 @When ("user select {string} as branch")
 public void selectBranch(String branch) {
	 Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbBranch')]",
			 "//*[@class='select2-search__field']", 
			 branch, 
			 "(//*[contains(@id,'MainContent_cmbBranch-results')])[1]", 
			 "user select {string} as branch", "DROPDOWN", 1000);
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
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchRiskNote']", claimId, "user enter {string} as claim id", "TEXTBOX", 0);
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
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtInitCR']", claimReserve, "user enter {string} as initial claims reserve", "TEXTBOX", 0);

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
	    Itl.CustomClickEvent("//*[@id='btnClaimProceed']", "user click on register new claim botton", "CLICK", 4000);

 }
 @Then ("user able to view {string} as success message")
 public void successMessage(String message) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", message,
				"user able to view {string} as success message", "VALIDATION", 0);

 }
}
