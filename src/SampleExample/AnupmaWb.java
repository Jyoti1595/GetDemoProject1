package SampleExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Configuration;

public class AnupmaWb {
		@FindBy(xpath = "//a[contains(text(),'Click Here For Registration')]")private WebElement CR;
		@FindBy(xpath ="//input[@name='firstname']")private WebElement F1;
		@FindBy(xpath ="//input[@name='middlename']")private WebElement M1;
		@FindBy(xpath ="//input[@name='lastname']")private WebElement L1;
		@FindBy(xpath ="(//input[@type='radio'])[2]")private WebElement Radio1;
		

		@FindBy(xpath ="//input[@name='birthdate']")private WebElement BDate1;

		@FindBy(xpath ="//input[@name='contactno']")private WebElement MNo1;
		@FindBy(xpath ="//input[@name='email']")private WebElement Email;
		@FindBy(xpath ="//input[@name='password']")private WebElement Pass;
		//@FindBy(xpath ="//input[@name='imgname']")private WebElement UploadI;
		@FindBy(xpath ="//input[@type='checkbox']")private WebElement CheckB;
		
		AnupmaWb(WebDriver d1)
		{
			PageFactory.initElements(d1, this);
		}
		
		
		
		public void OnClick()
		{
			CR.click();
		}
		
		public void enterFN(String fname) 
		{
			F1.sendKeys(fname);
		}
		
		public void enterMN(String mname) 
		{
			M1.sendKeys(mname);
		}
		
		public void enterLN(String lname) 
		{
			L1.sendKeys(lname);
		}
		

		public void OnClickRadio()
		{
			Radio1.click();
		}
		
		

		public void enterDate(String Date)	
		{
			BDate1.sendKeys(Date);
		}
		

		public void enterMobile(String number)
		{
			MNo1.sendKeys(number);
		}
		
		public void enterEmail(String email)
		{
			Email.sendKeys(email);
		}
		
		public void enterPass(String pass)
		{
			Pass.sendKeys(pass);
		}
		
		public void OnClickCheck()
		{
			CheckB.click();
		}
		
}