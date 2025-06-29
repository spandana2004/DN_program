import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class WeatherServiceTest {

    @Test
    public void testGetWeatherReport() {
        // Step 1: Create mock object
        WeatherApiClient mockApiClient = mock(WeatherApiClient.class);

        // Step 2: Stub the method
        when(mockApiClient.fetchWeather("Bangalore")).thenReturn("Sunny");

        // Step 3: Use mock in service
        WeatherService weatherService = new WeatherService(mockApiClient);

        // Assertion
        assertEquals("Sunny", weatherService.getWeatherReport("Bangalore"));
    }
}
