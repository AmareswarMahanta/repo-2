package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		WebElement un=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		
		Actions action=new Actions(driver);
		
				// 1. KeyDown--press the key and hold...
		action.keyDown(un,Keys.SHIFT).sendKeys("amares").perform();
		action.keyDown(pass,Keys.SHIFT).sendKeys("likun").perform();
		action.keyDown(Keys.ENTER).perform();
	}

}
