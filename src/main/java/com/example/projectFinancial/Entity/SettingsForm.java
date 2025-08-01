package com.example.projectFinancial.Entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettingsForm {
    private String email;
    private String preferredCurrency;
    private boolean notificationsEnabled;
    private String newPassword;
    private String confirmPassword;

   }