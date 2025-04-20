package com.investasi.ui;

import com.investasi.controller.CustomerController;

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
                    CustomerController.beliSaham();
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
                    CustomerController.getPortofolio();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 6);
    }
}
