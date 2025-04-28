package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public String getTanggalJatuhTempoFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return tanggalJatuhTempo.format(formatter);
    }

    public double getKuotaNasional() {
        if(kuotaNasional == 0) {
            return 0;
        }
        return kuotaNasional;
    }

    public void setKuotaNasional(double kuotaNasional) {
        this.kuotaNasional = kuotaNasional;
    }

    @Override
    public String toString() {
        String bungaFormatted = String.format("%.2f%%", bunga);

        return String.format(
                """
                        | Nama SBN    : %-36s|
                        | Bunga       : %-36s|
                        | Jatuh Tempo : %-36s|
                        | Kuota       : Rp%,-34.2f|"""
                , nama, bungaFormatted, getTanggalJatuhTempoFormatted(), kuotaNasional);
    }
}
