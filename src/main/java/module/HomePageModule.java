package module;

import framework.BaseTest;
import framework.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.HomePagePO;
import pageObject.PaymentPO;
import stepDefination.Hooks;
import utility.Assertion;
import utility.ElementIntraction;

import java.util.List;
import java.util.Map;

public class HomePageModule {

	protected BaseTest baseTest = Hooks.getBasetest();
	private HomePagePO homePagePO = new HomePagePO(DriverUtil.getDriver());
	private PaymentPO paymentPO = new PaymentPO(DriverUtil.getDriver());
	WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(),30);

	public void validateHeader(){
		baseTest.browerIntraction.isElementPresent(homePagePO.getElementHeaderLogo());
	}

	public void clickOnBuyNow(){
		homePagePO.clickBtnBuyNow();
	}

	public void proceedWithCheckout(){
		homePagePO.clickBtnCheckOut();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("snap-midtrans")));
		baseTest.browerIntraction.switchToFrameUsingId("snap-midtrans");
		paymentPO.clickBtnCheckOutContinue();
	}

	public void validateMsg(String value){
		baseTest.browerIntraction.switchToParentFrame();
		baseTest.browerIntraction.textEqual(homePagePO.getMsgWebElement(),value);
	}


	

}

