package beverages.v1_sk;

public class Tea implements Beverage {
    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public double getPrice() {
        return 3.50;
    }
}
