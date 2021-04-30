package com.Banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.Configuration.BrowserSettings;
import com.Banking.PageObject.LoginPage;

import BussinessFunction.Application_Login;

public class TC2_Add_Customer extends BrowserSettings {
	
	@Test
	public void AddCustomer() throws InterruptedException {
	BussinessFunction.AddCustomer obj=new BussinessFunction.AddCustomer();
	obj.NewCustomer();
	
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	if(res==true) {
		Assert.assertTrue(true);
	}
	else
		Assert.assertTrue(false);
	}

}
