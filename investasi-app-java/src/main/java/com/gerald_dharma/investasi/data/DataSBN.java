package com.investasi.data;

import com.investasi.model.SuratBerhargaNegara;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataSBN {
    private static List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    public static void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }

    public static void getSBN() {
        for(SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn);
        }
    }
}
