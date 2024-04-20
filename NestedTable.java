package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedTable {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().window().maximize();
		
		List<WebElement> NestedTableRow=driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr"));
		int size=NestedTableRow.size();
		
		for(int i=0;i<size;i++)
		{
			String value=NestedTableRow.get(i).getText();
			System.out.println(value);
		}
		
	}
}
