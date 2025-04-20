package com.investasi.ui;

import com.investasi.controller.LoginController;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;

import java.util.Scanner;

public class MenuLogin {
    public static String username;

    public static void show() {
        Scanner sc = new Scanner(System.in);
        User user = null;

        do {
            System.out.print("Enter username : "); username = sc.nextLine();
            System.out.print("Enter password : "); String password = sc.nextLine();

            user = LoginController.login(username, password);
            if(user == null) {
                System.out.println("username atau password salah!");
            }
        } while (user == null);

        if(user instanceof Admin) {
            MenuAdmin.show();
        } else if (user instanceof Customer) {
            MenuCustomer.show();
        }

        show();
    }
}
