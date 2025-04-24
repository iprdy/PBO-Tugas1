package com.investasi.validator;

import com.investasi.data.DataSBN;
import com.investasi.data.DataSaham;
import com.investasi.menu.MenuLogin;
import com.investasi.model.Customer;
import com.investasi.model.Saham;
import com.investasi.model.SahamCustomer;
import com.investasi.model.SuratBerhargaNegara;

import java.util.List;

public class DataValidation {
    public static boolean kodeSahamCheck(String kode) {
        List<Saham> daftarSaham = DataSaham.getDataSaham();

        for (Saham saham : daftarSaham) {
            if(kode.equals(saham.getKode())) {
                return true;
            }
        }
        System.out.println("Saham dengan kode " + kode + " tidak ditemukan");
        return false;
    }

    public static boolean kodeSahamCustomerCheck(String kode) {
        Customer customer = MenuLogin.getCustomerLoggedIn();
        List<SahamCustomer> daftarSaham = customer.getDataSahamCustomer();

        for (SahamCustomer sahamCustomer : daftarSaham) {
            if(kode.equals(sahamCustomer.getKode())) {
                return true;
            }
        }
        System.out.println("Saham dengan kode " + kode + " tidak ditemukan");
        return false;
    }

    public static boolean kodeSahamAdminCheck(String kode) {
        List<Saham> daftarSaham = DataSaham.getDataSaham();

        for (Saham saham : daftarSaham) {
            if(kode.equals(saham.getKode())) {
                System.out.println("Kode saham " + kode + " sudah ada, silahkan coba yang lain");
                return false;
            }
        }
        return true;
    }

    public static boolean namaSBNCheck(String nama) {
        List<SuratBerhargaNegara> daftarSBN = DataSBN.getDataSBN();

        for (SuratBerhargaNegara sBN : daftarSBN) {
            if(nama.equals(sBN.getNama())) {
                return true;
            }
        }
        System.out.println("SBN dengan nama " + nama + " tidak ditemukan");
        return false;
    }
    public static boolean namaSBNAdminCheck(String nama) {
        List<SuratBerhargaNegara> daftarSBN = DataSBN.getDataSBN();

        for (SuratBerhargaNegara sBN : daftarSBN) {
            if(nama.equals(sBN.getNama())) {
                System.out.println("Nama SBN " + nama + " sudah ada, silahkan coba yang lain");
                return false;
            }
        }
        return true;
    }

}
