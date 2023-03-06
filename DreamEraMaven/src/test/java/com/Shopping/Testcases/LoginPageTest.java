package com.Shopping.Testcases;

import org.testng.Assert;
import com.Config.TestBase.*;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestPages.HomaPage;
import com.Shopping.TestPages.LoginPage;

public class LoginPageTest extends TestBase
{
	HomaPage home;
	LoginPage loginp;
	

      
	
	  
	  public LoginPageTest() 
	  {
			super();
	  }
	  
	  @BeforeMethod
	  void setup() 
	  {
		  initialization();
		  home= new HomaPage();
		  loginp = new LoginPage();
	  }
	  
	 
	  @Test
	  void VerifyValidLogin() 
	  {
		   loginp=home.ClickonLogin(); 
		   Assert.assertEquals("https://automationexercise.com/", "https://automationexercise.com/");
		   loginp.Login("Pranita@gmail.com" ,"12345");
		   
		  
	  }
	  
	  
	  @AfterMethod
	  void teradown() 
	  {
		  driver.quit();
	  }
	
}
