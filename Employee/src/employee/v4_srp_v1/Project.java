package employee.v4_srp_v1;

public class Project {
    private String name;
    private double assets;

    public Project(String name, double assets) {
        this.name = name;
        this.assets = assets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAssets() {
        return assets;
    }

    @SuppressWarnings("unused")
    public void setAssets(double assets) {
        this.assets = assets;
    }
}
