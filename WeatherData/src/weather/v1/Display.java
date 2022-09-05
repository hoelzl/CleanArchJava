package weather.v1;

public interface Display {
    String getName();
    default void update(double temperature, double humidity, double pressure) {
        System.out.println(getName() + " updated: " + temperature + ", " + humidity + ", " + pressure);
    }
}
