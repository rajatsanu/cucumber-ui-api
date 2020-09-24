package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Assertion;
import utility.ElementIntraction;

public class HomePagePO {

	ElementIntraction elementIntraction = null ;

	public HomePagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		elementIntraction = new ElementIntraction();
	}

	@FindBy(xpath="//a[text()='Coco']")
	private WebElement headerLogo;

	@FindBy(xpath="//a[contains(text(),'BUY NOW')]")
	private WebElement btnBuyNow;

	@FindBy(xpath="//div[contains(text(),'CHECKOUT')]")
	private WebElement btnCheckOut;

	@FindBy(xpath="//div[@class='notification-wrapper']//span")
	private WebElement textMsg;

	public WebElement getElementHeaderLogo(){
		return headerLogo;
	}

	public void clickBtnBuyNow(){
		elementIntraction.onClick(btnBuyNow);
	}

	public void clickBtnCheckOut() {
		elementIntraction.onClick(btnCheckOut);
	}

	public String getPurchaseMessage(){
		return elementIntraction.getText(textMsg);
	}

	public WebElement getMsgWebElement(){
		return textMsg;
	}


}

