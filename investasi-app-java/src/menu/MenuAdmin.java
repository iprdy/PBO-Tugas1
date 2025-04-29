package menu;

import controller.AdminController;
import model.Admin;
import ui.AdminUI;
import ui.ClearUI;
import ui.MenuLoginUI;
import validator.InputValidation;

public class MenuAdmin {
    public static void show() {
        int pilihan;

        do {
            AdminUI.mainMenu();

            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    menuSaham();
                    break;
                case 2:
                    menuSBN();
                    break;
                case 3:
                    MenuLoginUI.logout();
                    InputValidation.pause();
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 3);
    }


    private static void menuSaham() {
        int pilihan;

        do {
            AdminUI.menuSaham();

            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    AdminController.adminTampilkanSaham();
                    break;
                case 2:
                    AdminController.adminTambahSaham();
                    break;
                case 3:
                    AdminController.adminUbahHargaSaham();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 4);
    }


    private static void menuSBN() {
        int pilihan;

        do {
            ClearUI.clearScreen();
            AdminUI.menuSBN();

            pilihan = InputValidation.inputInteger("Masukkan angka: ");

            switch (pilihan) {
                case 1:
                    AdminController.adminTampilkanSBN();
                    break;
                case 2:
                    AdminController.adminTambahSBN();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 3);
    }
}
