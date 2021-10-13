package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = {"src/test/resources/features/LoginPage.feature"},
	glue = {"stepdefinitions", "hooks"}
)
public class TestRunner {

}
