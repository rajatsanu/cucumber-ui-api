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

/**
 * Description : Method of Home page
 */
public class HomePageModule {

	protected BaseTest baseTest = Hooks.getBasetest();
	private HomePagePO homePagePO = new HomePagePO(DriverUtil.getDriver());
	private PaymentPO paymentPO = new PaymentPO(DriverUtil.getDriver());
	WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(),30);

	/**
	 * Description : Validate Home page header
	 */
	public void validateHeader(){
		baseTest.browerIntraction.isElementPresent(homePagePO.getElementHeaderLogo());
	}

	/**
	 * Description : Click on BUY now button
	 */
	public void clickOnBuyNow(){
		homePagePO.clickBtnBuyNow();
	}

	/**
	 * Description : Checkout and Proceed for payment
	 */
	public void proceedWithCheckout(){
		homePagePO.clickBtnCheckOut();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("snap-midtrans")));
		baseTest.browerIntraction.switchToFrameUsingId("snap-midtrans");
		paymentPO.clickBtnCheckOutContinue();
	}

	/**
	 * Decription : Validate success message on Home page
	 * @param msg
	 */
	public void validateMsg(String msg){
		baseTest.browerIntraction.switchToParentFrame();
		baseTest.browerIntraction.textEqual(homePagePO.getMsgWebElement(),msg);
	}


	

}

