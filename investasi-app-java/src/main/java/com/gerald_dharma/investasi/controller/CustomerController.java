package com.investasi.controller;

import com.investasi.data.DataUser;
import com.investasi.data.DataSaham;
import com.investasi.model.Customer;
import com.investasi.model.User;
import com.investasi.ui.MenuCustomer;
import com.investasi.ui.MenuLogin;

import java.awt.*;
import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);

    public static void getPortofolio() {
        for (User user : DataUser.getUsers()) {
            if(user.getUsername().equals(MenuLogin.getUsername())) {
                Customer cust = (Customer) user;
                cust.portofolio();
            }
        }
    }

    public static void beliSaham() {
        DataSaham.getSaham();

        System.out.print("Masukkan kode saham yang ingin dibeli: "); String kode = sc.nextLine();
        System.out.print("Masukkan banyak lembar yang ingin dibeli: "); int lembar = Integer.parseInt(sc.nextLine());

        beliSahamLogic(kode, lembar);
    }

    public static void beliSahamLogic(String kode, int lembar) {
        Customer cust = MenuLogin.getCustomerLoggedIn();
        cust.tambahSaham(kode, lembar);
    }

    public static void jualSaham() {
        String kode;
        int lembarSaham = 0, lembar = 0;

        do {
            for (User user : DataUser.getUsers()) {
                if(user.getUsername().equals(MenuLogin.getUsername())) {
                    Customer cust = (Customer) user;
                    if(cust.getDataSaham() == null) {
                        System.out.println("Anda tidak memiliki saham!");
                        MenuCustomer.show();
                        break;
                    }
                    System.out.println(cust.getDataSaham());
                }
            }

            System.out.print("Masukkan kode saham yang ingin dijual: "); kode = sc.nextLine();
            for (User user : DataUser.getUsers()) {
                if(user.getUsername().equals(MenuLogin.getUsername())) {
                    Customer cust = (Customer) user;
                    lembarSaham = cust.getLembar(kode);
                }
            }

            System.out.print("Masukkan banyaknya lembar yang ingin dijual: "); lembar = Integer.parseInt(sc.nextLine());
            if(lembar > lembarSaham) {
                System.out.println("Lembar yang anda miliki kurang");
            }
        } while(lembar > lembarSaham);

        System.out.println("Berhasil menjual saham sebanyak " + lembar + " lembar");
        for (User user : DataUser.getUsers()) {
            if(user.getUsername().equals(MenuLogin.getUsername())) {
                Customer cust = (Customer) user;
                cust.jualSaham(kode, lembar);
            }
        }
    }
}
