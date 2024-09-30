package AssignmentTestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class BaseClass {
	
	public  WebDriver driverInit() {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver=new ChromeDriver();
		
		return driver;
		}

}
