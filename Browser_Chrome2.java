package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Chrome2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\worksoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Welcome");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"UserFirstName\"]")).sendKeys("Shivani");
		driver.findElement(By.xpath("//input[@name=\"UserLastName\"]")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name=\"UserEmail\"]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"CompanyName\"]")).sendKeys("MyCompany");
		driver.findElement(By.xpath("//input[@name=\"UserPhone\"]")).sendKeys("9856765321");
		
		WebElement jt =driver.findElement(By.xpath("//select[@name=\"UserTitle\"]"));
		Select jobtitle=new Select(jt);

		jobtitle.selectByIndex(5);
		WebElement selected = jobtitle.getFirstSelectedOption();
		System.out.println(selected.getText());
		List<WebElement> jobtitle_options = jobtitle.getOptions();
		
		System.out.println("Options in the job title dropdown are: ");
		for(WebElement titlename:jobtitle_options)
			System.out.println(titlename.getText());
		
		WebElement e=driver.findElement(By.xpath("//select[@name=\"CompanyEmployees\"]"));
		Select Employees=new Select(e);
		Employees.selectByIndex(1);
		
		System.out.println("Sign Up Page -- Title of Page is: "+driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();

		
	}

}
