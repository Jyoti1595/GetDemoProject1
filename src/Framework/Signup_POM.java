package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup_POM {
	
	//Declaration
	@FindBy(xpath="//input[@name='firstname']")private WebElement fN;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lN;

	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newpass;	
	
	@FindBy(xpath="(//input[@type='radio'])[1]")private WebElement radioB;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement radioB1;

	@FindBy(xpath="//select[@name='birthday_day']")private WebElement day;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;
	@FindBy(xpath="//select[@name='birthday_year']")private WebElement year1;



	//Intilization
	
	Signup_POM(WebDriver ddd){
		PageFactory.initElements(ddd, this);		
	}
	
	
	//Usage
	public void enterFirstName(String name) {
		fN.sendKeys(name);
	}
	
	public void enterLastName(String lastName) {
		lN.sendKeys(lastName);
	}
	
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
	}
	
	public void enterNewPassword(String pass) {
		newpass.sendKeys(pass);
	}
	
	public void clickOnRadio() {
		radioB.click();
	}
	
	public void clickOnRadio1() {
		radioB1.click();
	}
	
	public void selectDay(String day1) {
		Select sel = new Select(day);
		sel.selectByVisibleText(day1);
		
	}
	
	
	public void selectMonth(String mon) {
		Select sel = new Select(month);
		sel.selectByVisibleText(mon);
		
	}
	
	public void selectYear(String year) {
		Select sel = new Select(year1);
		sel.selectByVisibleText(year);
		
	}
		
}

