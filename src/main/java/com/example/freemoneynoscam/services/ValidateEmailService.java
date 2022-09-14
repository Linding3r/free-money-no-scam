package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String email) {
        return email.contains("@") && email.substring(email.indexOf("@")).contains(".");
    }
}
