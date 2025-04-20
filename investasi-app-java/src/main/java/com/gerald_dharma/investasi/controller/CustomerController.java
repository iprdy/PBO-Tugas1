package com.investasi.controller;

import com.investasi.data.DataUser;
import com.investasi.data.DataSaham;
import com.investasi.model.Customer;
import com.investasi.model.User;
import com.investasi.ui.MenuLogin;

import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);

    public static void getPortofolio() {
        for (User user : DataUser.getUsers()) {
            if(user.getUsername().equals(MenuLogin.username)) {
                Customer cust = (Customer) user;
                cust.portofolio();
            }
        }
    }

    public static void beliSaham() {
        DataSaham.getSaham();

        System.out.print("Masukkan kode saham yang ingin dibeli: "); String kode = sc.nextLine();
        System.out.print("Masukkan banyak lembar yang ingin dibeli: "); int lembar = Integer.parseInt(sc.nextLine());

        DataUser.beliSaham(kode, lembar);
    }
}
