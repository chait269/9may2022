
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


public class Tc02SelectFunctionality extends BaseTestClass 
{
	
	
		@Test(priority=2)
		public void SelectFunctionality () 
		
		{
	    HomePage hp=new HomePage (driver);
		hp.Clickonimg();
		System.out.println("click on sauce lab back pack");
		
		
		String ExpectedImg1Url="https://www.saucedemo.com/inventory-item.html?id=4";
		System.out.println("Expected Url is-"+ ExpectedImg1Url);
		
		String ActualImgUrl= driver.getCurrentUrl();
		System.out.println("Actual Url is- "+ActualImgUrl);
		
		System.out.println("verify whether we are able to select the product or not");
		Assert.assertEquals(ActualImgUrl, ExpectedImg1Url, "Failed to select product");
	}
		
		

}
