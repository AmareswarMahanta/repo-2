package my_practicals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		// 1. we need to create the object of webdriver wait class
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		// 2. use Until method of WebDriverWait class
		WebElement username=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("aamre");
		
		WebElement password=driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
		password.sendKeys("1234");
		
		WebElement login=driver.findElement(By.id("u_0_b"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

}
