package BussinessFunction;

import org.openqa.selenium.WebDriver;

import com.Banking.Commands.ActionDriver;
import com.Banking.Configuration.BrowserSettings;
import com.Banking.PageObject.LoginPage;

public class Application_Login {
	WebDriver driver;
	public void login() throws InterruptedException {
		BrowserSettings.childTest=BrowserSettings.parentTest.createNode("Login into  the Application");
		ActionDriver Obj=new ActionDriver();
		Obj.NavigateToApplication("http://www.demo.guru99.com/v4/");
		
		Thread.sleep(500);
		
		
		Obj.Type(LoginPage.Txtusername,"mngr322394","UserName");
		Obj.Type(LoginPage.TxtPassword,"peqEqyv\r\n","Password");
		Thread.sleep(5000);
		//Obj.click(LoginPage.btnLogin,"Login Button");
		//Obj.click(LoginPage.btnreset,"Button Reset");
		
	}

	
	
	

}
