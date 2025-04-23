package com.investasi.data;

import com.investasi.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataUser {
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new Customer("user", "user"));
        users.add(new Customer("dhar", "dhar"));
        users.add(new Admin("admin", "admin"));

        Customer cust0 = (Customer) users.get(0);
        cust0.tambahSahamCustomer("BBCA", 10);

        Customer cust1 = (Customer) users.get(1);
        cust1.tambahSahamCustomer("BBNI", 50);
    }

    public static List<User> getUsers() {
        return users;
    }
}
