package weather.v3;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    double temperature = 0.0;
    double humidity = 0.0;
    double pressure = 0.0;

    List<Display> displays = new ArrayList<>();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        measurementChanged();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        measurementChanged();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        measurementChanged();
    }

    public void registerDisplay(Display display) {
        displays.add(display);
    }

    public void measurementChanged() {
        double temperature = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        for (Display display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
}
