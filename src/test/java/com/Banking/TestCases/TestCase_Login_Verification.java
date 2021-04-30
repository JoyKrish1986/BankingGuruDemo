package com.Banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.Configuration.BrowserSettings;

import BussinessFunction.Application_Login;

public class TestCase_Login_Verification extends BrowserSettings{
	
	@Test
public void login() throws InterruptedException {
		
Application_Login Obj1=new Application_Login();
Obj1.login();
if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
{
	Assert.assertTrue(true);
	
}
else
{
	Assert.assertTrue(false);
}

}

}
