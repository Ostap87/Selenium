package main;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://cybertek-bnb.herokuapp.com/");
		System.out.println("URL is : " + d.getCurrentUrl());
		System.out.println(d.getCurrentUrl());
		String t = d.getTitle();
		System.out.println("Title is : " + t);
		if (t.equals("Intro | cybertek-bnb")) {
			System.out.println("Intro | cybertek-bnb");
		} else {
			System.out.println("Title - Failing");
		}
		Random random = new Random();
		int r = random.nextInt(1000000);
		String fN = "Marrio";
		String lN = "Brunny";
		String email = "mario" + r + "B@yahoo.com";
		String password = "Qwerty123";

		d.findElement(By.linkText("sign up")).click();
		
		WebElement fName = d.findElement(By.name("first-name"));
		fName.sendKeys(fN);
		Thread.sleep(1000);
		fName.clear();
		Thread.sleep(1000);
		d.findElement(By.name("first-name")).click();
		d.findElement(By.name("first-name")).sendKeys(fN);

		WebElement lName = d.findElement(By.name("last-name"));
		lName.sendKeys(lN);
		Thread.sleep(1000);
		lName.clear();
		Thread.sleep(1000);
		d.findElement(By.name("last-name")).click();
		d.findElement(By.name("last-name")).sendKeys(lN);
		
		WebElement eMail = d.findElement(By.name("email"));
		eMail.sendKeys(email);
		Thread.sleep(1000);
		eMail.clear();
		Thread.sleep(1000);
		d.findElement(By.name("email")).sendKeys(email);

		
		WebElement psw = d.findElement(By.name("password"));
		psw.sendKeys(password);
		Thread.sleep(1000);
		psw.clear();
		Thread.sleep(1000);
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.xpath("//button[.='sign up']")).click();
		if (d.getTitle().equals("Intro | cybertek-bnb")) {
			System.out.println("Sign in is : correct");
		} else {
			System.out.println("Sign in FAILED");
		}
		d.findElement(By.name("email")).sendKeys(email);
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.xpath("//button[.='sign in']")).click();

		String loggenInTitle = d.getTitle();
		if (loggenInTitle.equals("Map | cybertek-bnb")) {
			System.out.println("User signed in - successfully");
		} else {
			System.out.println("User signed in - fail");
		}
		Thread.sleep(5000);

		d.close();
	}

}
