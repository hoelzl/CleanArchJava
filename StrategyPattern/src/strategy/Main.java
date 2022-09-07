package strategy;

public class Main {
    public static void main(String[] args) {
        Strategy s = new ConcreteAlgorithmA();
        Context c = new Context(s, "context 1");
        c.method();
    }
}
