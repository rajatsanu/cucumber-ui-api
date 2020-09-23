package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	
	public void headerLogoIsPresent(){
		elementIntraction.elementIsPresent(headerLogo);
	}
	

}

