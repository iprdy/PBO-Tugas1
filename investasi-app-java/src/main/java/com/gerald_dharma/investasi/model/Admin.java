package com.investasi.model;

public class Admin extends User{
    public Admin(String username, String password, String role) {
        super(username, password, "admin");
    }
}
