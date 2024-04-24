package FraudControl;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ClaimsRepository {

	@Then("^user click on Claims Repository option$")
	public void user_click_on_Claims_Repository_option() throws Throwable {
		Object[] input7=new Object[1];
		input7[0]="(//*[text()='Claim Repository'])[1]";
		SeleniumOperations.clickOnElement(input7);
	}

	@When("^user enter \"([^\"]*)\" as insured name$")
	public void user_enter_as_insured_name(String insuredName) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtInsuredName']";
	  	input[1]=insuredName;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as insured name",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle reg no$")
	public void user_enter_as_vehicle_reg_no(String vehicleRegNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtVehicleNo']";
	  	input[1]=vehicleRegNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle reg no",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle make$")
	public void user_enter_as_vehicle_make(String vehicleMake) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtFltMake']";
	  	input[1]=vehicleMake;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle make",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as vehicle type$")
	public void user_enter_as_vehicle_type(String vehicleType) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtType']";
	  	input[1]=vehicleType;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle type",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as chassis No$")
	public void user_enter_as_chassis_No(String chassisNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtChasis']";
	  	input[1]=chassisNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as chassis No",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as engine No$")
	public void user_enter_as_engine_No(String EngineNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtEngine']";
	  	input[1]=EngineNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as engine No",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as policy No$")
	public void user_enter_as_policy_No(String PolicyNo) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtPolicyNo']";
	  	input[1]=PolicyNo;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as policy No",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cover note$")
	public void user_enter_as_cover_note(String coverNote) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtCoverNote']";
	  	input[1]=coverNote;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cover note",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as risk note$")
	public void user_enter_as_risk_note(String riskNote) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtRNNb']";
	  	input[1]=riskNote;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as risk note",output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as claim amount$")
	public void user_enter_as_claim_amount(String cliamAmount) throws Throwable {
	    Object[] input = new Object[2];
	  	input[0]="//*[@id='txtClaimAmount']";
	  	input[1]=cliamAmount;
	  	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
	  	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as claim amount",output.get("MESSAGE").toString());
	}
}
