package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		WebElement button1=driver.findElement(By.xpath("//*[@value='FeMale']"));
//		button1.click();
//		
//		if(button1.isSelected())
//		{
//			System.out.println("Radio BUtton is already Selected!!");
//		}
//		else
//		{
//			button1.click();
//		}
		
						// For Dynamic use....
		
		List<WebElement> allradio=driver.findElements(By.xpath("//input[@type='radio']"));
		int size=allradio.size();
		for(int i=0;i<size;i++) 
		{
			String value= allradio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("female"))
			{
				allradio.get(i).click();			
			}
		}
		
	}

}
