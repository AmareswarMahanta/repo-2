package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndDrandandDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		  		// 4.DoubleClick...
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(button).perform();  
		
				// 5. Drag And Drop...
		WebElement draganddrop=driver.findElement(By.partialLinkText("Drag"));
		draganddrop.click();
		
		WebElement drag=driver.findElement(By.id("dragdiv"));
		WebElement drop=driver.findElement(By.id("dropdiv"));
		
		//action.dragAndDrop(drag, drop).perform();						// way--1st
		
		action.dragAndDropBy(drag, 100, 100).perform();					// way--2nd
	}
	

}
