package com.investasi.data;

import com.investasi.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataUser {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Admin("admin", "admin"));

        Customer cust = (Customer) users.get(0);
        cust.tambahSaham("BBCA", 10);
    }

    public static List<User> getUsers() {
        return users;
    }
}
