package employee.v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee regular = new Employee(0, "Regular Joe", new RegularPaymentCalculator(5000.0, 3));
        Employee houred = new Employee(1, "Houred Sally", new HouredPaymentCalculator(42));

        Project p = new Project("The Project", 3500.0);
        Employee commissioned = new Employee(2, "Commissioned Jack", new CommissionedPaymentCalculator(p));

        ArrayList<Employee> employees = new ArrayList<>(List.of(regular, houred, commissioned));

        for (Employee e : employees) {
            System.out.println("Employee " + e.getName() + " earns " + e.calculatePay());
        }
    }
}
