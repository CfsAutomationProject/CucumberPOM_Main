package com.pageActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import javaCollections.ArrayList;

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
	
	@FindBy(how = How.XPATH, using="a")
	public WebElement AllHyperLinks;
	
	@FindBy(how = How.XPATH, using="//button[text()='Add to cart']")
	public WebElement Add_to_cart;
	
	@FindBy(how = How.XPATH, using="//div[@aria-label='Fashion']")
	public WebElement Flipkart_fashion_hoverover;
	
	

	// 2. Constructor of the page class:
	public Amazon_PageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	
@SuppressWarnings("deprecation")
public void Search_Product() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Amazon_SearchBox.sendKeys("Iphone 14");
	Submit.click();
	
	
}

public void Get_product_priceList() {
	List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println("price list is " +priceList.size());
}

public void get_HyperLinks_in_Homepage() {
	
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	
	
	
	for(WebElement Links : allLinks){
		
		System.out.println(Links.getText());
		System.out.println(Links.getAttribute("href"));
		
	}
}
public void Select_Desired_Iphone_from_Result() {
	
	List<WebElement> products= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	for(int i=0;i<products.size();i++) {
		
		String product_name= products.get(i).getText();
	
	if(product_name.contains("iPhone 14 (512 GB) - Blue")){
		driver.findElements(By.xpath("Add_to_cart")).get(i).click();
		break;
	}
	}
}

@SuppressWarnings("deprecation")
public void mouse_actions() {
	Actions a = new Actions(driver);
   a.moveToElement(Flipkart_fashion_hoverover).build().perform();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   

}
}
