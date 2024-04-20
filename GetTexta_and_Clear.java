package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTexta_and_Clear {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("kkkkkkkllll");
		Thread.sleep(3000);
		username.clear();                     							// Clear
		
		
		// To Fetch the value of particular Text....
		WebElement text=driver.findElement(By.tagName("h1"));
		String value=text.getText();
		System.out.println(value);
	}

}
