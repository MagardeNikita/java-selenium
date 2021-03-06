package drivermethods;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		
        driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
      Select s= new Select(driver.findElement(By.id("select-demo")));
      s.selectByIndex(0);
      s.selectByValue("Tuesday");
      s.selectByVisibleText("Wednesday");
      
      List<WebElement> list =s.getOptions();
      
      System.out.println("list size "+list.size());   //also counts the first option which says select option
      
      Iterator it = list.iterator();
      
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      s.selectByIndex(list.size()-1); //selects last element
      
      s.selectByIndex(list.size()-2); //selects 2nd last element
      
      
     // s.deselectByVisibleText("Wednesday");    You may only deselect options of a multi-select
      
     
      
		
		
		
		
	}

}
