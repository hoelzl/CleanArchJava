package employee.v5_srp_v2;

public class EmployeePaymentCalculator implements PaymentCalculator {
    @Override
    public double calculatePay(Employee employee) {
        return switch (employee.getEmployeeType()) {
            case REGULAR -> employee.getSalary() / 12 + employee.getOvertime() * 50;
            case HOURED -> employee.getOvertime() * 90;
            case COMMISSIONED -> employee.getProject().getAssets() * 0.18;
        };
    }
}
