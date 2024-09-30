package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPom {
	
		@FindBy(xpath="//input[@name='firstname']")private WebElement fName;
		@FindBy(xpath="//input[@name='lastname']")private WebElement lName;

		@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
		@FindBy(xpath="//input[@name='reg_email_confirmation__']")private WebElement cemail;


		@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newPass;
		
		@FindBy(xpath="//input[@type='radio'][1]")private WebElement radioBtn;
		
		@FindBy(xpath="//select[@name='birthday_day']")private WebElement day1;
		@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;
		@FindBy(xpath="//select[@name='birthday_year']")private WebElement year1;

		
		@FindBy(xpath="	//button[@type='submit']")private WebElement signupBtn;
		
		


		
		
		SignupPom(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void FirstName()
		{
			fName.sendKeys("Netra");
		}

		public void LastName()
		{
			lName.sendKeys("Pawar");
		}
		

		public void Email()
		{
			email.sendKeys("Netra123@gamil.com");
		}
		
		
		public void CEmail()
		{
			cemail.sendKeys("Netra123@gamil.com");
		}

		public void NewPassword()
		{
			newPass.sendKeys("12345678");
		}
		
		public void selectDay(String day) 
		{
			Select s1 = new Select(day1);
			s1.selectByVisibleText(day);
			
		}

		public void selectMonth(String mon) 
		{
			Select s2 = new Select(month);
			s2.selectByVisibleText(mon);
			
		}
		
		public void selectYear(String year) 
		{
			Select s3 = new Select(year1);
			s3.selectByVisibleText(year);
			
		}


		public void RadioBtn()
		{
			radioBtn.click();
		}
		
		
		public void SignupBtn()
		{
			signupBtn.click();
		}

}
