package employee.v7_dip.core;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final DbInterface db;

    public Employee(int id, String name, double salary, DbInterface db) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.db = db;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Create the record for this employee in the database.
     */
    public void create() {
        System.out.printf("Inserting employee #%d into database...%n", id);
        db.create(this);
    }

    /**
     * Overwrite the state of this employee with the data for employee with the given id from the database.
     */
    public void retrieve(int id) {
        System.out.printf("Retrieving employee #%d from database...%n", id);
        db.retrieve(id, this);
    }

    /**
     * Update the data of this employee from the database.
     */
    public void update() {
        System.out.printf("Updating employee #%d in database...%n", id);
        db.update(this);
    }

    /**
     * Delete the record corresponding to this employee from the database.
     */
    public void delete() {
        System.out.printf("Deleting Employee #%d from database...%n", id);
        db.delete(this);
    }
}
