package com.investasi.ui;

import java.util.Scanner;

public class MenuAdmin {
    static Scanner sc = new Scanner(System.in);

    public static void show() {
        int pilihan;

        do {
            menuAdmin();
            System.out.print("Masukkan angka: "); pilihan = sc.nextInt();

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

    private static void menuAdmin() {
        System.out.println("Menu Admin");
        System.out.println("1. Saham");
        System.out.println("2. SBN");
        System.out.println("3. Logout");
    }

    private static void menuSaham() {
        int pilihan;

        do {
            System.out.println("Menu Admin > Saham");
            System.out.println("1. Tambah Saham");
            System.out.println("2. Ubah Harga Saham");
            System.out.println("3. Kembali");
            System.out.print("Masukkan angka: "); pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    //Tambah Saham
                    break;
                case 2:
                    //Ubah Harga Saham
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
            System.out.println("Menu Admin > SBN");
            System.out.println("1. Tambah SBN");
            System.out.println("2. Kembali");
            System.out.print("Masukkan angka: "); pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    //Tambah SBN
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 2);
    }
}
