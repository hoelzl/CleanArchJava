package beverages.v2_decorator;


public class Milk implements Beverage {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return String.format("%s with milk", beverage.getName());
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 0.5;
    }
}
