package SeleniumProgram123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IPHRAME1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chrome1\\chromedriver.exe");
		System.out.println("System properties are to be set");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser open");
		
		driver.manage().window().maximize();
		System.out.println("window maximize");
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println("URL open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(iframe2);
		
		WebElement AnimalDropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		System.out.println("Click dropdown");
		
		Select s=new Select(AnimalDropdown);
		
		s.selectByValue("babycat");
		
		driver.switchTo().defaultContent();
		
	
    }

}
