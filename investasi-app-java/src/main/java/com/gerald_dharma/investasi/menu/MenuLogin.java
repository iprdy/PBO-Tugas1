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
            } else if (pilihan != 1) {
                System.out.println("Input tidak valid, silahkan masukkan pilihan 1 atau 2!");
                continue;
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
