package structuralDesignPatterns.adapter;

//Adapter class that implements the WeatherService interface
public class WeatherServiceAdapter implements WeatherService {
	private WeatherServiceV2 externalService;
	
	public WeatherServiceAdapter(WeatherServiceV2 externalService) {
		this.externalService = externalService;
	}

	// Adapter class that implements the WeatherService interface
	@Override
	public String getWeather() {
		// Convert the response from the new API to match the expected format
        String weatherData = externalService.fetchWeatherData();
        return "Today's weather is: " + weatherData;
	}

}
