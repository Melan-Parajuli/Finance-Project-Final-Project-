package com.example.projectFinancial.Entity;

public enum TransactionCategory {
    EXPENSE,
    REVENUE;

    @Override
    public String toString() {
        return name();
    }
}
