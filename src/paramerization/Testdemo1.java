package paramerization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Testdemo1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read excel sheet data
		
		FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
		
		Sheet s=WorkbookFactory.create(path).getSheet("Sheet2");
		
		String username = s.getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		String password = s.getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		
		//Browser launch
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();		
		driver.get(Configuration.appUrl);
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

	
	
	
}
}

