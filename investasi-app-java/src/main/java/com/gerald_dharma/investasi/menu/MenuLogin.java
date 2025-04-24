package com.investasi.menu;

import com.investasi.controller.LoginController;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;
import com.investasi.ui.MenuLoginUI;
import com.investasi.validator.InputValidation;

public class MenuLogin {
    private static Customer customerLoggedIn;

    public static void show() {
        while (true) {
            User user;

            MenuLoginUI.loginMenu();

            int pilihan = InputValidation.inputInteger("Masukkan pilihan: ");

            if (pilihan == 2) {
                MenuLoginUI.thankYou();
                break;
            }

            user = LoginController.login();

            if (user instanceof Admin) {
                MenuLoginUI.uiBerhasilLoginAdmin();

                InputValidation.pause();

                MenuAdmin.show();
            } else if (user instanceof Customer) {
                customerLoggedIn = (Customer) user;

                MenuLoginUI.uiBerhasilLoginCustomer();

                InputValidation.pause();

                MenuCustomer.show();
            }
        }
    }

    public static Customer getCustomerLoggedIn() {
        return customerLoggedIn;
    }
}
