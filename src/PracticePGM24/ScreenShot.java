package PracticePGM24;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import config.Configuration;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.globalsqa.com/demo-site/draganddrop");
		
	
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		String date = d.toString();		
		String str = date.replace(":", "_");
		
		File f = new File("C:\\Users\\Vaibhav\\Desktop\\"+str+".jpg");
		
		FileHandler.copy(src, f);
		
		
		

	}

}
