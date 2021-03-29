package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement admin;
	
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement UMang;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement user;
	
	public void clickElement(WebDriver driver) {
		Actions act = new Actions(driver);
		
		act.moveToElement(admin).perform();
		
		act.moveToElement(UMang).perform();
		
		act.moveToElement(user).click().perform();
		
	}
	
	public  Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
