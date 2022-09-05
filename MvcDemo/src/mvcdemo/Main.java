package mvcdemo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        User user = new User();
        View view = new View();
        LoginListener observer = new Controller(view, user);
        SwingUtilities.invokeLater(() -> {
            view.pack();
            view.setVisible(true);
            System.exit(0);
        });
    }
}
