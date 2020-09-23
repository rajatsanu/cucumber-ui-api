package utility;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion extends ElementIntraction{

    public void textEqual(WebElement element, String exp){
        Assert.assertEquals(getText(element),exp);
    }

}
