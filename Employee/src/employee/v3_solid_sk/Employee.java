package employee.v3_solid_sk;

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

    public Project getProject() {
        return project;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double calculatePay() {
        //noinspection DuplicatedCode
        switch (employeeType) {
            case REGULAR -> {
                return salary + 60.0 * overtime;
            }
            case HOURED -> {
                return 50.0 * overtime;
            }
            case COMMISSIONED -> {
                return project.getCommissionedPay();
            }
        }
        return 0.0;
    }

    public String reportHours() {
        return String.format("%.1f", calculateRegularHours());
    }

    public void printReport() {
        System.out.printf("Employee %s works %s hours and earns $%.2f.%n", getName(), reportHours(), calculatePay());
    }

    private double calculateRegularHours() {
        switch (employeeType) {
            case REGULAR -> {
                return 40.0 + overtime;
            }
            case HOURED -> {
                return overtime;
            }
            default -> {
                return 40.0;
            }
        }
    }
}
