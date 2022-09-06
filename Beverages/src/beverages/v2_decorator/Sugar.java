package beverages.v2_decorator;


public class Sugar implements Beverage {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return String.format("%s with sugar", beverage.getName());
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 0.2;
    }
}
