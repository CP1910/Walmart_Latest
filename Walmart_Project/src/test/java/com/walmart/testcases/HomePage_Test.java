package com.walmart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.base.Test_Base;
import com.walmart.pages.Home_Page;
public class HomePage_Test extends Test_Base {

	Home_Page homepage;

	public HomePage_Test() {
		super();// use all the properties of parent class

	}

	@BeforeMethod

	public void setup() {
		initialization();
		homepage = new Home_Page();

	}

	@Test(priority = 1)
	public void clickonimgtest() throws InterruptedException {

		homepage.clickonimage();

	}

	@Test(priority = 2)
	public void clickondepttest() throws InterruptedException {

		homepage.clickondept();
	}

	@Test(priority = 3)
	public void clickonhealthtest() throws InterruptedException {

		homepage.clickonhealthlink();
	}

	@Test(priority = 4)
	public void clickondealscentertest() throws InterruptedException {
		homepage.dealscenter();
	}

	@Test(priority = 5)

	public void clickoneasterlinktest() {
		homepage.clickoneaster();
	}

	@Test(priority = 6)

	public void clickonflyerslinktest() {
		homepage.clickonflyers();
	}

	@Test(priority = 7)
	public void clickonclothinglinktest() {
		homepage.clickonclothing();
	}

	@Test(priority =8)
	public void clickoncareerlinktest() throws InterruptedException {
		homepage.clickoncareer();
	}

	@Test(priority = 9)
	public void clickontoystest() throws InterruptedException {
		homepage.clickontoysbanner();
	}

	@Test(priority = 10)
	public void clickonreturncentertest() throws InterruptedException {
		homepage.clickonreturncenter();
	}

	@Test(priority = 11)
	public void typeonsearchbartest() throws InterruptedException {
		homepage.typeon_searchbar();
	}
	
	@Test(priority = 12)
	public void clickonpersonalcare() throws InterruptedException {
		homepage.clickonpersonalcare();
	}
	
	@Test(priority = 13)
	public void clickonjewellery() throws InterruptedException {
		homepage.clickonjewellery();
	}
	
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
