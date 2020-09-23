package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {

	String configFile = System.getProperty("user.dir")
			+ "/src/main/resources/config.properties";
	static Properties pro ;
	static WebDriver driver ;

	public DriverUtil() throws IOException {
		try {
			FileInputStream file = new FileInputStream(configFile);
			pro = new Properties();
			pro.load(file);
			if(pro.getProperty("browser").equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", pro.getProperty("pathOfGeckoDriver"));
				driver = new FirefoxDriver();
			}else if(pro.getProperty("browser").equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", pro.getProperty("pathOfIEDriver"));
				driver = new InternetExplorerDriver();
			}else {
				System.setProperty("webdriver.chrome.driver", pro.getProperty("pathOfChromeDriver"));
				driver = new ChromeDriver();
			}
		}catch(Exception e){
				e.printStackTrace();
				throw e;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}

	public static String getProperty(String property){
		return pro.getProperty(property);
	}

	public static WebDriver getDriver(){
		return driver;
	}


}
