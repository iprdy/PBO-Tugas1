package com.investasi.validator;

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
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silahkan masukkan angka");
            }
        }
    }

    public static double inputDouble(String input) {
        while (true) {
            try {
                System.out.print(input);
                return Double.parseDouble(sc.nextLine());
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
}
