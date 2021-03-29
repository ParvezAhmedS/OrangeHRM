package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement un;
	
   @FindBy(xpath="//input[@id='txtPassword']")
   private WebElement pw;
   
   @FindBy(xpath="//input[@id='btnLogin']")
   private WebElement lg;
   
   
   public void enterUserName(String str)
   {
	 un.sendKeys(str); 
   }
   
	
   public void enterPassword(String str)
   {
	 pw.sendKeys(str); 
   }
   
   public void clickLogin()
   {
	 lg.click(); 
   }
   

}
