package com.investasi.model;

import com.investasi.data.DataSaham;
import com.investasi.data.DataSBN;
import com.investasi.menu.MenuCustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private List<SahamCustomer> daftarSaham = new ArrayList<>();
    private List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();


    public Customer(String username, String password) {
        super(username, password);
    }

    
    public void tambahSaham(String kode, int lembar) {
        int checkSaham = 0;
        for (SahamCustomer sahamC : daftarSaham) {
            if (sahamC.getKode().equals(kode)) {
                sahamC.setLembar(lembar);
                checkSaham = 1;
                break;
            }
        }
        if (checkSaham == 0) {
            daftarSaham.add(new SahamCustomer(kode, DataSaham.getNamaPerusahaanSaham(kode), DataSaham.getHargaSaham(kode), lembar));
        }
    }

    
    public void tambahSBN(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional));
    }

    
    public List<SahamCustomer> getDataSahamCustomer() {
        return daftarSaham;
    }

    
    public void printDataSahamCostumer() {
        if (daftarSaham.isEmpty()) {
            System.out.println("Anda tidak memiliki saham!");
            MenuCustomer.show();
            return;
        }
        for (SahamCustomer saham : daftarSaham) {
            System.out.println(saham);
        }
    }

    
    public int getLembar(String kode) {
        for (SahamCustomer saham : daftarSaham) {
            if(kode.equals(saham.getKode())) {
                return saham.getLembar();
            }
        }
        return 0;
    }

    
    public void jualSaham(String kode, int jumlahLembar) {
        SahamCustomer sahamYangDihapus = null;

        for (SahamCustomer saham : daftarSaham) {
            if(kode.equals(saham.getKode())) {
                if(saham.getLembar()-jumlahLembar == 0) {
                    sahamYangDihapus = saham;
                } else {
                    saham.jualLembar(jumlahLembar);
                }
                break;
            }
        }
        if (sahamYangDihapus != null) {
            daftarSaham.remove(sahamYangDihapus);
        }
    }

    
    public void portofolio() {
        for (SahamCustomer saham : daftarSaham) {
            System.out.println("-------------------------------------------------");
            System.out.println("Kode: " + saham.getKode());
            System.out.println("Nama perusahaan: " + saham.getNamaPerusahaan());
            System.out.println("Harga saat beli: " + saham.getHargaBeli());
            System.out.println("Harga saat ini: " + DataSaham.getHargaSaham(saham.getKode()));
            System.out.println("Lembar: " + saham.getLembar());
            System.out.println("Total pembelian: " + saham.getLembar() * saham.getHargaBeli());
            System.out.println("Nilai pasar saat ini: " + saham.getLembar() * DataSaham.getHargaSaham(saham.getKode()));

        }
        System.out.println("-------------------------------------------------");
    }
}
