package com.Banking.PageObject;

import org.openqa.selenium.By;

public class Customer_Add {
	public static By newcust=By.xpath("//a[contains (text(),'New Customer')]");
	
	public static By Cust_Name=By.xpath("//input[@name=\"name\"]");
	public static By GenderF=By.xpath("//tbody/tr[5]/td[2]/input[1]");
	public static By GenderM=By.xpath("//tbody/tr[5]/td[2]/input[2]");
	public static By DOB=By.xpath("//input[@name=\"dob\"]");
	public static By Address=By.xpath("//textarea[@name=\"addr\"]");
	public static By City=By.xpath("//input[@name=\"city\"]");
	public static By State=By.xpath("//input[@name=\"state\"]");
	public static By Pin=By.xpath("//input[@name=\"pinno\"]");
	public static By MobNo=By.xpath("//input[@name=\"telephoneno\"]");
	public static By Email=By.xpath("//input[@name=\"emailid\"]");
	public static By Password=By.xpath("//input[@name=\"password\"]");
	public static By btnsubmit=By.xpath("//input[@type=\"submit\"]");
	

}
