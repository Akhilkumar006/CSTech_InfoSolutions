package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

    By emailField = By.id("txtEmailId");
    By passwordField = By.id("txtPassword");
    By loginButton = By.id("btnLogIn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    
}
