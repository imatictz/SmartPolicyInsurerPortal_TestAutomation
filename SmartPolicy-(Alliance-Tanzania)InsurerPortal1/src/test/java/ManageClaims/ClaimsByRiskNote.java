package ManageClaims;

import java.util.Hashtable;
import java.util.concurrent.TimeoutException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ClaimsByRiskNote {
	@When("user navigate on policy management option")
	public void user_navigate_on_policy_management_option() throws Throwable {
		Itl.CustomNavigateAction("//*[@id='span124']", 
	    		"user navigate on policy management option",
	    		"NAVIGATE", 3000);
	}
	@When("user Click on risk note menu")
	public void user_click_on_risk_note_menu() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='span_ChangePass_lc']", 
	    		"user Click on risk note menu", "CLICK", 2000);
	}
	@When("user enter {string} as Insurance Type")
	public void user_enter_as_insuranceType(String insuranceType) throws InterruptedException {
	   Itl.CustomClearSendEvent("//*[@id='MainContent_txtInsuranceType']", 
			   insuranceType, "user enter {string} as Insurance Type", "TEXTBOX", 0);
	}
	@When("user select {string} as from date \\(RiskNote)")
	public void user_select_as_from_date(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']", 
				   fromDate, 
				   "user select {string} as from date", "TEXTBOX", 0);
	}
	@When("user click on search button to find {string} risk note")
	public void user_click_on_search_button_to_find_risk_note(String risknote) throws InterruptedException, TimeoutException {
		Itl.CustomClickEvent("//*[@id='button_btnSearch_lc']", 
	    		"user click on search button to find {string} risk note", "CLICK", 2000);
		Thread.sleep(3000);
		 SeleniumOperations.getClaim(risknote);
		 Thread.sleep(5000);
	}
	@When ("user enter risk note number to search {string} risk note")
	public void user_enter_as_quote_number(String risknote) throws InterruptedException, TimeoutException {
		String risknoteNo = SeleniumOperations.getClaim(risknote);
		Itl.CustomClearSendEvent("//*[@id='MainContent_txtRiskNote']",
				risknoteNo, "user enter {string} as risk note number", "TEXTBOX", 0);
		
		Thread.sleep(4000);
	}
	
	/*@When ("user click on search button")
	 public void user_click_on_search_button_quoteNo() throws Throwable {
		 Object[] input=new Object[1];
		 input[0]="//*[@id='button_btnSearch_lc']";
		 Hashtable<String,Object> output= SeleniumOperations.clickOnElement(input);
		 HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on search button",output.get("MESSAGE").toString());
		 Thread.sleep(2000);
	 }*/
	 @When("user enter date of loss\\/Accident")
	 public void user_enter_as_date_of_loss_accident() throws InterruptedException {
           Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtAcciDate']", "Today",
        		   "user enter date of loss\\\\/Accident", "TEXTBOX", 0);
	 }
	 @When("user enter date of death\\/illnes\\/others")
	 public void user_enter_as_date_of_death_illnes_others() throws InterruptedException {
           Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtAcciDate']", "Today","user enter date of death\\\\/illnes\\\\/others", "TEXTBOX", 0);
	 }
	 @When("user select {string} as country")
	 public void user_select_as_country(String country) throws InterruptedException {
		    Itl.CustomDropdownEvent("//*[contains(@aria-controls,'MainContent_cmbCountryofLoss')]", 
		    		"//*[@class='select2-search__field']", country , "(//*[contains(@data-select2-id,'MainContent_cmbCountryofLoss')])[2]", "user select {string} as country", "DROPDOWN", 3000);

	 }
	 @When("user select {string} as region\\/City of loss")
	 public void user_select_as_region_city_of_loss(String cityOfLoss) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbRegion')])[1]", "//*[@class='select2-search__field']", cityOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbRegion')])[3]", "user select {string} as region\\\\/City of loss", "DROPDOWN", 3000);

	 }
	 @When("user select {string} as district of loss")
	 public void user_select_as_district_of_loss(String districtOfLoss) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbDistrict')])[1]", "//*[@class='select2-search__field']", districtOfLoss , "(//*[contains(@data-select2-id,'MainContent_cmbDistrict')])[3]", "user select {string} as district of loss", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as cause of loss\\/Accident")
	 public void user_select_as_cause_of_loss_accident(String causeOfLossAccident) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "//*[@class='select2-search__field']", causeOfLossAccident , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of loss\\\\/Accident", "DROPDOWN", 2000);

	 }
	 @Then("user enter {string} as place of loss\\/Accident")
	 public void user_enter_as_place_of_loss_accident(String placeOfLossAccident) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfLossAccident, "user enter {string} as place of loss\\\\/Accident", "TEXTBOX", 0);	

	 }
	 @When("user select {string} as reported type")
	 public void user_select_as_reported_type(String reportedType) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbIntimationType')])[1]", "//*[@class='select2-search__field']", reportedType , "(//*[contains(@data-select2-id,'MainContent_cmbIntimationType')])[2]", "user select {string} as reported type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as nature of loss\\/claim type")
	 public void user_select_as_nature_of_loss_claim_type(String natureOfLossClaimType) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbLossType')])[1]", "//*[@class='select2-search__field']", natureOfLossClaimType , "(//*[contains(@data-select2-id,'MainContent_cmbLossType')])[2]", "user select {string} as nature of loss\\\\/claim type", "DROPDOWN", 2000);

	 }
	 @When("user select {string} as claimant circumstances")
	 public void user_select_as_claimant_circumstances(String claimantCircumstances) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbInjured')])[1]", "//*[@class='select2-search__field']", claimantCircumstances , "(//*[contains(@data-select2-id,'MainContent_cmbInjured')])[2]", "user select {string} as claimant circumstances", "DROPDOWN", 2000);

	 }
	 @When("user enter {string} as claimant amount")
	 public void user_enter_as_claimant_amount(String claimantAmount) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='txtClaimedAmount']", claimantAmount, "user enter {string} as claimant amount", "TEXTBOX", 0);	

	 }
	 @When("user enter {string} as circumstances of accidents")
	 public void user_enter_as_circumstances_of_accidents(String circumstancesOfAccidents) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtCircums']", circumstancesOfAccidents, "user enter {string} as circumstances of accidents", "TEXTBOX", 0);	

	 }
     @When("user select {string} as cause of claim")
     public void user_select_as_cause_of_claim(String causeOfClaim) throws InterruptedException {
		    Itl.CustomDropdownEvent("(//*[contains(@aria-controls,'MainContent_cmbClmmCauses')])[1]", "//*[@class='select2-search__field']", causeOfClaim , "(//*[contains(@data-select2-id,'MainContent_cmbClmmCauses')])[2]", "user select {string} as cause of claim", "DROPDOWN", 2000);

     }
     @Then("user enter {string} as place of death\\/illnes\\/others")
     public void user_enter_as_place_of_death_illnes_others(String placeOfDeath) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciPlace']", placeOfDeath, "user enter {string} as place of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

     }
     @When("user enter {string} as date of death\\/illnes\\/others")
     public void user_enter_as_date_of_death_illnes_others(String dateOfDeathIllnesOthers) throws InterruptedException {
		    Itl.CustomClearSendEvent("//*[@id='MainContent_txtAcciDate']", 
		    		dateOfDeathIllnesOthers, "user enter {string} as date of death\\\\/illnes\\\\/others", "TEXTBOX", 0);	

     }
     @When("user enter {string} as reported by")
     public void user_enter_as_reported_by(String reported_by) throws InterruptedException {
    	 Itl.CustomClearSendEvent("//*[@id='MainContent_txtClaimReported']", 
    			 reported_by, "user enter {string} as reported by", "TEXTBOX", 0);
     }
     @When("user enter reported date")
     public void user_enter_reported_date() throws InterruptedException {
    	 Itl.CustomSendTodaysDateEvent("//*[@id='MainContent_txtReportedDate']", "Today",
      		   "user enter reported date", "TEXTBOX", 0);
     }
     /*@When ("user select reported time")
	 public void reportTime() throws InterruptedException {
		 SeleniumOperations.scrollUp();  
		 Itl.CustomClickEvent("//*[@id='MainContent_txtReportedTime']", "user select reported time", "CLICK", 2000);
            Itl.ClickEvent("//*[@id='MainContent_txtReportedTime']", "CLICK", 2000);
     }*/
     @When("user click on save button")
     public void user_click_on_save_button() throws InterruptedException {
         Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 4000);
     }
     @Then("user able to view {string} as status \\(RiskNote)")
     public void user_able_to_view_as_status(String status) throws InterruptedException {
         Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", status, "user able to view {string} as status", "VALIDATION", 0);
     }
}

