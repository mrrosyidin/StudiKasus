import controllers.LoginController;
import models.Admin;
import views.LoginView;

public class Main {

    private void run() {
        LoginController loginController = new LoginController();

        loginController.toView();
    }
    
    private static void initialDataDummy() {
        Admin.initialData();
    }

    public static void main(String[] args) {
        initialDataDummy();
        LoginView lf = new LoginView();
        lf.setVisible(true);

        //new Main().run();
    }
}