package mvcdemo;

public class Controller implements LoginListener {
    private final View view;
    private final User user;

    public Controller(View view, User user) {
        this.view = view;
        this.user = user;
        view.setLoginListener(this);
    }

    @Override
    public void performLogin() {
        user.setName(view.getNameField().getText());
        user.setPassword(String.valueOf(view.getPasswordField().getPassword()));
    }
}
