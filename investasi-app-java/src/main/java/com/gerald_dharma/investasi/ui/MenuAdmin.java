package com.investasi.ui;

import com.investasi.data.Data;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuAdmin {
    static Scanner sc = new Scanner(System.in);

    public static void show() {
        int pilihan;

        do {
            menuAdmin();
            System.out.print("Masukkan angka: "); pilihan = Integer.parseInt(sc.nextLine());

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
            System.out.print("Masukkan angka: "); pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode perusahaan: "); String kode = sc.nextLine();
                    System.out.print("Masukkan nama perusahaan: "); String namaPerusahaan = sc.nextLine();
                    System.out.print("Masukkan harga saham: "); double harga = Double.parseDouble(sc.nextLine());
                    Data.tambahSaham(kode, namaPerusahaan, harga);
                    break;
                case 2:
                    Data.getSaham();
                    System.out.print("Masukkan kode perusahaan: "); String kodeUbah = sc.nextLine();
                    System.out.print("Masukkan harga baru: "); double hargaBaru = Double.parseDouble(sc.nextLine());
                    Data.ubahHargaSaham(kodeUbah, hargaBaru);
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
            System.out.print("Masukkan angka: "); pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama SBN: "); String nama = sc.nextLine();
                    System.out.print("Masukkan bunga: "); double bunga = Double.parseDouble(sc.nextLine());
                    System.out.print("Masukkan jangka waktu: "); int jangkaWaktu = Integer.parseInt(sc.nextLine());
                    System.out.print("Masukkan tanggal jatuh tempo (yyyy-mm-dd): "); String temp = sc.nextLine(); LocalDate tanggalJatuhTempo = LocalDate.parse(temp);
                    System.out.print("Masukkan kuota nasional: "); double kuotaNasional = Integer.parseInt(sc.nextLine());
                    Data.tambahSBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);
                    Data.getSBN();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 2);
    }
}
