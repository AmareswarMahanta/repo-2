package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
				// 1. TAG and ATTRIBUTES.....
		
//  	WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));     // Created by browser by using copy xpath..
//		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));		 // Created by me ...
//		WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		
		
				// 2. Using "AND" Condition..........(All condition must be True)
	
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' and @tabindex='1']"));
//		WebElement password =driver.findElement(By.xpath("//input[@type='password' and @id='pass']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @tabindex='4']"));
		
		
				// 3. Using "OR" Condition...........(Any One Condition must be True)
	
//		WebElement username = driver.findElement(By.xpath("//input[@id='!!!!' or @tabindex='1']"));
//		WebElement password =driver.findElement(By.xpath("//input[@type='password' or @id='!!!']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @tabindex='004']"));
		
		
				// 4. Contains Method.....
		
//		WebElement username = driver.findElement(By.xpath("//input[contains(@type,'ext')]"));
//		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'ss')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'In')]"));
		
		
				// 5. Starts with Method.........
		
//		WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'ema')]"));
//		WebElement password = driver.findElement(By.xpath("//*[starts-with(@type,'pas')]"));
//		WebElement login = driver.findElement(By.xpath("//*[starts-with(@value,'Lo')]"));
		
		
//	    username.sendKeys("amash");
//		password.sendKeys("fhfhf");
//		login.click();
		
		
				// 6. Using TEXT Method...(Mostly use for Hyper-Links)
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Agile Project']"));
		link.click();		
		
		WebElement uid=driver.findElement(By.id("uid"));
		uid.sendKeys("dhwud");		
	}

}
