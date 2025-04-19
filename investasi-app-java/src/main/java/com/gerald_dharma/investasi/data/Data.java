package com.investasi.data;

import com.investasi.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<User> users = new ArrayList<>();
    private static List<Saham> daftarSaham = new ArrayList<>();
    private static List <SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 100000));

        Customer cust = (Customer) users.get(0);
        cust.tambahSaham("BBCA", "Bank BCA", 100000);
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
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
}
