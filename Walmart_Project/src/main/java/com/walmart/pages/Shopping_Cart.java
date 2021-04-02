package com.walmart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.base.Test_Base;

public class Shopping_Cart extends Test_Base{
	
	@FindBy(linkText = "Toys")
	WebElement toyslink;
	@FindBy(xpath="//span[contains(text(),'Action Figures')]")
	WebElement actionfigures;
	@FindBy(xpath="//p[contains(text(),'Marvel Spider-Man Titan Hero Series Spider-Man wit')]")
	WebElement spiderman;
	@FindBy(xpath="//button[contains(text(),'+')]")
	WebElement quantity;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement cart;
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
	WebElement contshopping;
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[1]/*[1]")
	WebElement shop_cart;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	


public Shopping_Cart() {
	PageFactory.initElements(driver, this);
	
	//-----------------------Actions-----------------
}

public void toyslink() throws InterruptedException {
   toyslink.click();
   System.out.println("Clicked on Toys"+ driver.getTitle());
   js.executeScript("arguments[0].scrollIntoView();",actionfigures);
   actionfigures.click();
   spiderman.click();
   Thread.sleep(2000);
   js.executeScript("arguments[0].scrollIntoView();",quantity);
   quantity.click();
   Thread.sleep(2000);
   cart.click();
   Thread.sleep(2000);
   contshopping.click();
   shop_cart.click();
   Thread.sleep(2000);
   
}

}