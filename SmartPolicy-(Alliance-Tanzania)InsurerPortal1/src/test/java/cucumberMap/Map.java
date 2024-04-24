package cucumberMap;

import java.util.Hashtable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Map {

	@When ("^user enter username$")
 	public void enterUserName()
 	{
 		 Object[] input2=new Object[2];
 	      input2[0]="//*[@id='usercode']";
 	 Hashtable<String, Object> output2 = SeleniumOperations.sendUserId(input2);
 	 HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter username$",output2.get("MESSAGE").toString());
 	}
 	
 	@When ("^user enter password$")
 	public void enterPassword()
 	{
 		Object[] input3=new Object[2];
 	      input3[0]="//*[@id='password']";
  	  Hashtable<String, Object> output3 = SeleniumOperations.sendPassword(input3);
 	  HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter password$",output3.get("MESSAGE").toString());
 	}
 	
 	
 	@When ("^user enter \"(.*)\" as username$")
 	public void sendUserName(String username)
 	{
 		 Object[] input2=new Object[2];
 	      input2[0]="//*[@id='usercode']";
 	      input2[1]=username;
 	 Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
 	 HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter username$",output2.get("MESSAGE").toString());
 	}
 	
 	@When ("^user enter \"(.*)\" as password$")
 	public void sendPassword(String password)
 	{
 		 Object[] input2=new Object[2];
 	      input2[0]="//*[@id='password']";
 	      input2[1]=password;
 	 Hashtable<String, Object> output2 = SeleniumOperations.sendKeys(input2);
 	 HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user enter password$",output2.get("MESSAGE").toString());
 	}
 	  
 	 @And ("^user click on login button$")
 	 public void clickOnLoginButton()
 	 {
 		 Object[] input4=new Object[1];
 	      input4[0]="//*[text()='Login']";
 	  Hashtable<String, Object> output4 = SeleniumOperations.clickOnElement(input4);
 	  HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on login button$",output4.get("MESSAGE").toString());
 	  
 	 }
 	 
 	 //Valid
 	 @Then ("^application shows home page to user$")
 	 public void validValidation()
 	 {
 		 Object[] input5=new Object[2];
 			input5[0]="(//*[text()='Pravin Wagh'])[2]";
 			input5[1]="Pravin wagh";
 			Hashtable<String, Object> output5 = SeleniumOperations.validation(input5);
 			HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^application shows home page to user$",output5.get("MESSAGE").toString());
 	 }
	 
}
