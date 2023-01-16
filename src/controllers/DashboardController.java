package controllers;

import views.admin.DashboardView;
import views.admin.DashboardPage;

public class DashboardController {
    
    public void toView(){
        //DashboardPage dashboard = new DashboardPage();
        DashboardView db = new DashboardView();
        db.setVisible(true);
        //dashboard.menu();
    }
}
