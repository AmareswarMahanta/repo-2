package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocators {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		// program will not run,because it will find the first "lebel" tag..
		// Tag name basically use in Tables.............
		
		WebElement login = driver.findElement(By.tagName("lebel"));
		login.click();

	}

}
