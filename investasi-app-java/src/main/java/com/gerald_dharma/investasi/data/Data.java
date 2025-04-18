package com.investasi.data;

import com.investasi.model.Admin;
import com.investasi.model.Customer;
import com.investasi.model.User;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));

        Customer cust = (Customer) users.get(0);
        cust.tambahSaham("BBCA", "Bank BCA", 100000);
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
