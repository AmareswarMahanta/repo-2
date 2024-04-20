package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select select =new Select(country);
		
					// 1. Select by  VisibleText
		//select.selectByVisibleText("DOMINICA");
		
					// 2. Select by Value
		//select.selectByValue("FAROE ISLANDS");
		
					// 3. select by index
		select.selectByIndex(7);
		
		

	}

}
 