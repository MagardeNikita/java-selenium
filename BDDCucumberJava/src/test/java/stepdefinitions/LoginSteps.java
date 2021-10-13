package stepdefinitions;

import driverfactory.initdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyLoginPage;

public class LoginSteps {
	

	MyLoginPage loginpage= new MyLoginPage(initdriver.getDriver());
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
	    System.out.println("on a hone page");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		System.out.println(loginpage.getTitle());
		loginpage.enterName(string);
	    
	}

	@Then("I validate title")
	public void i_validate_title() {
		System.out.println(loginpage.getTitle());
	    
	}
}
