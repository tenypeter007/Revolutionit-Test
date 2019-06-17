package objects;

import com.jayway.restassured.path.json.JsonPath;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import java.util.*;

import static io.restassured.RestAssured.given;

public class Holder {
	private Response response;
	private RequestSpecification request;
	int numberOfDay = 0;
	int numberOfDaySunny = 0;

	private String ENDPOINT_GET_POSTS_FROM_JSONPLACEHOLDER = "https://openweathermap.org/data/2.5/forecast/daily/?appid=b6907d289e10d714a6e88b30761fae22&id=2147714&units=metric";

	public void getWeatherByCity() {
		request = given();
		response = request.when().get(ENDPOINT_GET_POSTS_FROM_JSONPLACEHOLDER);

	}

	public void getNumberOfDaysWithTempMoreThanProvided(Float temperature) {
		JsonPath jsonPath = new JsonPath(response.asString());
		List<Float> list_max_temp = jsonPath.getList("list.temp.max");
		for (Float s : list_max_temp) {
			if (s > temperature) {
				numberOfDay++;
			}
		}

	}

	public void getNumberOfDaysWithWeatherSunny(String weather) {
		JsonPath jsonPath = new JsonPath(response.asString());
		List<List<String>> list_weather_sunny = jsonPath.getList("list.weather.main");
		System.out.println(list_weather_sunny);
		for (List<String> s : list_weather_sunny) {
			if (s.contains(weather)) {
				numberOfDaySunny++;
			}
		}

	}

	public int getNumberOfDays() {

		return numberOfDay;
	}

	public int getNumberOfDaysSunny(String weather) {

		return numberOfDaySunny;
	}
}
