package SeleniumProgram123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDemo123 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\chrome\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("URL is open");
		
		String Exp="https://opensource-demo.orangehrmlive.com/";
		
		String Act=driver.getCurrentUrl();
		
		if(Exp.equals(Act))
		{
			System.out.println("URL Test Case is Pass");
		}
		else
		{
			System.out.println("URL Test case is fail");
		}
		
		
		WebElement UN=driver.findElement(By.xpath("(//html//body//div//a)[5]"));
		UN.sendKeys(" Admin");
		System.out.println(" valid username is filed");
		String Uname=UN.getDomAttribute("id");
		System.out.println(Uname);
		
		WebElement PS=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		PS.sendKeys("admin123");
		System.out.println("valid Passwors is filled");
		 String Pass=PS.getAttribute("id");
		 System.out.println(Pass);
		 
		 WebElement LI=driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
		 LI.click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	

}


