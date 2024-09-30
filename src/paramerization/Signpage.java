package paramerization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class Signpage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//WebDriver driver = new ChromeDriver(); 
		//Read excel sheet data
	
		
		FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
		
		Sheet s=WorkbookFactory.create(path).getSheet("Sheet3");
		
		String firstName = s.getRow(1).getCell(0).getStringCellValue();
		System.out.println(firstName);
		
		String lastName = s.getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastName);
		
		String email = s.getRow(1).getCell(2).getStringCellValue();
		System.out.println(email);
		
		
		String Cemail = s.getRow(1).getCell(2).getStringCellValue();
		System.out.println(Cemail);
		
		String password = s.getRow(1).getCell(3).getStringCellValue();
		System.out.println(password);
		
		
		
		
		//Browser launch
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();		
		driver.get(Configuration.appUrl);
		driver.manage().window().maximize();
		
		
	
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(Cemail);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s1=new Select(day);
		s1.selectByVisibleText("15");
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();


	
	
	
}
}
