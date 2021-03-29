package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	private WebElement un;
	
	@FindBy(id="txtPassword")
	private WebElement pw;
	
	@FindBy(id="btnLogin")
	private WebElement lgb;
	
	public void enterUserName(String str)
	{
		un.sendKeys(str);
	}
	
	public void enterPassWord(String str) {
		pw.sendKeys(str);
		
	}
	
	public void clickLIButton() {
		
		lgb.click();
	}
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}
