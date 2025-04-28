package controller;

import data.DataSBN;
import data.DataSaham;
import model.Customer;
import menu.MenuLogin;
import model.SuratBerhargaNegara;
import ui.ClearUI;
import ui.CustomerUI;
import validator.InputValidation;


public class CustomerController {
    static Customer customer = MenuLogin.getCustomerLoggedIn();

    public static void customerBeliSaham() {
        ClearUI.clearScreen();

        DataSaham.printDataSaham();

        CustomerUI.uiBeliSahamCustomer();

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

        ClearUI.clearScreen();

        do {
            if(!customer.printDataSahamCustomer()) {
                InputValidation.pause();
                return;
            }

            CustomerUI.uiJualSahamCustomer();

            kode = InputValidation.inputStringKodeSahamCustomer("Masukkan kode saham yang ingin dijual: ");
            lembar = InputValidation.inputInteger("Masukkan banyaknya lembar yang ingin dijual: ");

            lembarSaham = customer.getLembarSahamCustomer(kode);

            if(lembar > lembarSaham) {
                CustomerUI.uiGagalMenjualSahamCustomer();
                InputValidation.pause();
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
        ClearUI.clearScreen();

        DataSBN.printDataSBN();

        CustomerUI.uiBeliSBNCustomer();

        String namaSBN = InputValidation.inputStringNamaSBN("Masukkan nama SBN yang ingin dibeli: ");
        double jumlahBeli = InputValidation.inputDouble("Masukkan jumlah pembelian (dalam rupiah): ");

        SuratBerhargaNegara sbn = DataSBN.getSBN(namaSBN);

        if(sbn != null && sbn.getKuotaNasional() == 0) {
            CustomerUI.uiSBNHabisCustomer();

            InputValidation.pause();

            return;
        }

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
        ClearUI.clearScreen();

        DataSBN.printDataSBN();

        CustomerUI.uiSimulasiSBNCustomer();

        String namaSBN = InputValidation.inputStringNamaSBN("Masukkan nama SBN yang ingin disimulasikan: ");
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
        ClearUI.clearScreen();

        customer.portofolioCustomer();

        InputValidation.pause();
    }



    public static boolean confirmationBeliSahamCustomer(String kode, int lembar) {
        CustomerUI.uiConfirmationBeliSahamCustomer(kode, lembar);

        return confirmation();
    }



    public static boolean confirmationJualSahamCustomer(String kode, int lembar) {
        CustomerUI.uiConfirmationJualSahamCustomer(kode, lembar);

        return confirmation();
    }



    public static boolean confirmationBeliSBNCustomer(String namaSBN, double jumlahBeli) {
        CustomerUI.uiConfirmationBeliSBNCustomer(namaSBN, jumlahBeli);

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
