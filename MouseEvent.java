package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseEvent {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement flights =driver.findElement(By.linkText("Flights"));	
		
		Actions action = new Actions(driver);            //Action is a Built_In class
		
					// 1. click and hold
		//action.clickAndHold(flights).perform();
		
					// 2. Release...
		//action.release().perform();
		
					// 3. ContexClick--(Right click on the mouse)
		//action.contextClick(flights).perform();
		
	}

}
