package menu;

import controller.CustomerController;
import ui.CustomerUI;
import ui.MenuLoginUI;
import validator.InputValidation;

public class MenuCustomer {
    public static void show() {
        int pilihan;

        do {
            CustomerUI.mainMenu();

            pilihan = InputValidation.inputInteger("Masukkan pilihan: ");

            switch (pilihan) {
                case 1:
                    CustomerController.customerBeliSaham();
                    break;
                case 2:
                    CustomerController.customerJualSaham();
                    break;
                case 3:
                    CustomerController.customerBeliSBN();
                    break;
                case 4:
                    CustomerController.customerSimulasiSBN();
                    break;
                case 5:
                    CustomerController.customerGetPortofolio();
                    break;
                case 6:
                    MenuLoginUI.logout();
                    InputValidation.pause();
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan dengan benar!");
            }
        } while (pilihan != 6);
    }
}
