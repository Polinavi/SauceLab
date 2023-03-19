package com.sauceDemo.Utils;

public enum Users {

    STANDART_USER("standard_user", "secret_sauce"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce"),
    PROBLEM_USER("problem_user", "secret_sauce"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user", "secret_sauce"),
    INVALID_USER("invalid_user", "Password123");


    private final String username;
    private final String password;

    Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
