package com.investasi.menu;

import com.investasi.controller.LoginController;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;


public class MenuLogin {
    private static Customer customerLoggedIn;

    public static void show() {
        User user;

        do {
            user = LoginController.login();
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
