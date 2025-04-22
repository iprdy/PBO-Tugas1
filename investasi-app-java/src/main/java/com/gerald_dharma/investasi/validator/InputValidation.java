package com.investasi.validator;

import java.util.Scanner;

public class InputValidation {
    static Scanner sc = new Scanner(System.in);

    public static int inputInteger(String input) {
        while (true) {
            try {
                System.out.print(input);
                int x = Integer.parseInt(sc.nextLine());
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
}
