package weather.v2;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // Sensors working...
        weatherData.setTemperature(18.3);
        weatherData.setHumidity(23.4);
        weatherData.setPressure(1012.1);
        weatherData.measurementChanged();
    }
}
