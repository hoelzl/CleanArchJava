package beverages.v2_decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        printDescription(coffee);
        coffee = new Milk(coffee);
        printDescription(coffee);
        coffee = new Sugar(coffee);
        printDescription(coffee);
        System.out.println();
        Beverage tea = new Tea();
        printDescription(tea);
        tea = new Sugar(new Milk(tea));
        printDescription(tea);
    }

    static void printDescription(Beverage b) {
        System.out.printf("%s costs %.2f.%n", b.getName(), b.getPrice());
    }
}
