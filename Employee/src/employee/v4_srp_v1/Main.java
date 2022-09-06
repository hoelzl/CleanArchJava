package employee.v4_srp_v1;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String[] args) {
        Project p = new Project("The Project", 35000.0);
        Employee regular = new Employee(0, "Regular Joe", 50000.0, 3, p, EmployeeType.REGULAR);
        Employee houred = new Employee(1, "Houred Sally", 0.0, 42, p, EmployeeType.HOURED);
        Employee commissioned = new Employee(2, "Commissioned Jack", 0.0, 0, p, EmployeeType.COMMISSIONED);
        ArrayList<Employee> employees = new ArrayList<>(List.of(regular, houred, commissioned));

        for (Employee e : employees) {
            var cp = new EmployeeColorPrinter(e, new EmployeePaymentCalculator(e), new EmployeeXmlReportFormatter(e));
            cp.printReport();
            var dao = new SqlEmployeeDao(e);
            dao.saveEmployee();
        }
    }
}
