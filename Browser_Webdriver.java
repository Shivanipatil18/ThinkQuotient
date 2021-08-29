package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Webdriver {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.err.println("Code Comments");
		
		String title=driver.getTitle();
		driver.getCurrentUrl();
		System.out.println("Title of Page is: "+title);
		System.out.println("URL of page is: "+driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		System.out.println("Maximized Browser");
		
		driver.navigate().to("http://RedBus.com");
		System.out.println("Navigated - Title Page is: "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Back-Title of Page is: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("Forward- Title of Page is: "+driver.getTitle());
		Thread.sleep(10000);
		
		driver.close();
		System.out.println("End of Code");
	}

}
