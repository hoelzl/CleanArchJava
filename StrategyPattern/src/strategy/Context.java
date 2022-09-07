package strategy;

public class Context {
    private final Strategy strategy;
    public String name;

    public Context(Strategy strategy, String name) {
        this.strategy = strategy;
        this.name = name;
    }

    void method() {
        strategy.algorithm(this);
    }
}
