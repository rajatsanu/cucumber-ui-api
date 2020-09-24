package utility;

import com.cucumber.listener.Reporter;
import framework.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion extends ElementIntraction{

    WebDriver driver = null ;

    public Assertion() {
        driver = DriverUtil.getDriver();
    }

    public void textEqual(WebElement element, String exp){
        Assert.assertEquals(getText(element),exp);
        Reporter.addStepLog("Element Value " + exp + " is as expected.");
    }

    public void isElementPresent(WebElement element){
        Assert.assertTrue(elementIsPresent(element));
        Reporter.addStepLog("Element is displayed.");
    }

}
