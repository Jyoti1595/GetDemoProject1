package Framework;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	
	public class MultipleTextCase {

		//Declaration
		@FindBy(xpath="//input[@name='firstname']")private WebElement fName;
		
		@FindBy(xpath="//input[@name='lastname']")private WebElement lName;

		@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;

		
		@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newPass;
		
		
		@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement radioBtn;
		@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement radioBtn1;	
		
		
		@FindBy(xpath="//select[@name='birthday_day']")private WebElement day;
		@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;

		@FindBy(xpath="//select[@name='birthday_year']")private WebElement year;


		//Intilization
		
		MultipleTextCase(WebDriver driver){
			PageFactory.initElements(driver, this);		
		}
		
		
		//Usage
		public void enterFirstName(String firstname) {
			fName.sendKeys(firstname);
		}
		
		public void enterLastName(String lastName) {
			lName.sendKeys(lastName);
		}
		
		public void enterEmail(String emailID) {
			email.sendKeys(emailID);
		}
		
		public void enterNewPassword(String pass) {
			newPass.sendKeys(pass);
		}
		
		public void clickOnRadio() {
			radioBtn.click();
		}
		
		public void clickOnRadio1() {
			radioBtn1.click();
		}
		
		
		public void selectDay(String day1) {
			Select s1 = new Select(day);
			s1.selectByVisibleText(day1);
			
		}
		
		
		public void selectMonth(String mon) {
			Select s2 = new Select(month);
			s2.selectByVisibleText(mon);
			
		}

		
		public void selectYear(String year1) {
			Select s3 = new Select(year);
			s3.selectByVisibleText(year1);
			
		}


}
