package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	 @FindBy(xpath="//input[@id='email']") private WebElement userName;
	 @FindBy(xpath="//input[@id='pass']") private WebElement userPassword;
	 @FindBy(xpath="//button[@name='login']") private WebElement loginBtn;

	Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void userName()
	{
		userName.sendKeys("Netra");
	}
	public void userPassword()
	{
		userPassword.sendKeys("12345678");
	}
	public void loginBtn()
	{
		loginBtn.click();
	}
	
	
}
