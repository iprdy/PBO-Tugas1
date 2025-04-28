package ui;

public class MenuLoginUI {
    public static void loginMenu() {
        System.out.println("+-------------------------------+");
        System.out.println("|    Program Investasi Saham    |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Login                      |");
        System.out.println("| 2. Keluar dari program        |");
        System.out.println("+-------------------------------+");
    }

    public static void loginUI() {
        System.out.println("+-------------------------------+");
        System.out.println("|     M E N U     L O G I N     |");
        System.out.println("+-------------------------------+");
    }

    public static void gagalLoginUI() {
        System.out.println("+-------------------------------+");
        System.out.println("| PASSWORD ATAU USERNAME SALAH! |");
        System.out.println("+-------------------------------+");
    }

    public static void uiBerhasilLoginCustomer(String username) {
        System.out.println("+-----------------------------------+");
        System.out.println("|  Berhasil login sebagai Customer  |");
        System.out.println("+-----------------------------------+");
        System.out.printf("|  Username anda: %-17s |\n", username);
        System.out.println("+-----------------------------------+");
    }

    public static void uiBerhasilLoginAdmin(String username) {
        System.out.println("+----------------------------------+");
        System.out.println("|   Berhasil login sebagai Admin   |");
        System.out.println("+----------------------------------+");
        System.out.printf("|  Username anda: %-16s |\n", username);
        System.out.println("+----------------------------------+");
    }

    public static void logout() {
        ClearUI.clearScreen();
        System.out.println("+---------------------------------------+");
        System.out.println("|            Berhasil logout            |");
        System.out.println("+---------------------------------------+");
    }

    public static void thankYou() {
        ClearUI.clearScreen();
        System.out.println("+-----------------------------------------+");
        System.out.println("| Terimakasih sudah memakai program kami! |");
        System.out.println("+-----------------------------------------+");
    }
}
