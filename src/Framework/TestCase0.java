package Framework;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import config.Configuration;

public class TestCase0 {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		Signup_POM ss = new Signup_POM(driver);
		Utility11 util = new Utility11();
		
	
		ss.enterFirstName(util.readExcelData(1, 0));
		ss.enterLastName(util.readExcelData(1, 1));
		ss.enterEmail(util.readExcelData(1, 2));
		ss.enterNewPassword(util.readExcelData(1, 3));
		
		ss.selectDay(util.readExcelData(1, 4));
		ss.selectMonth(util.readExcelData(1, 5));
		ss.selectYear(util.readExcelData(1, 6));


		ss.clickOnRadio();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		//TC02
		ss.enterFirstName(util.readExcelData(2, 0));
		ss.enterLastName(util.readExcelData(2, 1));
		ss.enterEmail(util.readExcelData(2, 2));
		ss.enterNewPassword(util.readExcelData(2, 3));
		
		ss.selectDay(util.readExcelData(2, 4));
		ss.selectMonth(util.readExcelData(2, 5));
		ss.selectYear(util.readExcelData(2, 6));

		ss.clickOnRadio();
		
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		/*//TC03
		ss.enterFirstName("Dinesh");
		ss.enterLastName("Test3");
		ss.enterEmail("dinesh@gamil.com");
		ss.enterNewPassword("1111111");
		ss.clickOnRadio();
		ss.selectMonth("Nov");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		//TC04
		ss.enterFirstName(" ");
		ss.enterLastName(" ");
		ss.enterEmail(" ");
		
		ss.enterNewPassword(" ");
		ss.clickOnRadio();
		ss.selectMonth("Dec");*/		
		
	}

}

