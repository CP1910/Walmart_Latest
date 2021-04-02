package com.walmart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.base.Test_Base;
import com.walmart.pages.Shopping_Cart;


public class Shopping_Cart_Test extends Test_Base {
	Shopping_Cart shopping_cart;
	
	public Shopping_Cart_Test() {
		
		super();// use all the properties of parent class

	}
	@BeforeMethod
	public void setup() {
		initialization();
	 shopping_cart = new Shopping_Cart();

	}
	@Test
	public void shoppingcarttest() throws InterruptedException {
	shopping_cart.toyslink();	
		
	}

	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
