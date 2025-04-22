package com.investasi.controller;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.validator.DataValidation;
import com.investasi.validator.InputValidation;

import java.time.LocalDate;
import java.util.Scanner;

public class AdminController {
    static Scanner sc = new Scanner(System.in);

    public static void tambahSaham() {
        System.out.print("Masukkan kode perusahaan: "); String kode = sc.nextLine();
        System.out.print("Masukkan nama perusahaan: "); String namaPerusahaan = sc.nextLine();
        double harga = InputValidation.inputDouble("Masukkan harga saham: ");

        DataSaham.tambahSaham(kode, namaPerusahaan, harga);
    }

    public static void ubahHargaSaham() {
        DataSaham.printDataSaham();
        String kode = InputValidation.inputStringKodeSaham("Masukkan kode perusahaan: ");
        double hargaBaru = InputValidation.inputDouble("Masukkan harga baru: ");

        DataSaham.ubahHarga(kode, hargaBaru);
    }

    public static void tambahSBN() {
        System.out.print("Masukkan nama SBN: "); String nama = sc.nextLine();
        double bunga = InputValidation.inputDouble("Masukkan bunga: ");
        int jangkaWaktu = InputValidation.inputInteger("Masukkan jangka waktu: ");
        System.out.print("Masukkan tanggal jatuh tempo (yyyy-mm-dd): "); String temp = sc.nextLine(); LocalDate tanggalJatuhTempo = LocalDate.parse(temp);
        double kuotaNasional = InputValidation.inputDouble("Masukkan kuota nasional: ");

        DataSBN.tambahSBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);
        DataSBN.getSBN();
    }
}
