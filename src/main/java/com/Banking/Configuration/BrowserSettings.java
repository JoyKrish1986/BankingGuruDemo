package com.Banking.Configuration;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class BrowserSettings {
	public static WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	
	@BeforeTest
	public void Report() {
		htmlreporter=new ExtentHtmlReporter("Report/Myresult.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	@BeforeMethod
	public void  method(Method method) {
		parentTest=extent.createTest(method.getName());
	}
	@BeforeClass
	
	public void BrowserOpening() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	@AfterClass
	public void BrowserClosing() {
		extent.flush();
		driver.close();
		
	}
}
