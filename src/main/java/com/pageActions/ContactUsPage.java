package com.pageActions;

import java.awt.Desktop.Action;
import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {
	
	private WebDriver driver;

	private By subjectHeading = By.id("id_contact");
	private By email = By.id("email");
	private By orderRef = By.id("id_order");
	private By messageText = By.id("message");
	private By sendButton = By.id("submitMessage");
	private By successMessg = By.cssSelector("div#center_column p");

	@FindBy(how=How.XPATH, using="//span[text()='Men']")
	public WebElement Men_Dropdown;
	
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}

	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	
	public void fillContactUsForm(String heading, String emailId, String orderReference, String message) {
		Select select = new Select(driver.findElement(subjectHeading));
		select.selectByVisibleText(heading);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(orderRef).sendKeys(orderReference);
		driver.findElement(messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}
	
	public String getSuccessMessg() {
		return driver.findElement(successMessg).getText();
	}
	
	
	
	
	// to capture all the links in a page
	public void Get_all_links() {
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = links.size();
		
		System.out.println("count is" +count);
		
		for(int i=0; i<=count; i++) {
			System.out.println(links.get(i).getText());
			
		}
		
	}
	
	// handling dropdowns
	public void handling_dropdowns() {
	WebElement dropdown =  driver.findElement(By.xpath("//select[@id='option']"));
	
	Select selectObject = new Select(dropdown);
	
	selectObject.selectByIndex(1);
	
	}
	
	//mouse hover actions
	
	public void mouse_hover_action(){
		
		Actions action = new Actions(driver);
		action.moveToElement(Men_Dropdown).perform();
		
	}
	
	//Handeling Alerts
	public void handeling_alerts() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	//Explicit wait
	public void dynamic_wait() {
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//WebElement elementclick = wait.until(ExpectedConditions.elementToBeClickable(email));
	}
	
	
	
	
}
