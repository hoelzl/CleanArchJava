package employee.v5_srp_v2;

@SuppressWarnings({"unused", "DuplicatedCode", "FieldMayBeFinal"})
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int overtime;
    private Project project;
    private EmployeeType employeeType;
    private PaymentCalculator paymentCalculator;
    private ReportFormatter reportFormatter;
    private EmployeePrinter printer;

    public Employee(int id, String name, double salary, int overtime, Project project, EmployeeType employeeType,
                    PaymentCalculator paymentCalculator, ReportFormatter reportFormatter, EmployeePrinter printer) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.overtime = overtime;
        this.project = project;
        this.employeeType = employeeType;
        this.paymentCalculator = paymentCalculator;
        this.reportFormatter = reportFormatter;
        this.printer = printer;
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

    public double calculatePay() {
        return paymentCalculator.calculatePay(this);
    }

    public String reportHours() {
        return reportFormatter.reportHours(this);
    }

    public void printReport() {
        printer.printReport(this);
    }

    public void saveEmployee() {
        System.out.printf("Saving Employee %s to database...\n", getName());
    }

}
