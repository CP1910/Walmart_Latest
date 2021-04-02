package com.walmart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.walmart.util.Test_Util;




public class Test_Base {
	
	
	public  static WebDriver driver;
	public  static  Properties prop;
	
	public Test_Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"/Users/BlacK_BearD/eclipse-workspace/Walmart_Project/src/main/java/com/walmart/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/BlacK_BearD/eclipse-workspace/Walmart_Project/drivers/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Walmart_Project/drivers/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}



}

