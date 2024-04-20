package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayedIsEnebled {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		// isDisplayed()-- method is used to check the WebElement is present in the WebPage OR Not..
		
		// isEnebled()--   method is used to check the WebElement(inputBox,,) is Enabled in the WebPage OR Not...
		
		// isSelected()--  method is used to check if the CheckBox is Selected OR Not.....
		
//		boolean res1=username.isDisplayed();
//		boolean res2=username.isEnabled();
//		
//		System.out.println(res1);
//		System.out.println(res2);
//		
//		boolean res3=password.isDisplayed();
//		boolean res4=password.isEnabled();
//		
//		System.out.println(res3);
//		System.out.println(res4);
		
				
					// For Email
		
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("Amar45");
		}
		else
		{
			System.out.println("user name not displayed!!!");
		}
		
					// For Password
		
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("123@#");
		}
		else
		{
			System.out.println("Password not displayed!!!");
		}
		
		
		WebElement checkbox=driver.findElement(By.id("persist_box"));
		boolean result1=checkbox.isSelected();
		System.out.println(result1);
		
	}

}
