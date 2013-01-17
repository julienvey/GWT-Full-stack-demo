package com.zenika.resanet.shared.dto;

import java.io.Serializable;

public class Operator implements Serializable {

    private String login;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
    private OperatorRole role;

    public Operator() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public OperatorRole getRole() {
        return role;
    }

    public void setRole(OperatorRole role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
