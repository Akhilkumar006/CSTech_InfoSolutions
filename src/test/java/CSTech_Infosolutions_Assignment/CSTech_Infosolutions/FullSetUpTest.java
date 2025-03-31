package CSTech_Infosolutions_Assignment.CSTech_Infosolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	 		public void UserLogin()
	 		{
	 			login.enterCredentials("akhil@gmail.com","akhil");  //The email and passwords are dummy
	 			login.clickLogin();
	 			
	 		}
	 		
	 		/*
	 		 The teams feature which is in the video is not in the site.i think site is updated video is old 
	 		 
	 		 */
		
	
}
