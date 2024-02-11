package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/New folder/CucumberPOM-main/src/test/resources/features/RSA.feature"},
	    tags="@TC5",
		glue = {"stepdefinitions", "AppHooks"},
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"timeline:test-output-thread/"	
		}
		
		)

public class MyTestRunner {

}
