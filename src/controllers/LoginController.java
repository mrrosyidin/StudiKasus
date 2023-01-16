package controllers;

import entities.AdminEntity;
import models.Admin;
import views.LoginPage;

public class LoginController {

    public void toView() {
        LoginPage loginPage = new LoginPage();
        loginPage.formLogin();
    }

    public boolean loginProccess(String username, String password) {

        AdminEntity adminEntity = Admin.findUsername(username);
        
        if (adminEntity != null) {
            if (adminEntity.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

}
