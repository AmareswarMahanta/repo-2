  package my_practicals;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
					// to maximize the window
		driver.manage().window().maximize();
		
					// to minimize the window
		//driver.manage().window().minimize();
		
//		WebElement button =driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
//		
//		
//				// 1. to get the text from the alert.
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		
//				// 2. to accept the alert
//		driver.switchTo().alert().accept();	
		
//		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();	
//		
//				// 3. To dismiss the alert
//		driver.switchTo().alert().dismiss();
		
		
		/////////////////////////////////////////////////
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		
		Thread.sleep(3000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("hello amaresh");
		driver.switchTo().alert().accept();
		
		
	}

}
