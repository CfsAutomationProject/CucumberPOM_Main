package stepdefinitions;

import com.pageActions.Amazon_PageActions;
import com.pageActions.RSA_Dropdowns_Actions;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

@Then("Capture all the hyper links in the page")
public void Capture_all_the_hyper_links_in_the_page() {
    
	DropdownsAction.Verify_all_the_links_in_webpage();
	
}

@Then("Verify ChildWindow")
public void verify_child_window() {
	DropdownsAction.Verify_windowHandles();
}

@Given("Launch W3schools wesite")
public void launch_w3schools_wesite() {
   DriverFactory.getDriver().get("https://www.w3schools.com/sql/sql_where.asp");
	
}

@Then("navigate to Table")
public void navigate_to_table() {
    
}
@Then("Capture all the data present in Table")
public void capture_all_the_data_present_in_table() {
	DropdownsAction.Table_Handling();
	
	
}

@When("user Search for product")
public void user_search_for_product() {
	DropdownsAction.user_search_for_Jeans();
	
}

@Then("Capture prices of products and sort then from lowest to higest")
public void capture_prices_of_products_and_sort_then_from_lowest_to_higest() {
	DropdownsAction.Sort_product_prices();
}






}