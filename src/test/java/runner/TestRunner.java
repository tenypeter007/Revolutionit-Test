package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:"},
		glue = {"stepdefs"},
		features = {"src/test/features"})
public class TestRunner {}
