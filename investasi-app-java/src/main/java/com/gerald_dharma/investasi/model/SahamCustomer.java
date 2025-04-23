package com.investasi.model;

public class SahamCustomer {
    private final String kode;
    private final String namaPerusahaan;
    private final double hargaBeli;
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
                """
                Kode              : %s
                Nama Perusahaan   : %s
                Jumlah lembar     : %d
                """,
            kode, namaPerusahaan, lembar
        );
    }
}
