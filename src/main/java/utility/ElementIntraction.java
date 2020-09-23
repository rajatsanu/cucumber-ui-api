package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementIntraction extends Assertion{

    public void onClick(WebElement element){
        element.click();
    }

    public void onSendKeys(WebElement element, String value){
        element.sendKeys(value);
    }

    public String getText(WebElement element){
        return element.getText();
    }

}
