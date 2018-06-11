package main;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		d.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		d.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		d.findElement(By.id("ctl00_MainContent_login_button")).click();
		d.findElement(By.cssSelector("#ctl00_menu > li:nth-child(3) > a")).click();

		Random r = new Random();
		int i = r.nextInt(101);
		int i1 = r.nextInt(69999);
		int card = r.nextInt(3);
		String v = "4" + i1 + i1 + i1;
		String m = "5" + i1 + i1 + i1;
		String ae = "3" + i1 + i1 + (i1 - 1);
		int ed = r.nextInt(12);
		int min = 19;
		int max = 25;
		int ed1 = min + r.nextInt(max);
		String slash = "";

		if (ed < 10) {
			slash = "0" + ed + "/" + ed1;

		} else {
			slash = "" + ed + "/" + ed1;

		}

		char midName = (char) (r.nextInt(26) + 65);
		d.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE);
		d.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("" + i);
		

		d.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtName")).sendKeys("John " + midName + " Smith");
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("123 Any Street");
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Chicago");
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")).sendKeys("IL");
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")).sendKeys("" + i1);

		if (card == 0) {
			d.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
			d.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(v);

		} else if (card == 1) {
			d.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']")).click();
			d.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(m);

		} else if (card == 2) {
			d.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_2']")).click();
			d.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(ae);

		} else {
			d.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
			d.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(v);

		}

		d.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_TextBox1\']")).sendKeys(slash);
		d.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_InsertButton")).click();

		String str5 = d.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder\']/tbody/tr/td/div/strong")).getText();
if(str5.contains("New order has been successfully added."))	{
	System.out.println("Pass");
}else {
	System.out.println("Fail");
}
		
		Thread.sleep(6000);
	//	d.close();

	}
}