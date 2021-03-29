package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Adminhomepage {
	
	Actions act;
	
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	
	public void selectAdmin(WebDriver driver) {
		act = new Actions(driver);
		act.moveToElement(admin).perform();		
	}
	
    @FindBy(xpath="//a[@id='menu_admin_UserManagement']")
    private WebElement um;
    
    public void selectUserManagement(WebDriver driver)
    {
    	act=new Actions(driver);
    	act.moveToElement(um).perform();
    }
    
    @FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
    private WebElement user;
    
    public void clickUser(WebDriver driver)
    {
    	act=new Actions(driver);
    	act.moveToElement(user).click().perform();
    }
    
    
    
    
	
	
	
	
}
