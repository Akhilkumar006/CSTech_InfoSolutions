package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentPage {

	 WebDriver driver;

	    By agentNameField = By.id("agentName");
	    By agentEmailField = By.id("agentEmail");
	    By agentPhoneField = By.id("agentPhone");
	    By submitButton = By.id("submitAgent");
	    By successMessage = By.id("successMessage");

	    public AgentPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterAgentDetails(String name, String email, String phone) {
	        driver.findElement(agentNameField).sendKeys(name);
	        driver.findElement(agentEmailField).sendKeys(email);
	        driver.findElement(agentPhoneField).sendKeys(phone);
	    }

	    public void submitAgentForm() {
	        driver.findElement(submitButton).click();
	    }

	    public boolean verifyAgentAdded() {
	        return driver.findElement(successMessage).isDisplayed();
	    }
}
