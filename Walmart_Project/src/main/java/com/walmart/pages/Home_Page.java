package com.walmart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.base.Test_Base;

public class Home_Page extends Test_Base {

	@FindBy(linkText = "Health")
	WebElement healthlink;

	@FindBy(xpath = "//div[contains(text(),'Departments')]")
	WebElement dept;

	@FindBy(xpath = "//img[contains(@class,'css-lu5rme e16kzl6s3')]")
	WebElement patio;

	@FindBy(xpath = "//span[contains(text(),'Tuscany')]")
	WebElement tuscany;

	@FindBy(xpath = "//*[@id='walmartblue_Layer_1']")
	WebElement clickon_walmart_logo;

	@FindBy(xpath = "//span[contains(text(),'Appliances')]")
	WebElement deals_appliances;

	@FindBy(linkText = "Easter")
	WebElement easter;

	@FindBy(linkText = "Clothing")
	WebElement clothing;

	@FindBy(xpath = "//span[contains(text(),'Flyers')]")
	WebElement flyers;

	@FindBy(xpath = "//span[contains(text(),'Toys')]")
	WebElement toys;

	@FindBy(linkText = "Careers")
	WebElement career;

	@FindBy(linkText = "Return Centre")
	WebElement return_center;
	
	@FindBy(xpath="//span[contains(text(),'Personal care')]")
	WebElement personalcare;
	
	@FindBy(xpath="//span[contains(text(),'Jewellery & watches')]")
	WebElement jewellery;

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[10]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]")
	WebElement deals_center;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/div/div[1]/div[2]/form/div/input")
	WebElement search_bar;
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}
//---------------Actions--------------

	public void clickonhealthlink() {
		healthlink.click();
		System.out.println("clicked on healthlink " + driver.getTitle());
	}

	public void clickondept() throws InterruptedException {

		actions.moveToElement(dept).build().perform();
		Thread.sleep(3000);
		dept.click();

		System.out.println("clicked on department " + driver.getTitle());

	}

	public void clickoneaster() {
		easter.click();
		System.out.println("clicked on easter " + driver.getTitle());

	}

	public void clickonclothing() {
		clothing.click();
		System.out.println("clicked on clothing link " + driver.getTitle());

	}

	public void clickonflyers() {
		flyers.click();
		System.out.println("clicked on Flyers link " + driver.getTitle());
	}

	public void clickontoysbanner() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", toys);
		toys.click();
		Thread.sleep(2000);
		System.out.println("clicked on Toys link " + driver.getTitle());
	}

	public void clickoncareer() throws InterruptedException {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		career.click();
		Thread.sleep(2000);
		System.out.println("clicked on  Career link " + driver.getTitle());
	}

	public void clickonreturncenter() throws InterruptedException {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		return_center.click();
		Thread.sleep(2000);
		System.out.println("clicked on return center " + driver.getTitle());
	}

	public void clickonimage() throws InterruptedException {
		clickon_walmart_logo.click();
		js.executeScript("window.scrollBy(0,600)");
		patio.click();
		System.out.println("Clicked on patio" + driver.getTitle());
		tuscany.click();
		System.out.println("Clicked on patio tuscany collection:-" + driver.getTitle());

	}

	public void dealscenter() throws InterruptedException {
		js.executeScript("window.scrollBy(0,800)");
		deals_center.click();
		System.out.println("Clicked on deals center:" + driver.getTitle());
		deals_appliances.click();
		Thread.sleep(2000);
		System.out.println("Clicked on deals center appliances:" + driver.getTitle());

	}

	public void typeon_searchbar() throws InterruptedException {
		search_bar.sendKeys("Iphone");
		Thread.sleep(3000);
	}
	
	public void clickonpersonalcare() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();",personalcare);
		personalcare.click();
		System.out.println("Clicked on personal care:" + driver.getTitle());
		Thread.sleep(2000);
	}

	public void clickonjewellery() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();",jewellery);
		 jewellery.click();
		System.out.println("Clicked on Jewellery & Wathches" + driver.getTitle());
		Thread.sleep(2000);
	}

	
}
