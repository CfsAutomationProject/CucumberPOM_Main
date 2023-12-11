package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.pageActions.LoginPage_Actions;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private LoginPage_Actions loginPage = new LoginPage_Actions(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
	}
	
	@Then("user captures all the link in Homepage")
	public void user_captures_all_the_link_in_Homepage() {
	
		//loginPage.verify_all_the_links_in_homepage();
		
	}
	
		@Given("user login to TryTestingThis")
		public void user_login_to_try_testing_this() {
		    DriverFactory.getDriver().get("https://trytestingthis.netlify.app/");
		    loginPage.Verify_page_Title();
		    
		}

		@Then("user selects the dropdown value")
		public void user_selects_the_dropdown_value() {
			//loginPage.Select_value_from_dropdown();
			loginPage.Verify_upload_file();
			
		}
		@Then("verify alert popup")
		public void verify_alert_popup() {
			
			loginPage.Alert_Handling();
		}


	
	
	
	
	
	

//	@When("user gets the title of the page")
//	public void user_gets_the_title_of_the_page() {
//		title = loginPage.getLoginPageTitle();
//		System.out.println("Page title is: " + title);
//	}
//
//	@Then("page title should be {string}")
//	public void page_title_should_be(String expectedTitleName) {
//		Assert.assertTrue(title.contains(expectedTitleName));
//	}
//
//	@Then("forgot your password link should be displayed")
//	public void forgot_your_password_link_should_be_displayed() {
//		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
//	}
//
//	@When("user enters username {string}")
//	public void user_enters_username(String username) {
//		loginPage.enterUserName(username);
//	}
//
//	@When("user enters password {string}")
//	public void user_enters_password(String password) {
//		loginPage.enterPassword(password);
//	}
//
//	@When("user clicks on Login button")
//	public void user_clicks_on_login_button() {
//		loginPage.clickOnLogin();
//	}


}
