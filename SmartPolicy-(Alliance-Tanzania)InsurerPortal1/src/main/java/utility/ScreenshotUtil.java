package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotUtil {

    // Highlight element by WebElement
    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // Capture screenshot of the whole page with highlighted element
    public static String capture(WebDriver driver, WebElement element, String screenshotName) {
        try {
            // Highlight the element
            highlightElement(driver, element);

            // Take screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            // Path to save screenshot
            String path = System.getProperty("user.dir") + "/screenshots/" 
                    + screenshotName + "_" + System.currentTimeMillis() + ".png";

            File dest = new File(path);
            FileUtils.copyFile(src, dest);

            // Remove highlight
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border=''", element);

            // ✅ Convert to clickable link
            String clickablePath = path.replace("\\", "/");
            return "<a href='file:///" + clickablePath + "' target='_blank'>View Screenshot</a>";

        } catch (Exception e) {
            return "Screenshot capture failed: " + e.getMessage();
        }
    }

    public static String captureFullPage(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir") + "/screenshots/" 
                    + screenshotName + "_" + System.currentTimeMillis() + ".png";

            File dest = new File(path);
            FileUtils.copyFile(src, dest);

            // ✅ Convert to clickable link
            String clickablePath = path.replace("\\", "/");
            return "<a href='file:///" + clickablePath + "' target='_blank'>View Screenshot</a>";

        } catch (Exception e) {
            return "Full page screenshot failed: " + e.getMessage();
        }
    }
}