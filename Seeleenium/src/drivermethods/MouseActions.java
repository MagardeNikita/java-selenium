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
import org.openqa.selenium.devtools.v88.browser.Browser;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java");
		
		
        driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	 
	    //Mouse hover
	    Actions action = new Actions(driver);
//	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Manual')]"))).build().perform();
//	    
//	    driver.findElement(By.xpath("//a[contains(text(),'Manual Testing Tutorial')]")).click();
	    
	    //Drag and Drop
	     driver.get("https://demoqa.com/droppable/");
	     
	     action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
	     //it replaces the new screenshot with older one with same file name
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     try {
			FileUtils.copyFile(src, new File("C:\\Users\\NI336519\\Pictures\\Screenshots\\error.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.quit();
	}
	
}
