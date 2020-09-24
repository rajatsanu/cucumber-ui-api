package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ElementIntraction;

public class PaymentPO {

	ElementIntraction elementIntraction = null ;

	public PaymentPO(WebDriver driver){
		PageFactory.initElements(driver, this);
		elementIntraction = new ElementIntraction();
	}

	@FindBy(xpath="//a[@href='#/select-payment']")
	private WebElement btnCheckOutContinue;

	@FindBy(xpath="//a[@href='#/credit-card']")
	private WebElement btnCreaditCard;

	@FindBy(name="cardnumber")
	private WebElement inputCreditCard;

	@FindBy(xpath="//input[@placeholder='MM / YY']")
	private WebElement inputExpiry;

	@FindBy(xpath="//label[text()='CVV']/..//input")
	private WebElement inputCVV;

	@FindBy(xpath="//a[@href='#/']")
	private WebElement btnPayNow;

	@FindBy(id="PaRes")
	private WebElement inputBankOtp;

	@FindBy(xpath="//button[text()='OK']")
	private WebElement btnOkClick;

	@FindBy(xpath="//div[@class='text-failed']//span")
	private WebElement labelFailureMessage;

	public void clickBtnCheckOutContinue(){
		elementIntraction.onClick(btnCheckOutContinue);
	}

	public void clickBtnCreaditCard(){
		elementIntraction.onClick(btnCreaditCard);
	}

	public void setInputCreditCard(String value){
		elementIntraction.onSendKeys(inputCreditCard,value);
	}

	public void setInputExpiry(String value){
		elementIntraction.onSendKeys(inputExpiry,value);
	}

	public void setInputCVV(String value){
		elementIntraction.onSendKeys(inputCVV,value);
	}

	public void clickbtnPayNow(){
		elementIntraction.onClick(btnPayNow);
	}

	public void setInputBankOtp(String value){
		elementIntraction.onSendKeys(inputBankOtp,value);
	}

	public void setBtnOk(){
		elementIntraction.onClick(btnOkClick);
	}

	public WebElement getLabelFailureMessage(){
		return labelFailureMessage;
	}

}

