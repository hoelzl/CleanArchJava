package employee.v7_dip.db;

import employee.v7_dip.core.DbInterface;
import employee.v7_dip.core.Employee;

public class SqlDbAdapter implements DbInterface {
    SqlDatabase db = new SqlDatabase();

    public void create(Employee e) {
        db.query(String.format("INSERT INTO Employees (%d, %s, %.2f);", e.getId(), e.getName(), e.getSalary()));
    }

    public void retrieve(int id, Employee e) {
        db.query(String.format("SELECT (name, salary) FROM Employees WHERE id = %d;", id));
    }

    public void update(Employee e) {
        db.query(String.format("UPDATE Employees SET name = %s, salary = %.2f) WHERE id = %d;", e.getName(),
                e.getSalary(), e.getId()));
    }

    public void delete(Employee e) {
        db.query(String.format("DELETE FROM Employees WHERE id = %d;", e.getId()));
    }
}
