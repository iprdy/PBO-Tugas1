package com.investasi.menu;

import com.investasi.controller.AdminController;
import com.investasi.ui.AdminUI;
import com.investasi.validator.InputValidation;

import java.util.Scanner;

public class MenuAdmin {
    static Scanner sc = new Scanner(System.in);

    public static void show() {
        int pilihan;

        do {
            AdminUI.mainMenu();
            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    menuSaham();
                    break;
                case 2:
                    menuSBN();
                    break;
                case 3:
                    System.out.println("Logout. . .");
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 3);
    }

    private static void menuSaham() {
        int pilihan;

        do {
            AdminUI.menuSaham();
            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    AdminController.tambahSaham();
                    break;
                case 2:
                    AdminController.ubahHargaSaham();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 3);
    }

    private static void menuSBN() {
        int pilihan;

        do {
            AdminUI.menuSBN();
            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    AdminController.tambahSBN();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 2);
    }
}
