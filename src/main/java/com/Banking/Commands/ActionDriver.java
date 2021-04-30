package com.Banking.Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Banking.Configuration.BrowserSettings;


public class ActionDriver {
WebDriver driver;
ActionDriver adriver;
public ActionDriver() {
	driver=BrowserSettings.driver;
	
}

public void NavigateToApplication(String url) {
	try {
	driver.get(url);
	BrowserSettings.childTest.pass("Successfully Nevigayed to: " + url);
	
	
	}
	catch (Exception e) {
	BrowserSettings.childTest.fail("Could not Nevigayed to: " + url);	
	}
}

public void Type(By locator, String Txt, String element) {
	try {
	driver.findElement(locator).sendKeys(Txt);
	BrowserSettings.childTest.pass("Successfully typed in:  " + element +"With data: " +Txt );
}
	catch (Exception e ) {
		BrowserSettings.childTest.fail("Unable to typed in:  " + element +"With data: " +Txt);
		BrowserSettings.childTest.info(e);
		throw e;
	}
}
public void click(By locator,String element) {
	try {
		driver.findElement(locator).click();
		BrowserSettings.childTest.pass("Successfully cliked on:"+ element);
		
	}	
	catch (Exception e)
	{
	BrowserSettings.childTest.fail("Unable to click: " + element);
	BrowserSettings.childTest.info(e);
	throw e;
	}
	
}

}
