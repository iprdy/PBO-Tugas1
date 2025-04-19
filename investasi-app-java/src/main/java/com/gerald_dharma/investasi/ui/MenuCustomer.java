package com.investasi.ui;

import com.investasi.data.Data;
import com.investasi.model.Customer;
import com.investasi.model.User;

import java.util.Scanner;

public class MenuCustomer {
    static Scanner sc = new Scanner(System.in);
    public static void show() {
        int pilihan;

        do {
            System.out.println("Menu Customer");
            System.out.println("1. Beli Saham");
            System.out.println("2. Jual Saham");
            System.out.println("3. Beli SBN");
            System.out.println("4. Simulasi SBN");
            System.out.println("5. Portofolio");
            System.out.println("6. Logout");
            System.out.print("Masukkan pilihan: "); pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    Data.getSaham();
                    System.out.print("Masukkan kode saham yang ingin dibeli: "); String kode = sc.nextLine();
                    System.out.print("Masukkan banyak lembar yang ingin dibeli: "); int lembar = Integer.parseInt(sc.nextLine());
                    Customer user = (Customer) Data.searchUser(MenuLogin.username);
                    user.tambahSaham(kode, Data.getNamaPerusahaanSaham(kode), Data.getHargaSaham(kode), lembar);
                    break;
                case 2:
                    //Jual Saham
                    break;
                case 3:
                    //Beli SBN
                    break;
                case 4:
                    //Simulasi SBN
                    break;
                case 5:
                    Data.getPortofolio();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 6);
    }
}
