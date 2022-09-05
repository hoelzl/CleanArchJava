package weather.v1;

import java.util.ArrayList;

public class WeatherData {
    double temperature = 0.0;
    double humidity = 0.0;
    double pressure = 0.0;

    Display currentConditionsDisplay = new CurrentConditionsDisplay();
    Display forecastDisplay = new ForecastDisplay();
    Display statisticsDisplay = new StatisticsDisplay();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void measurementChanged() {
        double temperature = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
