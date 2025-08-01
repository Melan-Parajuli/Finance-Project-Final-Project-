package com.example.projectFinancial.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private double amount;

    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionCategory type;

    private String notes;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


}
