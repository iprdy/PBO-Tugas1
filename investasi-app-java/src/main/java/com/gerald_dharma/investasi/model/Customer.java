package com.investasi.model;

import com.investasi.data.DataSaham;
import com.investasi.data.DataSBN;
import com.investasi.menu.MenuCustomer;

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


    public List<SuratBerhargaNegara> getDataSBNCustomer() {
        return daftarSBN;
    }

    public SahamCustomer getSahamCustomer(String kode) {
        for (SahamCustomer sahamC : daftarSaham) {
            if (sahamC.getKode().equals(kode)) {
                return sahamC;
            }
        }
        return null;
    }

    public void tambahSaham(String kode, int lembar) {
        SahamCustomer saham = getSahamCustomer(kode);

        if (saham != null) {
            saham.setLembar(lembar);
        } else {
            daftarSaham.add(new SahamCustomer(kode, DataSaham.getNamaPerusahaanSaham(kode), DataSaham.getHargaSaham(kode), lembar));
        }
    }

    
    public boolean tambahSBN(String namaSBN, double jumlah) {
        SuratBerhargaNegara sbn = DataSBN.getSBN(namaSBN);

        if (sbn != null && DataSBN.prosesPembelian(namaSBN, jumlah)) {
            daftarSBN.add(new SuratBerhargaNegara(
                    sbn.getNama(),
                    sbn.getBunga(),
                    sbn.getJangkaWaktu(),
                    sbn.getTanggalJatuhTempo(),
                    jumlah
            ));
            return true;
        }
        return false;
    }

    
    public boolean printDataSahamCostumer() {
        if (daftarSaham.isEmpty()) {
            System.out.println("Anda tidak memiliki saham!");
            return false;
        }
        for (SahamCustomer saham : daftarSaham) {
            System.out.println(saham);
        }
        return true;
    }

    
    public int getLembar(String kode) {
        SahamCustomer saham = getSahamCustomer(kode);
        return saham.getLembar();
    }

    
    public void jualSaham(String kode, int jumlahLembar) {
        SahamCustomer saham = getSahamCustomer(kode);

        if(saham.getLembar()-jumlahLembar == 0) {
            daftarSaham.remove(saham);
        } else {
            saham.jualLembar(jumlahLembar);
        }
    }

    
    public void portofolio() {
        System.out.println("----------------------------------------------------");
        System.out.println("|                       Saham                      |");
        for (SahamCustomer saham : daftarSaham) {
            System.out.println("----------------------------------------------------");
            System.out.println("Kode: " + saham.getKode());
            System.out.println("Nama perusahaan: " + saham.getNamaPerusahaan());
            System.out.println("Harga saat beli: " + saham.getHargaBeli());
            System.out.println("Harga saat ini: " + DataSaham.getHargaSaham(saham.getKode()));
            System.out.println("Lembar: " + saham.getLembar());
            System.out.println("Total pembelian: " + saham.getLembar() * saham.getHargaBeli());
            System.out.println("Nilai pasar saat ini: " + saham.getLembar() * DataSaham.getHargaSaham(saham.getKode()));
        }
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("|                        SBN                       |");
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println("----------------------------------------------------");
            System.out.println("Nama SBN: " + sbn.getNama());
            System.out.printf("Nominal dimiliki: Rp%,.2f\n", sbn.getKuotaNasional());
            System.out.println("Bunga tahunan: " + sbn.getBunga());
            System.out.printf("Bunga per bulan: Rp%,.2f\n", sbn.getKuotaNasional() * (sbn.getBunga()/100) / 12);
        }
        System.out.println("----------------------------------------------------");
    }
}
