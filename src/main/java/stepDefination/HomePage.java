package stepDefination;

import java.io.IOException;

import cucumber.api.java.en.When;
import framework.BaseTest;
import framework.DriverUtil;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pageObject.HomePagePO;
import utility.BrowserInteraction;

public class HomePage {

	protected BaseTest baseTest = Hooks.getBasetest();
	private HomePagePO homePagePO = new HomePagePO(DriverUtil.getDriver());

	@Given("^Navigate to \"([^\"]*)\" website$")
	public void openBrowser(String url) throws Throwable {
		baseTest.browerIntraction.load(DriverUtil.getProperty(url));
	}

	@When("^Validate header of home page$")
	public void validate_header_of_home_page() throws Throwable {
		homePagePO.headerLogoIsPresent();
	}
	
	

}
