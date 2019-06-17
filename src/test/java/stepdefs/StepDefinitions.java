package stepdefs;

import com.cucumber.listener.Reporter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.Holder;

public class StepDefinitions {

    Holder jsonPlaceHolder = new Holder();

    @When("^I Call the Api Openweatherapi for the city Sydney$")
    public void iGetAListOfBlogPostsUsingTheAPIEndpoint() {
        jsonPlaceHolder.getWeatherByCity();
    }

    @When("^I verify the number of days with temperature above \"([^\"]*)\" degree$")
    public void getNumberOfDaysWithTempMoreThanProvided(Float temperature) {
        jsonPlaceHolder.getNumberOfDaysWithTempMoreThanProvided(temperature);
    }

@Then("^I should see the number of days  with temperature above \"([^\"]*)\" degree$")
public void i_should_see_the_number_of_days(Float temperature)
{
	Reporter.addStepLog("Number of days with temperature more than "+ temperature +"degree in Sydeny: " 
			+ jsonPlaceHolder.getNumberOfDays());
	System.out.println();
	
	}

@When("^I verify the number of days where weather is \"([^\"]*)\"$")

	  public void getNumberOfDaysWithWeatherSunny(String weather) {
	        jsonPlaceHolder.getNumberOfDaysWithWeatherSunny(weather);
	    }

@Then("^I should see the number of days where weather is \"([^\"]*)\"$")

public void i_should_see_the_number_of_days_sunny(String weather) {
	
	Reporter.addStepLog("Number of days in sydney where weather is clear: " +
			jsonPlaceHolder.getNumberOfDaysSunny(weather));
	
  }
}


