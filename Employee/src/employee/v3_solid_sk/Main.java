package employee.v3_solid_sk;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String[] args) {
        Project p = new Project("The Project", 3500.0);
        Employee regular = new Employee(0, "Regular Joe", 5000.0, 3, p, EmployeeType.REGULAR);
        Employee houred = new Employee(1, "Houred Sally", 0.0, 42, p, EmployeeType.HOURED);
        Employee commissioned = new Employee(2, "Commissioned Jack", 0.0, 0, p, EmployeeType.COMMISSIONED);
        ArrayList<Employee> employees = new ArrayList<>(List.of(regular, houred, commissioned));

        for (Employee e : employees) {
            System.out.printf("Employee %s works %s hours and earns $%.2f.%n", e.getName(), e.reportHours(),
                    e.calculatePay());
        }
        employees.forEach(Employee::printReport);
    }
}
