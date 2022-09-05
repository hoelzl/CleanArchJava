package employee.v1;

public class Project {
    private String name;
    private double commissionedPay;

    public Project(String name, double commissionedPay) {
        this.name = name;
        this.commissionedPay = commissionedPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommissionedPay() {
        return commissionedPay;
    }

    public void setCommissionedPay(double commissionedPay) {
        this.commissionedPay = commissionedPay;
    }
}
