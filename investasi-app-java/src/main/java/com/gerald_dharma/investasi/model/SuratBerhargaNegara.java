package com.investasi.model;

import java.time.LocalDate;

public class SuratBerhargaNegara {
    private final String nama;
    private final double bunga;
    private final int jangkaWaktu;
    private final LocalDate tanggalJatuhTempo;
    private double kuotaNasional;

    public SuratBerhargaNegara(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        this.nama = nama;
        this.bunga = bunga;
        this.jangkaWaktu = jangkaWaktu;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.kuotaNasional = kuotaNasional;
    }

    public String getNama() {
        return nama;
    }

    public double getBunga() {
        return bunga;
    }

    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    public LocalDate getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    public double getKuotaNasional() {
        return kuotaNasional;
    }

    public void setKuotaNasional(double kuotaNasional) {
        this.kuotaNasional = kuotaNasional;
    }

    @Override
    public String toString() {
        return String.format("| Nama SBN: %-40s|\n| Bunga (%%): %-39.2f|\n| Jatuh Tempo: %-37s|\n| Kuota: Rp%,-41.2f|", nama, bunga, tanggalJatuhTempo.toString(), kuotaNasional);
    }
}
