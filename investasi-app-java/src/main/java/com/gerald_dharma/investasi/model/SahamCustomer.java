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

    public void setLembar(int lembar) {
        this.lembar += lembar;
    }

    public void jualLembar(int jumlahLembar) {
        lembar -= jumlahLembar;
    }

    @Override
    public String toString() {
        return String.format(
                "Kode              : %s\n" +
                "Nama Perusahaan   : %s\n" +
                "Jumlah lembar     : %d\n",
                kode, namaPerusahaan, lembar
        );
    }
}
