package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
								// 1 .create reference variable of javaScript interface
						JavascriptExecutor js=(JavascriptExecutor)driver;
		
//						driver.findElement(By.name("uid")).sendKeys("amar");
//						driver.findElement(By.name("password")).sendKeys("amar123");
//						
//						WebElement login=driver.findElement(By.name("btnLogin"));
						
								// to click on login button
//						js.executeScript("arguments[0].click();", login);
						
								// use below javaScript to handle the alert
//						js.executeScript("alert('User or password is not valid');");
						
								
								// to get all the details like Title,,domain name
						
								//  domain
						String domainName = js.executeScript("return document.domain;").toString();
						System.out.println(domainName);
							
								// title
						String title = js.executeScript("return document.title;").toString();
						System.out.println(title);
								
								// url
						String url = js.executeScript("return document.URL;").toString();
						System.out.println(url);
						
								// to launch the new URL
						js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
						Thread.sleep(5000);
						driver.navigate().refresh();
						
						

		
		
	}
	

}
