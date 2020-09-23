package testClass;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.BaseTest;


@CucumberOptions(
		monochrome = true,
		features = "src/test/resources/features",
		plugin = { "pretty","html:target/site/cucumber-pretty","json:target/cucumber1.json" },
		glue = "stepDefination",
		tags={"@Regression"})
public class TC_01_Runner extends AbstractTestNGCucumberTests {


}
