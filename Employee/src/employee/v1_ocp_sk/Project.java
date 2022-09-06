package employee.v1_ocp_sk;

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

    @SuppressWarnings("unused")
    public void setCommissionedPay(double commissionedPay) {
        this.commissionedPay = commissionedPay;
    }
}
