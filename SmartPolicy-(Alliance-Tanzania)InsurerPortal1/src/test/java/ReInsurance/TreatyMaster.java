package ReInsurance;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.SeleniumOperations;

public class TreatyMaster {

	@When("user navigate on reinsurance dropdown menu")
	public void user_navigate_on_reinsurance_dropdown_menu() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] ="//*[@id='MOD_INS_REINSURER']";
	    SeleniumOperations.actionClass(input);
	}
	@When("user click on treaty master option")
	public void user_click_on_treaty_master_option() throws InterruptedException {
	    Object[] input = new Object[1];
	    input[0]="//*[@id='MNU_WFTRTM']";
	    SeleniumOperations.clickOnElement(input);
	    Thread.sleep(2000);
	}
	@Then("user click on add button")
	public void user_click_on_add_button() throws InterruptedException {
	    Object[] input = new Object[1];
	    input[0] ="//*[@id='button_btnAdd_lc']";
	    SeleniumOperations.clickOnElement(input);
	    Thread.sleep(2000);
	    
	}
	@When("user enter {string} as treaty code")
	public void user_enter_as_treaty_code(String treatyCode) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtTreatyCode']", treatyCode, "user enter {string} as treaty code", "TEXTBOX", 0);
	    
	}
	@When("user enter {string} as treaty description")
	public void user_enter_as_treaty_description(String treatyDescription) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtTreatyDesc']", treatyDescription, "user enter {string} as treaty description", "TEXTBOX", 0);

	}
	@When("user select {string} as business type")
	public void user_select_as_business_type(String businessType) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbBusinessType']", "//*[@class='select2-input select2-focused']", businessType, "//*[@class='select2-match']", "user select {string} as business type", "DROPDOWN", 0);
	}
	@When("user select {string} as rate basis")
	public void user_select_as_rate_basis(String rateBasis) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbRateBasis']", "//*[@class='select2-input select2-focused']", rateBasis, "//*[@class='select2-match']", "user select {string} as rate basis", "DROPDOWN", 0);

	}
	@When("user select {string} as rate type")
	public void user_select_as_rate_type(String rateType) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbRateType']", "//*[@class='select2-input select2-focused']", rateType, "//*[@class='select2-match']", "user select {string} as rate type", "DROPDOWN", 0);

	}
	@When("user enter {string} as round off")
	public void user_enter_as_round_off(String roundOff) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtRoundOff']", roundOff, "user enter {string} as round off", "TEXTBOX", 0);

	}
	@When("user enter {string} as exchange rate")
	public void user_enter_as_exchange_rate(String exchangeRate) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtExchangeRate']", exchangeRate, "user enter {string} as exchange rate", "TEXTBOX", 0);

	}
	@When("user enter {string} as Fac Inwards Treaty Limit %")
	public void user_enter_as_fac_inwards_treaty_limit(String facTreatyLimit) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtFacInwTreatyPercent']", facTreatyLimit, "user enter {string} as Fac Inwards Treaty Limit %", "TEXTBOX", 0);

	}
	@When("user enter {string} as cash call limit")
	public void user_enter_as_cash_call_limit(String cashCallLimit) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtCashCallLimit']", cashCallLimit, "user enter {string} as cash call limit", "TEXTBOX", 0);

	}
	@When("user select {string} as company name")
	public void user_select_as_company_name(String companyName) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCompany']", "//*[@class='select2-input select2-focused']", companyName, "//*[@class='select2-match']", "user select {string} as company name", "DROPDOWN", 0);

	}
	@When("user select {string} as treaty type")
	public void user_select_as_treaty_type(String treatyType) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbType']", "//*[@class='select2-input select2-focused']", treatyType, "//*[@class='select2-match']", "user select {string} as treaty type", "DROPDOWN", 0);

	}
	@When("user select {string} as limit type")
	public void user_select_as_limit_type(String limitType) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbLimitType']", "//*[@class='select2-input select2-focused']", limitType, "//*[@class='select2-match']", "user select {string} as limit type", "DROPDOWN", 0);

	}
	@When("user select {string} as ceding type")
	public void user_select_as_ceding_type(String cedingType) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbCeading']", "//*[@class='select2-input select2-focused']", cedingType, "//*[@class='select2-match']", "user select {string} as ceding type", "DROPDOWN", 0);

	}
	@When("user select {string} as allocation mode")
	public void user_select_as_allocation_mode(String allocationMode) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbAllocationMode']", "//*[@class='select2-input select2-focused']", allocationMode, "//*[@class='select2-match']", "user select {string} as allocation mode", "DROPDOWN", 0);

	}
	@When("user enter {string} as percentage")
	public void user_enter_as_percentage(String percentage) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtPercentage']", percentage, "user enter {string} as percentage", "TEXTBOX", 0);

	}
	@When("user enter {string} lines")
	public void user_enter_lines(String lines) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtLines']", lines, "user enter {string} lines", "TEXTBOX", 0);

	}
	@When("user enter {string} as limit amount")
	public void user_enter_as_limit_amount(String limitAmount) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtLimitAmount']", limitAmount, "user enter {string} as limit amount", "TEXTBOX", 0);

	}
	@When("user enter {string} as commission %")
	public void user_enter_as_commission(String commission) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtCommPer']", commission, "user enter {string} as commission %", "TEXTBOX", 0);

	}
	@When("user select {string} as reinsurance broker")
	public void user_select_as_reinsurance_broker(String reinsuranceBroker) {
	    Itl.CustomDropdownEvent("//*[@id='s2id_MainContent_cmbReBroker']", "//*[@class='select2-input select2-focused']", reinsuranceBroker, "//*[@class='select2-match']", "user select {string} as reinsurance broker", "DROPDOWN", 0);

	}
	@When("user enter {string} as rate")
	public void user_enter_as_rate(String rate) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtXOLrate']", rate, "user enter {string} as rate", "TEXTBOX", 0);

	}
	@When("user enter {string} as minimum deposit premium")
	public void user_enter_as_minimum_deposit_premium(String miniDepoPremium) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtMDP']", miniDepoPremium, "user enter {string} as minimum deposit premium", "TEXTBOX", 0);

	}
	@When("user enter {string} as yearly limit")
	public void user_enter_as_yearly_limit(String yearlyLimit) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtYearlyLimit']", yearlyLimit, "user enter {string} as yearly limit", "TEXTBOX", 0);

	}
	@When("user enter {string} as No of reinstatement")
	public void user_enter_as_no_of_reinstatement(String noOfReinstatement) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtNoofReinstatement']", noOfReinstatement, "user enter {string} as No of reinstatement", "TEXTBOX", 0);

	}
	@When("user enter {string} as withhold tax %")
	public void user_enter_as_withhold_tax(String withHoldTax) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtWithHoldTax']", withHoldTax, "user enter {string} as withhold tax %", "TEXTBOX", 0);

	}
	@When("user enter {string} as premium levy %")
	public void user_enter_as_premium_levy(String premiumLevy) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtDeductPremiumLevy']", premiumLevy, "user enter {string} as premium levy %", "TEXTBOX", 0);

	}
	@When("user enter {string} as city levy %")
	public void user_enter_as_city_levy(String cityLevy) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtDeductCityLevy']", cityLevy, "user enter {string} as city levy %", "TEXTBOX", 0);

	}
	@When("user enter {string} as additional levy %")
	public void user_enter_as_additional_levy(String additionalLevy) throws InterruptedException {
	    Itl.CustomSendEvent("//*[@id='MainContent_txtAdditionalLevy']", additionalLevy, "user enter {string} as additional levy %", "TEXTBOX", 0);

	}
	@When("user click on add button to save treaty limit")
	public void user_click_on_add_button_to_save_treaty_limit() throws InterruptedException {
        Itl.CustomClickEvent("//*[@id='btnAddDetails']", "user click on add button to save treaty limit", "CLICK", 2000);
	}
	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
        Itl.CustomClickEvent("//*[@id='btnSave']", "user click on save button", "CLICK", 2000);

	}
	@Then("user able to view {string} as status")
	public void user_able_to_view_as_status(String status) throws InterruptedException {
		Itl.CustomValidationEvent("//*[@id='MainContent_repTreaty_Label6_0']", status, "user able to view {string} as status", "VALIDATION", 0);
	}
}
