package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//Storing in WebElement Interface Reference variable..
		WebElement username=driver.findElement(By.name("email"));
		
		WebElement password=driver.findElement(By.name("pass"));
		
	
		username.sendKeys("amaresh@gmail.com");
		password.sendKeys("hello@123");
		

	}

}
