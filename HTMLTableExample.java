package pkg;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> all_rows = table.findElements(By.tagName("tr"));
		
		System.out.println("Totl no.of rows: "+all_rows.size());
		int i=0;
		for(WebElement element:all_rows)
		{
			List<WebElement> eachcolumn = table.findElements(By.tagName("td"));
			i++;
			System.out.println("no. of Column: " +i+ "\t Rows Are: "+eachcolumn.size());
			for(WebElement column : eachcolumn)
			{
				System.out.print("||" + column.getText());
			}
			System.out.println("\n");
		}
	
		System.out.println("END OF CODE");
		Toolkit.getDefaultToolkit().beep();
		
	}

}
