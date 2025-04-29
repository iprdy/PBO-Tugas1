package menu;

import controller.LoginController;
import model.Admin;
import model.Customer;
import model.User;
import ui.ClearUI;
import ui.MenuLoginUI;
import validator.InputValidation;

public class MenuLogin {
    private static Customer customerLoggedIn;

    public static void show() {
        MenuLoginUI.loginMenu();

        while (true) {
            User user;

            int pilihan = InputValidation.inputInteger("Masukkan pilihan: ");

            if (pilihan == 2) {
                MenuLoginUI.thankYou();
                break;
            } else if (pilihan != 1) {
                System.out.println("Input tidak valid, silahkan masukkan pilihan 1 atau 2!");
            }

            user = LoginController.login();

            if (user instanceof Admin) {
                ClearUI.clearScreen();
                MenuLoginUI.uiBerhasilLoginAdmin(user.getUsername());
                InputValidation.pause();
                MenuAdmin.show();
                MenuLoginUI.loginMenu();
            } else if (user instanceof Customer) {
                customerLoggedIn = (Customer) user;
                ClearUI.clearScreen();
                MenuLoginUI.uiBerhasilLoginCustomer(user.getUsername());
                InputValidation.pause();
                MenuCustomer.show();
                MenuLoginUI.loginMenu();
            }
        }
    }

    public static Customer getCustomerLoggedIn() {
        return customerLoggedIn;
    }
}
