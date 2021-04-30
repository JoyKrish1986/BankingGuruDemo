package BussinessFunction;

import com.Banking.Commands.ActionDriver;
import com.Banking.Configuration.BrowserSettings;
import com.Banking.PageObject.Customer_Add;

public class AddCustomer {
	
	public void NewCustomer() throws InterruptedException {
		BrowserSettings.childTest=BrowserSettings.parentTest.createNode("Add Customer");
		Application_Login obj=new Application_Login();
		obj.login();
		ActionDriver obj1= new ActionDriver();
		obj1.click(Customer_Add.newcust, "NewCustomer");
		obj1.Type(Customer_Add.Cust_Name,"JOY","CustomerName");
		obj1.click(Customer_Add.GenderF, "MaleButon");
		obj1.Type(Customer_Add.DOB,"29","DateOfBirth");
		obj1.Type(Customer_Add.DOB,"Apr","month");
		obj1.Type(Customer_Add.DOB,"21","year");
		obj1.Type(Customer_Add.Address,"22 Juhu","Address");
		obj1.Type(Customer_Add.City,"Mumbai","City");
		obj1.Type(Customer_Add.State,"Maharashatra","State");
		obj1.Type(Customer_Add.Pin,"123232", "Pin");
		obj1.Type(Customer_Add.MobNo,"43545","MobileNo");
		obj1.Type(Customer_Add.Email,"joy@test.com","Email");
		obj1.Type(Customer_Add.Password,"Testpass","Password");
		obj1.click(Customer_Add.btnsubmit,"Submit");
		
	
		
	}
	
	

}
