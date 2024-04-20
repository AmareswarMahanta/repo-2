package my_practicals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShort {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
				// Create TakeScreenSort Interface.....
			TakesScreenshot ts= (TakesScreenshot) driver;
		
				// calling getScreenshort method to create image and store in a variable
		   File srcFile = ts.getScreenshotAs(OutputType.FILE);
		   
		   		// Set the path where the file will be save and \\filename.png
		   File destination =new File("D:\\Automation_Seed\\ScreenShort\\error.png");
		   
		   		// Copy the ScreenShot into destination folder
		   Files.copy(srcFile, destination);
		
	}

}
