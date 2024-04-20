package my_practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits =driver.findElement(By.id("fruits"));
		Select select=new Select(fruits);
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByValue("apple");
			select.selectByVisibleText("Grape");
		}
		
//		select.deselectByIndex(0);
//		select.deselectByVisibleText("Grape");
//		select.deselectByValue("apple");
		select.deselectAll();
	}

}
