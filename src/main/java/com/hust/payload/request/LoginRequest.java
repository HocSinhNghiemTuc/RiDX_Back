package com.hust.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "Please provide a username")
    private String username;
    @NotBlank(message = "Please provide a password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
