package utility;

import framework.DriverUtil;
import org.openqa.selenium.WebDriver;

public class BrowserInteraction {

	WebDriver driver = null ;

	public BrowserInteraction() {
		driver = DriverUtil.getDriver();
	}

	public void load(String url){
		driver.get(url);
	}
	
	
	
	
	
	
}
