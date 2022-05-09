package SeleniumProgram123;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
System.setProperty("webdriver.chrome.driver","F:\\chrome\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("URL is open");
		
		
		Actions act=new Actions(driver);
		
		 
		//for oslo
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement capital=driver.findElement(By.xpath("//div[@id='capitals']"));
		 act.dragAndDrop(oslo, norway).perform(); 
		 

		 
		 
		 //for stockholm
		 
		 WebElement Stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
	     WebElement swedan=driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(Stockholm, swedan).perform();
		 
		 //for Washington
	     WebElement Washington=driver.findElement(By.xpath("//div[@id='box3']"));
	     WebElement UN=driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(Washington, UN).perform();
		 
		
	     WebElement copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
	     WebElement denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		 act.dragAndDrop(copenhagen, denmark).perform();
		 
		
	     WebElement Seol=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	     WebElement southcorea=driver.findElement(By.xpath("//div[text()='South Korea']"));
		 act.dragAndDrop(Seol, southcorea).perform(); 			 
						 
		 WebElement rome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		 WebElement Itley=driver.findElement(By.xpath(" (//div[text()='Italy'])"));
		 act.dragAndDrop(rome, Itley).perform();
		 
		 WebElement Madrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		 WebElement Spain=driver.findElement(By.xpath("(//div[text()='Spain'])"));				 
		act.dragAndDrop(Madrid, Spain).perform();
		 act.dragAndDrop(norway, capital).perform();
		 act.dragAndDrop(swedan, capital).perform();
		 act.dragAndDrop(UN, capital).perform();
		 act.dragAndDrop(denmark, capital).perform();
		 act.dragAndDrop(southcorea, capital).perform();
		 act.dragAndDrop(Itley, capital).perform();
		 act.dragAndDrop(Spain, capital).perform();
						 
						 
	}

}
