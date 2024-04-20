package my_practicals;
				
import org.openqa.selenium.By;					  // BY is a Class
import org.openqa.selenium.WebDriver;			 // WebDriver Interface
import org.openqa.selenium.WebElement;           // WebElement Interface
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//Storing in WebElement Interface Reference variable..
		WebElement username=driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.id("pass"));
		
		WebElement login=driver.findElement(By.id("u_0_b"));
		
		username.sendKeys("amaresh@gmail.com");
		password.sendKeys("hello@123");
		login.click();  // click()--on any BUTTON,,RADIO BUTTON,,CHECHBOX ,,LINK
		Thread.sleep(3000);
		driver.close();
	}

}
