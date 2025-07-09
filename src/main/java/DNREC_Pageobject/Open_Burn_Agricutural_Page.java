package DNREC_Pageobject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DNREC_Abstract.DNREC_Abstact;

public class Open_Burn_Agricutural_Page

{

	
public WebDriver driver;
	
	public Open_Burn_Agricutural_Page(WebDriver driver)
	{
		
		//super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		//Login Page Element
	
	@FindBy(id="permit-licence_startHereButton") WebElement StartHere_Button;
    @FindBy(xpath="//*[@id=\"mat-radio-2\"]/label/span[2]/span[2]") WebElement account_holder_radio;
    @FindBy(xpath="//span[contains(text(),\"This item is for you, the primary account holder?\")]") WebElement Check_Choose_your_program_DropDown; 
    @FindBy(xpath="//div[contains(@id,\"mat-select-value\")]") WebElement Choose_your_program_DropDown;
    @FindBy(xpath="//span[contains(text(),'Air Quality Permits - Small Sources')]") WebElement select_AQ;
    @FindBy(xpath="//span[contains(text(),'Next')]") WebElement AQ_select_Next_Button;
    @FindBy(id="placeholder-exp-select-1") WebElement Choose_your_permit_DropDown;
    @FindBy(xpath="//span[contains(text(),'Select your Permit/Approval type')]") WebElement check_permit_dropdown;
    @FindBy(xpath="//div[contains(@id,'placeholder-exp-select')])[2]")WebElement Permit_DropDown;
    
    
    
    
    
	public  void Select_OpenBurn_Agricutural() throws InterruptedException, IOException
	{
          StartHere_Button.click();
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          wait.until(ExpectedConditions.visibilityOf(Check_Choose_your_program_DropDown));
          account_holder_radio.click();
          Choose_your_program_DropDown.click();
          select_AQ.click();
          AQ_select_Next_Button.click();
          wait.until(ExpectedConditions.visibilityOf(check_permit_dropdown));
          Permit_DropDown.click();
          DNREC_Abstact obj = new DNREC_Abstact(driver);
          obj.getScreenShot("AQ1");
          
	}

	
	public  void Survey_questions()
	{
        System.out.println("surevy questions done");
	}
	
	public void checkout()
	{
        System.out.println("CheckOut Done");
	}
	
}
