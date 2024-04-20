package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
					// to maximize the window
		driver.manage().window().maximize();
		
		 		// To fetch the number of iframe we need to get the size of the iframe.
		List <WebElement> noOfFrame=driver.findElements(By.tagName("iframe"));
		int size=noOfFrame.size();
		System.out.println("Nof of iframe ="+size);
		
		      // 1. switch by index
//		driver.switchTo().frame(0);
//		
//			// 2. switch by id
//		driver.switchTo().frame("singleframe");
		
			// 3. switch by name
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("hello");
	}

}
