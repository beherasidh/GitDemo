package DNREC_AQ;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DNREC_Pageobject.Login_indivisual;
import DNREC_Pageobject.Open_Burn_Agricutural_Page;
import DNREC_TestComponents.baseTest;

public class OpenBurn_Agricuture extends baseTest {

	@Test
	public static void EndtoEnd_OpenBurn_Agricutural() throws IOException, InterruptedException
	
	{
		Login_indivisual obj = new Login_indivisual(driver);
		                 obj.Login_indy();
		                 
		Open_Burn_Agricutural_Page obj1 = new Open_Burn_Agricutural_Page(driver);
		                 obj1.Select_OpenBurn_Agricutural();
		                 obj1.Survey_questions();
		                 obj1.checkout();
		               

	}
	
	
	
	
	
	
	//Data with hashMap
	
	
	  @DataProvider public Object[] [] getData()
	  
	{
		  
		  HashMap<String, String> Map1 = new HashMap<String, String>();
		  Map1.put("email", "sidhartha+19@expertly.cloud");
		  Map1.put("Password","Test@1234");
		  
		  //return new Object [] [] {{Map1}};
		  
		  HashMap<String, String> Map2 = new HashMap<String, String>();
		  Map2.put("email", "sidhartha+20@expertly.cloud");
		  Map2.put("Password","Test@12345");
		  
		  HashMap<String, String> Map3 = new HashMap<String, String>();
		  Map3.put("email", "sidhartha+20@expertly.cloud");
		  Map3.put("Password","Test@12345");
		  
		  return new Object [] [] {{Map1},{Map2},{Map3}};
	  
	 
	  }
	  
	  
	  @Test (dataProvider = "getData") 
	  public void TestOne(HashMap<String, String> Input) 
	  
	   {
	  
	  System.out.println(Input.get("email")); 
	  System.out.println(Input.get("password"));
	  
	  
	 }
	  
	  // data with array
	  
	  @DataProvider 
	  public Object[] [] getData1()
	  
		{
		  return new Object [] [] {{"username1","password1"},{"username2","password2"}};
		}
		
	 
	

}
