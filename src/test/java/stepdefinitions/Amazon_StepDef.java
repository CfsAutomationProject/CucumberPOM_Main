package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.pageActions.Amazon_PageActions;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_StepDef {

	private Amazon_PageActions amazonActions = new Amazon_PageActions(DriverFactory.getDriver());


@Given("User Log into Amazon portal")
public void user_log_into_amazon_portal() {
	DriverFactory.getDriver().get("https://www.flipkart.com/");
    
}
@When("User searches for a Product")
public void user_searches_for_a_product() {
	amazonActions.Search_Product();
}

@Then("User Captures the list of Product prices")
public void user_captures_the_list_of_product_prices() {
	amazonActions.Get_product_priceList();
}

@Then("User captures all the hyperLinks in Homepage")
public void user_captures_all_the_hyper_links_in_homepage() {
	amazonActions.get_HyperLinks_in_Homepage();	
}

@Then("User Selects the desired model of Iphone from result")
public void user_selects_the_desired_model_of_iphone_from_result() {
	amazonActions.Select_Desired_Iphone_from_Result();
}


@Given("^User navigates to \"([^\"]*)\"$")
public void user_navigates_to(String url) {
	DriverFactory.getDriver().get(url);
}

@Given("User movuse over on SignIn")
public void user_movuse_over_on_sign_in() {
	amazonActions.mouse_actions();
}







}

