package structuralDesignPatterns.adapter;

//ExternalWeatherService representing the new API with a different interface
public class ExternalWeatherService implements WeatherServiceV2{
	@Override
	public String fetchWeatherData() {
        // Logic to fetch weather data from the new API
        return "Sunny";
    }
}
