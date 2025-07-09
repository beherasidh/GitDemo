package DNREC_Abstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DNREC_Abstact {

	
	WebDriver driver;
	
	public DNREC_Abstact(WebDriver driver)
	
	{
		
		this.driver = driver;
	}
	
	
	public void waitToAppearWebElement(By findby)
	{

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(findby));

	}
	
	
	public String getvaluesFromProertyFile(String value) throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream fi = new FileInputStream("Z:\\Framework\\seleniumFramework\\src\\main\\java\\DNREC_Resources\\globalData.properties");
		prop.load(fi);
		return prop.getProperty(value);
	}
	
	
	public String getScreenShot(String testName) throws IOException
    {
 	   Date currentDateTime = new Date();
 	   String timeFormat = currentDateTime.toString().replace(" ", "-").replace(":", "_");
 	   
 	  
 	   File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 	   File file = new File(System.getProperty("user.dir") + "//reports//" +testName+"_SS_"+timeFormat+ ".png");
 	   FileUtils.copyFile(source, file);
 	   return System.getProperty("user.dir") + "//reports//" +testName+"_SS_"+timeFormat+ ".png";
 	   
    }   
	
	
		
	
	
	

}
