package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;

import driverfactory.initdriver;
import io.cucumber.java.Before;

public class LoginHooks {
	
	 initdriver driverfactory;
	 WebDriver driver;
	 String browsername;
	 Properties prop;
	 ConfigReader configreader;
	 
	 @Before(order=0)
	 public void getProperty() {
		 configreader = new ConfigReader();
		 prop = configreader.readproperty();
		 browsername = prop.getProperty("browser");
		 System.out.println(browsername);
	 }
	 
	@Before(order=1)
	public void launchUrl() {
		driverfactory = new initdriver();
		driverfactory.initDriver(browsername);
		driver =initdriver.getDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

}
