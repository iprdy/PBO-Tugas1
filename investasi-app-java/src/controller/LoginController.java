package controller;

import data.DataUser;
import model.User;
import ui.ClearUI;
import ui.MenuLoginUI;
import validator.InputValidation;

import java.util.Scanner;

public class LoginController {
    public static User login() {
        Scanner sc = new Scanner(System.in);

        ClearUI.clearScreen();

        MenuLoginUI.loginUI();

        while (true) {
            System.out.print("Enter username : "); String username = sc.nextLine();
            System.out.print("Enter password : "); String password = sc.nextLine();

            for (User user : DataUser.getUsers()) {
                if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                    return user;
                }
            }

            MenuLoginUI.gagalLoginUI();

            InputValidation.pause();

            MenuLoginUI.loginUI();
        }
    }
}
