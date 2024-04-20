package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
						// 1. To open the URL 
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
						// 2. To Refresh the Page
		//driver.navigate().refresh();
		
						// 3. To re-direct backwards
    	WebElement link=driver.findElement(By.linkText("Flights"));
		link.click();
		Thread.sleep(3000);                          // waits for 3 seconds //throws excepting if wrong. 
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
}

}
