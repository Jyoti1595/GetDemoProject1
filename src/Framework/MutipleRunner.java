package Framework;

	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.Configuration;

	public class MutipleRunner {

		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			MultipleTextCase ss = new MultipleTextCase(driver);
			
			//TC01
			ss.enterFirstName("Tester1");
			ss.enterLastName("Test");
			ss.enterEmail("test@gamil.com");
			ss.enterNewPassword("12345");
			ss.clickOnRadio();
			ss.selectDay("12");
			ss.selectMonth("Feb");
			ss.selectYear("1995");
		
			
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			
			//TC02
			ss.enterFirstName("Ramesh");
			ss.enterLastName("Test2");
			ss.enterEmail("ramesh@gamil.com");
			ss.enterNewPassword("456789");
			ss.clickOnRadio();
			ss.selectDay("17");
			ss.selectMonth("Mar");
			ss.selectYear("1995");
			
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			//TC03
			ss.enterFirstName("Dinesh");
			ss.enterLastName("Test3");
			ss.enterEmail("dinesh@gamil.com");
			ss.enterNewPassword("1111111");
			ss.clickOnRadio();
			ss.selectDay("15");
			ss.selectMonth("Nov");
			ss.selectYear("1995");
			
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			
			//TC04
			ss.enterFirstName("Netra");
			ss.enterLastName("Dabade");
			ss.enterEmail("dabadeNetra@gamil.com");
			ss.enterNewPassword("12345678");
			ss.clickOnRadio1();
			ss.selectDay("15");
			ss.selectYear("1995");
			ss.selectMonth("Jan");	
		}

	}

