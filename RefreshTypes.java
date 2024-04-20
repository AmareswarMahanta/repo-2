package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTypes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
					//1.by using refresh method
				//driver.navigate().refresh();
				
					//2. getCurrentUrl method
				//driver.get(driver.getCurrentUrl());
				
					//3.getCurrenturl with navigate().to()
				//driver.navigate().to(driver.getCurrentUrl());
				
					//4. By using F5
				driver.findElement(By.name("email")).sendKeys(Keys.F5);		
				  
					//5. by using ascii value
				//driver.findElement(By.id("email")).sendKeys("\uE035");
		
	}

}
