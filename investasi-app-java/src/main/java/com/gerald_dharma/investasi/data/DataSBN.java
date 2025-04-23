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
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn);
        }
    }

    public static SuratBerhargaNegara cariSBN(String nama) {
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(nama)) {
                return sbn;
            }
        }
        return null;
    }

    public static double getBunga(String nama) {
        SuratBerhargaNegara sbn = cariSBN(nama);
        return (sbn != null) ? sbn.getBunga() : -1;
    }

    public static int getJangkaWaktu(String nama) {
        SuratBerhargaNegara sbn = cariSBN(nama);
        return (sbn != null) ? sbn.getJangkaWaktu() : -1;
    }

    public static boolean prosesPembelian(String nama, double jumlah) {
        SuratBerhargaNegara sbn = cariSBN(nama);
        if (sbn != null && sbn.getKuotaNasional() >= jumlah) {
            sbn.setKuotaNasional(sbn.getKuotaNasional() - jumlah);
            return true;
        }
        return false;
    }
}
