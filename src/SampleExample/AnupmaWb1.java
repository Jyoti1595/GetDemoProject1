package SampleExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class AnupmaWb1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.anupamshaadi.com/home/planregistration");
		driver.manage().window().maximize();
		
		AnupmaWb a = new AnupmaWb(driver);
		
		//TC01
		a.enterFN("Q");
		a.enterMN("A");
		a.enterLN("Tester");
		
		a.enterEmail("test@gamil.com");
		a.enterPass("12345");
		a.OnClickRadio();
		a.enterDate("05-03-2004");
		a.enterMobile("9876564500");
		a.OnClickCheck();
		
		Thread.sleep(3000);
		//driver.navigate().refresh();

}
}

