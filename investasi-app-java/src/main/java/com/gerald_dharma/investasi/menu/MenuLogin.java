package com.investasi.menu;

import com.investasi.controller.LoginController;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;

import java.util.Scanner;

public class MenuLogin {
    private static Customer customerLoggedIn;

    public static void show() {
        String userLoggedIn;
        Scanner sc = new Scanner(System.in);
        User user = null;

        do {
            System.out.print("Enter username : "); userLoggedIn = sc.nextLine();
            System.out.print("Enter password : "); String password = sc.nextLine();

            user = LoginController.login(userLoggedIn, password);

            if(user == null) {
                System.out.println("username atau password salah!");
            }

        } while (user == null);

        if(user instanceof Admin) {
            MenuAdmin.show();
        } else if (user instanceof Customer) {
            customerLoggedIn = (Customer) user;
            MenuCustomer.show();
        }

        show();
    }

    public static Customer getCustomerLoggedIn() {
        return customerLoggedIn;
    }
}
