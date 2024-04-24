package utility;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
	
  //private static final String[] String = null;
    public static WebDriver driver=null;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	public static ConfigReader config;

//BrowserLaunch
	public static Hashtable<String,Object>  browserLaunch(){  
		try {
		  config=new ConfigReader();
	      if(config.getBrowserName().equalsIgnoreCase("Chrome")){		
		     System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		  }
	      else if(config.getBrowserName().equalsIgnoreCase("FireFox")) { 
	         System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
	         driver=new FirefoxDriver();
	         driver.manage().window().maximize();
	      }
	      else if(config.getBrowserName().equalsIgnoreCase("MicroSoftEdge")){ 
	         System.setProperty("webdriver.edge.driver", config.getDriverPathMicroSoft() );
	         driver=new EdgeDriver();
	         driver.manage().window().maximize();
	      }
	         outputparameters.put("STATUS","PASS");
	         outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
	    }
	    catch(Exception e){
	    	 outputparameters.put("STATUS","FAIL");
	    	 outputparameters.put("MESSAGE","Method Used:browserLaunch,Input Given:"+config.getBrowserName().toString());
		}
	    return outputparameters;
     }

//OpenApplication
	 public static Hashtable<String,Object> openApplication(){   
		 try {  
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		   driver.navigate().to(config.getApplicationUrl());
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
	      }
	      catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:openApplication, Input Given:"+config.getApplicationUrl());
	      }
	      return outputparameters;
     }
	 
//SendUserID
     public static Hashtable<String,Object> sendUserId(Object[]inputparameters){   
	    try {
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	      String strXpath=(String)inputparameters[0];
          driver.findElement(By.xpath(strXpath)).sendKeys(config.sendUserId());
          outputparameters.put("STATUS","PASS");
	      outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendUserId());
        }
        catch(Exception e){
   	      outputparameters.put("STATUS","FAIL");
		  outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendUserId());
        }
        return outputparameters;
     }
	 
//SendPassword
     public static Hashtable<String,Object> sendPassword(Object[]inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
	       driver.findElement(By.xpath(strXpath)).sendKeys(config.sendPassword());
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendPassword());
	     }
	     catch(Exception e){
	   	   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+config.sendPassword());
	     }
	     return outputparameters;
     }

//SendKeys
     public static Hashtable<String,Object> sendKeys(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
	       driver.findElement(By.xpath(strXpath)).sendKeys(strvalue);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
	
//Click
     public static Hashtable<String,Object> clickOnElement(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   driver.findElement(By.xpath(strXpath)).click();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
	     }
	     return outputparameters;
     }
	
//Validation
     public static Hashtable<String,Object> validation(Object[] inputparameters){  
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String xpath=(String)inputparameters[0];
		   String givenText=(String)inputparameters[1];
		   String findText=driver.findElement(By.xpath(xpath)).getText();
		   if(givenText.equalsIgnoreCase(findText)){
			 System.out.println("Test Case Pass");
		   }
		   else {
			 System.out.println("Test Case Fail");
		   }
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
	 
//Actions Class	 
	 public static Hashtable<String,Object> actionClass(Object[] inputparameters) {
	     try {
		   String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   Actions act=new Actions(driver);
		   WebElement move = driver.findElement(By.xpath(xpath));
		   act.moveToElement(move).build().perform();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:actionClass, Input Given:"+inputparameters[0]);
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:actionClass, Input Given:"+inputparameters[0]);
		 }
		 return outputparameters;
     }
		
//ActionsDownEnter
	 public static Hashtable<String,Object> actionDownEnter() {
		 try { 
		 //String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		 //driver.findElement(By.xpath(xpath));
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_DOWN).build().perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ENTER).build().perform();
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:actionDownEnter, Input Given:");
		 }
		 return outputparameters;
     }  
	
//HandleAlertMessage		 
     public static Hashtable<String,Object> alert() {   
    	 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   Alert pass=driver.switchTo().alert();
		   pass.accept();
		 }
		 catch(Exception e) {
		   System.out.println(e);
		 }
		 return outputparameters;
     }
		 
//ScrollUp
     public static Hashtable<String,Object> scrollUp() {
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,-750)");
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:scrollUp, Input Given:");
		 }
	     return outputparameters;
     }
		 
//Select date
     public static Hashtable<String, Object> date (Object[] inputParameters) {
		 try {
		   String xpath1=(String) inputParameters[0];
		   String xpath2=(String) inputParameters[1];
		   String xpath3=(String) inputParameters[2];
		   String xpath4=(String) inputParameters[3];
		   String xpath5=(String) inputParameters[4];
		   String xpath6=(String) inputParameters[5];
		 //Click on calender symbol
		   driver.findElement(By.xpath(xpath1)).click();
		 //Select Date of birth
		   driver.findElement(By.xpath(xpath2)).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(xpath3)).click();
		 //Click On Year
		   driver.findElement(By.xpath(xpath4)).click();
		   Thread.sleep(2000);
		 //Select month
		   driver.findElement(By.xpath(xpath5)).click();
		   Thread.sleep(2000);
		 //Select Day
		   driver.findElement(By.xpath(xpath6)).click();
		   Thread.sleep(2000);
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 return outputparameters;
     }
		 
//Scrolldown		 
     public static Hashtable<String,Object> scrolldown() {
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   JavascriptExecutor down=(JavascriptExecutor) driver;
		   down.executeScript("window.scrollBy(0,1000)");
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 catch(Exception e) {
		   outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:date, Input Given:");
		 }
		 return outputparameters;
     }
		 
//ClearAndEnter
     public static Hashtable<String,Object> clearAndEnter(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
	       WebElement remove=driver.findElement(By.xpath(strXpath));
	       remove.clear();
	       Thread.sleep(2000);
	       remove.sendKeys(strvalue);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
		 
//Iframe
     public static Hashtable<String,Object> iFrameEnter(Object[]inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   driver.switchTo().frame(0);
	       WebElement send=driver.findElement(By.xpath(strXpath));
	       send.clear();
	       Thread.sleep(1000);
	       send.sendKeys(strvalue);
	       Thread.sleep(2000);
	       driver.switchTo().defaultContent();
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     } 
		 
//Switch Window 		
     public static void transfer() {
		 ((JavascriptExecutor)driver).executeScript("window.open()");
         ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(tab.get(0));
     }	

//Open New Tab
     public static void tab() {
		 ((JavascriptExecutor)driver).executeScript("window.open()");
		  ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
     }

//DropDown
     public static Hashtable<String,Object> dropdown(Object[] inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String clickXpath = (String)inputparameters[0];
		   driver.findElement(By.xpath(clickXpath)).click();
		   String sendXpath = (String)inputparameters[1];
		   String sendValue = (String)inputparameters[2];
		   driver.findElement(By.xpath(sendXpath)).sendKeys(sendValue);
		   String selectXpath = (String)inputparameters[3];
		   driver.findElement(By.xpath(selectXpath)).click();
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[2]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[2]);
	     }
	     return outputparameters;
     }
}		 
	
	