package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v105.cast.Cast;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

import com.Config.TestBase.TestBase;



public class HomaPage extends TestBase
{
  @FindBy(xpath ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
  
  WebElement home;
  
  @FindBy(xpath ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
  WebElement products;
  
  @FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
  
  WebElement carts;
  
  @FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
  
  WebElement login;
  
  @FindBy(xpath="//h2[contains(text(),'Category')]")
  
  WebElement Category;
  
  
  
  
  
  public HomaPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  void clickonhomelink()
  {
	  home.click();
  }
  
  public String verifytitle()
  {
	  String title=driver.getTitle();
	  
	  return title;
  }
  
  public boolean verifyhomapage()
  {
	
	boolean catedis=Category.isDisplayed();
	  
	  return catedis;
  }
  
  public LoginPage ClickonLogin()
	{
		login.click();
		return new LoginPage();
	}
}

