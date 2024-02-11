package stepdefinitions;

import com.pageActions.Amazon_PageActions;
import com.pageActions.RSA_Dropdowns_Actions;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RSA_Dropdowns_StepDef {

	private RSA_Dropdowns_Actions DropdownsAction = new RSA_Dropdowns_Actions(DriverFactory.getDriver());


@Given("Logs into the RSA portal")
public void logs_into_the_RSA_portal() {
	DriverFactory.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
}

@Then("Verify Static Dropdown")
public void verify_static_dropdown() throws InterruptedException {
	DropdownsAction.Verify_Static_Dropdown();
	
}

@Then("user selects three Adults Passengers")
public void user_selects_three_adults_passengers() throws InterruptedException {
	DropdownsAction.Select_Passengers();
}
@Then("Verify Green Cart Website")
public void verify_green_cart_website() {
	DropdownsAction.GreenCart_Website();

}
@Given("Launch RSA Practice URL")
public void launch_rsa_practice_url() {
	DriverFactory.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
   
}

@Then("Verify Window Handles")
public void verify_window_handles() {
	DropdownsAction.Window_Handle();

}
@Given("User Launches Flipkart URL")
public void user_launches_flipkart_url() {
   
	DriverFactory.getDriver().get("https://www.flipkart.com/");
	
}

@Then("Verify products name and price")
public void verify_products_name_and_price() {
	DropdownsAction.Flipkart_Product_Price(); 
}


}