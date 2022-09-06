package employee.v7_dip;

import employee.v7_dip.core.Employee;
import employee.v7_dip.db.SqlDbAdapter;

public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee(123, "Jane Doe", 5000.0, new SqlDbAdapter());
        jane.create();
        jane.retrieve(123);
        jane.update();
        jane.delete();
    }
}
