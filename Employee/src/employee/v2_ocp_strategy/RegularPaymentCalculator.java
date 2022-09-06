package employee.v2_ocp_strategy;

public class RegularPaymentCalculator implements PaymentCalculator {
    double salary;
    int overtime;

    public RegularPaymentCalculator(double salary, int overtime) {
        this.salary = salary;
        this.overtime = overtime;
    }

    @Override
    public double calculatePay() {
        return salary + 60.0 * overtime;
    }
}
