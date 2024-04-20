package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		//CSS-LOCATORS--(Dynamic Locators).....................................
		
		// 1. TAG and CLASS.....!!!
		// 2. TAG and ID.....!!!!
		// 3. TAG and ATTRIBUTES.....!!!!
		// 4. TAG , CLASS and ATTRIBUTES....!!!
		// 5. TAG , ID and ATTRIBUTES......!!!
		// 6. Starts With......(^)
		// 7. Ends with.........($)
		// 8. Contains..........(*)
		
		
	
//		// 1. TAG and CLASS.....!!!	
//		WebElement un=driver.findElement(By.cssSelector("input.inputtext"));
//		
//		// 2. TAG and ID.....!!!!	
//		WebElement pass =driver.findElement(By.cssSelector("input#pass"));
//		
//		un.sendKeys("amama");
//		pass.sendKeys("ieuf12"); 
		  
		
//		// 3. TAG and ATTRIBUTES.....!!!!
//		WebElement un=driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		
//		//4. TAG , CLASS and ATTRIBUTES....!!!
//		WebElement pass= driver.findElement(By.cssSelector("input.inputtext[type='password'][id='pass']"));
//		
//		un.sendKeys("aksd");
//		pass.sendKeys("ojfie1234");
//		
//		// 5. TAG , ID and ATTRIBUTES......!!!
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][tabindex='4']"));
//		login.click();
		
		// 6. Starts With......(^)
		WebElement un =driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("kkk");
		
		// 7. Ends with.........($)
		WebElement pass =driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("1234");
		
		// 8. Contains..........(*)
		WebElement login =driver.findElement(By.cssSelector("input#u_0_b[type*='bmi']"));
		login.click();		
		
		
		
	}  

}
