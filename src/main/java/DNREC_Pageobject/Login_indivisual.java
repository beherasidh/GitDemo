package DNREC_Pageobject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import DNREC_Abstract.DNREC_Abstact;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_indivisual
{
	
	public WebDriver driver;
	
	public Login_indivisual(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		//Login Page Element
	@FindBy(name="loginId") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(id="personal_login") WebElement Login_Button;
	@FindBy(xpath="//*[contains(text(),'PERSONAL ')]") WebElement PersonalButton;
	@FindBy(id="permit-licence_startHereButton") WebElement StartHere_Button;
	
	
	   
       public void Login_indy() throws IOException  
{
    	   DNREC_Abstact obj = new DNREC_Abstact(driver);
    	   String UserName  = obj.getvaluesFromProertyFile("IndyUserName");
    	   String Userpassword  = obj.getvaluesFromProertyFile("PassWord1"); 
    	   PersonalButton.click();
    	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	   wait.until(ExpectedConditions.visibilityOf(Login_Button));
	       userName.sendKeys(UserName);
	       password.sendKeys(Userpassword);
	       Login_Button.click();
	       wait.until(ExpectedConditions.visibilityOf(StartHere_Button));
	       //obj.getScreenShot("test2");
	       
	       
	       
}
       
       
}
