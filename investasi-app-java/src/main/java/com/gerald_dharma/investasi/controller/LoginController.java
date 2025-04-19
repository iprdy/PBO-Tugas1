package com.investasi.controller;

import com.investasi.data.Data;
import com.investasi.model.User;

public class LoginController {
    public static User login(String username, String password) {
        for (User user : Data.users) {
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
