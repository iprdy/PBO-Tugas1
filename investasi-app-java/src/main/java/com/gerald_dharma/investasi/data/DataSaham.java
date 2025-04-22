package com.investasi.data;

import com.investasi.model.Saham;

import java.util.ArrayList;
import java.util.List;

public class DataSaham {
    private static List<Saham> daftarSaham = new ArrayList<>();

    static {
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 100000));
        daftarSaham.add(new Saham("BBNI", "Bank BNI", 50000));
    }

    public static List<Saham> getDataSaham() {
        return daftarSaham;
    }

    public static void tambahSaham(String kode, String namaPerusahaan, double harga) {
        daftarSaham.add(new Saham(kode, namaPerusahaan, harga));
    }

    private static Saham getSaham(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equals(kode)) {
                return saham;
            }
        }
        return null;
    }

    public static void printDataSaham() {
        for (Saham saham : daftarSaham) {
            System.out.println(saham);
        }
    }

    public static String getNamaPerusahaanSaham(String kode) {
        Saham saham = getSaham(kode);
        return saham.getNamaPerusahaan();
    }

    public static double getHargaSaham(String kode) {
        Saham saham = getSaham(kode);
        return saham.getHarga();
    }

    public static void ubahHarga(String kode, double harga) {
        Saham saham = getSaham(kode);
        saham.setHarga(harga);
    }
}
