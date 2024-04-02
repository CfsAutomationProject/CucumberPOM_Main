package com.pageActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RSA_Dropdowns_Actions {

	public WebDriver driver;
	
	//1. Locators
	@FindBy(how=How.XPATH, using="//select[@id='ctl00_mainContent_DropDownListCurrency']")
	public WebElement Dropdown_Field;
	
	@FindBy(how=How.XPATH, using="//div[@id='divpaxinfo']")
	public WebElement Passengers_Dropdown;

	@FindBy(how=How.XPATH, using="(//span[text()='+'])[1]")
	public WebElement Adult_PlusButton;
	
	@FindBy(how=How.XPATH, using="//input[@value='Done']")
	public WebElement Done_Button;
	
	@FindBy(how=How.XPATH, using="//button[text()='ADD TO CART']")
	public WebElement AddToCart;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Cart']")
	public WebElement Cart;
	
	@FindBy(how=How.XPATH, using="//div[@class='product-info'][1]")
	public WebElement AddToCart_Product;
	
	@FindBy(how=How.XPATH, using="//button[text()='Open Window']")
	public WebElement OpenWindow;
	
	@FindBy(how=How.XPATH, using="//input[@name='q']")
	public WebElement Flipkart_Search;
	
	@FindBy(how=How.XPATH, using="//div[@class='_3pLy-c row']")
	public WebElement Product_Result;
	
	@FindBy(how=How.XPATH, using="(//span[text()='info@qaclickacademy.com'])[2]")
	public WebElement ChildWindow_Text;
	
	@FindBy(how=How.XPATH, using="(//input[@name='radioButton'])[1]")
	public WebElement RadioButton;
	
	@FindBy(how=How.XPATH, using="//table[@class='ws-table-all notranslate']//tr[2]")
	public WebElement Rows;
	
	@FindBy(how=How.XPATH, using="//table[@class='ws-table-all notranslate']//tr[2]/td")
	public WebElement Colum;
	
	
	
	
	// 2. Constructor of the page class:
		public RSA_Dropdowns_Actions(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements( driver, this);
		}
		
		
		public void Verify_Static_Dropdown() throws InterruptedException {
			
			Thread.sleep(10000);
			Select dropdown = new Select(Dropdown_Field);
			dropdown.selectByValue("AED");
			Thread.sleep(10000);
			 System.out.println(dropdown.getFirstSelectedOption().getText());
		}
		
		public void Select_Passengers() throws InterruptedException {
			
			Passengers_Dropdown.click();
			
			
			for(int i=1; i<4; i++) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Adult_PlusButton));
	            element.click();
			}
			Done_Button.click();
		}
		
		public void GreenCart_Website() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h4[@class='product-name']"))));
			
			List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for(int i=0; i<products.size(); i++) {
				
				String name= products.get(i).getText();
				
				if(name.contains("Beetroot")) {
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					break;
				}		
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			Cart.click();	
			String CartProduct = AddToCart_Product.getText().trim();
			System.out.println(CartProduct);
		}
		
		public void Window_Handle() {
			
			OpenWindow.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Set<String> windowHandles= driver.getWindowHandles();
			for(String WindowHandle : windowHandles) {
				driver.switchTo().window(WindowHandle);
		 
			}
		}
		
		public void Flipkart_Product_Price() {
			
			Flipkart_Search.sendKeys("iphone");
			Flipkart_Search.submit();
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(1));
			//wait.until(ExpectedConditions.elementToBeSelected(Product_Result));
			
			List<WebElement> products= driver.findElements(By.xpath("//div[@class='col col-7-12']"));	

			for(int i=0;i<products.size(); i++) {
				String Names= products.get(i).getText();
				
				if(Names.contains("Apple iPhone 15 Plus (Black, 128 GB)")) {
					String price= driver.findElements(By.xpath("//div[@class='_25b18c']")).get(i).getText();
					//Collections.sort(price);
					System.out.println(price);
					break;	
					
					
				
				}
				}			
	
			}
		
		
		public void Verify_all_the_links_in_webpage() {
			
			Flipkart_Search.sendKeys("track pants");
			Flipkart_Search.submit();
			
			List<WebElement> Hyperlinks = driver.findElements(By.tagName("a"));
			
			for(WebElement Links: Hyperlinks) {
				
				String href = Links.getAttribute("href");
	            
	                System.out.println("Text: " + Links.getText() + ", URL: " + href);
				
//				String AllLinks = Links.getText();
//				System.out.println(AllLinks);	
			}
			
			//System.out.println("Links size is = " + Hyperlinks.size());
		}
		
		public void Verify_windowHandles() {
			
			OpenWindow.click();
			
			Set<String> WindowID = driver.getWindowHandles();
			
			System.out.println(WindowID);
			
			for(String Windowhandle : WindowID) {
				driver.switchTo().window(Windowhandle);	
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String ChildWindowText= ChildWindow_Text.getText();
			System.out.println(ChildWindowText);
			
			driver.switchTo().defaultContent();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RadioButton.click();
			
		}
		
		public void Table_Handling() {
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		    int rows= driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr[2]")).size();
		    System.out.println("Total number of rows" + rows);
		    
			
			int column = driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr[2]/td")).size();
			 System.out.println("Total number of Column" + column);
			 
			 String value= driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tr[2]")).getText();
			System.out.println("this value is" + value);
			
			for(int r=1; r<=rows; r++) {
				
				for(int c=1; c<=column; c++) {
					
					String data = driver.findElement(By.xpath("table[@class='ws-table-all notranslate']//tr["+r+"]/td["+c+"]")).getText();
					System.out.print("The value is" + data);
					
					
				}
				System.out.println();	
			}	
			
		}
		
	public void user_search_for_Jeans() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Flipkart_Search.sendKeys("jeans");
		Flipkart_Search.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Assert.assertTrue(Flipkart_Search.getText(), false);
		
		}
			public void Sort_product_prices() {
				List<WebElement> products= driver.findElements(By.xpath("//div[@class='_30jeq3']"));
				ArrayList<String> A = new ArrayList<String>();
				for ( int i=0; i<products.size();i++) {
					String Names = products.get(i).getText().replaceAll("[^a-zA-Z0-9]", "");
					System.out.println(Names);
					A.add(Names);	
					
					if(A.contains("349")) {
						products.get(i).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						break;
						
							
						
					}
	}
		
		
		}
			
			
			
}


