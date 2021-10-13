package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyLoginPage {
	
	WebDriver driver;
	//By locators
	
	private By email = By.id("email_create");
	
	//constructor
	
	public MyLoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//methods
	
	public void enterName(String username) {
		driver.findElement(email).sendKeys(username);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void executor() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		//js.executeScript(null, null);
	}
}
