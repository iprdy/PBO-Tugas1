package com.investasi.controller;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.validator.InputValidation;

import java.time.LocalDate;
import java.util.Scanner;

public class AdminController {
    static Scanner sc = new Scanner(System.in);

    public static void adminTambahSaham() {
        String kode = InputValidation.inputStringKodeSahamAdmin("Masukkan kode perusahaan: ");
        String namaPerusahaan = InputValidation.inputString("Masukkan nama perusahaan: ");
        double harga = InputValidation.inputDouble("Masukkan harga saham: ");

        DataSaham.tambahSaham(kode, namaPerusahaan, harga);
    }

    public static void adminUbahHargaSaham() {
        DataSaham.printDataSaham();

        String kode = InputValidation.inputStringKodeSaham("Masukkan kode perusahaan: ");
        double hargaBaru = InputValidation.inputDouble("Masukkan harga baru: ");

        DataSaham.ubahHargaSaham(kode, hargaBaru);
    }

    public static void adminTambahSBN() {
        String nama = InputValidation.inputString("Masukkan nama SBN: ");
        double bunga = InputValidation.inputDouble("Masukkan bunga: ");
        int jangkaWaktu = InputValidation.inputInteger("Masukkan jangka waktu: ");
        System.out.print("Masukkan tanggal jatuh tempo (yyyy-mm-dd): "); String temp = sc.nextLine(); LocalDate tanggalJatuhTempo = LocalDate.parse(temp);
        double kuotaNasional = InputValidation.inputDouble("Masukkan kuota nasional: ");

        DataSBN.tambahSBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);
    }
}
