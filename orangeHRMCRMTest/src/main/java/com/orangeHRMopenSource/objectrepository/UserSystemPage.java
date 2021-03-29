package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSystemPage {

	@FindBy(id="btnAdd")
	private WebElement add;
	
	public void clickOnAdd() {
		
		add.click();
		
	}
	
	public UserSystemPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
}
