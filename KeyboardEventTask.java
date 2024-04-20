package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement current=driver.findElement(By.id("currentAddress"));
		WebElement permanent =driver.findElement(By.id("permanentAddress"));
		
		Actions action=new Actions(driver);
		
					// Enter the value
		current.sendKeys("punecity");
		
					 //KeyDown
					// CTRl+a
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		
					//Key-up method
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
					//CTRL+C
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
				    // TAB
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
					// CTRL+V
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}

}
