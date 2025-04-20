package com.investasi.data;

import com.investasi.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<User> users = new ArrayList<>();
    private static List <SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));

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

    public static void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }

    public static void getSBN() {
        for(SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn);
        }
    }
}
