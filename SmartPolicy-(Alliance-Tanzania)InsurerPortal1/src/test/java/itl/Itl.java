package itl;

import java.util.Hashtable;

import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Itl {

	public static void CustomClickEvent(String strElementId, String stepName,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void ClickEvent(String strElementId,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			SeleniumOperations.clickOnElement(input);
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomDoubleClickEvent(String strElementId, String stepName,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomSendEvent(String strElementId,String strInputText,String stepName,
		String strElementType, int intThreadSleepTime ) throws InterruptedException {
		/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
		if (strElementType == "TEXTBOX") {
			Object[] input = new Object[2];
			input[0]=strElementId;
			input[1]=strInputText;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);	
		}
	}
	
	public static void CustomSendTodaysDateEvent(
	        String strElementXpath,
	        String dateValue,
	        String stepName,
	        String strElementType,
	        int intThreadSleepTime
	) throws InterruptedException {

	    if ("TEXTBOX".equalsIgnoreCase(strElementType)) {

	        Object[] input = new Object[2];
	        input[0] = strElementXpath;
	        input[1] = dateValue;

	        Hashtable<String, Object> output = SeleniumOperations.sendDate(input);
	        HTMLReportGenerator.StepDetails(
	                output.get("STATUS").toString(),
	                stepName,
	                output.get("MESSAGE").toString()
	        );
	        Thread.sleep(intThreadSleepTime);
	    }
	}

	
	public static void CustomClearSendEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "TEXTBOX") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.clearAndEnter(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validation(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationContainsEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validationContains(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	/*public static void CustomswitchWindowEvent(String stepName ,String strElementType) {
		if(strElementType =="SWITCHWINDOW")
		try{
			Hashtable<String,Object> output = SeleniumOperations.switchWindow();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*/
	
	public static void CustomActionDownEnterEvent(String strElementId, String stepName,String strElementType, 
			                          Integer intThreadSleepTime) throws Throwable {
		if (strElementType == "ENTER") {
		Object[] input=new Object[1];
		input[0]=strElementId;
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),stepName,output.get("MESSAGE").toString());
	}
  }
	
	public static void CustomDropdownEvent(String strElementId,String searchBoxId,String value,
			String valueId,String stepName,String strElementType,Integer intThreadSleepTime) {
		if(strElementType =="DROPDOWN") {
		Object[] input= new Object[4];
		input[0]=strElementId;
		input[1]=searchBoxId;
		input[2]=value;
		input[3]=valueId;
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),stepName,output.get("MESSAGE").toString());
		}
	}
	
	public static void CustomNavigateAction(String strElementId, String stepName,String strElementType, 
            Integer intThreadSleepTime) throws Throwable {
         if (strElementType == "NAVIGATE") {
        	 Object[] input2=new Object[2];
     	    input2[0]=strElementId;
     	    Hashtable<String, Object> output2 = SeleniumOperations.actionClass(input2);
     	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),stepName,output2.get("MESSAGE").toString());
     	}
    }
	
	/*public static void CustomClear(String strElementId,String strElementType, 
            Integer intThreadSleepTime) throws Throwable {
         if (strElementType == "CLICK") {
        	 Object[] input2=new Object[2];
     	    input2[0]=strElementId;
     	    SeleniumOperations.clear(input2);
     	    //HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),stepName,output2.get("MESSAGE").toString());
     	}
    }
	
	public static void CustomGstPercentValidation(String TotalPremium,String VattGstAmount,String TotalPremiumWithTax,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType =="GSTVALIDATION") {
			Object[] input = new Object[3];
	        input[0] = TotalPremium;
	        input[1] =VattGstAmount;
	        input[2] = TotalPremiumWithTax;
	        SeleniumOperations.gstPercentCalculationValidation(input);
	        Thread.sleep(intThreadSleepTime);
		}
	}*/
	
	public static void CustomUiElementValidation(String xpath,String text,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType =="UiEleVALIDATION") {
			Object[] input = new Object[2];
	        input[0] = xpath;
	        input[1] =text;
	        SeleniumOperations.swahiliElement(input);
	        Thread.sleep(intThreadSleepTime);
		}
	}
	
	
	
	
}
	

