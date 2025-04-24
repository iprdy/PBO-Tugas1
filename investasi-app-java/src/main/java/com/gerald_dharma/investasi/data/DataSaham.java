package com.investasi.data;

import com.investasi.model.Saham;

import java.util.ArrayList;
import java.util.List;

public class DataSaham {
    private static final List<Saham> daftarSaham = new ArrayList<>();

    static {
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 1000000));
        daftarSaham.add(new Saham("BBNI", "Bank BNI", 1000000));
    }

    public static void tambahSaham(String kode, String namaPerusahaan, double harga) {
        daftarSaham.add(new Saham(kode, namaPerusahaan, harga));
    }

    public static void ubahHargaSaham(String kode, double harga) {
        Saham saham = getSaham(kode);
        if(saham == null) {
            System.out.println("Gagal mengubah harga saham dengan kode " + kode);
            return;
        }
        saham.setHarga(harga);
    }

    public static List<Saham> getDataSaham() {
        return daftarSaham;
    }

    public static void printDataSaham() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|             Daftar Saham Yang Tersedia            |");
        System.out.println("+---------------------------------------------------+");
        for (Saham saham : daftarSaham) {
            System.out.println(saham);
            System.out.println("+---------------------------------------------------+");
        }
    }

    private static Saham getSaham(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equals(kode)) {
                return saham;
            }
        }
        return null;
    }

    public static String getNamaPerusahaanSaham(String kode) {
        Saham saham = getSaham(kode);
        if(saham == null) {
            return "Nama perusahaan tidak ditemukan";
        }
        return saham.getNamaPerusahaan();
    }

    public static double getHargaSaham(String kode) {
        Saham saham = getSaham(kode);
        if(saham == null) {
            return 0;
        }
        return saham.getHarga();
    }
}
