package com.orangeHRMopenSource.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectrepository.AddPage;
import com.orangeHRMopenSource.objectrepository.LoginPage;

public class BaseClass {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");
	}
	public static WebDriver driver;
	public FileLib f= new FileLib();
	public WebDriverCommonLib w = new WebDriverCommonLib();
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		w.waitForElementInGui(driver);
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@BeforeMethod
	public void logIn() throws IOException
	{
		String un = f.getPropertyValue("UN");
		String pw = f.getPropertyValue("PW");
		driver.get(f.getPropertyValue("URL"));
		LoginPage l = new LoginPage(driver);
		l.enterUserName(un);
		l.enterPassWord(pw);
		l.clickLIButton();
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		AddPage a = new AddPage(driver);
		Thread.sleep(1000);
		a.clickOnWelcomeMenu();
		Thread.sleep(1000);
		a.clickOnLogOutButton();
	}
	
}
