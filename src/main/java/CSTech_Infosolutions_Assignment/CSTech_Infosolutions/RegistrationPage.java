package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	WebDriver driver;

	By nameField = By.id("txtName");
	By emailField = By.id("txtEmail");
	By phoneField = By.id("txt_mobile");
	By passwordField = By.id("txtPassword");
	By termsCheckBox = By.id("checkbox-signup");
	By signUpButton = By.id("btnSignUp");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public void enterPhone(String phone) {
		driver.findElement(phoneField).sendKeys(phone);
	}
	
	public void clickCaptcha()
	{
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.className("rc-anchor-content")).click();	}
	
	public void clickTerms()
	{
		 WebElement checkBox = driver.findElement(By.id("checkbox-signup"));

	     JavascriptExecutor  js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", checkBox);
	}
	
	public void clickRegister() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signUpButton = driver.findElement(By.id("btnSignUp"));
		js.executeScript("arguments[0].click();", signUpButton);
	}
	
    public void scrollUp()
    {
    	Actions scrollUp = new Actions(driver);
    	scrollUp.scrollByAmount(1000, 1000).perform();
    }
    
    
}
