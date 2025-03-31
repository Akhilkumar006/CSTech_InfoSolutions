package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import java.util.Random;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {

	private RegistrationPage registrationPage;

	@BeforeMethod
	public void setupTest() {
		navigateToUrl("https://app.getcalley.com/registration.aspx");
		registrationPage = new RegistrationPage(driver);
	}

	@Test(dataProvider = "userData",priority=1)
	public void verifyUserRegistrationFlow(String randomName, String randomEmail, String randomPhone, String randomPassword) throws Exception {

		// Enter Registration Details
		registrationPage.enterName(randomName);
		registrationPage.enterEmail(randomEmail);
		registrationPage.enterPhone(randomPhone);
		registrationPage.enterPassword(randomPassword);
		registrationPage.clickCaptcha();
		driver.switchTo().defaultContent();
		registrationPage.scrollUp();
		registrationPage.clickTerms();
		registrationPage.clickRegister();
		Thread.sleep(10000);
	}

	@DataProvider(name = "userData")
	public Object[][] getData() {
		Random random = new Random();

		return new Object[][]{
			{
				"TestUser" + random.nextInt(10000),   // Random Name
				"test" + random.nextInt(10000) + "@example.com",  // Random Email
				"98" + (1000000 + random.nextInt(9000000)),  // 10-digit Random Phone
				"Pass@" + random.nextInt(10000)   // Random Password
			},
			
				
			
		};

	}
	@Test(priority = 2)
	public void restFlow()
	{
		 WebElement FreeTrailLink = driver.findElement(By.id("ancPop2"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", FreeTrailLink);
		driver.findElement(By.id("ancPop2")).click();
		driver.findElement(By.id("btnteamsplanactive")).click();
		driver.findElement(By.className("btn btn-new2 icon_right")).click();

	}
}
