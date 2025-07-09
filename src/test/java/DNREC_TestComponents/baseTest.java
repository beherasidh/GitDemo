package DNREC_TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchApp() throws IOException
	
	{
		
		
		Properties prop= new Properties();
		FileInputStream fi = new FileInputStream("Z:\\Framework\\seleniumFramework\\src\\main\\java\\DNREC_Resources\\globalData.properties");
		prop.load(fi);
		String BrowserName= prop.getProperty("Browser");
		String URL = prop.getProperty("QAURL");
		if (BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox"))
		{
		    WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver(); 
		}
		else if (BrowserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterTest
	public void CloseApp()
	{
		driver.close();
	}
	
	
	
	
	

}
