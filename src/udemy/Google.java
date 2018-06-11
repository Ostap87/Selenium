package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
	WebDriver d = new ChromeDriver();
	d.get("http://google.com");
	d.findElement(By.xpath("//div[@class='gb_nb gb_Pg gb_R gb_Og gb_Sg gb_T']/div/div[2]/a")).click();
	d.findElement(By.xpath("//*[@id=\'lst-ib\']")).sendKeys("Poturai Aliona");
	d.findElement(By.cssSelector("#mKlEF")).click();
	
	
	
	
	
	
	
	
	
	
}
}
