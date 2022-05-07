package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CartPage;
import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC07Checkout1Functionality extends BaseTestClass
{@Test 
	public void Checkout1Functionality()
	
	{
		
		HomePage hp=new HomePage (driver);
		hp.ADDToCartAll();
		System.out.println("All container added to cart");
		hp.Cartcontainerclick();
		System.out.println("clic on cart container");
		
		CartPage cp=new CartPage(driver);
		cp.Checkout1Click();
		System.out.println("click on checkout button");
		
		String ExpectedUrlAfterCheckoutclick="https://www.saucedemo.com/checkout-step-one.html";
		System.out.println("expected Url after clicking checkoutbutton is-"+ExpectedUrlAfterCheckoutclick);
		
		String ActualUrlAfterCheckoutclick=driver.getCurrentUrl();
		System.out.println("expected Url after clicking checkoutbutton is-"+ActualUrlAfterCheckoutclick);
		
		System.out.println("validating checkout button ");
		 
		Assert.assertEquals( ActualUrlAfterCheckoutclick, ExpectedUrlAfterCheckoutclick, "failed to click on checkout button");
		
		
		
	}

}
