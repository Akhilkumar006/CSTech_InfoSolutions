package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSVUploadPage {

	 WebDriver driver;

	    By listNameField = By.id("listName");
	    By selectAgentsDropdown = By.id("selectAgents");
	    By uploadCsvButton = By.id("uploadCsv");
	    By mapFieldsButton = By.id("mapFields");
	    By importButton = By.id("importCsv");
	    By successMessage = By.id("successMessage");

	 

	    public void enterListName(String listName) {
	        driver.findElement(listNameField).sendKeys(listName);
	    }

	    public void selectAgents(String agentName) {
	        driver.findElement(selectAgentsDropdown).sendKeys(agentName);
	    }

	    public void uploadCsvFile(String filePath) {
	        driver.findElement(uploadCsvButton).sendKeys(filePath);
	    }

	    public void mapFieldsAndImport() {
	        driver.findElement(mapFieldsButton).click();
	        driver.findElement(importButton).click();
	    }

	    public boolean verifyUploadSuccess() {
	        return driver.findElement(successMessage).isDisplayed();
	    }
}
