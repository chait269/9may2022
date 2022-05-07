package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class Tc04AddToCartMutipleElement extends  BaseTestClass 
{
	@Test(priority=4)
	public void AddToCartMutipleElement() 
	{
	HomePage hp=new HomePage (driver);
	hp.ADDToCartAll();
	String Actualcontainertext=hp.CartContainergetText();
	System.out.println("actual text is-"+ Actualcontainertext);
	String Expectedcontainertext="3";
	Assert.assertEquals(Actualcontainertext, Expectedcontainertext, "failed to click multiple elements");
		

	
	
     }

}
