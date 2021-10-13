package driverfactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class initdriver {
	
	 static WebDriver driver;
	 
	
	public void initDriver(String browsername) {
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
			
			 Alert alert = driver.switchTo().alert(); 
		}
		
		
	}
	
	public static synchronized WebDriver getDriver() {
		return driver;
	}

}
