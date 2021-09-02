package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IED_Example {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("http:\\google.com");
		 System.out.println("END OF CODE");
	}

}
