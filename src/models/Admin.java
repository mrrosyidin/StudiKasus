package models;

import java.util.ArrayList;

import entities.AdminEntity;

public class Admin {
    private static ArrayList<AdminEntity> admin = new ArrayList<>();

    public static void initialData() {
        admin.add(new AdminEntity("admin", "admin", "admin"));
    }

    public static AdminEntity findUsername(String username) {
        for (AdminEntity adminEntity : admin) {
            if (adminEntity.getUsername().equals(username)) {
                return adminEntity;
            }
        }
        return null;
    }

}
