import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel successLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);
        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);

        panel.add(userLabel);
        panel.add(passwordLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165,25);
        panel.add(passwordField);

        button = new JButton("Login");
        button.setBounds(10, 80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        successLabel = new JLabel();
        successLabel.setBounds(100,110,300,25);
        successLabel.setText("");
        panel.add(successLabel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameField.getText();
        String password = passwordField.getText();
        successLabel.setText(user.equals(password) ? "Success login!" : "Password must match user!");

        usernameField.setText("");
        passwordField.setText("");
    }
}
