package my_practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		   
						// to fetch the columns
		
		List <WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));  // to fetch the column ..in the end mention /th
		int size=columns.size();
		System.out.println("Total no. of columns are :"+ size);
		
		for(int i=0;i<size;i++)
		{
			String ColumnName=columns.get(i).getText();
			System.out.println(ColumnName);
			if(ColumnName.equalsIgnoreCase("company"))						//give any column name to check
			{
				System.out.println("we have column name as per the requirement...");
			}
		}
						// to fetch all the rows
		
		List <WebElement> Rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));  
		int size1=Rows.size();
		System.out.println("Total no. of Rows are :"+ size1);
		for(int i=0;i<size;i++)
		{
			String RowName=Rows.get(i).getText();
			System.out.println(RowName);
		}
		
						// To fetch the cell data we will use the below commands
		WebElement CellData=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"));
		System.out.println("teh cell data is "+CellData.getText());
		
		
}
}
