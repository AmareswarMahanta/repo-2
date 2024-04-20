package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement login  = driver.findElement(By.name("login"));
		
		username.sendKeys("9777884515");
		password.sendKeys("likun197");
		
		login.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
		WebElement image=driver.findElement(By.xpath("//*[@id=\"mount_0_0_Rq\"]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));
		image.click();
	}

}
