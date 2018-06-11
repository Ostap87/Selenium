package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://instagram.com");
		d.findElement(By.xpath("//*[@id=\'react-root\']/section/main/article/div[2]/div[1]/div/form/span/button")).click();
		d.findElement(By.id("email")).sendKeys("ostap4info@gmail.com");
		d.findElement(By.name("pass")).sendKeys("Alf@3005.");
		d.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
		d.findElement(By.xpath("//span[.=' Search ']")).click();
		d.findElement(By.className("_avvq0 _o716c")).sendKeys("test" + Keys.ENTER);
		
		
		
		
		
		
		
		
		
}}
