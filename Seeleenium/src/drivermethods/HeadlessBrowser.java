package drivermethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadlessBrowser {

	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
				
		
		 driver.get("https://www.globalsqa.com/demo-site/dialog-boxes/");
		  
	     		
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	     
	
	}
}

