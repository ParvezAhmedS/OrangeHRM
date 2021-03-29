package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Userdetails {
	
	
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement add;
	
	public void clickOnAdd(WebDriver driver)
	{
		add.click();
	}
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement addbutton;
	
	
	
	
	
	
	

}
