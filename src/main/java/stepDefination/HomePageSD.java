package stepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.BaseTest;
import framework.DriverUtil;
import module.HomePageModule;
import module.PaymentModule;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pageObject.HomePagePO;
import utility.BrowserInteraction;

public class HomePageSD {

	protected BaseTest baseTest = Hooks.getBasetest();
	private HomePageModule homePageModule = new HomePageModule();
	private PaymentModule paymentModule = new PaymentModule();

	@Given("^Navigate to \"([^\"]*)\" website$")
	public void openBrowser(String url) throws Throwable {
		baseTest.browerIntraction.load(DriverUtil.getProperty(url));
	}

	@When("^Validate header of home page$")
	public void validate_header_of_home_page() throws Throwable {
		homePageModule.validateHeader();
	}

	@When("^Click on Buy Now button$")
	public void click_on_Buy_Now_button() throws Throwable {
		homePageModule.clickOnBuyNow();
	}

	@When("^Click on Checkout and proceed with continue$")
	public void click_on_Checkout_and_proceed_with_continue() throws Throwable {
		homePageModule.proceedWithCheckout();
	}

	@When("^Select Credit card and enter details$")
	public void select_Credit_card_and_enter_details(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		paymentModule.paymentMethod(list);
	}

	@Then("^Validate \"([^\"]*)\" message in Home Page$")
	public void validate_success_message_homePage(String value) {
		if(value.equalsIgnoreCase("success")){
			homePageModule.validateMsg("Thank you for your purchase.");
		}else if(value.equalsIgnoreCase("failure")){
			paymentModule.validateMsg("Your card got declined by the bank");
		}
	}



}
