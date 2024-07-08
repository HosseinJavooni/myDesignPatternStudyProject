package structuralDesignPatterns.adapter;

public class AppForTestingAdapter {
	public static void main(String[] args) {
        // Create an instance of the new API
		WeatherServiceV2 weatherServiceV2 = new ExternalWeatherService();
        
        // Create an adapter for the new API
        WeatherService weatherServiceAdapter = new WeatherServiceAdapter(weatherServiceV2);
        
        // Use the adapter to fetch weather data
        String weather = weatherServiceAdapter.getWeather();
        System.out.println(weather);
    }
}
