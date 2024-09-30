package AssignmentTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class TestData {
		//Declaration

		@FindBy(xpath="//input[@name='firstname']")private WebElement fName;
		
		@FindBy(xpath="//input[@name='lastname']")private WebElement lName;
		
		@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
		
		@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newPass;
		
		@FindBy(xpath="//select[@name='birthday_day']")private WebElement Day;
		
		@FindBy(xpath="//select[@name='birthday_month']")private WebElement Month;
		
		@FindBy(xpath="//select[@name='birthday_year']")private WebElement Year;
		
		@FindBy(xpath="(//input[@type='radio'])[1]")private WebElement FemaleRadioBtn;

		@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement MaleRadioBtn;
		
		@FindBy(xpath="//button[@name='websubmit']")private WebElement SubmitBtn;
		
		//Initialization
		
		TestData(WebDriver driver){
			
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void enterFirstName(String name) 
		{
			fName.sendKeys(name);
			
		}

		public void enterLastName(String name)
		{
			lName.sendKeys(name);
			
		}
		public void enterEmailID(String mail) 
		{
			email.sendKeys(mail);
			
		}
		public void enterPassword(String pass)
		{
			newPass.sendKeys(pass);
			
		}
		public void selectDay(String day) 
		{
			Select s1=new Select(Day);
			s1.selectByValue(day);
		}
		public void selectMonth(String month) 
		{
			Select s2=new Select(Month);
			s2.selectByVisibleText(month);

		}
		public void selectYear(String year) 
		{
			Select s3=new Select(Year);
			s3.selectByVisibleText(year);
			
		}
		public void ClickOnRadioF()
		{
			FemaleRadioBtn.click();
			
		}
		public void ClickOnRadioM()
		{
			MaleRadioBtn.click();
			
		}
		public void ClickOnSignUp()
		{
			SubmitBtn.click();
		}

	

}
