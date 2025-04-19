package com.investasi.controller;

import com.investasi.data.Data;
import com.investasi.model.Customer;
import com.investasi.ui.MenuLogin;

import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);

    public static void beliSaham() {
        Data.getSaham();

        System.out.print("Masukkan kode saham yang ingin dibeli: "); String kode = sc.nextLine();
        System.out.print("Masukkan banyak lembar yang ingin dibeli: "); int lembar = Integer.parseInt(sc.nextLine());

        Customer cust = (Customer) Data.searchUser(MenuLogin.username);
        cust.tambahSaham(kode, Data.getNamaPerusahaanSaham(kode), Data.getHargaSaham(kode), lembar);
    }
}
