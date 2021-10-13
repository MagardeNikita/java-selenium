package drivermethods;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI336519\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		
		//sendKeys
		js.executeScript("arguments[0].value='niki';", driver.findElement(By.name("first_name")));
		
		
		//click		
		//js.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[1]/div/a")));
		
		
		
		//getTitle
		System.out.println(js.executeScript("return document.title;").toString());
		
		
		
		//getInnerText
		System.out.println(js.executeScript("return document.documentElement.innerText;").toString());
		
				
		
		
		//Scroll down till end of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
		//scroll till the element
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")));
		
		
		//refresh
		js.executeScript("history.go(0)");
		//create alert
		js.executeScript("alert('message')");
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		
		
		//highlight a element
		for(int i=0;i<50;i++)
		{
			js.executeScript("arguments[0].style.backgroundColor='blue'", driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")));
			js.executeScript("arguments[0].style.backgroundColor='white'", driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")));
			
			
		}
		
		String dateval= "20-10-2021";
		
		js.executeScript("arguments[0].style.border='10px red solid'", driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")));
		
		driver.get("https://www.spicejet.com/");
		
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"))); //not working
				
	}

}
