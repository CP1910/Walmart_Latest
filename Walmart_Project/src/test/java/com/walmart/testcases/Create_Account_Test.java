package com.walmart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.base.Test_Base;
import com.walmart.pages.Create_Account;

public class Create_Account_Test extends Test_Base {

	Create_Account createaccount;

	public Create_Account_Test() {
		super();
	}

	@BeforeMethod

	public void setup() {
		initialization();
		createaccount = new Create_Account();

	}

	@Test(priority = 1)
	public void createaccounttest() throws InterruptedException

	{
		createaccount.signin();
		createaccount.createaccountlink();

		createaccount.firstname("John", "Smith", "johnsmith99@gmail.com", "Smith@1234");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
