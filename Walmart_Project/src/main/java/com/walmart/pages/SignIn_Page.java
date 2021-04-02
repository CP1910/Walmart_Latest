package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.base.Test_Base;

public class SignIn_Page extends Test_Base {

	@FindBy(xpath = "//span[contains(text(),'My account')]")
	WebElement my_account;

	@FindBy(id = "username")
	WebElement usr_name;

	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement signin_btn;

	// ---------------------------- Actions ------------------------//

	public SignIn_Page() {
		PageFactory.initElements(driver, this);
	}

	// --------//

	public void clickonsignin() {
		my_account.click();
		System.out.println("Clicked on my account link:" + driver.getTitle());
	}

	public Home_Page validate_signin(String u_name, String pass) throws InterruptedException {
		usr_name.sendKeys(u_name);
		pswd.sendKeys(pass);
		signin_btn.click();
		Thread.sleep(2000);
		System.out.println("Moving from sign to Homepage:" + driver.getTitle());

		return new Home_Page();
	}

}
