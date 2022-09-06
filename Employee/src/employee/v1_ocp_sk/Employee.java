package employee.v1_ocp_sk;

@SuppressWarnings("unused")
public class Employee {
    int id;
    String name;
    double salary;
    int overtime;
    Project project;
    EmployeeType employeeType;

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

    double calculatePay() {
        switch (employeeType) {
            case REGULAR -> { return salary + 60.0 * overtime; }
            case HOURED -> { return 50.0 * overtime; }
            case COMMISSIONED -> { return project.getCommissionedPay(); }
        }
        return 0.0;
    }
}
