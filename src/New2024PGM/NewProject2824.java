package New2024PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject2824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://hrms.indianrail.gov.in/HRMS/login");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("Jyoti");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Dabade");
		//d.findElement(By.xpath("//input[@id='captcha']")).sendKeys("fsqe23");
		d.findElement(By.xpath("//button[@type='submit']")).click();

	}
}