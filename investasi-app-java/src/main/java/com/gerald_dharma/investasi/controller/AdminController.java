package com.investasi.controller;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.ui.AdminUI;
import com.investasi.validator.InputValidation;

import java.time.LocalDate;



public class AdminController {
    public static void adminTambahSaham() {
        String kode = InputValidation.inputStringKodeSahamAdmin("Masukkan kode perusahaan: ");
        String namaPerusahaan = InputValidation.inputString("Masukkan nama perusahaan: ");
        double harga = InputValidation.inputDouble("Masukkan harga saham: ");

        if(confirmationTambahSahamAdmin(kode, namaPerusahaan, harga)) {
            return;
        }

        DataSaham.tambahSaham(kode, namaPerusahaan, harga);

        AdminUI.uiBerhasilTambahSahamAdmin(kode);

        InputValidation.pause();
    }


    
    public static void adminUbahHargaSaham() {
        DataSaham.printDataSaham();

        String kode = InputValidation.inputStringKodeSaham("Masukkan kode perusahaan: ");
        double hargaBaru = InputValidation.inputDouble("Masukkan harga baru: ");

        if(confirmationUbahHargaSahamAdmin(kode, hargaBaru)) {
            return;
        }

        DataSaham.ubahHargaSaham(kode, hargaBaru);

        AdminUI.uiBerhasilUbahHargaSahamAdmin(kode, hargaBaru);

        InputValidation.pause();
    }


    
    public static void adminTambahSBN() {
        String nama = InputValidation.inputStringNamaSBNAdmin("Masukkan nama SBN: ");
        double bunga = InputValidation.inputDouble("Masukkan bunga: ");
        int jangkaWaktu = InputValidation.inputInteger("Masukkan jangka waktu: ");
        LocalDate tanggalJatuhTempo = InputValidation.inputLocalDate("Masukkan tanggal tempo (dd-MM-yyyy): ");
        double kuotaNasional = InputValidation.inputDouble("Masukkan kuota nasional: ");

        if(confirmationTambahSBNAdmin(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional)) {
            return;
        }

        DataSBN.tambahSBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);

        AdminUI.uiBerhasilTambahSBNAdmin(nama);

        InputValidation.pause();
    }


    
    public static boolean confirmationTambahSahamAdmin(String kode, String namaPerusahaan, double harga) {
        AdminUI.uiConfirmationTambahSahamAdmin(kode, namaPerusahaan, harga);

        return confirmation();
    }


    
    public static boolean confirmationUbahHargaSahamAdmin(String kode, double hargaBaru) {
        double hargaLama = DataSaham.getHargaSaham(kode);

        AdminUI.uiConfirmationUbahHargaSahamAdmin(kode, hargaBaru, hargaLama);

        return confirmation();
    }


    
    public static boolean confirmationTambahSBNAdmin(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        AdminUI.uiConfirmationTambahSBNAdmin(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);

        return confirmation();
    }

    public static boolean confirmation() {
        while (true) {
            int confirmation = InputValidation.inputInteger("Masukkan pilihan: ");

            if (confirmation == 1) {
                return false;
            } else if (confirmation == 2) {
                return true;
            }

            System.out.println("Input tidak valid, silahkan masukkan pilihan 1 atau 2!");
        }
    }
}
