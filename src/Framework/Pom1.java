package Framework;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import config.Configuration;

	public class Pom1 {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			Pom p1= new Pom(driver);
			
			p1.userName();
			Thread.sleep(2000);
			
			p1.userPassword();
			p1.loginBtn();
			
					
			
			
		}

	}

