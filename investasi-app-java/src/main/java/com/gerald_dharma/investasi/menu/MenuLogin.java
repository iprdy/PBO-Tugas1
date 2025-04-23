package com.investasi.menu;

import com.investasi.controller.LoginController;
import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;
import com.investasi.validator.InputValidation;


public class MenuLogin {
    private static Customer customerLoggedIn;

    public static void show() {
        User user;

        System.out.println("Program Investasi Saham");
        System.out.println("1. Login");
        System.out.println("2. Keluar dari program");
        int pilihan = InputValidation.inputInteger("Masukkan pilihan: ");

        if(pilihan !=2) {
            user = LoginController.login();

            if(user instanceof Admin) {
                MenuAdmin.show();
            } else if (user instanceof Customer) {
                customerLoggedIn = (Customer) user;
                MenuCustomer.show();
            }
            show();
        }
    }

    public static Customer getCustomerLoggedIn() {
        return customerLoggedIn;
    }
}
