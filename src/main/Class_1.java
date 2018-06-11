package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {



		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");

	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("nursultan baikoziev");
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
	
	}

}
