package com.investasi.controller;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.model.Customer;
import com.investasi.menu.MenuLogin;
import com.investasi.validator.InputValidation;

public class CustomerController {
    static Customer customer = MenuLogin.getCustomerLoggedIn();
    
    public static void beliSaham() {
        DataSaham.printDataSaham();

        String kode = InputValidation.inputStringKodeSaham("Masukkan kode saham yang ingin dibeli: ");
        int lembar = InputValidation.inputInteger("Masukkan banyak lembar yang ingin dibeli: ");

        customer.tambahSaham(kode, lembar);
    }
    
    public static void jualSaham() {
        String kode;
        int lembarSaham, lembar;

        do {
            if(!customer.printDataSahamCostumer()) {
                return;
            }

            kode = InputValidation.inputStringKodeSahamCustomer("Masukkan kode saham yang ingin dijual: ");
            lembar = InputValidation.inputInteger("Masukkan banyaknya lembar yang ingin dijual: ");

            lembarSaham = customer.getLembar(kode);

            if(lembar > lembarSaham) {
                System.out.println("Lembar yang anda miliki kurang");
            }

        } while(lembar > lembarSaham);

        System.out.println("Berhasil menjual saham dengan kode " + kode + " sebanyak " + lembar + " lembar");

        customer.jualSaham(kode, lembar);
    }


    public static void beliSBN() {
        System.out.println("=== Daftar SBN yang Tersedia ===");
        DataSBN.printDataSBN();

        String namaSBN = InputValidation.inputStringNamaSBN("Masukkan nama SBN yang ingin dibeli: ");
        double jumlahBeli = InputValidation.inputDouble("Masukkan jumlah pembelian (dalam rupiah): ");
    
        boolean berhasil = customer.tambahSBN(namaSBN, jumlahBeli);
    
        if (berhasil) {
            System.out.println("Pembelian SBN berhasil!");
            System.out.println("SBN: " + namaSBN);
            System.out.printf("Jumlah: Rp%,.2f\n", jumlahBeli);
        } else {
            System.out.println("Pembelian gagal. Kuota tidak mencukupi.");
        }
    }
    

    public static void simulasiSBN() {
        System.out.println("=== Simulasi Investasi SBN ===");
        DataSBN.printDataSBN();
    
        String namaSBN = InputValidation.inputString("Masukkan nama SBN yang ingin disimulasikan: ");
        double jumlahInvestasi = InputValidation.inputDouble("Masukkan jumlah investasi: ");
    
        double bunga = DataSBN.getBunga(namaSBN);
        int tahun = DataSBN.getJangkaWaktu(namaSBN);
    
        if (bunga > 0 && tahun > 0) {
            double totalKeuntungan = jumlahInvestasi * bunga / 100 * tahun;
            double totalAkhir = jumlahInvestasi + totalKeuntungan;
    
            System.out.println("=== Hasil Simulasi ===");
            System.out.println("Nama SBN       : " + namaSBN);
            System.out.printf("Investasi Awal : Rp%,.2f\n", jumlahInvestasi);
            System.out.println("Bunga Tahunan  : " + bunga + "%");
            System.out.println("Durasi         : " + tahun + " tahun");
            System.out.printf("Keuntungan     : Rp%,.2f\n", totalKeuntungan);
            System.out.printf("Total Akhir    : Rp%,.2f\n", totalAkhir);
        } else {
            System.out.println("SBN tidak valid atau data tidak tersedia.");
        }
    }

    public static void getPortofolio() {
        customer.portofolio();
    }
}
