package pkg;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebayinc.com/company/");
		
		System.out.println("List of all the links in the page");
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		for(WebElement element:all_links)
			System.out.println(element.getText());
		
		
		System.out.println("END OF CODE");
		Toolkit.getDefaultToolkit().beep();
		driver.close();
	}

}
