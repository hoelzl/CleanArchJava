package employee.v4_srp_v1;

public class EmployeeColorPrinter implements Printer {
    Employee employee;
    PaymentCalculator pc;
    ReportFormatter rf;

    public EmployeeColorPrinter(Employee employee, PaymentCalculator pc, ReportFormatter rf) {
        this.employee = employee;
        this.pc = pc;
        this.rf = rf;
    }

    @Override
    public void printReport() {
        System.out.printf("Employee %s earns $%.2f.%n", employee.getName(), pc.calculatePay());
        System.out.println(rf.reportHours());
    }
}
