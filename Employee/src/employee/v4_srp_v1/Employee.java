package employee.v4_srp_v1;

@SuppressWarnings({"unused", "DuplicatedCode"})
public class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final int overtime;
    private final Project project;
    private final EmployeeType employeeType;

    public Employee(int id, String name, double salary, int overtime, Project project, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.overtime = overtime;
        this.project = project;
        this.employeeType = employeeType;
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

    public int getOvertime() {
        return overtime;
    }

    public Project getProject() {
        return project;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
}
