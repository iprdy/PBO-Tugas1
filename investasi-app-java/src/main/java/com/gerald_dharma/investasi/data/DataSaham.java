package com.investasi.data;

import com.investasi.model.Saham;

import java.util.ArrayList;
import java.util.List;

public class DataSaham {
    private static List<Saham> daftarSaham = new ArrayList<>();

    static {
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 100000));
    }

    public static void tambahSaham(String kode, String namaPerusahaan, double harga) {
        daftarSaham.add(new Saham(kode, namaPerusahaan, harga));
    }

    public static void getSaham() {
        for (Saham saham : daftarSaham) {
            System.out.println(saham);
        }
    }

    public static String getNamaPerusahaanSaham(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kode)) {
                return saham.getNamaPerusahaan();
            }
        }
        return null;
    }

    public static double getHargaSaham(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kode)) {
                return saham.getHarga();
            }
        }
        return 0;
    }

    public static void ubahHarga(String kode, double harga) {
        for (Saham saham : daftarSaham) {
            if(saham.getKode().equalsIgnoreCase(kode)) {
                saham.setHarga(harga);
                break;
            }
        }
    }
}
