package pkg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		

	}

}
