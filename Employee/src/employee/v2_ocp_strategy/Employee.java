package employee.v2_ocp_strategy;

public class Employee {
    int id;
    String name;
    PaymentCalculator paymentCalculator;

    public Employee(int id, String name, PaymentCalculator paymentCalculator) {
        this.id = id;
        this.name = name;
        this.paymentCalculator = paymentCalculator;
    }

    @SuppressWarnings("unused")
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    double calculatePay() {
        return paymentCalculator.calculatePay();
    }
}
