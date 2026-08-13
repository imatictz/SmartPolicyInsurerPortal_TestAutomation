package PremiumCollection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AllReceipts {

	@When("user navigate on Direct premium option")
	public void user_navigate_on_direct_premium_option() throws Throwable {
	    Itl.CustomNavigateAction("//*[@id='span3']", 
	    		"user navigate on Direct premium option", "NAVIGATE", 2000);
	}
	@Then("user click on all receipts option")
	public void user_click_on_all_receipts_option() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='span_TransactingComp_lc']", "user click on all receipts option", "CLICK", 2000);
	}
	@When("user select {string} as from date")
	public void user_select_as_from_date(String fromDate) throws InterruptedException {
		   Itl.CustomClearSendEvent("//*[@id='MainContent_txtSrchFromDate']", 
				   fromDate, 
				   "user select {string} as from date", "TEXTBOX", 0);
	}
	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", 
	    		"user click on search button", "CLICK", 2000);
	}
	@Then("user click on search button for {string} status")
	public void user_click_on_search1_button(String status) throws InterruptedException {
	    Itl.CustomClickEvent("//*[@id='MainContent_btnSearch']", 
	    		"user click on search button for {string} status", "CLICK", 2000);
	    SeleniumOperations.getStatus(status);
		 Thread.sleep(4000);
	}
	@When ("user enter receipt no for {string} status")
	public void user_enter_as_quote_number(String status) throws InterruptedException {
		String quoteNo = SeleniumOperations.getStatus(status);
		Itl.CustomSendEvent("//*[@id='MainContent_txtSrchReceiptNb']", quoteNo, "user enter receipt no", "TEXTBOX", 0);
		Thread.sleep(4000);
	}
	@When("user click on actions option")
	public void user_click_on_actions_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]", "user click on actions option", "CLICK", 2000);
	}
	@When("user click on reconcile option")
	public void user_click_on_reconcile_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[1]", "user click on reconcile option", "CLICK", 2000);
	}
	@When("user click on cancel button")
	public void user_click_on_cancel_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnDeleteReciept']", "user click on cancel button", "CLICK", 2000);
	}
	@When("user click on revoke button")
	public void user_click_on_revoke_button() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='btnDeleteReciept']", "user click on revoke button", "CLICK", 2000);
	}
	@Then ("user able to view {string} as message")
	 public void status(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@class='messenger-message-inner']", 
					status,
					"user able to view {string} as message", 
					"VALIDATION", 
					0);
	 }
	@Then ("user able to view {string} as status\\(All Receipts)")
	 public void status1(String status) throws InterruptedException {
			Itl.CustomValidationEvent("//*[@id='sort_table']/tbody/tr[1]/td[8]", 
					status,
					"user able to view {string} as status", 
					"VALIDATION", 
					0);
	 }
	@When("user click on print option")
	public void user_click_on_print_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[2]", 
				"user click on reconcile option", 
				"CLICK",
				2000);
	}
	@When("user click on cancel option")
	public void user_click_on_cancel_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[3]", 
				"user click on cancel option", 
				"CLICK",
				2000);
	}
	@When("user click on revoke option")
	public void user_click_on_revoke_option() throws InterruptedException {
		Itl.CustomClickEvent("//*[@id='sort_table']/tbody/tr[1]/td[10]/*[2]/*[2]/*[3]", 
				"user click on revoke option", 
				"CLICK",
				2000);
	}
	@When("the receipts should include all relevant details like")
	public void the_quote_should_include_all_relevant_details(DataTable dataTable) throws IOException, InterruptedException {
		 List<String> rawFields = dataTable.asList(String.class);
		    List<String> fields = new ArrayList<>(rawFields); // ✅ make it modifiable

		    // Remove header row if present
		    if (!fields.isEmpty() && fields.get(0).equalsIgnoreCase("Field")) {
		        fields.remove(0);
		    }
	    for (String field : fields) {
	        Object[] input = new Object[4];
	        input[0] = field.trim();
	        
	        Hashtable<String, Object> output = SeleniumOperations.printReceipt(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "the receipts should include all relevant details like", output.get("MESSAGE").toString());
			Thread.sleep(2000);
	    }
	    
	}
}
