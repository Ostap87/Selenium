package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceE2E {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
	WebDriver d = new ChromeDriver();
	d.get("http://rediff.com");
	d.findElement(By.cssSelector("a[title*='Sign in']")).click();
	d.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello_Man");
	d.findElement(By.cssSelector("#password")).sendKeys("1234567890");
	d.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	
	
	
	
}
}
