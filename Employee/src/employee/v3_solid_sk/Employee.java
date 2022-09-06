package employee.v3_solid_sk;

@SuppressWarnings({"unused", "DuplicatedCode", "FieldMayBeFinal"})
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int overtime;
    private Project project;
    private EmployeeType employeeType;

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
        return switch (employeeType) {
            case REGULAR -> salary / 12 + overtime * 50;
            case HOURED -> overtime * 90;
            case COMMISSIONED -> project.getAssets() * 0.18;
//            default -> throw new IllegalArgumentException("Unknown Employee Type!");
        };
    }

    public String reportHours() {
        return switch (employeeType) {
            case REGULAR -> String.format("Employee %s works %.1f hours per Week.", getName(),
                    calculateRegularHours() + overtime);
            case HOURED -> String.format("Freelancer %s works %d hours per Week.", getName(), overtime);
            case COMMISSIONED -> String.format("%s is commissioned, working hours are not relevant!", getName());
            // default -> throw new IllegalArgumentException("Unknown Employee Type!");
        };
    }

    public void printReport() {
        System.out.printf("Employee %s earns $%.2f.%n", getName(), calculatePay());
        System.out.println(reportHours());
    }

    public void saveEmployee() {
        System.out.printf("Saving Employee %s to database...\n", getName());
    }

    private double calculateRegularHours() {
        return 40.5;
    }
}
