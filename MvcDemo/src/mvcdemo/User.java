package mvcdemo;

public class User {
    private String name;
    private String password;

    public User() {
        this.name = "";
        this.password = "";
    }

    public void setName(String name) {
        System.out.println("Setting name to " + name);
        this.name = name;
    }

    public void setPassword(String password) {
        System.out.println("Setting password to " + password);
        this.password = password;
    }
}
