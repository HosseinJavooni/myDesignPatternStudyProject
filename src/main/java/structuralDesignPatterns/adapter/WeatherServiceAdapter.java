package structuralDesignPatterns.adapter;

//Adapter class that implements the WeatherService interface
public class WeatherServiceAdapter implements WeatherService {
	private WeatherServiceV2 weatherServiceV2;
	
	public WeatherServiceAdapter(WeatherServiceV2 weatherServiceV2) {
		this.weatherServiceV2 = weatherServiceV2;
	}

	// Adapter class that implements the WeatherService interface
	@Override
	public String getWeather() {
		// Convert the response from the new API to match the expected format
        String weatherData = weatherServiceV2.fetchWeatherData();
        return "Today's weather is: " + weatherData;
	}

}
