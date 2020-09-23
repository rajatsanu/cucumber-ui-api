package testClass;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.BaseTest;
import org.testng.annotations.BeforeClass;


@CucumberOptions(
		monochrome = true,
		features = "src/test/resources/features",
		plugin = { "pretty","html:target/site/cucumber-pretty","json:target/cucumber1.json" },
		glue = "stepDefination",
		tags={"@Regression1"})
public class TC_01_Runner extends AbstractTestNGCucumberTests {
}
