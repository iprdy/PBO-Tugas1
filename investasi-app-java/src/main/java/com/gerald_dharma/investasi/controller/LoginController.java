package com.investasi.controller;

import com.investasi.data.DataUser;
import com.investasi.model.User;

import java.util.Scanner;

public class LoginController {
    public static User login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username : "); String username = sc.nextLine();
        System.out.print("Enter password : "); String password = sc.nextLine();

        for (User user : DataUser.getUsers()) {
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }

        System.out.println("username atau password salah!");

        return null;
    }
}
