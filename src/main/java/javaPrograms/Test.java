package javaPrograms;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public WebDriver driver;
	
	public Test(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	
	
	public void array() {
	ArrayList<String> AL= new ArrayList<String>() ;
	
	
	AL.add("Dheeraj");
	AL.add("Vinay");	
	
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(1));
	//WebElement element = wait.until(ExpectedConditions.elementToBeSelected(""));
	
}


public static void main(String[] args) {
	
	
	
}	
}
