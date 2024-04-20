package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
				

			System.setProperty("webdriver.chrome.driver", "D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			WebElement upload= driver.findElement(By.id("uploadfile_0"));
			
			upload.sendKeys("D:\\All Pic\\Camera\\IMG_20220601_211139.jpg");
			WebElement submit=driver.findElement(By.id("submitbutton"));
			submit.click();
	}

}
