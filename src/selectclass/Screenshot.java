package selectclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class Screenshot {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
//		
//			ChromeOptions co=new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
//			
			WebDriver d = new ChromeDriver(); 
			
			d.get("https://www.facebook.com/signup");
			//d.manage().window().maximize();
			
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File f=new File("C:\\Users\\Vaibhav\\Desktop\\j\\image.jpg");
			FileHandler.copy(src, f);
		
		
			
			
		}
	}



