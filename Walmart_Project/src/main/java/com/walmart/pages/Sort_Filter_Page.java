package com.walmart.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.walmart.base.Test_Base;

	public class Sort_Filter_Page extends Test_Base{
		
		
		@FindBy(xpath="//div[contains(text(),'Best Match')]")
        WebElement sort_best_match;
		
		@FindBy(xpath="//span[contains(text(),'Newest')]")
        WebElement sort_newest;
		
		@FindBy(xpath="//label[contains(text(),'Colour')]")
		WebElement filter_colour;
		
		@FindBy(xpath="//span[contains(text(),'Black')]")
		WebElement filter_colour_black;
		
		@FindBy(xpath="//span[contains(text(),'Shop grocery')]")
		WebElement click_grocery;
		
		@FindBy(id="typeahead-search-input")
		WebElement search_grocery;
		
		@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
		WebElement search_bar;
		
		
		@FindBy(id="typeahead-search-button")
		WebElement click_banana;
		
		@FindBy(xpath="//label[contains(text(),'Customer Rating')]")
		WebElement customer_ratings;
		
		@FindBy(xpath="//span[contains(text(),'5 (51)')]")
		WebElement stars;
		
		@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/div/div[1]/div[2]/form/div/button[2]")
		WebElement searchbtn;
		
		@FindBy(xpath="//div[contains(text(),'Best Match')]")
		WebElement sort_bestmatch;
		
		@FindBy(linkText="Furniture")
		WebElement furniture;
		
		@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/a[1]/div[1]/span[1]")
		WebElement living_room;
		
		@FindBy(xpath="//label[contains(text(),'Material')]")
		WebElement filter_material;
		
		@FindBy(xpath="//span[contains(text(),'Metal')]")
		WebElement metal_click;
		
		@FindBy(xpath="//div[contains(text(),'Online Savings')]")
		WebElement online_savings;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	public Sort_Filter_Page() {
		PageFactory.initElements(driver, this);
	}
//------------------_Actions-----------------------

	
public void searchbar() throws InterruptedException {
	search_bar.sendKeys("tshirt");
	Thread.sleep(2000);
	searchbtn.click();
	Thread.sleep(2000);
	sort_best_match.click();
	Thread.sleep(2000);
	sort_newest.click();
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView();", filter_colour);
	filter_colour.click();
	Thread.sleep(2000);
	filter_colour_black.click();
	Thread.sleep(3000);
}
public void grocerylink() throws InterruptedException {
	click_grocery.click();
	Thread.sleep(2000);
	search_grocery.sendKeys("banana");
	Thread.sleep(2000);
	click_banana.click();
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();", customer_ratings);
	customer_ratings.click();
	Thread.sleep(2000);
	stars.click();
	Thread.sleep(2000);
	sort_bestmatch.click();
	Thread.sleep(2000);
	
}

public void furniturelink() throws InterruptedException {
	furniture.click();
	Thread.sleep(2000);
	living_room.click();
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();", filter_material);
	filter_material.click();
	Thread.sleep(2000);
	metal_click.click();
	online_savings.click();
	Thread.sleep(2000);
	
}



}