public class WeatherService {
    private WeatherApiClient apiClient;

    public WeatherService(WeatherApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String getWeatherReport(String city) {
        return apiClient.fetchWeather(city);
    }
}
