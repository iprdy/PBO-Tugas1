package com.investasi.ui;

import com.investasi.data.Data;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;

import java.util.Scanner;

public class MainMenu {
    public static void show() {
        Scanner sc = new Scanner(System.in);
        User user = null;

        do {
            System.out.print("Enter username : ");
            String username = sc.nextLine();
            System.out.print("Enter password : ");
            String password = sc.nextLine();
            user = Data.login(username, password);
            if(user == null) {
                System.out.println("username atau password salah!");
            }
        } while (user == null);

        if(user instanceof Admin) {
            MenuAdmin.show();
        } else if (user instanceof Customer) {
            MenuCustomer.show();
        }

    }
}
