package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocators {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		// It is not correct because classname is same for both username and password !!!!!!!
		//It will pick the first one,whose class name is "inputtext"..
		WebElement username = driver.findElement(By.className("inputtext"));
		WebElement password = driver.findElement(By.className("inputtext"));
		
		
		username.sendKeys("Amar@gmail.com");
		password.sendKeys("12345");
		

	}

}
