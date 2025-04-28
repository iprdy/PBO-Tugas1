package validator;

import ui.ClearUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputValidation {
    static Scanner sc = new Scanner(System.in);

    public static String inputString(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();
            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong");
            } else {
                return x;
            }
        }
    }

    public static int inputInteger(String input) {
        while (true) {
            try {
                System.out.print(input);
                int x = Integer.parseInt(sc.nextLine());

                if (x <= 0) {
                    System.out.println("Input tidak valid, silahkan masukkan angka diatas 0");
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silahkan masukkan angka");
            }
        }
    }

    public static double inputDouble(String input) {
        while (true) {
            try {
                System.out.print(input);
                double x = Double.parseDouble(sc.nextLine());

                if (x <= 0) {
                    System.out.println("Input tidak valid, silahkan masukkan angka diatas 0");
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silahkan masukkan angka");
            }
        }
    }

    public static String inputStringKodeSaham(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();

            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            } else if (DataValidation.kodeSahamCheck(x)){
                return x;
            }
        }
    }

    public static String inputStringKodeSahamCustomer(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();

            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            } else if (DataValidation.kodeSahamCustomerCheck(x)){
                return x;
            }
        }
    }

    public static String inputStringKodeSahamAdmin(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();

            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            } else if (DataValidation.kodeSahamAdminCheck(x)){
                return x;
            }
        }
    }

    public static String inputStringNamaSBN(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();

            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            } else if (DataValidation.namaSBNCheck(x)){
                return x;
            }
        }
    }

    public static String inputStringNamaSBNAdmin(String input) {
        while (true) {
            System.out.print(input);
            String x = sc.nextLine();

            if (x.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            } else if (DataValidation.namaSBNAdminCheck(x)){
                return x;
            }
        }
    }

    public static LocalDate inputLocalDate(String input) {
        while (true) {
            try {
                System.out.print(input);
                String x = sc.nextLine();

                if (x.isEmpty()) {
                    System.out.println("Input tidak boleh kosong!");
                    continue;
                }

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                return LocalDate.parse(x,formatter);
            } catch (Exception e) {
                System.out.println("Format tidak valid, silahkan coba lagi!");
            }
        }
    }

    public static void pause() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[1mTekan enter untuk melanjutkan. . .\033[0m");
        scanner.nextLine();

        ClearUI.clearScreen();
    }
}
