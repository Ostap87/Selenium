package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		System.out.println(d.getCurrentUrl());
		d.get("http://yahoo.com");
//		d.navigate().back();
//		d.navigate().forward();
//		d.navigate().back();
		d.findElement(By.id("gh-ac")).sendKeys("ping pong ball");
		d.findElement(By.id("gh-btn")).click();
		d.findElement(By.id("srp-river-results-SEARCH_STATUS_MODEL_V2-w0-w5-switch-box")).click();
		//d.close();
		
		

	}

}
