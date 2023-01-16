package views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.DashboardController;
import controllers.LoginController;

public class LoginView extends JFrame{
    private LoginController _loginC = new LoginController();
    JLabel label,userLabel,passLabel;
    JTextField userField;
    JPasswordField passField;
    JButton button;
    boolean status;
    
    public LoginView(){

        setBounds(0,0,375,481);
        setLayout(null);
        jLabel();
        jLogin();
    }

    private void jLabel(){

        label = new JLabel("Perpustakaan");
        label.setBounds(100, 10, 300, 30);
        label.setFont(new Font("Times New Roman", Font.BOLD, 40));

        add(label);
    }

    private void jLogin(){
        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("serif",Font.BOLD,14));
        userLabel.setBounds(18, 187, 101, 22);
        userField = new JTextField("admin");
        userField.setBounds(126, 186, 200, 30);
        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("serif",Font.BOLD,14));
        passLabel.setBounds(18, 237, 101, 22);
        passField = new JPasswordField("admin");
        passField.setBounds(126, 233, 200, 30);
        button = new  JButton("Submit");
        button.setBounds(18, 301, 100, 30);

        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(button);

        button.addActionListener((e) -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            boolean status = _loginC.loginProccess(username, password);

            if (status){
                this.setVisible(false);
                new DashboardController().toView();
            }
        });
    }
}

