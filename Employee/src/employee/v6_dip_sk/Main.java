package employee.v6_dip_sk;

import employee.v6_dip_sk.core.Employee;

public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee(123, "Jane Doe", 5000.0);
        jane.create();
        jane.retrieve(123);
        jane.update();
        jane.delete();
    }
}
