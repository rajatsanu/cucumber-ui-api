package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.BaseTest;
import framework.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.BrowserInteraction;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.io.IOException;

public class Hooks {

	static BaseTest basetest = null ;

	@Before
	public void setup() throws Throwable {
		System.out.println("----------Before Class----------");
		basetest = new BaseTest();
	}

	public static BaseTest getBasetest(){
		return basetest;
	}

	@After
	public void end(){
		System.out.println("----------After Class----------");
		DriverUtil.getDriver().quit();
	}

	

}
