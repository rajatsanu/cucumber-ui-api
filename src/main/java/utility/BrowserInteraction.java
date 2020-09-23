package utility;

import framework.DriverUtil;
import org.openqa.selenium.WebDriver;

public class BrowserInteraction extends Assertion {

	WebDriver driver = null ;

	public BrowserInteraction() {
		driver = DriverUtil.getDriver();
	}

	public void load(String url){
		driver.get(url);
	}

	public void switchToFrameUsingId(String frameId){
		driver.switchTo().frame(frameId);
	}

	public void switchToFrameUsingCount(int frameCount) throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame(frameCount);
	}

	public void switchToParentFrame(){
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
}
