package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"src/test/resources/features/Bhaane.feature"},
		glue="stepDefination",
		monochrome = true,
		plugin= {"pretty","summary","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//tags ="@Sign_up or @Tops_Functionality"

		
		
		)


public class TestRunner {

}
