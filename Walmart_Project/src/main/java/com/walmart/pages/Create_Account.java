package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.base.Test_Base;

public class Create_Account extends Test_Base {

	@FindBy(xpath = "//span[contains(text(),'My account')]")
	WebElement Sign_In;

	@FindBy(linkText = "Create account")
	WebElement Create_account;

	@FindBy(id = "firstName")
	WebElement First_name;

	@FindBy(id = "lastName")
	WebElement Last_name;

	@FindBy(id = "email")
	WebElement w_email;

	@FindBy(id = "password")
	WebElement w_password;

	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/div[1]/label[1]")
	WebElement w_termsandconditions;

	@FindBy(xpath = "//button[contains(text(),'Create account')]")
	WebElement ca_btn;

	// -------------------------------Actions---------------------------
	public Create_Account() {
		PageFactory.initElements(driver, this);
	}

	public void signin() throws InterruptedException {
		Sign_In.click();
		System.out.println("Clicked on My account/Sign_In link :" + driver.getTitle());
		Thread.sleep(2000);

	}

	public void createaccountlink() {
		Create_account.click();
		System.out.println("clicked on create account link :" + driver.getTitle());
	}

	public void firstname(String name, String lastname, String email, String password) throws InterruptedException {
		First_name.sendKeys(name);
		Thread.sleep(2000);
		Last_name.sendKeys(lastname);
		Thread.sleep(2000);
		w_email.sendKeys(email);
		Thread.sleep(2000);
		w_password.sendKeys(password);
		Thread.sleep(2000);
		w_termsandconditions.click();
		Thread.sleep(2000);
		ca_btn.click();

	}

}
