package utility;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.io.PrintWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SeleniumOperations {
	
	private static WebDriver d() {
	    return getDriver();
	}
	// Existing fields kept as-is
	public static WebDriver driver = null;
	public static Hashtable<String, Object> outputparameters = new Hashtable<String, Object>();
	public static ConfigReader config;
	public static WebDriverWait wait1;
	static Properties langProperties;

	// ThreadLocal for parallel execution
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	private static ThreadLocal<ConfigReader> threadConfig = new ThreadLocal<>();

	// Get driver for current thread
	public static WebDriver getDriver() {
	    return threadDriver.get();
	}

	// Get config for current thread
	public static ConfigReader getConfig() {
	    return threadConfig.get();
	}

	// Launch browser per thread
	public static void browserLaunch() {
	    // Initialize config for this thread
	    ConfigReader cfg = new ConfigReader();
	    threadConfig.set(cfg);

	    WebDriver wd;

	    if (cfg.getBrowserName().equalsIgnoreCase("chrome")) {

	        WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-extensions");
	        options.addArguments("--disable-gpu");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");

	        // 🔥 Recommended for your system (8GB RAM)
	        // options.addArguments("--headless=new");

	        wd = new ChromeDriver(options);

	    } else if (cfg.getBrowserName().equalsIgnoreCase("firefox")) {

	        WebDriverManager.firefoxdriver().setup();

	        FirefoxOptions options = new FirefoxOptions();

	        // 🔥 Recommended for your system
	        // options.addArguments("-headless");

	        wd = new FirefoxDriver(options);

	    } else {
	        // Default fallback → Chrome
	        WebDriverManager.chromedriver().setup();
	        wd = new ChromeDriver();
	    }

	    wd.manage().window().maximize();

	    // Set ThreadLocal driver
	    threadDriver.set(wd);

	    // For backward compatibility, assign static driver (not recommended for parallel, but kept)
	    driver = wd;

	    // Assign static config for backward compatibility
	    config = cfg;
	}

	// Open application
	public static void openApplication() {
	    WebDriver wd = getDriver();    // Thread-safe driver
	    ConfigReader cfg = getConfig(); // Thread-safe config

	    if (wd == null || cfg == null) {
	        throw new RuntimeException("Driver or Config not initialized for this thread");
	    }

	    wd.get(cfg.getApplicationUrl());
	    d().navigate().refresh();
	}
	
	 
//SendUserID
     public static Hashtable<String,Object> sendUserId(Object[]inputparameters){   
	    try {
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	      String strXpath=(String)inputparameters[0];
	      d().findElement(By.xpath(strXpath)).sendKeys(config.sendUserId());
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
		   d().findElement(By.xpath(strXpath)).sendKeys(config.sendPassword());
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
		   d().findElement(By.xpath(strXpath)).sendKeys(strvalue);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
     }
   //SelectLanguage
     public static void selectLanguage() {

    	    try {

    	        String language = config.getLanguageName();

    	        String dropdownXpath = "//*[@id='spnlangSel']";
    	        String yesButtonXpath = "//*[@id='btnYesLocal']";
    	        String validationXpath = "//*[@id='span_lblHi_lc']";

    	        String languageXpath = "";
    	        String expectedText = "";

    	        // ✅ Dynamic language handling
    	        switch (language.toUpperCase()) {

    	            case "EN":
    	                languageXpath = "//*[@data-language='En']";
    	                expectedText = "Hi";
    	                break;

    	            case "FR":
    	                languageXpath = "//*[@data-language='Fr']";
    	                expectedText = "Salut";
    	                break;

    	            case "SW":
    	                languageXpath = "//*[@data-language='Sw']";
    	                expectedText = "Habari";
    	                break;

    	            default:
    	                throw new RuntimeException("Unsupported language: " + language);
    	        }

    	        // ✅ Open language dropdown
    	        Object[] input1 = new Object[1];
    	        input1[0] = dropdownXpath;
    	        SeleniumOperations.actionClass(input1);

    	        // ✅ Select language
    	        Object[] input2 = new Object[1];
    	        input2[0] = languageXpath;
    	        SeleniumOperations.clickOnLogin(input2);

    	        // ✅ Confirm selection
    	        Object[] input3 = new Object[1];
    	        input3[0] = yesButtonXpath;
    	        SeleniumOperations.clickOnLogin(input3);

    	        // ✅ Wait for validation element instead of Thread.sleep
    	        WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
    	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(validationXpath)));

    	        // ✅ Validation
    	        Object[] input4 = new Object[2];
    	        input4[0] = validationXpath;
    	        input4[1] = expectedText;
    	        SeleniumOperations.validation(input4);
    	        Thread.sleep(2000);

    	    } catch (Exception e) {

    	        String screenshotPath = ScreenshotUtil.captureFullPage(d(), "Language_Selection_Exception");

    	        String msg =
    	                "Language selection failed\n" +
    	                "Language   : " + config.getLanguageName() + "\n" +
    	                "Reason     : " + e.getClass().getSimpleName() + " - " + e.getMessage() + "\n" +
    	                "Screenshot : " + screenshotPath;

    	        SoftFailureContext.add(msg);

    	        throw new RuntimeException(msg);
    	    }
    	}
//Click
     public static Hashtable<String, Object> clickOnElement(Object[] inputparameters) {

 	    Hashtable<String, Object> output = new Hashtable<>();

 	    String xpath = (String) inputparameters[0];
 	    By locator = By.xpath(xpath);

 	    int attempts = 0;

 	    try {

 	        while (attempts < 2) {
 	            try {
 	                // ✅ Explicit Wait (CLICKABLE)
 	                WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
 	                WebElement element = wait.until(
 	                        ExpectedConditions.elementToBeClickable(locator)
 	                );

 	                if (!element.isDisplayed()) {
 	                    String msg = "Element not displayed: " + xpath;
 	                    output.put("STATUS", "FAIL");
 	                    output.put("MESSAGE", msg);
 	                    SoftFailureContext.add(msg);
 	                    return output;
 	                }

 	                if (!element.isEnabled()) {
 	                    String screenshotPath = ScreenshotUtil.capture(d(), element, "Click_Disabled");

 	                    String msg =
 	                            "Element is disabled\n" +
 	                            "Locator    : " + xpath + "\n" +
 	                            "Screenshot : " + screenshotPath;

 	                    output.put("STATUS", "FAIL");
 	                    output.put("MESSAGE", msg);
 	                    SoftFailureContext.add(msg);
 	                    return output;
 	                }

 	                // ✅ Normal click
 	                element.click();

 	                output.put("STATUS", "PASS");
 	                output.put("MESSAGE", "Clicked on: " + xpath);

 	                return output;

 	            } catch (StaleElementReferenceException e) {
 	                attempts++;
 	            } catch (ElementClickInterceptedException e) {
 	                // 🔥 Handle overlay/intercept issue
 	                WebElement element = d().findElement(locator);
 	                JavascriptExecutor js = (JavascriptExecutor) d();
 	                js.executeScript("arguments[0].click();", element);

 	                output.put("STATUS", "PASS");
 	                output.put("MESSAGE", "Clicked using JS on: " + xpath);
 	                return output;
 	            }
 	        }

 	        throw new RuntimeException("Element unstable after retry");

 	    } catch (Exception e) {

 	        String screenshotPath;

 	        try {
 	            WebElement element = d().findElement(locator);
 	            screenshotPath = ScreenshotUtil.capture(d(), element, "Click_Exception");
 	        } catch (Exception ex) {
 	            screenshotPath = ScreenshotUtil.captureFullPage(d(), "Click_Exception");
 	        }

 	        String msg =
 	                "Click action failed\n" +
 	                "Locator    : " + xpath + "\n" +
 	                "Reason     : " + e.getClass().getSimpleName() + " - " + e.getMessage() + "\n" +
 	                "Screenshot : " + screenshotPath;

 	        output.put("STATUS", "FAIL");
 	        output.put("MESSAGE", msg);
 	        SoftFailureContext.add(msg);
 	    }

 	    return output;
 	}
	
   //DoubleClick
     public static Hashtable<String,Object> doubleClickOnElement(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   d().findElement(By.xpath(strXpath)).click();
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
     public static Hashtable<String, Object> validation(Object[] inputparameters) {

  	    Hashtable<String, Object> output = new Hashtable<>();

  	    String xpath = (String) inputparameters[0];
  	    String expectedText = (String) inputparameters[1];

  	    By locator = By.xpath(xpath);

  	    int attempts = 0;

  	    try {

  	        while (attempts < 2) {
  	            try {
  	                // ✅ Explicit wait (VISIBLE)
  	                WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
  	                WebElement element = wait.until(
  	                        ExpectedConditions.visibilityOfElementLocated(locator)
  	                );

  	                if (!element.isDisplayed()) {
  	                    String msg = "Element not displayed: " + xpath;
  	                    output.put("STATUS", "FAIL");
  	                    output.put("MESSAGE", msg);
  	                    SoftFailureContext.add(msg);
  	                    return output;
  	                }

  	                // ✅ Get text safely
  	                String actualText = element.getText().trim();
  	                String expected = expectedText.trim();

  	                System.out.println("Actual: " + actualText);
  	                System.out.println("Expected: " + expected);

  	                if (expected.equalsIgnoreCase(actualText)) {

  	                    output.put("STATUS", "PASS");
  	                    output.put("MESSAGE", "Validation passed. Expected: " + expected);

  	                } else {

  	                    String screenshotPath = ScreenshotUtil.capture(d(), element, "Validation_Failed");

  	                    String msg =
  	                            "Validation failed\n" +
  	                            "Locator    : " + xpath + "\n" +
  	                            "Expected   : " + expected + "\n" +
  	                            "Actual     : " + actualText + "\n" +
  	                            "Screenshot : " + screenshotPath;

  	                    output.put("STATUS", "FAIL");
  	                    output.put("MESSAGE", msg);
  	                    SoftFailureContext.add(msg);
  	                }

  	                return output;

  	            } catch (StaleElementReferenceException e) {
  	                attempts++;
  	            }
  	        }

  	        throw new RuntimeException("Element unstable after retry");

  	    } catch (Exception e) {

  	        String screenshotPath;

  	        try {
  	            WebElement element = d().findElement(locator);
  	            screenshotPath = ScreenshotUtil.capture(d(), element, "Validation_Exception");
  	        } catch (Exception ex) {
  	            screenshotPath = ScreenshotUtil.captureFullPage(d(), "Validation_Exception");
  	        }

  	        String msg =
  	                "Validation execution failed\n" +
  	                "Locator    : " + xpath + "\n" +
  	                "Expected   : " + expectedText + "\n" +
  	                "Reason     : " + e.getClass().getSimpleName() + " - " + e.getMessage() + "\n" +
  	                "Screenshot : " + screenshotPath;

  	        output.put("STATUS", "FAIL");
  	        output.put("MESSAGE", msg);
  	        SoftFailureContext.add(msg);
  	    }

  	    return output;
  	}
     public static Hashtable<String, Object> validationContains(Object[] inputparameters) {

  	    Hashtable<String, Object> output = new Hashtable<>();

  	    String xpath = (String) inputparameters[0];
  	    String expectedText = (String) inputparameters[1];

  	    By locator = By.xpath(xpath);

  	    int attempts = 0;

  	    try {

  	        while (attempts < 2) {
  	            try {
  	                // ✅ Explicit wait (VISIBLE)
  	                WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
  	                WebElement element = wait.until(
  	                        ExpectedConditions.visibilityOfElementLocated(locator)
  	                );

  	                if (!element.isDisplayed()) {
  	                    String msg = "Element not displayed: " + xpath;
  	                    output.put("STATUS", "FAIL");
  	                    output.put("MESSAGE", msg);
  	                    SoftFailureContext.add(msg);
  	                    return output;
  	                }

  	                // ✅ Get text safely
  	                String actualText = element.getText().trim();
  	                String expected = expectedText.trim();

  	                System.out.println("Actual: " + actualText);
  	                System.out.println("Expected: " + expected);

  	              if (actualText.contains(expected)) {

  	                    output.put("STATUS", "PASS");
  	                    output.put("MESSAGE", "Validation passed. Expected: " + expected);

  	                } else {

  	                    String screenshotPath = ScreenshotUtil.capture(d(), element, "Validation_Failed");

  	                    String msg =
  	                            "Validation failed\n" +
  	                            "Locator    : " + xpath + "\n" +
  	                            "Expected   : " + expected + "\n" +
  	                            "Actual     : " + actualText + "\n" +
  	                            "Screenshot : " + screenshotPath;

  	                    output.put("STATUS", "FAIL");
  	                    output.put("MESSAGE", msg);
  	                    SoftFailureContext.add(msg);
  	                }

  	                return output;

  	            } catch (StaleElementReferenceException e) {
  	                attempts++;
  	            }
  	        }

  	        throw new RuntimeException("Element unstable after retry");

  	    } catch (Exception e) {

  	        String screenshotPath;

  	        try {
  	            WebElement element = d().findElement(locator);
  	            screenshotPath = ScreenshotUtil.capture(d(), element, "Validation_Exception");
  	        } catch (Exception ex) {
  	            screenshotPath = ScreenshotUtil.captureFullPage(d(), "Validation_Exception");
  	        }

  	        String msg =
  	                "Validation execution failed\n" +
  	                "Locator    : " + xpath + "\n" +
  	                "Expected   : " + expectedText + "\n" +
  	                "Reason     : " + e.getClass().getSimpleName() + " - " + e.getMessage() + "\n" +
  	                "Screenshot : " + screenshotPath;

  	        output.put("STATUS", "FAIL");
  	        output.put("MESSAGE", msg);
  	        SoftFailureContext.add(msg);
  	    }

  	    return output;
  	}
	 
//Actions Class	 
	 public static Hashtable<String,Object> actionClass(Object[] inputparameters) {
	     try {
		   String xpath=(String) inputparameters[0];
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   Actions act=new Actions(d());
		   WebElement move = d().findElement(By.xpath(xpath));
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
		   Actions act=new Actions(d());
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
		   Alert pass=d().switchTo().alert();
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
		   JavascriptExecutor js = (JavascriptExecutor) d();
		   js.executeScript("window.scrollBy(0,-1050)");
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
		   JavascriptExecutor down=(JavascriptExecutor) d();
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
	       WebElement remove=d().findElement(By.xpath(strXpath));
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
		   d().switchTo().frame(0);
	       WebElement send=d().findElement(By.xpath(strXpath));
	       send.clear();
	       Thread.sleep(1000);
	       send.sendKeys(strvalue);
	       Thread.sleep(2000);
	       d().switchTo().defaultContent();
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
		 ((JavascriptExecutor)d()).executeScript("window.open()");
         ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
         d().switchTo().window(tab.get(0));
     }	

//Open New Tab
     public static void tab() {
		 ((JavascriptExecutor)d()).executeScript("window.open()");
		  ArrayList<String> tab=new ArrayList<String>(d().getWindowHandles());
		  d().switchTo().window(tab.get(1));
     }

//DropDown
     public static Hashtable<String,Object> dropdown(Object[] inputparameters) {   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String clickXpath = (String)inputparameters[0];
		   d().findElement(By.xpath(clickXpath)).click();
		   Thread.sleep(2000);
		   String sendXpath = (String)inputparameters[1];
		   String sendValue = (String)inputparameters[2];
		   d().findElement(By.xpath(sendXpath)).sendKeys(sendValue);
		   String selectXpath = (String)inputparameters[3];
		   d().findElement(By.xpath(selectXpath)).click();
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
    		 d().quit();
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
     
    

public static String getRiskNote(String quoteName) {
	 try {
		    // Locate the insurance table
		    WebElement table = d().findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

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
		    WebElement table = d().findElement(By.xpath("//*[@id='sort_table']")); // Update XPath as needed

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

  	Set<String> ids1 = d().getWindowHandles();
  	
  	Iterator<String> values = ids1.iterator();    
  	String one = values.next();
  	String two = values.next();
  	
  	d().switchTo().window(two);
  	
  	String url = d().getCurrentUrl();
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

	    Hashtable<String, Object> output = new Hashtable<>();
	    WebDriver driver = d(); // ThreadLocal driver

	    try {

	        String mainWindow = driver.getWindowHandle();
	        String pdfWindow = null;

	        // ======================================
	        // STEP 1: Detect new window manually
	        // ======================================
	        long startTime = System.currentTimeMillis();
	        long timeout = 30000; // 30 seconds

	        while ((System.currentTimeMillis() - startTime) < timeout) {

	            Set<String> handles = driver.getWindowHandles();

	            if (handles.size() > 1) {

	                for (String handle : handles) {
	                    if (!handle.equals(mainWindow)) {
	                        pdfWindow = handle;
	                        break;
	                    }
	                }

	                if (pdfWindow != null)
	                    break;
	            }

	            Thread.sleep(1000);
	        }

	        if (pdfWindow == null) {
	            throw new TimeoutException("PDF window did not open within 30 seconds.");
	        }

	        // ======================================
	        // STEP 2: Switch to PDF tab
	        // ======================================
	        driver.switchTo().window(pdfWindow);

	        // ======================================
	        // STEP 3: Wait until URL is valid
	        // ======================================
	        startTime = System.currentTimeMillis();

	        while ((System.currentTimeMillis() - startTime) < timeout) {

	            String url = driver.getCurrentUrl();

	            if (url != null &&
	                !url.contains("about:blank") &&
	                url.length() > 15) {

	                break;
	            }

	            Thread.sleep(1000);
	        }

	        String pdfUrlString = driver.getCurrentUrl();

	        if (pdfUrlString == null || pdfUrlString.contains("about:blank")) {
	            throw new TimeoutException("PDF URL not loaded properly.");
	        }

	        System.out.println("✅ PDF URL: " + pdfUrlString);

	        // ======================================
	        // STEP 4: Open URL connection
	        // ======================================
	        URL pdfUrl = new URL(pdfUrlString);
	        URLConnection connection = pdfUrl.openConnection();

	        connection.addRequestProperty("User-Agent", "Mozilla/5.0");
	        connection.setConnectTimeout(30000);
	        connection.setReadTimeout(120000); // 2 min for large PDFs

	        // ======================================
	        // STEP 5: Load PDF
	        // ======================================
	        PDDocument pdfDocument;

	        try (InputStream inputStream = connection.getInputStream();
	             BufferedInputStream bufferedStream =
	                     new BufferedInputStream(inputStream)) {

	            pdfDocument = PDDocument.load(bufferedStream);
	        }

	        int totalPages = pdfDocument.getNumberOfPages();
	        PDFTextStripper stripper = new PDFTextStripper();
	        String pdfText = stripper.getText(pdfDocument);

	        pdfDocument.close();

	        // ======================================
	        // STEP 6: Store result
	        // ======================================
	        output.put("PDF_URL", pdfUrlString);
	        output.put("PDF_PAGE_COUNT", totalPages);
	        output.put("PDF_TEXT_SAMPLE",
	                pdfText.substring(0, Math.min(500, pdfText.length())));
	        output.put("STATUS", "Pass");
	        output.put("MESSAGE", "Report verified successfully. Pages: " + totalPages);
	     
	        // ======================================
	        // STEP 7: Close PDF tab and return
	        // ======================================
	        driver.close();
	        driver.switchTo().window(mainWindow);

	    } catch (Exception e) {

	        StringWriter sw = new StringWriter();
	        e.printStackTrace(new PrintWriter(sw));

	        output.put("STATUS", "Fail");
	        output.put("MESSAGE", sw.toString());
	    }

	    return output;
	}
   
 //ValidateDOB
   public static Hashtable<String, Object> sendDate(Object[] inputparameters) {

	    Hashtable<String, Object> outputparameters = new Hashtable<>();

	    try {
	        String strXpath = (String) inputparameters[0];
	        String dateValue = (String) inputparameters[1];

	        String finalDate;

	        if ("Today".equalsIgnoreCase(dateValue)) {
	            finalDate = LocalDate.now()
	                    .format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
	        } else {
	            finalDate = dateValue;
	        }

	        WebElement element = d().findElement(By.xpath(strXpath));
	        element.clear();
	        element.sendKeys(finalDate);

	        outputparameters.put("STATUS", "PASS");
	        outputparameters.put("MESSAGE",
	                "Method Used: sendDate, Input Given: " + finalDate);

	    } catch (Exception e) {
	        outputparameters.put("STATUS", "FAIL");
	        outputparameters.put("MESSAGE",
	                "Method Used: sendDate, Error: " + e.getMessage());
	    }

	    return outputparameters;
	}
// NEW - dynamic methods
   public static void sendUserIdDynamic(Object[] input) {
  	    String xpath = (String) input[0];
  	    String value = (String) input[1];

  	    getDriver().findElement(By.xpath(xpath)).sendKeys(value);
  	}

   public static void sendPasswordDynamic(Object[] input) {
  	    String xpath = (String) input[0];
  	    String value = (String) input[1];

  	    getDriver().findElement(By.xpath(xpath)).sendKeys(value);
  	}
 //ClickOnLoginButton
   public static Hashtable<String, Object> clickOnLogin(Object[] inputparameters) {

	    try {
	        String strXpath = (String) inputparameters[0];

	        WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(20));

	        WebElement element = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath(strXpath)));

	        // Scroll element into view
	        JavascriptExecutor js = (JavascriptExecutor) d();
	        js.executeScript("arguments[0].scrollIntoView(true);", element);

	        try {
	            // Normal Selenium click
	            element.click();
	        } catch (Exception e) {
	            // Fallback JS click for Firefox
	            js.executeScript("arguments[0].click();", element);
	        }

	        outputparameters.put("STATUS", "PASS");
	        outputparameters.put("MESSAGE",
	                "Method Used: clickOnElement, Input Given: " + inputparameters[0]);

	    } catch (Exception e) {

	        outputparameters.put("STATUS", "FAIL");
	        outputparameters.put("MESSAGE",
	                "Method Used: clickOnElement, Input Given: "
	                        + inputparameters[0]
	                        + " Exception: " + e.getMessage());
	    }

	    return outputparameters;
	}
   public static Hashtable<String, Object> printReceipt(Object[] inputparameters) throws IOException {
	    Hashtable<String, Object> outputparameters = new Hashtable<>();

	    try {

	        String fieldName = ((String) inputparameters[0]).trim();
	        

	        // ✅ Store current (main) window
	        String mainWindow = d().getWindowHandle();

	        // ✅ Get expected values from UI BEFORE switching to PDF
	        Map<String, String> expectedValues = new HashMap<>();
	        expectedValues.put("Receipts", d().findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[2]/*[1]")).getText().toUpperCase());
	        expectedValues.put("Client Name", d().findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[5]")).getText());
	        expectedValues.put("Total Amount", d().findElement(By.xpath("//*[@id='sort_table']/tbody/tr/td[6]")).getText());

	        Thread.sleep(2000);

	        // ✅ Step 4: Switch to PDF tab
	        Set<String> ids = d().getWindowHandles();
	        for (String id : ids) {
	            if (!id.equals(mainWindow)) {
	            	d().switchTo().window(id);
	                break;
	            }
	        }

	        // ✅ Read PDF
	        URL pdfUrl = new URL(d().getCurrentUrl());
	        URLConnection urlConnection = pdfUrl.openConnection();
	        urlConnection.addRequestProperty("User-Agent", "Chrome");

	        try (InputStream id = urlConnection.getInputStream();
	             BufferedInputStream bufferedInput = new BufferedInputStream(id);
	             PDDocument pdDocument = PDDocument.load(bufferedInput)) {

	            String printText = new PDFTextStripper().getText(pdDocument);
	         // ✅ Compare current field (PDF vs Expected Value)
	            String expectedValue = expectedValues.get(fieldName);

	         
	            if (expectedValue != null) {
	                // Normalize expected value (remove extra spaces, unify case, remove special chars for fuzzy match)
	                String normalizedExpected = expectedValue.trim()
	                                                         .replaceAll("\\s+", " ")   // collapse multiple spaces
	                                                         .toUpperCase();

	                // 🔥 Split PDF into lines
	                String[] pdfLines = printText.split("\\r?\\n");
	                boolean matchFound = false;

	                for (String line : pdfLines) {
	                    // Normalize PDF line
	                    String normalizedLine = line.trim()
	                                                .replaceAll("\\s+", " ")   // collapse spaces
	                                                .toUpperCase();

	                    // Debug print
	                   // System.out.println("📄 PDF Line: [" + line + "]");

	                    // 1️⃣ Exact match
	                    if (normalizedLine.equals(normalizedExpected)) {
	                        matchFound = true;
	                        break;
	                    }

	                    // 2️⃣ Contains match (handles multi-line or label+value cases)
	                    if (normalizedLine.contains(normalizedExpected)) {
	                        matchFound = true;
	                        break;
	                    }

	                    // 3️⃣ Regex whole word match (avoid partial matches like "1234" inside "123456")
	                    if (normalizedLine.matches(".*\\b" + java.util.regex.Pattern.quote(normalizedExpected) + "\\b.*")) {
	                        matchFound = true;
	                        break;
	                    }

	                    // 4️⃣ Number-only comparison (ignore commas, decimals, currency symbols)
	                    String digitsExpected = normalizedExpected.replaceAll("[^0-9A-Za-z]", "");
	                    String digitsLine = normalizedLine.replaceAll("[^0-9A-Za-z]", "");
	                    if (!digitsExpected.isEmpty() && digitsExpected.equalsIgnoreCase(digitsLine)) {
	                        matchFound = true;
	                        break;
	                    }
	                }

	                if (matchFound) {
	                    System.out.println("✅ " + fieldName + " found in PDF: " + expectedValue);
	                    outputparameters.put("STATUS", "Pass");
	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is present in PDF with value: " + expectedValue);
	                } else {
	                    System.out.println("❌ " + fieldName + " NOT found in PDF (all match strategies failed)");
	                    outputparameters.put("STATUS", "Fail");
	                    outputparameters.put("MESSAGE", "Field '" + fieldName + "' is missing or mismatch in PDF. Expected: " + expectedValue);
	                }
	            } else {
	                System.out.println("⚠️ Expected value for " + fieldName + " not found in map");
	            }

	            
	        }

	        // ✅ Switch back to main tab
	       d().switchTo().window(mainWindow);

	    } catch (Exception e) {
	        e.printStackTrace();
	        outputparameters.put("STATUS", "Fail");
	        outputparameters.put("MESSAGE", "Exception in printQuote: " + e.getMessage());
	    }

	    return outputparameters;
	}
   
   public static String getStatus(String status) {
	    try {
	        boolean found = false;
	        String quoteNumber = null;

	        while (true) {
	            // Locate table and rows
	            WebElement table = d().findElement(By.xpath("//*[@id='sort_table']"));
	            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

	            for (WebElement row : rows) {
	                WebElement cell1 = row.findElement(By.xpath("./td[8]")); // 4th column
	                if (cell1.getText().trim().equalsIgnoreCase(status)
	                        ) {

	                    WebElement quoteCell = row.findElement(By.xpath("./td[2]/*[1]"));
	                    quoteNumber = quoteCell.getText().trim();
	                    found = true;

	                   System.out.println("✅ Found 'Allocated' for " + quoteNumber);
	                    return quoteNumber; // stop immediately
	                }
	            }

	            // Check for pagination only if not found yet
	            if (!found) {
	                WebElement nextButton = d().findElement(By.xpath("//*[@id='sort_table_next']"));
	                String nextClass = nextButton.getAttribute("class");

	                if (nextClass != null && nextClass.contains("disabled")) {
	                    System.out.println("🚫 Reached last page. ");
	                    break;
	                } else {
	                    System.out.println("➡️ Moving to next page...");
	                    nextButton.click();
	                    Thread.sleep(1500); // Wait for next page to load
	                }
	            } else {
	                break; // safety exit (redundant but safe)
	            }
	        }

	        return quoteNumber; // null if not found

	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
   public static String getQuote(String quoteName) {
	    try {
	        boolean found = false;
	        String quoteNumber = null;

	        while (true) {
	            // Locate table and rows
	            WebElement table = d().findElement(By.xpath("//*[@id='sort_table']"));
	            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

	            for (WebElement row : rows) {

	                WebElement cell1 = row.findElement(By.xpath("./td[4]")); // 4th column
	                WebElement cell2 = row.findElement(By.xpath("./td[9]")); // 9th column

	                String status = cell2.getText().trim();

	                if (cell1.getText().trim().equalsIgnoreCase(quoteName)
	                        && (status.equalsIgnoreCase("Required Approval(Back Date)")
	                        || status.equalsIgnoreCase("Required Approval (Multiple Compliance Issues)"))) {

	                    WebElement quoteCell = row.findElement(By.xpath("./td[2]"));
	                    quoteNumber = quoteCell.getText().trim();
	                    found = true;

	                    System.out.println("✅ Found matching status for " + quoteName + 
	                                       ". Quote Number: " + quoteNumber + 
	                                       " | Status: " + status);

	                    return quoteNumber; // stop immediately
	                }
	            }

	            // Check for pagination only if not found yet
	            if (!found) {
	                WebElement nextButton = d().findElement(By.xpath("//*[@id='sort_table_next']"));
	                String nextClass = nextButton.getAttribute("class");

	                if (nextClass != null && nextClass.contains("disabled")) {
	                    System.out.println("🚫 Reached last page. No 'Awaiting Receipt' found for: " + quoteName);
	                    break;
	                } else {
	                    System.out.println("➡️ Moving to next page...");
	                    nextButton.click();
	                    Thread.sleep(1500); // Wait for next page to load
	                }
	            } else {
	                break; // safety exit (redundant but safe)
	            }
	        }

	        return quoteNumber; // null if not found

	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
   public static String getClaim1(String quoteName) throws TimeoutException {
	    String lastRiskNoteNumber = null; // store the latest valid risk note

	    try {
	        WebElement table = d().findElement(By.xpath("//*[@id='sort_table']")); 
	        List<WebElement> rows = table.findElements(By.xpath("./tbody/tr")); // get all rows

	        for (int i = 1; i <= rows.size(); i++) {
	            WebElement row = rows.get(i - 1);

	            // 5th column = Quote Name
	            WebElement cell1 = row.findElement(By.xpath("./td[5]"));
	            // 8th column = Status
	            WebElement cell2 = row.findElement(By.xpath("./td[8]"));

	            if (cell1.getText().trim().contains(quoteName) &&
	                cell2.getText().trim().equalsIgnoreCase("Active")) {

	                // Get Risk Note number from 2nd column
	                WebElement quoteCell = row.findElement(By.xpath("./td[3]/*[1]"));
	                lastRiskNoteNumber = quoteCell.getText().trim();
	                System.out.println("🎯 Found Active Risk Note: " + lastRiskNoteNumber);

	                // Click Issue Claim button (adjust XPath as needed)
	                WebElement issueClaimBtn = row.findElement(
	                    By.xpath("//*[@id='sort_table']/tbody/tr[" + i + "]/td[11]/*[4]")
	                );
	                issueClaimBtn.click();
	                
	                // Report Claim
	                WebElement reportClaimBtn = d().findElement(
	                    By.xpath("//*[@id='btnReportClaim']")
	                );
	                reportClaimBtn.click();

	                // Report Claim
	                WebElement exitClaimBtn = d().findElement(
	                    By.xpath("//*[@id='btnClaimExit']")
	                );
	                exitClaimBtn.click();

	                // Exit Claim Page
	                WebElement exit = d().findElement(By.xpath("//*[@id='btnCancelICNM']"));
	                exit.click();
	             // ✅ After exit, table may reload → refresh rows reference
	                rows = d().findElements(By.xpath("//*[@id='sort_table']/tbody/tr"));
	                // ✅ Continue to check next rows also
	             // Step 4: Handle pagination
    	            WebElement nextButton = d().findElement(By.xpath("//*[@id='sort_table_next']"));
    	            String nextClass = nextButton.getAttribute("class");

    	            if (nextClass != null && nextClass.contains("disabled")) {
    	                System.out.println("🚫 Reached last page. Stopping pagination.");
    	                break;
    	            } else {
    	                System.out.println("➡️ Moving to next page...");
    	                nextButton.click();
    	                Thread.sleep(1500);
    	            }
	               // continue;
	                
	            }
	            
	        }

	        if (lastRiskNoteNumber == null) {
	            System.out.println("❌ No eligible Risk Note found for new claim.");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return lastRiskNoteNumber; // return the last one found
	}
   public static String getClaim(String quoteName) throws TimeoutException {
	    String lastRiskNoteNumber = null;

	    Set<String> processedRiskNotes = new HashSet<>();

	    WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) d();

	    try {
	        boolean hasNextPage = true;

	        while (hasNextPage) {

	            boolean foundAndProcessed = false;

	            // 🔁 Always fetch fresh rows
	            List<WebElement> rows = d().findElements(By.xpath("//*[@id='sort_table']/tbody/tr"));

	            for (int i = 1; i <= rows.size(); i++) {

	                // 🔁 Re-locate row every time (avoid stale)
	                WebElement row = d().findElement(
	                        By.xpath("//*[@id='sort_table']/tbody/tr[" + i + "]"));

	                String quote = row.findElement(By.xpath("./td[5]")).getText().trim();
	                String status = row.findElement(By.xpath("./td[8]")).getText().trim();

	                if (quote.contains(quoteName) && status.equalsIgnoreCase("Active")) {

	                    String currentRiskNote = row.findElement(By.xpath("./td[3]/*[1]"))
	                            .getText().trim();

	                    // ✅ Skip already processed
	                    if (processedRiskNotes.contains(currentRiskNote)) {
	                        continue;
	                    }

	                    System.out.println("🎯 Processing Active: " + currentRiskNote);

	                    processedRiskNotes.add(currentRiskNote);
	                    lastRiskNoteNumber = currentRiskNote;

	                    // ✅ Scroll row to center (avoids header overlap)
	                    js.executeScript("arguments[0].scrollIntoView({block:'center'});", row);
	                    Thread.sleep(500);

	                    // ✅ Locate button inside SAME row
	                    WebElement issueClaimBtn = row.findElement(By.xpath(".//td[11]/*[4]"));

	                    // ✅ Wait until clickable
	                    wait.until(ExpectedConditions.elementToBeClickable(issueClaimBtn));

	                    // ✅ Safe Click (normal + JS fallback)
	                    try {
	                        issueClaimBtn.click();
	                    } catch (Exception e) {
	                        System.out.println("⚠️ Normal click failed → using JS click");
	                        js.executeScript("arguments[0].click();", issueClaimBtn);
	                    }

	                    // ✅ Actions
	                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnReportClaim']"))).click();
	                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnClaimExit']"))).click();
	                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnCancelICNM']"))).click();

	                    // ✅ Wait for table reload
	                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sort_table']")));

	                    Thread.sleep(1000);

	                    // ✅ Restart scanning same page
	                    foundAndProcessed = true;
	                    break;
	                }
	            }

	            // ✅ If processed one → restart SAME page
	            if (foundAndProcessed) {
	                continue;
	            }

	            // ✅ No Active left → go to next page
	            WebElement nextButton = d().findElement(By.xpath("//*[@id='sort_table_next']"));
	            String nextClass = nextButton.getAttribute("class");

	            if (nextClass != null && !nextClass.contains("disabled")) {

	                System.out.println("➡️ Moving to next page...");
	                nextButton.click();

	               /* // ✅ Wait for overlay/loader to disappear (adjust xpath if needed)
	                wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                        By.xpath("//div[contains(@class,'loading') or contains(@class,'overlay')]")
	                ));*/

	                // ✅ Wait for table
	                wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//*[@id='sort_table']")
	                ));

	                // ✅ Scroll to top after pagination
	                js.executeScript("window.scrollTo(0, 0);");

	                Thread.sleep(1000);

	            } else {
	                System.out.println("🚫 No more pages.");
	                hasNextPage = false;
	            }
	        }

	        if (processedRiskNotes.isEmpty()) {
	            System.out.println("❌ No eligible Active Risk Notes found.");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return lastRiskNoteNumber;
	}
   public static String getReinsurance(String option) throws TimeoutException {

	    String lastRiskNoteNumber = null;

	    WebDriverWait wait = new WebDriverWait(d(), Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) d();

	    // ✅ Change Action Here
	    String actionType = option; // Edit / Delete / Approve

	    try {

	        boolean hasNextPage = true;
	        boolean isProcessed = false;

	        while (hasNextPage && !isProcessed) {

	            // 🔁 Fetch fresh rows
	            List<WebElement> rows = d().findElements(
	                    By.xpath("//*[@id='sort_table']/tbody/tr"));

	            for (int i = 1; i <= rows.size(); i++) {

	                WebElement row = d().findElement(
	                        By.xpath("//*[@id='sort_table']/tbody/tr[" + i + "]"));

	                String status = row.findElement(
	                        By.xpath("./td[9]")).getText().trim();

	                if (status.equalsIgnoreCase("Created")) {

	                    // ✅ Scroll row into view
	                    js.executeScript(
	                            "arguments[0].scrollIntoView({block:'center'});",
	                            row);

	                    Thread.sleep(500);

	                    // ✅ Open dropdown
	                    WebElement actionMenu = row.findElement(
	                            By.xpath(".//td[10]/*[2]"));

	                    try {

	                        wait.until(ExpectedConditions
	                                .elementToBeClickable(actionMenu));

	                        actionMenu.click();

	                    } catch (Exception e) {

	                        System.out.println(
	                                "⚠️ Dropdown click failed → using JS click");

	                        js.executeScript(
	                                "arguments[0].click();",
	                                actionMenu);
	                    }

	                    // ✅ Dynamic XPath based on action
	                    String actionXpath = "";

	                    if (actionType.equalsIgnoreCase("Edit")) {

	                        actionXpath =
	                                "//*[@id='sort_table']/tbody/tr[" + i + "]/td[10]/*[2]/*[2]/*[2]";

	                    } else if (actionType.equalsIgnoreCase("Delete")) {

	                        actionXpath =
	                                "//*[@id='sort_table']/tbody/tr[" + i + "]/td[10]/*[2]/*[2]/*[3]";

	                    } else if (actionType.equalsIgnoreCase("Approve")) {

	                        actionXpath =
	                                "//*[@id='sort_table']/tbody/tr[" + i + "]/td[10]/*[2]/*[2]/*[4]";
	                    }

	                    // ✅ Click action button
	                    WebElement actionBtn =
	                            wait.until(ExpectedConditions
	                                    .visibilityOfElementLocated(
	                                            By.xpath(actionXpath)));

	                    try {

	                        wait.until(ExpectedConditions
	                                .elementToBeClickable(actionBtn));

	                        actionBtn.click();

	                    } catch (Exception e) {

	                        System.out.println(
	                                "⚠️ " + actionType +
	                                " click failed → using JS click");

	                        js.executeScript(
	                                "arguments[0].click();",
	                                actionBtn);
	                    }

	                    Thread.sleep(2000);

	                    System.out.println(
	                            "✅ Created status found → "
	                                    + actionType +
	                                    " clicked → Stopping execution.");

	                    isProcessed = true;
	                    break;
	                }
	            }

	            // ✅ Stop execution
	            if (isProcessed) {
	                break;
	            }

	            // 🔁 Pagination
	            WebElement nextButton = d().findElement(
	                    By.xpath("//*[@id='sort_table_next']"));

	            String nextClass = nextButton.getAttribute("class");

	            if (nextClass != null &&
	                    !nextClass.contains("disabled")) {

	                System.out.println("➡️ Moving to next page...");

	                nextButton.click();

	                wait.until(ExpectedConditions
	                        .visibilityOfElementLocated(
	                                By.xpath("//*[@id='sort_table']")));

	                js.executeScript("window.scrollTo(0, 0);");

	                Thread.sleep(1000);

	            } else {

	                System.out.println(
	                        "🚫 No more pages. No 'Created' status found.");

	                hasNextPage = false;
	            }
	        }

	    } catch (Exception e) {

	        e.printStackTrace();
	    }

	    return lastRiskNoteNumber;
	}
 //DynamicValuesSendKeys
   public static Hashtable<String,Object> DynamicValuessendKeys(Object[] inputparameters){   
		 try {
		   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		   String strXpath=(String)inputparameters[0];
		   String strvalue=(String)inputparameters[1];
		   if (strvalue.equalsIgnoreCase("Value")) {
		        String code = "Code" + UUID.randomUUID().toString().substring(0, 8);
		        String value = code;


	       d().findElement(By.xpath(strXpath)).sendKeys(value);
	       outputparameters.put("STATUS","PASS");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
		   }
		   }
	     catch(Exception e){
	       outputparameters.put("STATUS","FAIL");
		   outputparameters.put("MESSAGE","Method Used:sendKeys, Input Given:"+inputparameters[1]);
	     }
	     return outputparameters;
   }
}	 

	