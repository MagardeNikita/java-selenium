package drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		
		//launching url
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.xpath("//label[text()='Option 1']/input")).click();
		
		
	}

}
