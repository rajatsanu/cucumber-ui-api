package testClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.BaseTest;
import framework.DriverUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import stepDefination.Hooks;

import java.io.File;
import java.text.DateFormat;


@CucumberOptions(
		monochrome = true,
		features = "src/test/resources/features",
		plugin = { "pretty","html:target/site/cucumber-pretty","json:target/cucumber1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		glue = "stepDefination",
		tags={"@Regression1"})
public class TC_01_Runner extends AbstractTestNGCucumberTests {
	private static DateFormat FileReaderManager;
	@AfterClass
	public static void writeExtentReport() {
		String reportConfigPath = System.getProperty("user.dir") + DriverUtil.getProperty("reportPath");
		Reporter.loadXMLConfig(new File(reportConfigPath));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}
