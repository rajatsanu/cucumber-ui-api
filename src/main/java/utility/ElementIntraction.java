package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementIntraction{

    public void onClick(WebElement element){
        element.click();
    }

    public void elementIsPresent(WebElement element){
        element.isDisplayed();
    }

    public void onSendKeys(WebElement element, String value){
        element.sendKeys(value);
    }

    public String getText(WebElement element){
        return element.getText();
    }

}
