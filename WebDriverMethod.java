package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {
	
	public static void main(String args[]) {
		
		// To set property (driver for chrome,,,path location \\exe file )
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe"); 
		
		// webDriver is a Interface..
		// create ChromeDriver object with interface of webdriver reference variable
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.amazon.in/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle(); 			 //get the title and print 
		System.out.println(title);
		
//		String source=driver.getPageSource();   	  //get the page source and print
//		System.out.println(source);
		
		String url=driver.getCurrentUrl();   		//get current url and print
		System.out.println(url);
		 
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		driver.close();						//close One Tab
		driver.quit();						//close ALL Tab at a time..
		
	}

}
