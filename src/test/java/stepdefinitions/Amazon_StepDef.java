package stepdefinitions;

import com.pageActions.Amazon_PageActions;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_StepDef {

	private Amazon_PageActions amazonActions = new Amazon_PageActions(DriverFactory.getDriver());


@Given("User Log into Amazon portal")
public void user_log_into_amazon_portal() {
	DriverFactory.getDriver().get("https://www.amazon.in/");
    
}

@When("User searches for a Peoduct")
public void user_searches_for_a_peoduct() {
	amazonActions.Search_Product();
}

@Then("User Captures the list of Product prices")
public void user_captures_the_list_of_product_prices() {
	amazonActions.Get_product_priceList();
}
}

