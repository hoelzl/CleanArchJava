package employee.v5_srp_v2;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String[] args) {
        Project p = new Project("The Project", 35000.0);
        PaymentCalculator pc = new EmployeePaymentCalculator();
        ReportFormatter rf = new EmployeeReportFormatter();
        EmployeePrinter ep = new EmployeeColorPrinter(pc, rf);
        Employee regular = new Employee(0, "Regular Joe", 50000.0, 3, p, EmployeeType.REGULAR, pc, rf, ep);
        Employee houred = new Employee(1, "Houred Sally", 0.0, 42, p, EmployeeType.HOURED, pc, rf, ep);
        Employee commissioned = new Employee(2, "Commissioned Jack", 0.0, 0, p, EmployeeType.COMMISSIONED, pc, rf, ep);
        ArrayList<Employee> employees = new ArrayList<>(List.of(regular, houred, commissioned));

        for (Employee e : employees) {
            System.out.printf("Employee %s earns $%.2f.%n", e.getName(), e.calculatePay());
        }
        employees.forEach(Employee::printReport);
        employees.forEach(Employee::saveEmployee);
    }
}
