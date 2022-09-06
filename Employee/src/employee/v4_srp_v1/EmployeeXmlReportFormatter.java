package employee.v4_srp_v1;

public class EmployeeXmlReportFormatter implements ReportFormatter {
    Employee employee;

    public EmployeeXmlReportFormatter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String reportHours() {
        return switch (employee.getEmployeeType()) {
            case REGULAR -> String.format("Employee %s works %.1f hours per Week.", employee.getName(),
                    calculateRegularHours() + employee.getOvertime());
            case HOURED -> String.format("Freelancer %s works %d hours per Week.", employee.getName(), employee.getOvertime());
            case COMMISSIONED -> String.format("%s is commissioned, working hours are not relevant!", employee.getName());
            // default -> throw new IllegalArgumentException("Unknown Employee Type!");
        };
    }

    private double calculateRegularHours() {
        return 40.5;
    }
}
