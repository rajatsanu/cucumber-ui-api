package module;

import framework.BaseTest;
import framework.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.HomePagePO;
import pageObject.PaymentPO;
import stepDefination.Hooks;

import java.util.List;
import java.util.Map;

public class PaymentModule {

	protected BaseTest baseTest = Hooks.getBasetest();
	private PaymentPO paymentPO = new PaymentPO(DriverUtil.getDriver());
	WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(),30);

	public void paymentMethod(List<Map<String, String>> list) throws InterruptedException {
		paymentPO.clickBtnCreaditCard();
		paymentPO.setInputCreditCard(list.get(0).get("Card Number"));
		paymentPO.setInputExpiry(list.get(0).get("Expiry Date"));
		paymentPO.setInputCVV(list.get(0).get("CVV Number"));
		paymentPO.clickbtnPayNow();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@src,'https://api.sandbox.veritrans.co.id/v2/token/rba/redirect/')]")));
		baseTest.browerIntraction.switchToFrameUsingCount(0);
		paymentPO.setInputBankOtp(list.get(0).get("Bank’s OTP"));
		paymentPO.setBtnOk();
	}

	public void validateMsg(String value){
		baseTest.browerIntraction.switchToParentFrame();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("snap-midtrans")));
		baseTest.browerIntraction.switchToFrameUsingId("snap-midtrans");
		baseTest.browerIntraction.textEqual(paymentPO.getLabelFailureMessage(),value);
	}
	

}

