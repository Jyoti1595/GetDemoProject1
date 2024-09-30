package TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Configuration;

public class NewPRG24 {

//	public static void main(String[] args) {
//		import org.openqa.selenium.By;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.WebElement;
//		import org.openqa.selenium.chrome.ChromeDriver;
//		import org.testng.Assert;
//		import org.testng.annotations.AfterClass;
//		import org.testng.annotations.BeforeClass;
//		import org.testng.annotations.Test;

		//public class RegistrationFormTest {

		    private WebDriver driver;
		    private String baseUrl = "https://www.facebook.com/signup"; // Replace with your registration page URL

		    @BeforeClass
		    public void setUp() {
		        // Set up WebDriver (Assuming ChromeDriver is used here)
		        System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
		    }

		    @Test
		    public void testValidationMessages() {
		        // Locate the form elements
		        WebElement usernameField = driver.findElement(By.id("username"));
		        WebElement emailField = driver.findElement(By.id("email"));
		        WebElement passwordField = driver.findElement(By.id("password"));
		        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
		        WebElement submitButton = driver.findElement(By.id("submit"));

		        // Submit the form without entering anything
		        submitButton.click();

		        // Validate the error messages
		        WebElement usernameError = driver.findElement(By.id("username-error"));
		        WebElement emailError = driver.findElement(By.id("email-error"));
		        WebElement passwordError = driver.findElement(By.id("password-error"));
		        WebElement confirmPasswordError = driver.findElement(By.id("confirmPassword-error"));

		        // Assert the expected error messages
		        Assert.assertEquals(usernameError.getText(), "Username is required.");
		        Assert.assertEquals(emailError.getText(), "Email is required.");
		        Assert.assertEquals(passwordError.getText(), "Password is required.");
		        Assert.assertEquals(confirmPasswordError.getText(), "Please confirm your password.");
		    }

		    @AfterClass
		    public void tearDown() {
		        // Close the browser after all tests are done
		        driver.quit();
		    }

	}

