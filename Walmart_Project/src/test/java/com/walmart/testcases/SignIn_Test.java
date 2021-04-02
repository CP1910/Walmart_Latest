package com.walmart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.base.Test_Base;
import com.walmart.pages.Home_Page;
import com.walmart.pages.SignIn_Page;

public class SignIn_Test extends Test_Base {
	SignIn_Page signin;

	public SignIn_Test() {
		super();
	}

	@BeforeMethod

	public void setup() {
		initialization();

		signin = new SignIn_Page();
	}

	@Test(priority = 1)
	public void signinValidationTest() throws InterruptedException {
		signin.clickonsignin();
		signin.validate_signin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
