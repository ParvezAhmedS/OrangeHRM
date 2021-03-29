package com.orangeHRMopenSource.objectrepository;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddPage {

	@FindBy(id="systemUser_userType")
	private WebElement userrole;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement empname;
	
	@FindBy(id="systemUser_userName")
	private WebElement username;
	
	@FindBy(id="systemUser_status")
	private WebElement status;
	
	@FindBy(id="systemUser_password")
	private WebElement password;
	
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id="btnSave")
	private WebElement savebutton;
	
	@FindBy(id="welcome")
	private WebElement welcomemenu;
	
	@FindBy(xpath = "//li[@class='ac_even']")
	private List<WebElement> name;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	
	@FindBy(xpath = "//a[text()='chaya12345']")
	private WebElement validateUser;
	
	public void selectUserRole(String str) {
		
		Select s = new Select(userrole);
		s.selectByVisibleText(str);
		
	}
	
	public void checkUserName(String str, WebDriver driver) {
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0 ,1000)");
		
		String text = validateUser.getText();
		Assert.assertEquals(text, str);
		
	}
	
	public void enterEmpName(String str, String aname) {
		
		empname.sendKeys(str);
		for(WebElement n:name)
		{
			if(aname.equals(str))
			{
				n.click();
			}
		}
		
	}
	
	public void enterUserName(String str) {
		
		username.sendKeys(str);
		
	}
	
	
	public void selectStatus(String str) {
		
		Select s= new Select(status);
		s.selectByVisibleText(str);
		
	}
	
	public void enterPassword(String str) {
		
		password.sendKeys(str);
		
	}
	
	public void enterConfirmPassword(String str) {
		
		confirmpassword.sendKeys(str);
		
	}
	
	public void clickOnSaveButton() {
		
		savebutton.click();
		
	}
	
	public void clickOnWelcomeMenu() {
		
		welcomemenu.click();
		
	}
	
	public void clickOnLogOutButton() {
		
		logoutbutton.click();
		
	}
	


public AddPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);

}

	
	
	
	
	
	
	
}
