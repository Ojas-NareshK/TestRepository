package DynamicXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test 
{ 
	static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","D://CodeTantra//Workspace//Selenium//CodeTantraSelenium//res//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Login / Signup')]"))).build().perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'SpiceClub Members')]"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Member Login')]"))).build().perform();
		Thread.sleep(1000);
		
		
//		driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Member Login')]")).click();
//		Thread.sleep(3000);
//		driver.quit();
		
	}
}