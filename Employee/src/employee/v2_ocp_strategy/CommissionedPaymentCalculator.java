package employee.v2_ocp_strategy;

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
