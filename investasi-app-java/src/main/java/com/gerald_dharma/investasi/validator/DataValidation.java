package com.investasi.validator;

import com.investasi.data.DataSaham;
import com.investasi.model.Saham;

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
}
