package utility;

import framework.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementIntraction extends Utility{

    WebDriver driver = null ;
    WebDriverWait wait = null ;

    public ElementIntraction() {
        driver = DriverUtil.getDriver();
        wait = new WebDriverWait(driver,30);
    }

    public void onClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public boolean elementIsPresent(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public void onSendKeys(WebElement element, String value){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);
    }

    public String getText(WebElement element){
        return element.getText();
    }

}
