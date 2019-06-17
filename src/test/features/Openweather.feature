Feature: Openmap Weather Forecast

  Scenario: Know the number of days in Sydney where the temperature is predicated to be above 20 degrees in the next 2 weeks
    Given I Call the Api Openweatherapi for the city Sydney
   When  I verify the number of days with temperature above "20" degree
    Then I should see the number of days  with temperature above "20" degree
    
    Scenario: Know the number of days in Sydney where the weather is predicated to be sunny in the next 2 weeks
    Given I Call the Api Openweatherapi for the city Sydney
   When  I verify the number of days where weather is "Clear"
    Then I should see the number of days where weather is "Clear"
   