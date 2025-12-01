package utility;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.PrintWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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
			    
		    	  WebDriverManager.chromedriver().setup();
		    	  driver = new ChromeDriver();
		    	  /*System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
			     driver=new ChromeDriver();*/
			     driver.manage().window().maximize();
		      }
		      else if(config.getBrowserName().equalsIgnoreCase("FireFox")) { 
		        WebDriverManager.firefoxdriver().setup();
		        driver = new FirefoxDriver();
		    	  /* System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
		         driver=new FirefoxDriver();*/
		         driver.manage().window().maximize();
		     
		      }
		      else if(config.getBrowserName().equalsIgnoreCase("MicroSoftEdge")){ 
		        WebDriverManager.edgedriver().setup();
		        driver = new EdgeDriver();
		    	  /* System.setProperty("webdriver.edge.driver", config.getDriverPathMicroSoft() );
		         driver=new EdgeDriver();*/
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
	
	//SelectLanguage
		public static void selectLanguage() throws InterruptedException {
			if(config.getLanguageName().equalsIgnoreCase("En")){		
			    
				Object[] input4=new Object[1];
				input4[0]="(//*[@class='menu-arrow'])[28]";
				//SeleniumOperations.clickOnElement(input4);
				SeleniumOperations.actionClass(input4);
				
				Object[] input5=new Object[1];
				input5[0]="//*[@data-language='En']";
				SeleniumOperations.clickOnElement(input5);
				
				Object[] input6=new Object[1];
				input6[0]="//*[@id='btnYesLocal']";
				SeleniumOperations.clickOnElement(input6);
				Thread.sleep(2000);
				Object[] input7 = new Object[2];
				input7[0] ="//*[@id='span_lblHi_lc']";
				input7[1]="Hi";
				SeleniumOperations.validation(input7);
		      }
		      else if(config.getLanguageName().equalsIgnoreCase("Fr")) { 
		    	  Object[] input4=new Object[1];
		  		input4[0]="(//*[@class='menu-arrow'])[28]";
		  		SeleniumOperations.actionClass(input4);
		  		
		  		Object[] input5=new Object[1];
		  		input5[0]="//*[@data-language='Fr']";
		  		SeleniumOperations.clickOnLogin(input5);
		  		
		  		Object[] input6=new Object[1];
		  		input6[0]="//*[@id='btnYesLocal']";
		  		SeleniumOperations.clickOnLogin(input6);
		  		Thread.sleep(2000);
		  		Object[] input7 = new Object[2];
		  		input7[0] ="//*[@id='span_lblHi_lc']";
		  		input7[1]="Salut";
		  		SeleniumOperations.validation(input7);
		     
		      }
		      else if(config.getLanguageName().equalsIgnoreCase("Sw")) { 
		    	  Object[] input4=new Object[1];
		  		input4[0]="(//*[@class='menu-arrow'])[28]";
		  		SeleniumOperations.actionClass(input4);
		  		
		  		Object[] input5=new Object[1];
		  		input5[0]="//*[@data-language='Sw']";
		  		SeleniumOperations.clickOnLogin(input5);
		  		
		  		Object[] input6=new Object[1];
		  		input6[0]="//*[@id='btnYesLocal']";
		  		SeleniumOperations.clickOnLogin(input6);
		  		Thread.sleep(2000);
		  		Object[] input7 = new Object[2];
		  		input7[0] ="//*[@id='span_lblHi_lc']";
		  		input7[1]="Habari";
		  		SeleniumOperations.validation(input7);
		     
		      }
		}
		//ClickOnLoginButton
	     public static Hashtable<String,Object> clickOnLogin(Object[] inputparameters){   
			 try {
			   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
			   String strXpath=(String)inputparameters[0];
			   driver.findElement(By.xpath(strXpath)).click();
			   outputparameters.put("STATUS","PASS");
			   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
		   /*  String test = driver.findElement(By.xpath("//*[text()='Session Expired.']")).getText();
			   System.out.println(test);
		     if(test.equalsIgnoreCase("Session Expired.")) {
				   driver.findElement(By.xpath("//*[@href='wfLogin.aspx']")).click();
				   driver.findElement(By.xpath("//*[@id='usercode']")).sendKeys(config.sendUserId());
				   driver.findElement(By.xpath("//*[@id='password']")).sendKeys(config.sendPassword());
				   driver.findElement(By.xpath("//*[text()='Login']")).click();
			   }*/
			 }
		     catch(Exception e) {
		       outputparameters.put("STATUS","FAIL");
			   outputparameters.put("MESSAGE","Method Used:clickOnElement, Input Given:"+inputparameters[0]);
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
     @SuppressWarnings("deprecation")
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
	
   //DoubleClick
     public static Hashtable<String,Object> doubleClickOnElement(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   driver.findElement(By.xpath(strXpath)).click();
		   outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:doubleClickOnElement, Input Given:"+inputparameters[0]);
	     }
	     catch(Exception e) {
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:doubleClickOnElement, Input Given:"+inputparameters[0]);
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
				 outputparameters.put("STATUS","PASS");
				   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
			     
			   }
			   else {
				 System.out.println("Test Case Fail");
				 outputparameters.put("STATUS","FAIL");
				   outputparameters.put("MESSAGE","Method Used:validation, Input Given:"+inputparameters[1]);
			   }
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
		   Thread.sleep(2000);
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
     
     public static void browserClose() {
    	 try {
    		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
    	 driver.quit();
    	 }
    	 catch(Exception e) {
    		 outputparameters.put("STATUS","Fail");
  		   outputparameters.put("MESSAGE","Method Used:browserColse, Input Given:");
  		 	 
    	 }
     }
     
     public static void swahiliElement(Object[] inputparameters) {
     	 SoftAssert SoftAssert = new SoftAssert();
     	 String xpath = (String) inputparameters[0];
     	 String text = (String) inputparameters[1];
     	 WebElement dashboardTitle = driver.findElement(By.xpath(xpath)); // replace with actual ID
          //System.out.println(dashboardTitle.getText());
          //SoftAssert.assertEquals(dashboardTitle.getText(), text);
          SoftAssert.assertEquals(dashboardTitle.getText(), text, "fail");
          SoftAssert.assertAll();
  	
      }
     
     public static String getQuote(String quoteName) {
    	 try {
    		    // Locate the insurance table
    		    WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

    		    // Get all rows of the table
    		    List<WebElement> rows = table.findElements(By.xpath("//*[@id='sort_table']/tbody/tr")); // Get all rows
    		    boolean found = false;
    		    for (WebElement row : rows) {
    		        WebElement cell1 = row.findElement(By.xpath("./td[4]")); // Get the 4th column
    		        WebElement cell2 = row.findElement(By.xpath("./td[9]")); // Get the 8th column

    		        if (cell1.getText().trim().equalsIgnoreCase(quoteName) && 
    		            cell2.getText().trim().contains("Required Approval")|| 
    		            cell2.getText().trim().contains("Insurer Approval Required")) {
    		            WebElement quoteCell = row.findElement(By.xpath("./td[2]"));
    		            String quoteNumber = quoteCell.getText().trim();
    		            
    		            return quoteNumber;
    		        }
    		    }
    		    if (!found) {
                    Object quoteNumber = null;
                    System.out.println("No Quote with 'Required Approval' status found.");
                }

    		} catch (Exception e) {
    		    e.printStackTrace();
    		}
		return null;
		

     }

public static String getRiskNote(String quoteName) {
	 try {
		    // Locate the insurance table
		    WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

		    // Get all rows of the table
		    List<WebElement> rows = table.findElements(By.xpath("//*[@id='sort_table']/tbody/tr")); // Get all rows
		    boolean found = false;
		    for (WebElement row : rows) {
		        WebElement cell1 = row.findElement(By.xpath("./td[6]")); // Get the 4th column
		        WebElement cell2 = row.findElement(By.xpath("./td[10]")); // Get the 8th column

		        if (cell1.getText().trim().equalsIgnoreCase(quoteName) && 
		            cell2.getText().trim().contains("Insurer Approval Required")) 
		            {
		            WebElement quoteCell = row.findElement(By.xpath("./td[2]"));
		            String quoteNumber = quoteCell.getText().trim();
		            
		            return quoteNumber;
		        }
		    }
		    if (!found) {
               Object quoteNumber = null;
               System.out.println("No Quote with 'Insurer Approval Required' status found.");
           }

		} catch (Exception e) {
		    e.printStackTrace();
		}
	return null;
	

}

public static String getClaimId(String quoteName) {
	 try {
		    // Locate the insurance table
		    WebElement table = driver.findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

		    // Get all rows of the table
		    List<WebElement> rows = table.findElements(By.xpath("//*[@id='sort_table']/tbody/tr")); // Get all rows
		    boolean found = false;
		    for (WebElement row : rows) {
		        WebElement cell1 = row.findElement(By.xpath("./td[7]")); // Get the 4th column
		        WebElement cell2 = row.findElement(By.xpath("./td[8]")); // Get the 8th column

		        if (cell1.getText().trim().contains(quoteName) && 
		            cell2.getText().trim().contains("Claim Intimated to Insurer")) 
		            {
		            WebElement claimIdCell = row.findElement(By.xpath("./td[6]"));
		            String fullText = claimIdCell.getText().trim();
		            claimId = fullText.split("\\s+")[0]; 
		            //System.out.println(claimId);
		            return claimId;
		        }
		    }
		    if (!found) {
              Object claimId = null;
              System.out.println("No Quote with 'Claim Intimated to Insurer' status found.");
          }

		} catch (Exception e) {
		    e.printStackTrace();
		}
	return null;

}
private static String claimId;
// ✅ Getter method to reuse later
   public static String getStoredClaimId() {
       return claimId;
   }
 //printReport     
   
   public static Hashtable<String, Object> printReport() throws IOException {
  	try {

  	Set<String> ids1 = driver.getWindowHandles();
  	
  	Iterator<String> values = ids1.iterator();    
  	String one = values.next();
  	String two = values.next();
  	
      driver.switchTo().window(two);
  	
  	String url = driver.getCurrentUrl();
  	System.out.println(url);
  	 
  	URL pdfUrl = new URL(url);
  	
  	URLConnection urlConnection = pdfUrl.openConnection();
  	urlConnection.addRequestProperty("User-Agent", "Chrome");
  	InputStream id = urlConnection.getInputStream();
  	
  	BufferedInputStream bufferedInput = new BufferedInputStream(id);
  	
  	System.out.println("==========Print Page Number Of Pdf==========");
  	PDDocument pdDocument = PDDocument.load(bufferedInput);
  	int pages = pdDocument.getNumberOfPages();
  	System.out.println("Number Of Pages In PDF"+" "+pages);
      System.out.println("==========End==========");
      //.load(bufferedInput);
      PDFTextStripper text = new PDFTextStripper();
      String printText = text.getText(pdDocument);
      System.out.println("==========Print PDF Text==========");
      System.out.println("PDF Text" +" "+printText);
      System.out.println("==========End==========");
    
     outputparameters.put("STATUS","Pass");

	   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
  	}
  	catch(Exception e) {
 		 outputparameters.put("STATUS","Fail");
		   outputparameters.put("MESSAGE","Method Used:PrintReport, Input Given:");
  	}
		return outputparameters;
		 	 
 	 }
   
   public static Hashtable<String, Object> printReport1() {
	    Hashtable<String, Object> outputParameters = new Hashtable<>();

	    try {
	        // Wait for the new window to open
	        Set<String> windowHandles = driver.getWindowHandles();
	        if (windowHandles.size() < 2) {
	            throw new IllegalStateException("No PDF window detected. Expected at least 2 windows.");
	        }

	        // ✅ Get current (main) window handle safely
	        String mainWindow = driver.getWindowHandle();
	        String pdfWindow = null;

	        // ✅ Find new window reliably (order-independent)
	        for (String handle : windowHandles) {
	            if (!handle.equals(mainWindow)) {
	                pdfWindow = handle;
	                break;
	            }
	        }

	        if (pdfWindow == null) {
	            throw new IllegalStateException("No new PDF window found.");
	        }

	        driver.switchTo().window(pdfWindow);

	        // ✅ Small wait to ensure URL is loaded (avoid about:blank)
	        new WebDriverWait(driver, Duration.ofSeconds(5))
	            .until(d -> !d.getCurrentUrl().startsWith("about:blank"));

	        String pdfUrlString = driver.getCurrentUrl();
	        System.out.println("✅ PDF URL: " + pdfUrlString);

	        URL pdfUrl = new URL(pdfUrlString);
	        URLConnection connection = pdfUrl.openConnection();
	        connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Chrome)");
	        connection.setConnectTimeout(10000); // 10s timeout
	        connection.setReadTimeout(15000);    // 15s timeout

	        // ✅ Use try-with-resources for auto-closing
	        try (InputStream inputStream = connection.getInputStream();
	             BufferedInputStream bufferedStream = new BufferedInputStream(inputStream);
	             PDDocument pdfDocument = PDDocument.load(bufferedStream)) {

	            int totalPages = pdfDocument.getNumberOfPages();
	            System.out.println("📄 Total PDF Pages: " + totalPages);

	            PDFTextStripper textStripper = new PDFTextStripper();
	            String pdfText = textStripper.getText(pdfDocument);

	            System.out.println("========== PDF Text Content ==========");
	            System.out.println(pdfText);
	            System.out.println("=====================================");

	            // ✅ Store extracted info for reporting
	            outputParameters.put("PDF_URL", pdfUrlString);
	            outputParameters.put("PDF_PAGE_COUNT", totalPages);
	            outputParameters.put("PDF_TEXT_SAMPLE", pdfText.substring(0, Math.min(500, pdfText.length())));
	            outputParameters.put("STATUS", "Pass");
	            outputParameters.put("MESSAGE", "Method Used: printReport executed successfully.");
	        }

	        // ✅ Return to main window safely
	       // driver.close(); // close PDF tab
	       // driver.switchTo().window(mainWindow);

	    } catch (MalformedURLException e) {
	        System.err.println("❌ Invalid PDF URL: " + e.getMessage());
	        outputParameters.put("STATUS", "Fail");
	        outputParameters.put("MESSAGE", "Invalid PDF URL: " + e.getMessage());
	    } catch (IOException e) {
	        System.err.println("❌ Error reading PDF: " + e.getMessage());
	        outputParameters.put("STATUS", "Fail");
	        outputParameters.put("MESSAGE", "Error reading PDF content: " + e.getMessage());
	    } catch (Exception e) {
	        // Capture full stack trace for UI-friendly report
	        StringWriter sw = new StringWriter();
	        e.printStackTrace(new PrintWriter(sw));
	        String exceptionAsString = sw.toString();

	        System.err.println("❌ Unexpected error in printReport: " + exceptionAsString);
	        outputParameters.put("STATUS", "Fail");
	        outputParameters.put("MESSAGE", "Unexpected error: " + exceptionAsString);
	    }


	    return outputParameters;
	}


}		 

	