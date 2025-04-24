package com.investasi.model;

import com.investasi.data.DataSaham;
import com.investasi.data.DataSBN;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private final List<SahamCustomer> daftarSaham = new ArrayList<>();
    private final List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    public List<SahamCustomer> getDataSahamCustomer() {
        return daftarSaham;
    }

    public boolean printDataSahamCustomer() {
        if (daftarSaham.isEmpty()) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("|             Anda tidak memiliki saham!            |");
            System.out.println("+---------------------------------------------------+");
            return false;
        }

        System.out.println("+---------------------------------------------------+");
        System.out.println("|            Daftar Saham Yang Anda Miliki          |");
        System.out.println("+---------------------------------------------------+");
        for (SahamCustomer saham : daftarSaham) {
            System.out.println(saham);
            System.out.println("+---------------------------------------------------+");
        }
        return true;
    }

    public SahamCustomer getSahamCustomer(String kode) {
        for (SahamCustomer sahamC : daftarSaham) {
            if (sahamC.getKode().equals(kode)) {
                return sahamC;
            }
        }
        return null;
    }

    public void tambahSahamCustomer(String kode, int lembar) {
        SahamCustomer saham = getSahamCustomer(kode);

        if (saham != null) {
            saham.setLembar(lembar);
        } else {
            daftarSaham.add(new SahamCustomer(kode, DataSaham.getNamaPerusahaanSaham(kode), DataSaham.getHargaSaham(kode), lembar));
        }
    }
    
    public boolean tambahSBNCustomer(String namaSBN, double jumlah) {
        SuratBerhargaNegara sbn = DataSBN.getSBN(namaSBN);

        if (sbn != null && DataSBN.prosesPembelianSBN(namaSBN, jumlah)) {
            daftarSBN.add(new SuratBerhargaNegara(sbn.getNama(), sbn.getBunga(), sbn.getJangkaWaktu(), sbn.getTanggalJatuhTempo(), jumlah));
            return true;
        }
        return false;
    }
    
    public int getLembarSahamCustomer(String kode) {
        SahamCustomer saham = getSahamCustomer(kode);
        return saham.getLembar();
    }

    public void jualSahamCustomer(String kode, int jumlahLembar) {
        SahamCustomer saham = getSahamCustomer(kode);

        if(saham.getLembar()-jumlahLembar == 0) {
            daftarSaham.remove(saham);
        } else {
            saham.jualLembar(jumlahLembar);
        }
    }

    public void portofolioCustomer() {
        System.out.println("+----------------------------------------------------------------------------------+");
        System.out.println("|                            Daftar saham yang dimiliki                            |");
        if (daftarSaham.isEmpty()) {
            System.out.println("+----------------------------------------------------------------------------------+");
            System.out.println("|          Anda tidak memiliki saham, silahkan beli saham terlebih dahulu          |");
            System.out.println("+----------------------------------------------------------------------------------+");
        } else {
            for (SahamCustomer saham : daftarSaham) {
                System.out.println("+----------------------------------------------------------------------------------+");
                System.out.printf("| Kode                 : %-58s|\n", saham.getKode());
                System.out.printf("| Nama perusahaan      : %-58s|\n", saham.getNamaPerusahaan());
                System.out.printf("| Harga saat beli      : Rp%,-56.2f|\n", saham.getHargaBeli());
                System.out.printf("| Harga saat ini       : Rp%,-56.2f|\n", DataSaham.getHargaSaham(saham.getKode()));
                System.out.printf("| Jumlah lembar        : %-58d|\n", saham.getLembar());
                System.out.printf("| Total pembelian      : Rp%,-56.2f|\n", saham.getLembar() * saham.getHargaBeli());
                System.out.printf("| Nilai pasar saat ini : Rp%,-56.2f|\n", saham.getLembar() * DataSaham.getHargaSaham(saham.getKode()));
            }
            System.out.println("+----------------------------------------------------------------------------------+");
        }

        System.out.println();

        System.out.println("+----------------------------------------------------------------------------------+");
        System.out.println("|                             Daftar SBN yang dimiliki                             |");
        if (daftarSBN.isEmpty()) {
            System.out.println("+----------------------------------------------------------------------------------+");
            System.out.println("|            Anda tidak memiliki SBN, silahkan beli SBN terlebih dahulu            |");
            System.out.println("+----------------------------------------------------------------------------------+");
        } else {
            for (SuratBerhargaNegara sbn : daftarSBN) {
                System.out.println("+----------------------------------------------------------------------------------+");
                System.out.printf("| Nama SBN                      : %-49s|\n", sbn.getNama());
                System.out.printf("| Nominal dimiliki              : Rp%,-47.2f|\n", sbn.getKuotaNasional());
                System.out.printf("| Bunga tahunan (.)             : %-49.2f|\n", sbn.getBunga());
                System.out.printf("| Bunga yang diterima per bulan : Rp%,-47.2f|\n", sbn.getKuotaNasional() * (sbn.getBunga()/100) / 12);
            }
            System.out.println("+----------------------------------------------------------------------------------+");
        }
    }
}
