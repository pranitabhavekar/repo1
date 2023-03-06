package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

import com.Config.TestBase.TestBase;

public class LoginPage extends TestBase
{
    @FindBy(xpath="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
    
    WebElement EmailAdress;
    
   @FindBy(xpath="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
    
    WebElement password;
   
  
   @FindBy(xpath="//button[contains(text(),'Login')]")
   
   WebElement LoginButton;
   
   public LoginPage()
   {
	   
	   PageFactory.initElements(driver,this);
   }
   
   public void Login(String email, String Pword)
   {
	   EmailAdress.sendKeys(email);
	   
	   password.sendKeys(Pword);
	   
	   LoginButton.click();
	   
   }

//public void login(String property, String property2) 
//{
	// TODO Auto-generated method stub
	
//}
  
}
