package com.Shopping.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Config.TestBase.TestBase;
import com.Shopping.TestPages.HomaPage;



public class HomePageTest extends TestBase
{
  
	HomaPage home;
	
	@BeforeMethod
	
	void setup()
	{
		initialization();
		home= new HomaPage();
	}
	
	public HomePageTest()
	{
		super();
	}
	
	@Test
	void VerifyTitle() 
      {
		String Title = home.verifytitle();
		Assert.assertEquals(Title, "Automation Exercise");
	}
	
	@Test
	
	void VerifyHomePageLanding()
	{
		boolean ElementVisible=home.verifyhomapage();
		
		Assert.assertEquals(true, ElementVisible);
	}
	
	@AfterMethod()
	void TeraDown()
	{
		driver.quit();
	}
	
}
