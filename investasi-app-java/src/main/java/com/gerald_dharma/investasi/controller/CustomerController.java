package com.investasi.controller;

import com.investasi.data.DataSaham;
import com.investasi.model.Customer;
import com.investasi.menu.MenuCustomer;
import com.investasi.menu.MenuLogin;
import com.investasi.validator.InputValidation;

import java.util.Scanner;

public class CustomerController {
    static Customer customer = MenuLogin.getCustomerLoggedIn();
    static Scanner sc = new Scanner(System.in);

    public static void getPortofolio() {
        customer.portofolio();
    }

    public static void beliSaham() {
        DataSaham.getSaham();

        System.out.print("Masukkan kode saham yang ingin dibeli: "); String kode = sc.nextLine();
        int lembar = InputValidation.inputInteger("Masukkan banyak lembar yang ingin dibeli: ");

        customer.tambahSaham(kode, lembar);
    }

    public static void jualSaham() {
        String kode = null;
        int lembarSaham = 0, lembar = 0;

        do {
            if(customer.getDataSaham() != null) {
                System.out.println(customer.getDataSaham());

                System.out.print("Masukkan kode saham yang ingin dijual: "); kode = sc.nextLine();
                lembarSaham = customer.getLembar(kode);

                lembar = InputValidation.inputInteger("Masukkan banyaknya lembar yang ingin dijual: ");

                if(lembar > lembarSaham) {
                    System.out.println("Lembar yang anda miliki kurang");
                }

            } else {
                System.out.println("Anda tidak memiliki saham!");
                MenuCustomer.show();
            }
        } while(lembar > lembarSaham);

        System.out.println("Berhasil menjual saham dengan kode " + kode + " sebanyak " + lembar + " lembar");

        customer.jualSaham(kode, lembar);
    }
}
