    package com.example.projectFinancial.Entity;

    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    import java.time.YearMonth;


    @Getter
    @Setter
    @Entity
    public class Financial {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private YearMonth month;

        private double amount;

        @ManyToOne
        private Category category;

        @ManyToOne(fetch = FetchType.LAZY)
        private User user;


    }
