package drivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Locators {

	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		
		//launching url
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//implicit wait - wait for page load and all elements to be loaded on page, if loaded before 30 seconds, it will save remaining
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    
	    
	    //to get title
	    System.out.println(driver.getTitle());
	    
	    
	    
	    //dynamic xpath
	   // driver.findElement(By.xpath("//a[@class='login']"));
	    //driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	   // driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
	   // driver.findElement(By.xpath("//a[starts-with(@class,'log')]")).click();
	     // driver.findElement(By.xpath("//a[ends-with(@title,'account')]")).click(); - giving error
	    //driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	   // driver.findElement(By.xpath("//a[text()='Sign in')]")).click();	          - not working
	    //driver.findElement(By.xpath("//a[@class='login' or @name='login']")).click();
	    //driver.findElement(By.xpath("//a[@class='login' and @name='login']")).click(); - fails if both are not true, nosuchelement exc
	    //driver.findElement(By.xpath("//a[@class='login' or @title='Log in to your customer account']")).click();
	    
	    
	    
	    //explicit wait
	    WebElement  wait =new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='login']"))));
	    wait.click();
	    
	    
	    
	    System.out.println(driver.getTitle());
	    //System.out.println(driver.getPageSource());
	    
	    
	    
	    String text = driver.findElement(By.xpath("//h3[contains(text(),'Already registered?')]")).getText();
	    System.out.println(text);
	    
	   driver.findElement(By.id("email")).sendKeys("magardenikita@gmail.com");
	   driver.findElement(By.name("passwd")).sendKeys("Wipro@123");
	   driver.findElement(By.cssSelector("#SubmitLogin")).sendKeys(Keys.ENTER);
	   System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText());
	   
	   
	   driver.findElement(By.linkText("Women")).click();
	   driver.findElement(By.partialLinkText("Contact")).click();
	   System.out.println(driver.getTitle());
	
	    
	    driver.quit();
	}
}
