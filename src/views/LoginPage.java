package views;

import java.util.Scanner;

import controllers.DashboardController;
import controllers.LoginController;

public class LoginPage {
    private Scanner input = new Scanner(System.in);
    private LoginController _loginC = new LoginController();

    public void formLogin() {
        while (true) {
            String username, password;
            
            System.out.println("----- LOGIN ADMIN -----");
            System.out.print("Masukan Username: ");
            username = input.nextLine();

            System.out.print("Masukan Password: ");
            password = input.nextLine();

            boolean status = _loginC.loginProccess(username, password);

            if (status) {
                new DashboardController().toView();
            } else {
                System.out.println("Login Failed: Username atau Password SALAH !");
            }
        }
    }
}
