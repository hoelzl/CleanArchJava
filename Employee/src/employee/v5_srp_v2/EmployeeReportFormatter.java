package employee.v5_srp_v2;

public class EmployeeReportFormatter implements ReportFormatter {
    @Override
    public String reportHours(Employee employee) {
        return switch (employee.getEmployeeType()) {
            case REGULAR -> String.format("Employee %s works %.1f hours per Week.", employee.getName(),
                    calculateRegularHours(employee) + employee.getOvertime());
            case HOURED -> String.format("Freelancer %s works %d hours per Week.", employee.getName(), employee.getOvertime());
            case COMMISSIONED -> String.format("%s is commissioned, working hours are not relevant!", employee.getName());
            // default -> throw new IllegalArgumentException("Unknown Employee Type!");
        };
    }

    private double calculateRegularHours(Employee ignoredEmployee) {
        return 40.5;
    }
}
