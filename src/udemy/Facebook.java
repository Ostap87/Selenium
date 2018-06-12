package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver driver = new ChromeDriver();
		//	driver.findElement(By.linkText("Forgot account?")).click();
		//	driver.close();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("info@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		driver.findElement(By.xpath("//*[@id=\'facebook\']/body/div[22]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'navItem_217974574879787\']/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\'facebook\']/body/div[4]/div[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\'facebook\']/body/div[4]/div[2]")).clear();
//		driver.findElement(By.xpath("//*[@id=\'js_8a\']/div/div/div/div/img")).click();
		//driver.findElement(By.cssSelector("body > div._n8._3qx.uiLayer._3qw > div._3ixn")).click();
		driver.get("http://google.com");
		
		
		
		
		
		
	}
	
	
}