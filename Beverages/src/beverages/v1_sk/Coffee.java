package beverages.v1_sk;

public class Coffee implements Beverage {
    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 2.95;
    }
}
