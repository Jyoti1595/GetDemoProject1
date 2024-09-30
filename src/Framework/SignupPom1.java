package Framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.Configuration;


public class SignupPom1 {
	
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			SignupPom signup = new SignupPom(driver);
			
			signup.FirstName();
			signup.LastName();
			signup.Email();
			signup.CEmail();

			signup.NewPassword();
			signup.selectDay("15");
			signup.selectMonth("Jan");
			signup.selectYear("1995");
			signup.RadioBtn();
			signup.SignupBtn();
		}

	}

