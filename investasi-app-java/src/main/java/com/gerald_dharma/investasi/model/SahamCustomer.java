package com.investasi.model;

public class SahamCustomer {
    private String kode;
    private String namaPerusahaan;
    private double hargaBeli;
    private int lembar;

    public SahamCustomer(String kode, String namaPerusahaan, double hargaBeli, int lembar) {
        this.kode = kode;
        this.namaPerusahaan = namaPerusahaan;
        this.hargaBeli = hargaBeli;
        this.lembar = lembar;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public int getLembar() {
        return lembar;
    }
}
