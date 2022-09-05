package employee.v2;

public class CommissionedPaymentCalculator implements PaymentCalculator {
    Project project;

    public CommissionedPaymentCalculator(Project project) {
        this.project = project;
    }

    @Override
    public double calculatePay() {
        return project.getCommissionedPay();
    }
}
