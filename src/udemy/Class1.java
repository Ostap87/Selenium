package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://login.salesforce.com/");
		d.findElement(By.id("username")).sendKeys("Hello");
		d.findElement(By.name("pw")).sendKeys("World!");
		d.findElement(By.cssSelector("#Login")).click();
		System.out.println(d.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		
		
		
		
		
	}

}
