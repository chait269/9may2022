package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC03AddToCartSingleElement extends BaseTestClass 
{ 
	
	@Test(priority=3)
	public void AddToCartSingleElement()
	{
		HomePage hp=new HomePage (driver);
		hp.AddToCartClick();
		System.out.println("product is added to cart");
		
		String ActualText=hp.Gettext1();
		
		System.out.println("Actual text is-"+ActualText);
		
		String ExpectedText="REMOVE";
		
		if(ExpectedText.equals(ActualText))
		{
			System.out.println("product is sucessfully added to cart");
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("product is not added to cart");
			System.out.println("test case is failed");
		}
				
		
		
		
		
	}

}
