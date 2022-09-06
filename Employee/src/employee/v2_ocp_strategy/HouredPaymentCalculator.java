package employee.v2_ocp_strategy;

public class HouredPaymentCalculator implements PaymentCalculator {
    int hoursWorked;

    public HouredPaymentCalculator(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return 50.0 * hoursWorked;
    }
}
