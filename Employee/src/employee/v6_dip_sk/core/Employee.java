package employee.v6_dip_sk.core;

import employee.v6_dip_sk.db.SqlDatabase;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final SqlDatabase db = new SqlDatabase();

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Create the record for this employee in the database.
     */
    public void create() {
        System.out.printf("Inserting employee #%d into database...%n", id);
        db.query(String.format("INSERT INTO Employees (%d, %s, %.2f);", id, name, salary));
    }

    /**
     * Overwrite the state of this employee with the data for employee with the given id from the database.
     */
    public void retrieve(int id) {
        System.out.printf("Retrieving employee #%d from database...%n", id);
        db.query(String.format("SELECT (name, salary) FROM Employees WHERE id = %d;", id));
    }

    /**
     * Update the data of this employee from the database.
     */
    public void update() {
        System.out.printf("Updating employee #%d in database...%n", id);
        db.query(String.format("UPDATE Employees SET name = %s, salary = %.2f) WHERE id = %d;", name, salary, id));
    }

    /**
     * Delete the record corresponding to this employee from the database.
     */
    public void delete() {
        System.out.printf("Deleting Employee #%d from database...%n", id);
        db.query(String.format("DELETE FROM Employees WHERE id = %d;", id));
    }
}
