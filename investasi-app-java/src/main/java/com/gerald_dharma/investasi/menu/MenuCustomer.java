package com.investasi.menu;

import com.investasi.controller.CustomerController;
import com.investasi.ui.CustomerUI;
import com.investasi.validator.InputValidation;

import java.util.Scanner;

public class MenuCustomer {
    static Scanner sc = new Scanner(System.in);
    public static void show() {
        int pilihan;

        do {
            CustomerUI.mainMenu();
            pilihan = InputValidation.inputInteger("Masukkan pilihan: ");

            switch (pilihan) {
                case 1:
                    CustomerController.beliSaham();
                    break;
                case 2:
                    CustomerController.jualSaham();
                    break;
                case 3:
                    //Beli SBN
                    break;
                case 4:
                    //Simulasi SBN
                    break;
                case 5:
                    CustomerController.getPortofolio();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 6);
    }
}
