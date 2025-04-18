package com.investasi.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private List<Saham> daftarSaham = new ArrayList<>();
    private List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();


    public Customer(String username, String password) {
        super(username, password);
    }

    public void tambahSaham(String kode, String namaPerusahaan, double harga) {
        daftarSaham.add(new Saham(kode, namaPerusahaan, harga));
    }

    public void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }
}
