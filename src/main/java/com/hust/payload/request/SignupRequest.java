package com.hust.payload.request;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public class SignupRequest {
    @NotBlank(message = "Please provide a username")
    private String username;
    @NotBlank(message = "Please provide a email")
    @Email(message = "Email is invalid")
    private String email;
    @NotBlank(message = "Please provide a password")
    private String password;

    private List<String> role;

    public List<String> getRole() {
        return role;
    }

    public SignupRequest(@NotBlank(message = "Please provide a username") String username, @NotBlank(message = "Please provide a email") String email, @NotBlank(message = "Please provide a password") String password, List<String> role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
