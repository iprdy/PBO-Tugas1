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

    @Override
    public String toString() {
        return String.format(
                "Kode              : %s\n" +
                "Nama Perusahaan   : %s\n" +
                "Harga             : Rp %.2f\n" +
                "Lembar            : %d\n",
                kode, namaPerusahaan, hargaBeli, lembar
        );
    }
}
