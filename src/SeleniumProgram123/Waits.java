package SeleniumProgram123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\chrome\\chromedriver.exe");		   
		     		     
		  WebDriver driver =  new ChromeDriver();
		  
		  driver.get("https://www.facebook.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  
		  WebElement UN=driver.findElement(By.xpath("//input[@id='emai']"));
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.visibilityOf(UN));
		   UN.sendKeys("hii");
		  
		  
		    

}
}
