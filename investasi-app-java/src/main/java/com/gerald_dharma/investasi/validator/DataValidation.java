package com.investasi.validator;

import com.investasi.data.DataSaham;
import com.investasi.menu.MenuLogin;
import com.investasi.model.Customer;
import com.investasi.model.Saham;
import com.investasi.model.SahamCustomer;

import java.util.ArrayList;
import java.util.List;

public class DataValidation {
    public static boolean kodeSahamCheck(String kode) {
        List<Saham> daftarSaham = new ArrayList<>();
        daftarSaham = DataSaham.getDataSaham();

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
        List<SahamCustomer> daftarSaham = new ArrayList<>();
        daftarSaham = customer.getDataSahamCustomer();

        for (SahamCustomer sahamCustomer : daftarSaham) {
            if(kode.equals(sahamCustomer.getKode())) {
                return true;
            }
        }
        System.out.println("Customer dengan kode " + kode + " tidak ditemukan");
        return false;
    }
}
