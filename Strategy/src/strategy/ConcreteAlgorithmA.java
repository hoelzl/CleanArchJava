package strategy;

public class ConcreteAlgorithmA implements Strategy {
    @Override
    public void algorithm(Context context) {
        System.out.println("Algorithm A: " + context.name);
    }
}
