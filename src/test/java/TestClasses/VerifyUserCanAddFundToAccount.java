package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClasses.BaseClass;
import PomClasses.Home_Page;
import PomClasses.Login_Page;

public class VerifyUserCanAddFundToAccount {
	
	WebDriver driver;
	Login_Page lp;
	Home_Page hp;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String bName)
	{
		driver = BaseClass.getDriver(bName);
	}
	
	@BeforeMethod()
	public void beforeMethod()
	{
		lp = new Login_Page(driver);
		hp = new Home_Page(driver);
	}
	
	
	@Test
	public void VerifyUserCanLogin() throws IOException
	{
		lp.clickOnLognButton();
		lp.enterEmail();
		lp.clickOnContinue();
		lp.enterPassword();
		lp.clickOnSubmit();
		lp.enterPin();
		
		hp.clickOnProfile();
		Assert.assertTrue(hp.verifyUser());
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		
	}

}
