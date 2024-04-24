package SalvageBidding;

import java.util.Hashtable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageBids {

 	@When ("^user navigate on operation dropdown$")
 	public void user_navigate_on_operation_dropdown_menu() {
		Object[] input7=new Object[1];
	    input7[0]="(//*[@class='dropdown-toggle'])[1]";
	    SeleniumOperations.clickOnElement(input7);
    }
 	
 	@When("^user navigate on salvage bidding option$")
 	public void user_navigate_on_salvage_bidding_option() throws Throwable {
 	    Object[]input=new Object[1];
 	    input[0]="//*[@id='MNU_SALVAGE']";
 	    SeleniumOperations.actionClass(input);
 	}

 	@Then("^user click on manage bids$")
 	public void user_click_on_manage_bids() throws Throwable {
 	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='MNU_wfSLVG']";
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

 	@When("^user enter \"([^\"]*)\" as bid end date$")
 	public void user_enter_as_bid_end_date(String bidEndDate) throws Throwable {
 	   Object[] input = new Object[2];
 	   input[0]="//*[@id='MainContent_txtBidEndDate']";
 	   input[1]=bidEndDate;
 	   Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
 	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as bid end date",output.get("MESSAGE").toString());
 	}

 	@When("^user enter \"([^\"]*)\" vehicle No$")
 	public void user_enter_vehicle_No(String vehicleNo) throws Throwable {
 	    Object[] input = new Object[2];
  	    input[0]="//*[@id='txtVehicleNo']";
  	    input[1]=vehicleNo;
  	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
  	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" vehicle No",output.get("MESSAGE").toString());
  	}

 	@Then("^user click on new to enroll new vehicle make and type$")
 	public void user_click_on_new_to_enroll_new_vehicle_make_and_type() throws Throwable {
 	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnVehicleMake']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on new to enroll new vehicle make and type",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as make&Model$")
 	public void user_enter_as_make_Model(String makeModel) throws Throwable {
 	    Object[] input = new Object[2];
   	    input[0]="//*[@id='txtMakeNew']";
   	    input[1]=makeModel;
   	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
   	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as make&Model",output.get("MESSAGE").toString());
   	}

 	@When("^user enter \"([^\"]*)\" as vehicle type$")
 	public void user_enter_as_vehicle_type(String vehicleType) throws Throwable {
 	    Object[] input = new Object[2];
    	input[0]="//*[@id='txtTypeNew']";
    	input[1]=vehicleType;
    	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
    	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle type",output.get("MESSAGE").toString());
    }

 	@Then("^user click on save button \\(VehicleMake\\)$")
 	public void user_click_on_save_button() throws Throwable {
 	    Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSaveMake']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
 	}

 	@When("^user enter \"([^\"]*)\" as vehicle make$")
 	public void user_enter_as_vehicle_make(String vehicleMake) throws Throwable {
 	    Object[] input = new Object[2];
 	    input[0]="//*[@id='MainContent_txtFltMake']";
 	    input[1]=vehicleMake;
 	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as vehicle make",output.get("MESSAGE").toString());
 	}

 	@When("^user enter \"([^\"]*)\" as type$")
 	public void user_enter_as_type(String type) throws Throwable {
 	    Object[] input = new Object[2];
  	    input[0]="//*[@id='txtType']";
  	    input[1]=type;
  	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
  	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as type",output.get("MESSAGE").toString());
  	}

 	@Then("^user enter \"([^\"]*)\" as chasis No$")
 	public void user_enter_as_chasis_No(String chasisNo) throws Throwable {
 	    Object[] input = new Object[2];
   	    input[0]="//*[@id='txtChasis']";
   	    input[1]=chasisNo;
   	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
   	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as chasis No",output.get("MESSAGE").toString());
   	}

 	@When("^user enter \"([^\"]*)\" as salvage value$")
 	public void user_enter_as_salvage_value(String salvageValue) throws Throwable {
 	    Object[] input = new Object[2];
    	input[0]="//*[@id='txtSalvageValue']";
    	input[1]=salvageValue;
    	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
    	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as salvage value",output.get("MESSAGE").toString());
    }

 	@When("^user enter \"([^\"]*)\" as min bid value$")
 	public void user_enter_as_min_bid_value(String minBidValue) throws Throwable {
 	    Object[] input = new Object[2];
 	    input[0]="//*[@id='txtMinValue']";
 	    input[1]=minBidValue;
 	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as min bid value",output.get("MESSAGE").toString());
 	}

 	@Then("^user select \"([^\"]*)\" as currency from dropdown$")
 	public void user_select_as_currency_from_dropdown(String currency) throws Throwable {
 	    Object[] input = new Object[4];
 		input[0]="//*[@id='s2id_MainContent_cmbCurrency']";
 		input[1]="//*[@class='select2-input select2-focused']";
 		input[2]=currency;
 		input[3]="//*[@class='select2-match']";
 		Hashtable<String,Object>output=SeleniumOperations.dropdown(input);
 	 	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as min bid value",output.get("MESSAGE").toString());
 	}

 	@When("^user enter \"([^\"]*)\" as address$")
 	public void user_enter_as_address(String address) throws Throwable {
 	    Object[] input = new Object[2];
  	    input[0]="//*[@id='MainContent_txtLocation']";
  	    input[1]=address;
  	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
  	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as address",output.get("MESSAGE").toString());
  	}

 	@When("^user enter \"([^\"]*)\" as contact person$")
 	public void user_enter_as_contact_person(String contactPerson) throws Throwable {
 	    Object[] input = new Object[2];
   	    input[0]="//*[@id='txtContactPerson']";
   	    input[1]=contactPerson;
   	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
   	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as contact person",output.get("MESSAGE").toString());
   	}

 	@When("^user enter \"([^\"]*)\" as mobile$")
 	public void user_enter_as_mobile(String mobile) throws Throwable {
 	    Object[] input = new Object[2];
    	input[0]="//*[@id='txtMobile']";
    	input[1]=mobile;
    	Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
    	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as mobile",output.get("MESSAGE").toString());
    }

 	@Then("^user enter \"([^\"]*)\" as Preferred time to contact$")
 	public void user_enter_as_Preferred_time_to_contact(String time) throws Throwable {
 	    Object[] input = new Object[2];
 	    input[0]="//*[@id='txtPreferredTime']";
 	    input[1]=time;
 	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Preferred time to contact",output.get("MESSAGE").toString());
 	}

 	@When("^user enter \"([^\"]*)\" as contact person \\(Insurance Company\\)$")
 	public void user_enter_as_contact_person_Insurance_Company(String contactPerson) throws Throwable {
 	    Object[] input = new Object[2];
  	    input[0]="//*[@id='txtInsContactPerson']";
  	    input[1]=contactPerson;
  	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
  	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as contact person \\\\(Insurance Company\\\\)",output.get("MESSAGE").toString());
  	}

 	@When("^user enter \"([^\"]*)\" as mobile \\(Insurance Company\\)$")
 	public void user_enter_as_mobile_Insurance_Company(String mobile) throws Throwable {
 	    Object[] input = new Object[2];
   	    input[0]="//*[@id='txtInsMobile']";
   	    input[1]=mobile;
   	    Hashtable<String,Object>output=SeleniumOperations.sendKeys(input);
   	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as mobile \\\\(Insurance Company\\\\)",output.get("MESSAGE").toString());
   	}

 	@When("^user select \"([^\"]*)\" as bid type from dropdown$")
 	public void user_select_as_bid_type_from_dropdown(String bidType) throws Throwable {
 	    Object[] input = new Object[4];
 		input[0]="//*[@id='s2id_MainContent_cmbBidType']";
 		input[1]="//*[@class='select2-input select2-focused']";
 		input[2]=bidType;
 		input[3]="//*[@class='select2-match']";
 		Hashtable<String,Object>output=SeleniumOperations.dropdown(input);
 	 	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as bid type from dropdown",output.get("MESSAGE").toString());
 	}

 	@When("^user select \"([^\"]*)\" as bidders$")
 	public void user_select_as_bidders(String bidders) throws Throwable {
 	    Object[] input = new Object[4];
 		input[0]="//*[@id='s2id_cmbUsers']";
 		input[1]="//*[@class='select2-input select2-focused']";
 		input[2]=bidders;
 		input[3]="//*[@class='select2-match']";
 		Hashtable<String,Object>output=SeleniumOperations.dropdown(input);
 	 	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as bidders",output.get("MESSAGE").toString());
 	}


 	@Then ("^user click on save button$")
 	public void save() throws InterruptedException{
 		Object[] input7=new Object[1];
 		input7[0]="//*[@id='btnSave']";
 	    Hashtable<String,Object>output=SeleniumOperations.clickOnElement(input7);
 	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button",output.get("MESSAGE").toString());
 	    Thread.sleep(2000);
 	}
 	
 	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String status) throws Throwable {
	    Object[] input=new Object[2];
		input[0]="//*[text()='Required Approval ']";
		input[1]=status;
		Hashtable<String,Object> output= SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user able to view \\\"([^\\\"]*)\\\" as status",output.get("MESSAGE").toString());
    }
}
