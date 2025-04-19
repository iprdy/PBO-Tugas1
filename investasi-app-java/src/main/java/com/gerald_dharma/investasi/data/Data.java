package com.investasi.data;

import com.investasi.model.*;
import com.investasi.ui.MenuLogin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Data {
    public static List<User> users = new ArrayList<>();
    private static List<Saham> daftarSaham = new ArrayList<>();
    private static List <SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 100000));

        Customer cust = (Customer) users.get(0);
        cust.tambahSaham("BBCA", "Bank BCA", 100000, 10);
    }

    public static User searchUser(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
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

    public static void getPortofolio() {
        for (User user : users) {
            if(user.getUsername().equals(MenuLogin.username)) {
                Customer cust = (Customer) user;
                cust.portofolio();
            }
        }
    }

    public static void ubahHargaSaham(String kode, double harga) {
        for (Saham saham : daftarSaham) {
            if(saham.getKode().equalsIgnoreCase(kode)) {
                saham.setHarga(harga);
                break;
            }
        }
    }

    public static void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }

    public static void getSBN() {
        for(SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn);
        }
    }
}
