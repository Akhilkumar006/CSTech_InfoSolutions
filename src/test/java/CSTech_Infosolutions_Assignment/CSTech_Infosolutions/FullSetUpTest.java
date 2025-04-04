package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FullSetUpTest extends  BaseClass{

	LoginPage login ;

	@BeforeMethod
	public void setupTest()
	{
		navigateToUrl("https://app.getcalley.com/Login.aspx");
		login = new LoginPage(driver);
	}

	@Test(priority=1)
	public void userLogin()
	{
		login.enterCredentials("roshanvj29072002@gmail.com","Calley");  
		login.clickLogin();

	}

	@Test(priority =2)
	public void testFlow() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.linkText("Add New List")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtlistname")).sendKeys("Akhil kumar");
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_fileUpload']"));

		// Provide the file path (Use double backslashes or a raw string)
		String filePath = "C:\\Users\\akhil\\Downloads\\Sample File.csv";

		// Upload the file
		fileInput.sendKeys(filePath);

		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divagents\"]/div/div/button")).click();
		driver.findElement(By.xpath("//label[contains(text(),\"Select All\")]")).click();
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div[2]/div/div/div[2]/div/h5")).click();
		driver.findElement(By.xpath("//*[@id=\"btnUp\"]")).click();
		Actions action = new Actions(driver);
		action.moveToLocation(719, 568).click().perform();
		WebElement element1 = driver.findElement(By.id("ddlbelongto_1"));
		Select dropdown1 = new Select(element1);
		dropdown1.selectByValue("FirstName");
		
		WebElement element2 = driver.findElement(By.id("ddlbelongto_2"));
		Select dropdown2 = new Select(element2);
		dropdown2.selectByValue("Phone");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnUpload\"]"));
		action.scrollToElement(button);
		WebElement element3 = driver.findElement(By.id("ddlbelongto_3"));
		Select dropdown3 = new Select(element3);
		dropdown3.selectByValue("Notes");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnUpload\"]")).click();
	}



}
