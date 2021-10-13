package drivermethods;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrameWindow {
	
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.globalsqa.com/demo-site/dialog-boxes/");
		
		
        driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //frame
	    List<WebElement> list = driver.findElements(By.tagName("iframe"));
	    System.out.println(list.size());
	    
	    Iterator it = list.iterator();
		driver.switchTo().frame(0);
		//driver.switchTo().parentFrame(); 
		
		driver.findElement(By.id("create-user")).click();
				
		
		
		//alert
//		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//		 driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
//		
//		
//		Alert alert = driver.switchTo().alert();		
//		System.out.println(alert.getText());
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
//		System.out.println(alert.getText());
//		alert.accept();
//		
//		
//		//input test on confirmation box
//		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
//		driver.switchTo().alert().sendKeys("nikita");
//		//alert.sendKeys("nikita"); - cant see it entering ----ERROR-----
//		driver.switchTo().alert().accept();
//		//driver.quit();
//		
		
		
		
		//Window - multiple windows	
		 
		  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")).click(); 
		  driver.findElement(By.id("followall")).click();
		  
		  Set<String> set =driver.getWindowHandles();
		   Iterator it1 = set.iterator();
		   System.out.println("number of windows opened "+set.size()); 
		   while(it1.hasNext())
		   { 
		  driver.switchTo().window(it1.next().toString()); 
		  System.out.println(driver.getCurrentUrl()); 
		  }
		 		
		
	}

}
