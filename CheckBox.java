package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
							//to click on the single checkbox ..we need to find out the element and need to click on it..
		
//		WebElement checkbox1=driver.findElement(By.id("checkbox1"));
//		checkbox1.click();
//		
//		if(checkbox1.isSelected())
//		{
//			System.out.println("checkbox is selected");
//		}
//		else
//		{
//			checkbox1.click();		
//		}  
		
							// findElements
		
		List<WebElement> checkboxes =driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
			
		              		//to select only one..
		//checkboxes.get(2).click();
		
							// For selecting Multiple Checkboxes...
		
//		for(int i=0;i<size;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
							// For Dynamic use....(if the value changes frequently)
							// getAttribute --get the value of particular element
		for(int i=0;i<size;i++)
		{
			String value=checkboxes.get(i).getAttribute("value");
			{
				if(value.equalsIgnoreCase("hockey"))
				{
					checkboxes.get(i).click();				
				}
			}
		}
		  
	}

}
