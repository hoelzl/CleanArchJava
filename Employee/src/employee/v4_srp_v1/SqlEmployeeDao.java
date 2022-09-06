package employee.v4_srp_v1;

public class SqlEmployeeDao implements EmployeeDao {
    Employee employee;

    public SqlEmployeeDao(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void saveEmployee() {
        System.out.printf("Saving Employee %s to database...\n", employee.getName());
    }

    @Override
    public void deleteEmployee() {
        System.out.printf("Deleting Employee %s from database...\n", employee.getName());
    }
}
