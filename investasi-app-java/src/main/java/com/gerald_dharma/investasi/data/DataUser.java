package com.investasi.data;

import com.investasi.model.*;
import com.investasi.ui.MenuLogin;

import java.util.ArrayList;
import java.util.List;

public class DataUser {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));

        Customer cust = (Customer) users.get(0);
        cust.tambahSaham("BBCA", "Bank BCA", 100000, 10);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void beliSaham(String kode, int lembar) {
        for (User user : users) {
            if(user.getUsername().equals(MenuLogin.username)) {
                Customer cust = (Customer) user;
                cust.tambahSaham(kode, DataSaham.getNamaPerusahaanSaham(kode), DataSaham.getHargaSaham(kode), lembar);
            }
        }
    }
}
