package employee.v5_srp_v2;

public class EmployeeColorPrinter implements EmployeePrinter {
    PaymentCalculator pc;
    ReportFormatter rf;

    public EmployeeColorPrinter(PaymentCalculator pc, ReportFormatter rf) {
        this.pc = pc;
        this.rf = rf;
    }

    @Override
    public void printReport(Employee employee) {
        System.out.printf("Employee %s earns $%.2f.%n", employee.getName(), pc.calculatePay(employee));
        System.out.println(rf.reportHours(employee));
    }
}
