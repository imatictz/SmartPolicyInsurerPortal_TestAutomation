package cucumberMap24Languages;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class Languages {
	@When("user is on dashboard page able to view {string}")
	public void user_is_on_dashboard_page(String name) throws InterruptedException {
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnDashboard']", name, "UiEleVALIDATION", 2000);
	}
	@Then("user validate all dashboard page elements")
	public void user_validate_all_dashboard_page_elements(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	   
	     //System.out.println(userList.get(2).get("Text"));
	    //Hi
	    Itl.CustomUiElementValidation("//*[@id='span_lblHi_lc']", userList.get(0).get("Text"), "UiEleVALIDATION", 2000);
	    //UserName
	    Itl.CustomUiElementValidation("//*[@id='MainContent_spnUserName']", userList.get(1).get("Text"), "UiEleVALIDATION",000);
	    //RiskNotes
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnRiskNote']", userList.get(2).get("Text"), "UiEleVALIDATION", 000);
	    //Tax Invoices
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnTaxInvoice']", userList.get(3).get("Text"), "UiEleVALIDATION",000);
        //Receipts
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnReceipts']", userList.get(4).get("Text"), "UiEleVALIDATION",000);
        //Claims
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnClaim']", userList.get(5).get("Text"), "UiEleVALIDATION", 000);
        //Renewals
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnRenewals']", userList.get(6).get("Text"), "UiEleVALIDATION", 000);
        //Reports
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnReports']", userList.get(7).get("Text"), "UiEleVALIDATION", 000);
        


	}
	
}
