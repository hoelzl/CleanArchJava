package beverages.v1_sk;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();
        printDescription(coffee);
        printDescription(tea);
    }

    static void printDescription(Beverage b) {
        System.out.printf("%s costs %.2f.%n", b.getName(), b.getPrice());
    }
}
