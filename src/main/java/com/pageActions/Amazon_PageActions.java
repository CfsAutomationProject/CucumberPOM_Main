package com.pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PageActions {
	
	private WebDriver driver;

	// 1. By Locators: OR
	@FindBy(how=How.XPATH, using="//button[text() =' Your Sample Alert Button!']")
	public WebElement Alert_Button;
	
	@FindBy(how = How.XPATH, using="//input[@id='twotabsearchtextbox']")
	public WebElement Amazon_SearchBox;
	
	@FindBy(how = How.XPATH, using="//input[@type='submit']")
	public WebElement Submit;
	
	@FindBy(how = How.XPATH, using="//span[@class='a-price-whole']")
	public WebElement Prices_List;
	
	

	// 2. Constructor of the page class:
	public Amazon_PageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	
public void Search_Product() {
	Amazon_SearchBox.sendKeys("Iphone");
	Submit.click();
	
	
}

public void Get_product_priceList() {
	List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println("price list is " +priceList.size());
}
}
