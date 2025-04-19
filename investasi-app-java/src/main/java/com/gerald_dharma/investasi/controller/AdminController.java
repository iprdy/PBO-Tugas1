package com.investasi.controller;

import com.investasi.data.Data;

import java.time.LocalDate;
import java.util.Scanner;

public class AdminController {
    static Scanner sc = new Scanner(System.in);

    public static void tambahSaham() {
        System.out.print("Masukkan kode perusahaan: "); String kode = sc.nextLine();
        System.out.print("Masukkan nama perusahaan: "); String namaPerusahaan = sc.nextLine();
        System.out.print("Masukkan harga saham: "); double harga = Double.parseDouble(sc.nextLine());
        Data.tambahSaham(kode, namaPerusahaan, harga);
    }

    public static void ubahHargaSaham() {
        Data.getSaham();
        System.out.print("Masukkan kode perusahaan: "); String kodeUbah = sc.nextLine();
        System.out.print("Masukkan harga baru: "); double hargaBaru = Double.parseDouble(sc.nextLine());
        Data.ubahHargaSaham(kodeUbah, hargaBaru);
    }

    public static void tambahSBN() {
        System.out.print("Masukkan nama SBN: "); String nama = sc.nextLine();
        System.out.print("Masukkan bunga: "); double bunga = Double.parseDouble(sc.nextLine());
        System.out.print("Masukkan jangka waktu: "); int jangkaWaktu = Integer.parseInt(sc.nextLine());
        System.out.print("Masukkan tanggal jatuh tempo (yyyy-mm-dd): "); String temp = sc.nextLine(); LocalDate tanggalJatuhTempo = LocalDate.parse(temp);
        System.out.print("Masukkan kuota nasional: "); double kuotaNasional = Integer.parseInt(sc.nextLine());
        Data.tambahSBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);
        Data.getSBN();
    }
}
