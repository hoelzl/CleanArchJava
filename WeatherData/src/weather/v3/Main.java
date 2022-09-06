package weather.v3;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerDisplay(new CurrentConditionsDisplay());
        weatherData.registerDisplay(new ForecastDisplay());
        weatherData.registerDisplay(new StatisticsDisplay());

        // Sensors working...
        weatherData.setTemperature(18.3);
        weatherData.setHumidity(23.4);
        weatherData.setPressure(1012.1);
        // weatherData.measurementChanged();
    }
}
