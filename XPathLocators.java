package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));
		username.sendKeys("hello12");
		
		WebElement password =driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("secrt");
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
		login.click();
	}

}
