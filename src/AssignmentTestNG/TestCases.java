package AssignmentTestNG;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.Configuration;

public class TestCases {
	
	WebDriver driver;                 //Global variable
	 UtilityClass utl;
	 TestData data;
	
	@BeforeClass
	public void OpenBrowser() {
		
		BaseClass base=new BaseClass();                 //Base class object
		base.driverInit();
		
		  driver = new ChromeDriver();	    
		  
		   utl=new UtilityClass();                        //Utility class object
		   
		    data=new TestData(driver);
		       
	}

	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
	
	@BeforeMethod
	public void LoginToApp() {
	
		driver.get(Configuration.appUrl);
	}
	
	@AfterMethod
	public void RefreshPage() throws InterruptedException {
	
	driver.navigate().refresh();
	
	Thread.sleep(1000);
		
	}	

	@Test(priority=1)
	public void SignUpTC01() throws EncryptedDocumentException, IOException {
		
		data.enterFirstName(utl.readExcelData(1, 0));
		data.enterLastName(utl.readExcelData(1, 1));
		data.enterEmailID(utl.readExcelData(1, 2));
		data.enterPassword(utl.readExcelData(1, 3));
		data.selectDay(utl.readExcelData(1, 4));
		data.selectMonth(utl.readExcelData(1, 5));
		data.selectYear(utl.readExcelData(1, 6));
		data.ClickOnRadioF();
		data.ClickOnSignUp();  
		
		}
	
	@Test(priority=-1,enabled=false)
	public void SignUpTC02() throws EncryptedDocumentException, IOException {
		
		data.enterFirstName(utl.readExcelData(2, 0));
		data.enterLastName(utl.readExcelData(2, 1));
		data.enterEmailID(utl.readExcelData(2, 2));
		data.enterPassword(utl.readExcelData(2, 3));
		data.selectDay(utl.readExcelData(2, 4));
		data.selectMonth(utl.readExcelData(2, 5));
		data.selectYear(utl.readExcelData(2, 6));
		data.ClickOnRadioF();
		data.ClickOnSignUp();  
		
		}
	@Test(priority=-1)
	public void SignUpTC03() throws EncryptedDocumentException, IOException {
		
		data.enterFirstName(utl.readExcelData(3, 0));
		data.enterLastName(utl.readExcelData(3, 1));
		data.enterEmailID(utl.readExcelData(3, 2));
		data.enterPassword(utl.readExcelData(3, 3));
		data.selectDay(utl.readExcelData(3, 4));
		data.selectMonth(utl.readExcelData(3, 5));
		data.selectYear(utl.readExcelData(3, 6));
		data.ClickOnRadioF();
		data.ClickOnSignUp();  
		
		}
	@Test(priority=2)
	public void SignUpTC04() throws EncryptedDocumentException, IOException {
		
		data.enterFirstName(utl.readExcelData(4, 0));
		data.enterLastName(utl.readExcelData(4, 1));
		data.enterEmailID(utl.readExcelData(4, 2));
		data.enterPassword(utl.readExcelData(4, 3));
		data.selectDay(utl.readExcelData(4,4));
		data.selectMonth(utl.readExcelData(4, 5));
		data.selectYear(utl.readExcelData(4, 6));
		data.ClickOnRadioF();
		data.ClickOnSignUp();  
		
		}
	@Test
	public void SignUpTC05() throws EncryptedDocumentException, IOException {
		
		data.enterFirstName(utl.readExcelData(5, 0));
		data.enterLastName(utl.readExcelData(5, 1));
		data.enterEmailID(utl.readExcelData(5, 2));
		data.enterPassword(utl.readExcelData(5, 3));
		data.selectDay(utl.readExcelData(5, 4));
		data.selectMonth(utl.readExcelData(5, 5));
		data.selectYear(utl.readExcelData(5, 6));
		data.ClickOnRadioF();
		data.ClickOnSignUp();  
		

}
}