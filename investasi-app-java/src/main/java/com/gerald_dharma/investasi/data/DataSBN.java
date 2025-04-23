package com.investasi.data;

import com.investasi.model.SuratBerhargaNegara;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataSBN {
    private static final List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    static {
        tambahSBN("SBR013", 6.15, 2, LocalDate.of(2027, 4, 10), 5000000);
    }

    public static void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }

    public static List<SuratBerhargaNegara> getDataSBN() {
        return daftarSBN;
    }

    public static void printDataSBN() {
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn);
        }
    }

    public static SuratBerhargaNegara getSBN(String nama) {
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(nama)) {
                return sbn;
            }
        }
        return null;
    }

    public static double getBunga(String nama) {
        SuratBerhargaNegara sbn = getSBN(nama);
        return (sbn != null) ? sbn.getBunga() : -1;
    }

    public static int getJangkaWaktu(String nama) {
        SuratBerhargaNegara sbn = getSBN(nama);
        return (sbn != null) ? sbn.getJangkaWaktu() : -1;
    }

    public static boolean prosesPembelian(String nama, double jumlah) {
        SuratBerhargaNegara sbn = getSBN(nama);

        if (sbn != null && sbn.getKuotaNasional() >= jumlah) {
            sbn.setKuotaNasional(sbn.getKuotaNasional() - jumlah);
            return true;
        }
        return false;
    }
}
