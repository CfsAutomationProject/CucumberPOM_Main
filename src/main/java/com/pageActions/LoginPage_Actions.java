package com.pageActions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertArrayEquals;

import dev.failsafe.internal.util.Assert;

public class LoginPage_Actions {

	private WebDriver driver;

	// 1. By Locators: OR
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?111");
	
	@FindBy(how=How.XPATH, using="//button[text() =' Your Sample Alert Button!']")
	public WebElement Alert_Button;
	
	//Magento site> Mouse hower action
	@FindBy(how=How.XPATH, using="//span[text()='Men']")
	public WebElement Men_Dropdown;
	
	@FindBy(how=How.XPATH, using="(//span[text()='Bottoms'])[1]")
	public WebElement Men_Subdorpdown_value;
	
	@FindBy(how=How.XPATH, using="//input[@id='myfile']")
	public WebElement upload_file_button;
	
	

	// 2. Constructor of the page class:
	public LoginPage_Actions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	
	
	public void verify_all_the_links_in_homepage() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("total links in home page are " +count);
		
		for(int i= 0; i<= count; i++) {
			System.out.println(links.get(i).getText());
			
		}
		//Intantiating action interface
		Actions action = new Actions(driver);
		action.moveToElement(Men_Dropdown).perform();
		Men_Subdorpdown_value.click();
		
		
		
	}
		
	public void Select_value_from_dropdown() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='option']"));
	Select selectObject = new Select(dropdown);
	
	selectObject.selectByValue("option 2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void Verify_page_Title() {
		
		String expectedTitle= "Try Testing This";
	String actualTitle= driver.getTitle();
	
	
	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("Title Matched");
	}
	else
		System.out.println("Title did not matched");
	}
	
	
@SuppressWarnings("deprecation")
public void Alert_Handling() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Alert_Button.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
	
public void Verify_upload_file() {
	
	WebElement browse = upload_file_button;
	
	browse.sendKeys("C:\\Users\\dheer\\Downloads\\test.pdf");
}

//hashmap
public void hashmap() {

	HashMap<String, String> data= new HashMap<>();
	
data.put("username", "password");
}
	
	

//	public String getLoginPageTitle() {
//		return driver.getTitle();
//	}
//
//	public boolean isForgotPwdLinkExist() {
//		return driver.findElement(forgotPwdLink).isDisplayed();
//	}
//
//	public void enterUserName(String username) {
//		driver.findElement(emailId).sendKeys(username);
//	}
//
//	public void enterPassword(String pwd) {
//		driver.findElement(password).sendKeys(pwd);
//	}
//
//	public void clickOnLogin() {
//		driver.findElement(signInButton).click();
//	}
//
//	public AccountsPage doLogin(String un, String pwd) {
//		System.out.println("login with: " + un + " and " + pwd);
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(signInButton).click();
//		return new AccountsPage(driver);
//	}

}
