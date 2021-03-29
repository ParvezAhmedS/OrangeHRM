package com.orangeHRMopenSource.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.generics.BaseClass;
import com.orangeHRMopenSource.objectrepository.AddPage;
import com.orangeHRMopenSource.objectrepository.Homepage;
import com.orangeHRMopenSource.objectrepository.UserSystemPage;
@Listeners(com.orangeHRMopenSource.generics.Listenerimplementation.class)
public class TestClass extends BaseClass {

	@Test
	public void test() throws Exception
	{
		w.waitForElementInGui(driver);
		Homepage hp= new Homepage(driver);
		Thread.sleep(2000);
		hp.clickElement(driver);
		Thread.sleep(2000);
		
		UserSystemPage us = new UserSystemPage(driver);
		Thread.sleep(1000);
		us.clickOnAdd();
		
		AddPage ap= new AddPage(driver);
		ap.selectUserRole("ESS");
		
		ap.enterEmpName(f.getPropertyValue("EU"), f.getPropertyValue("aname"));
		
		ap.enterUserName(f.getPropertyValue("EUN"));
		ap.selectStatus("Enabled");
		
		ap.enterPassword("12345678");
		Thread.sleep(1000);
		ap.enterConfirmPassword("12345678");
		
		
		ap.clickOnSaveButton();
		Thread.sleep(1000);
		
		ap.checkUserName(f.getPropertyValue("EUN") , driver);
		
		Thread.sleep(1000);
		
		
		
		
		
	}
}
