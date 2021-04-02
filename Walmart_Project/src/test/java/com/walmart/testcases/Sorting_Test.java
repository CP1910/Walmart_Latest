
	
	package com.walmart.testcases;

	import org.testng.annotations.AfterMethod;

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.walmart.base.Test_Base;
	import com.walmart.pages.Home_Page;
import com.walmart.pages.Sort_Filter_Page;
	
	public class Sorting_Test extends Test_Base {
		Sort_Filter_Page sort_filter1;
		
	public Sorting_Test() {
			
			super();// use all the properties of parent class

		}

		
		@BeforeMethod
		public void setup() {
			initialization();
			sort_filter1 = new Sort_Filter_Page();

		}
		
		@Test(priority=1)
		public void   type_searchbar() throws InterruptedException {
			sort_filter1.searchbar();
		 
		}

		
		@Test(priority=2)
		public void   grocerytest() throws InterruptedException {
			sort_filter1.grocerylink();
		 
		}
		@Test(priority=3)
		public void   furnituretest() throws InterruptedException {
			sort_filter1.furniturelink();
		 
		}
		
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
		
		

	}


