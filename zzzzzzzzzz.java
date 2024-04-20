package my_practicals;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zzzzzzzzzz {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();  
		
		String ParesntWindow = driver.getWindowHandle();
		System.out.println(ParesntWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		Set<String> ChildWindow=driver.getWindowHandles();
		System.out.println(ChildWindow);
		Iterator<String> i=ChildWindow.iterator();
		while(i.hasNext())
		{
			String ChildWindow1=i.next();
			System.out.println(ChildWindow1);
			
			if(!ParesntWindow.equalsIgnoreCase(ChildWindow1))
			{
				driver.switchTo().window(ChildWindow1);
				WebElement download=driver.findElement(By.partialLinkText("Downloads"));
				download.click();
				//driver.close();
			}
			Thread.sleep(2000);
			driver.switchTo().window(ParesntWindow);
		}


	

	}

}
