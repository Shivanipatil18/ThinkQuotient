package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Chrome2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Welcome");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}

}
