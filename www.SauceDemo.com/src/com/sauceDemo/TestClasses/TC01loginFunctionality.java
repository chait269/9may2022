package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

import UtilityPackage.UtilityClass;


public class TC01loginFunctionality extends BaseTestClass 
{
	
	
		@Test(priority=1)
		public void LogInFunctionality()
		{
		
		String ExpectedHomepageURL="https://www.saucedemo.com/inventory.html";
		System.out.println("Expected Url"+ExpectedHomepageURL);
	    String ActualHomepageURL=driver.getCurrentUrl();
		System.out.println("Actual URL"+ActualHomepageURL);
		System.out.println("validating Login functionality");
		Assert.assertEquals(ExpectedHomepageURL, ActualHomepageURL);
		
		
		}
		 
		

}

