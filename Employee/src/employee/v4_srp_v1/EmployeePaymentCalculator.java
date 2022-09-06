package employee.v4_srp_v1;

public class EmployeePaymentCalculator implements PaymentCalculator {
    Employee employee;

    public EmployeePaymentCalculator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculatePay() {
        return switch (employee.getEmployeeType()) {
            case REGULAR -> employee.getSalary() / 12 + employee.getOvertime() * 50;
            case HOURED -> employee.getOvertime() * 90;
            case COMMISSIONED -> employee.getProject().getAssets() * 0.18;
//            default -> throw new IllegalArgumentException("Unknown Employee Type!");
        };
    }
}
