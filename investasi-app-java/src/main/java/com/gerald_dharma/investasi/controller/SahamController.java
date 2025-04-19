package com.investasi.controller;

import com.investasi.data.Data;
import com.investasi.model.Customer;
import com.investasi.ui.MenuAdmin;
import com.investasi.ui.MenuLogin;

public class SahamController {
    public static void beliSaham(String kode, int lembar) {
        Customer cust = (Customer) Data.searchUser(MenuLogin.username);
        cust.tambahSaham(kode, Data.getNamaPerusahaanSaham(kode), Data.getHargaSaham(kode), lembar);
    }
}
