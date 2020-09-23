package stepDefination;

import apiModule.APIModule;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.BaseTest;
import framework.DriverUtil;
import module.HomePageModule;
import module.PaymentModule;

import java.util.List;
import java.util.Map;

public class API_SD {

	protected BaseTest baseTest = Hooks.getBasetest();
	APIModule apiModule = new APIModule();

	@Given("^Read File \"([^\"]*)\"$")
	public void read_File(String file) throws Throwable {
		apiModule.readFile(file);
	}

	@Then("^Compare Response from both file API$")
	public void compare_file_response() throws Throwable {
		apiModule.compareResponse();
	}


}
