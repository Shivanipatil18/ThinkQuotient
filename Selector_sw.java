package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Selector_sw {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement name=driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		name.sendKeys("Shivani Patil");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("12345");
		
		WebElement login=driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		login.sendKeys("s.patil");
		
		WebElement mobile=driver.findElement(By.id("mobno"));
		WebElement mobile1=driver.findElement(By.xpath("//input[contains(@name,'mobno')]"));
		mobile.sendKeys("7834263487");
		mobile.clear();
		Thread.sleep(2000);
		mobile1.sendKeys("8976436283");
		
		
		
		
	}
}
