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
	WebDriverWait wait = null ;

	public PaymentPO(WebDriver driver){
		PageFactory.initElements(driver, this);
		elementIntraction = new ElementIntraction();
		wait = new WebDriverWait(driver,30);
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
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckOutContinue));
		elementIntraction.onClick(btnCheckOutContinue);
	}

	public void clickBtnCreaditCard(){
		wait.until(ExpectedConditions.elementToBeClickable(btnCreaditCard));
		elementIntraction.onClick(btnCreaditCard);
	}

	public void setInputCreditCard(String value){
		wait.until(ExpectedConditions.elementToBeClickable(inputCreditCard));
		elementIntraction.onSendKeys(inputCreditCard,value);
	}

	public void setInputExpiry(String value){
		wait.until(ExpectedConditions.elementToBeClickable(inputExpiry));
		elementIntraction.onSendKeys(inputExpiry,value);
	}

	public void setInputCVV(String value){
		wait.until(ExpectedConditions.elementToBeClickable(inputCVV));
		elementIntraction.onSendKeys(inputCVV,value);
	}

	public void clickbtnPayNow(){
		wait.until(ExpectedConditions.elementToBeClickable(inputCVV));
		elementIntraction.onClick(btnPayNow);
	}

	public void setInputBankOtp(String value){
		wait.until(ExpectedConditions.elementToBeClickable(inputBankOtp));
		elementIntraction.onSendKeys(inputBankOtp,value);
	}

	public void setBtnOk(){
		wait.until(ExpectedConditions.elementToBeClickable(btnOkClick));
		elementIntraction.onClick(btnOkClick);
	}

	public WebElement getLabelFailureMessage(){
		return labelFailureMessage;
	}

}

