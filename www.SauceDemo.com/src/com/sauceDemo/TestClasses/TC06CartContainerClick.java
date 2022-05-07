package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC06CartContainerClick extends BaseTestClass 
{
	@Test 
	public void CartContainerClick() 
	{
		
		HomePage hp=new HomePage (driver);
		hp.ADDToCartAll();
		System.out.println("All container added to cart");
		hp.Cartcontainerclick();
		
		String ExpectedCartPageUrl="https://www.saucedemo.com/cart.html";
		System.out.println("Expected Cart page url is-"+ExpectedCartPageUrl);
		
		String ActualPageUrl=driver.getCurrentUrl();
		System.out.println("Actual Cart PageUrl is-"+ActualPageUrl);
		
		System.out.println("validating all products sucessfully moved to the cart page");
		
		Assert.assertEquals( ActualPageUrl, ExpectedCartPageUrl, "failed to click on cart container");
		
		
		
	}

}
