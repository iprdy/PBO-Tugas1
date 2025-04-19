package com.investasi.controller;

import com.investasi.data.Data;

import java.util.Scanner;

public class AdminController {
    static Scanner sc = new Scanner(System.in);

    public static void tambahSaham() {
        System.out.print("Masukkan kode perusahaan: "); String kode = sc.nextLine();
        System.out.print("Masukkan nama perusahaan: "); String namaPerusahaan = sc.nextLine();
        System.out.print("Masukkan harga saham: "); double harga = Double.parseDouble(sc.nextLine());
        Data.tambahSaham(kode, namaPerusahaan, harga);
    }


}
