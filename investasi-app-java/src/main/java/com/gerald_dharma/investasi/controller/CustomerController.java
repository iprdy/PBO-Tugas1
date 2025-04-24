package com.investasi.controller;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.model.Customer;
import com.investasi.menu.MenuLogin;
import com.investasi.ui.CustomerUI;
import com.investasi.validator.InputValidation;

public class CustomerController {
    static Customer customer = MenuLogin.getCustomerLoggedIn();
    
    public static void customerBeliSaham() {
        DataSaham.printDataSaham();

        String kode = InputValidation.inputStringKodeSaham("Masukkan kode saham yang ingin dibeli: ");
        int lembar = InputValidation.inputInteger("Masukkan banyak lembar yang ingin dibeli: ");

        if(confirmationBeliSahamCustomer(kode, lembar)) {
            return;
        }

        customer.tambahSahamCustomer(kode, lembar);

        CustomerUI.uiCustomerBerhasilBeliSaham(kode, lembar);

        InputValidation.pause();
    }
    
    public static void customerJualSaham() {
        String kode;
        int lembarSaham, lembar;

        do {
            if(!customer.printDataSahamCustomer()) {
                return;
            }

            kode = InputValidation.inputStringKodeSahamCustomer("Masukkan kode saham yang ingin dijual: ");
            lembar = InputValidation.inputInteger("Masukkan banyaknya lembar yang ingin dijual: ");

            lembarSaham = customer.getLembarSahamCustomer(kode);

            if(lembar > lembarSaham) {
                CustomerUI.uiGagalMenjualSahamCustomer();
            }

        } while(lembar > lembarSaham);

        if (confirmationJualSahamCustomer(kode, lembar)) {
            return;
        }

        customer.jualSahamCustomer(kode, lembar);

        CustomerUI.uiCustomerBerhasilJualSaham(kode, lembar);

        InputValidation.pause();
    }


    public static void customerBeliSBN() {
        DataSBN.printDataSBN();

        String namaSBN = InputValidation.inputStringNamaSBN("Masukkan nama SBN yang ingin dibeli: ");
        double jumlahBeli = InputValidation.inputDouble("Masukkan jumlah pembelian (dalam rupiah): ");

        boolean berhasil = customer.tambahSBNCustomer(namaSBN, jumlahBeli);

        if (berhasil) {
            if(confirmationBeliSBNCustomer(namaSBN, jumlahBeli)) {
                return;
            }

            CustomerUI.uiCustomerBerhasilBeliSBN(namaSBN, jumlahBeli);

            InputValidation.pause();
        } else {
            CustomerUI.uiGagalMenjualSBNCustomer();

            InputValidation.pause();
        }
    }
    

    public static void customerSimulasiSBN() {
        DataSBN.printDataSBN();
    
        String namaSBN = InputValidation.inputString("Masukkan nama SBN yang ingin disimulasikan: ");
        double jumlahInvestasi = InputValidation.inputDouble("Masukkan jumlah investasi: ");
    
        double bunga = DataSBN.getBunga(namaSBN);
        int tahun = DataSBN.getJangkaWaktu(namaSBN);
    
        if (bunga > 0 && tahun > 0) {
            double totalKeuntungan = jumlahInvestasi * bunga / 100 * tahun;
            double totalAkhir = jumlahInvestasi + totalKeuntungan;

            CustomerUI.uiSimulasiSBN(namaSBN, jumlahInvestasi, bunga, tahun, totalKeuntungan, totalAkhir);

            InputValidation.pause();
        } else {
            CustomerUI.uiSBNTidakValid();

            InputValidation.pause();
        }
    }

    public static void customerGetPortofolio() {
        customer.portofolioCustomer();

        InputValidation.pause();
    }

    public static boolean confirmationBeliSahamCustomer(String kode, int lembar) {
        CustomerUI.uiConfirmationBeliSahamCustomer(kode, lembar);

        int confirmation = InputValidation.inputInteger("Masukkan pilihan: ");

        return confirmation == 2;
    }

    public static boolean confirmationJualSahamCustomer(String kode, int lembar) {
        CustomerUI.uiConfirmationJualSahamCustomer(kode, lembar);

        int confirmation = InputValidation.inputInteger("Masukkan pilihan: ");

        return confirmation == 2;
    }

    public static boolean confirmationBeliSBNCustomer(String namaSBN, double jumlahBeli) {
        CustomerUI.uiConfirmationBeliSBNCustomer(namaSBN, jumlahBeli);

        int confirmation = InputValidation.inputInteger("Masukkan pilihan: ");

        return confirmation == 2;
    }
}
